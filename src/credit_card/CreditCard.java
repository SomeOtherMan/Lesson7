package credit_card;

public class CreditCard {

    private String accNumber;

    private int accSum;

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public int getAccSum() {
        return accSum;
    }

    public void setAccSum(int accSum) {
        this.accSum = accSum;
    }

    public void accrueAccSum(int amount) {
        this.accSum += amount;
    }

    public void writeOffAccSum(int amount) {
        this.accSum -= amount;
    }

    @Override
    public String toString() {
        return String.format("Кредитная карта: счет[%s], сумма[%d]", accNumber, accSum);
    }
}
