public class YRecord {
    private int month;
    private int amount;
    private boolean isExpence;

    public YRecord(int month, int amount, boolean isExpence) {
        this.month = month;
        this.amount = amount;
        this.isExpence = isExpence;
    }

    public int getMonth() {
        return month;
    }

    public int setMonth() {
        return this.month = month;
    }

    public int getAmount() {
        return amount;
    }

    public int setAmount() {
        return this.amount = amount;
    }

    public boolean getIsExpence() {
        return isExpence;
    }

    public boolean setIsExpence() {
        return this.isExpence = isExpence;
    }

}

