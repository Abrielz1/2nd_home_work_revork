import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //todo сгенерировать 2 объекта передающих ссылки на файлы - за год и за месяц
      //  int i = 0;
        Scanner scanner = new Scanner(System.in);
        PrintMenu printMenu = new  PrintMenu();
        Converter converter = new Converter();
        YearlyReport yearlyReport = new YearlyReport(2021, "resources/y.2021.csv");
     //   MonthlyReport monthlyReport = new MonthlyReport("m.20210" + i + ".csv");
        System.out.println("Здравствуйте!");
        while (true){
            printMenu.printMenu();
           int input = scanner.nextInt();
           switch (input){
               case 1:    converter.readMonthlyReport();
                   break;
               case 2:      converter.printYearlyReport();
                   break;
               case 3:
                   break;
               case 4:
                   break;
               case 5:
                   break;
               case 0:
                   return;
               default:
                   System.out.println("Такого пункта нет!");
           }
        }
    }
}

