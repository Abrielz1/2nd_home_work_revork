import java.util.ArrayList;

public class Converter {
    private MonthlyReport monthlyReport = new MonthlyReport();
    private YearlyReport yearlyReport = new YearlyReport();

    //todo написать методы для:

    public void readYearlyReport(){
    //todo считывания годовых отчётов
        if (!yearlyReport.getYearRows().isEmpty()) {
            yearlyReport.getYearRows();
        } else {
            System.out.println("Данные считай!");
            return;
        }
    }

    public void readMonthlyReport(){
    //todo считывания месячных отчётов
        if (!monthlyReport.getMonthData().isEmpty()){
            monthlyReport.getMonthData();
            for (Integer key : monthlyReport.getMonthData().keySet()){
                for (ArrayList<MRecord> value : monthlyReport.getMonthData().values()){
                    if (value.get(key).getIsExpense()){
                        System.out.println("расход: " + value.get(key).getItemName() + " " + value.get(key).getSumOfOne());
                    }

                }
            }
        } else {
            System.out.println("Данные считай!");
            return;
        }
    }

public void reconciliationOfReports(){
    //todo сверки отчётов
}

   public void printMonthlyReport(){
   //todo вывода информации о годовом отчёте
   }

  public void printYearlyReport(){
   //todo вывода информации о месячном отчёте
  }

}
