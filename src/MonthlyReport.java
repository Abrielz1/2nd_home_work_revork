import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;

public class MonthlyReport {

    private HashMap<Integer, ArrayList<MRecord>> monthData = new HashMap();

    private ArrayList<MRecord> monthRows;

    private ArrayList<MRecord> getMothRows() {
        return monthRows;
    }

    public void setMothRows(ArrayList<MRecord> mothRows) {
        this.monthRows = mothRows;
    }

    public HashMap<Integer, ArrayList<MRecord>> getMonthData() {
        return monthData;
    }

    public void setMonthData(HashMap<Integer, ArrayList<MRecord>> monthData) {
        this.monthData = monthData;
    }

    public MonthlyReport() {
        for (int i = 1; i <= 3; i++) {
        String content = readFileContentsOrNull("resources/m.20210" + i + ".csv");
            String[] linesMonth = content.split("\r?\n");
            monthRows = new ArrayList<>();
            for (int j = 1; j < linesMonth.length; j++) {
                String line = linesMonth[j];
                String[] parts = line.split(",");
                String itemName = parts[0];
                boolean isExpence = Boolean.parseBoolean(parts[1]);
                int quantity = Integer.parseInt(parts[2]);
                int sumOfOne = Integer.parseInt(parts[3]);
                monthRows.add(new MRecord(itemName, isExpence, quantity, sumOfOne));
            }
            monthData.put(i, monthRows);
        }

    }


    private String readFileContentsOrNull(String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с месячным отчётом. Возможно, файл не находится в нужной директории.");
            return null;
        }
    }
}
