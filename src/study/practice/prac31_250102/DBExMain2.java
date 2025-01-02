package study.practice.prac31_250102;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBExMain2 {

    public static void main(String[] args) {
        // 단일 행 읽기 테스트
        ProductDTO singleProduct = findProductByCode(101);
        if (singleProduct != null) {
            System.out.println(singleProduct);
        } else {
            System.out.println("Product not found.");
        }

        // 객체 리스트 읽기 테스트
        List<ProductDTO> productList = findProductList();
        if (productList != null && !productList.isEmpty()) {
            for (ProductDTO product : productList) {
                System.out.println(product);
            }
        } else {
            System.out.println("No products found.");
        }
    }

    public static ProductDTO findProductByCode(int pCode) {
        String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
        String dbId = "scott";
        String dbPw = "tiger";

        String query = "SELECT * FROM product WHERE p_code = ?";
        ProductDTO product = null;

        try (Connection conn = DriverManager.getConnection(dbUrl, dbId, dbPw);
             PreparedStatement psmt = conn.prepareStatement(query)) {

            psmt.setInt(1, pCode);
            try (ResultSet rs = psmt.executeQuery()) {
                if (rs.next()) {
                    product = new ProductDTO(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return product;
    }

    public static List<ProductDTO> findProductList() {
        String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
        String dbId = "scott";
        String dbPw = "tiger";

        String query = "SELECT * FROM product";
        List<ProductDTO> productList = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(dbUrl, dbId, dbPw);
             PreparedStatement psmt = conn.prepareStatement(query);
             ResultSet rs = psmt.executeQuery()) {

            while (rs.next()) {
                ProductDTO product = new ProductDTO(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price"));
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productList;
    }
}