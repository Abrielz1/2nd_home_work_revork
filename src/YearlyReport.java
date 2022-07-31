import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class YearlyReport {
    private int year;

    private ArrayList<YRecord> yearRows = new ArrayList<>();

    public YearlyReport(int year, String path) {
        this.year = year;
        String content = readFileContentsOrNull(path);

            String[] lines = content.split("\r?\n");
            for (int i = 1; i < lines.length; i++) {
                String line = lines[i];
                String[] parts = line.split(",");
                int month = Integer.parseInt(parts[0]);
                int amount = Integer.parseInt(parts[1]);
                boolean isExpense = Boolean.parseBoolean(parts[2]);
                yearRows.add(new YRecord(month, amount, isExpense));
            }

    }

    public YearlyReport(){

    }

    public int getYear() {
        return year;
    }

    public int setYear() {
        return this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<YRecord> getYearRows() {
        return yearRows;
    }

    public void setYearRows(ArrayList<YRecord> yearRows) {
        this.yearRows = yearRows;
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
