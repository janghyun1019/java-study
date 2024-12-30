package study.evaluation;

public class SalesInfo {
    String machineId;
    String branchName;
    int totalSales;
    int lossSales;
    int income;

    public SalesInfo(String machineId, String branchName, int totalSales, int lossSales, int income) {
        this.machineId = machineId;
        this.branchName = branchName;
        this.totalSales = totalSales;
        this.lossSales = lossSales;
        this.income = income;
    }
}