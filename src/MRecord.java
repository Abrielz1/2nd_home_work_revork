import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MRecord {
    private String itemName;
    private boolean isExpense;
    private int quantity;
    private int sumOfOne;

    public MRecord(String itemName, boolean isExpense, int quantity, int sumOfOne) {
        this.itemName = itemName;
        this.isExpense = isExpense;
        this.quantity = quantity;
        this.sumOfOne = sumOfOne;
    }

    public String getItemName() {
        return itemName;
    }

    public String setItemName() {
        return this.itemName = itemName;
    }

    public boolean getIsExpense() {
        return isExpense;
    }

    public boolean setIsExpense() {
        return this.isExpense = isExpense;
    }

    public int getquantity() {
        return quantity;
    }

    public int setquantity() {
        return this.quantity = quantity;
    }

    public int getSumOfOne() {
        return sumOfOne;
    }

    public int setSumOfOne() {
        return this.sumOfOne = sumOfOne;
    }



}
