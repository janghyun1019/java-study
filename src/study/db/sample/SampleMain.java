package study.db.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleMain {

	public static void main(String[] args) {

		selectDept();

		findProduct();
	}

	@SuppressWarnings("null")
	public static void findProduct() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// DB 연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db연결
		// Statement stmt = null; // 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql 실행 select 결과 저장하는 객체
		
// 쿼리 준비
		String sqlQuery = "Select * from product";
		try {

			// 쿼리 실행 후 데이터 후속 처리
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery(); // 데이터를 담았다

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? ture 데이터가 있다
//							System.out.println(rs.getInt(1));
//							System.out.println(rs.getString(2));
//							System.out.println(rs.getString(3));

				System.out.println(rs.getInt("p_code"));
				System.out.println(rs.getString("P_name"));
				System.out.println(rs.getInt("p_price"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void selectDept() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// DB 연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db연결
		// Statement stmt = null; // 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql 실행 select 결과 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 쿼리 준비
		String sqlQuery = "Select * from dept";
		try {

			// 쿼리 실행 후 데이터 후속 처리
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery(); // 데이터를 담았다

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? ture 데이터가 있다
//					System.out.println(rs.getInt(1));
//					System.out.println(rs.getString(2));
//					System.out.println(rs.getString(3));

				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결종료
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}

			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
