package classes;

public class Credit {
    
    private double amount;
    private double paydown;
    private double interest;
    private String paymentOption;

    public Credit(double amount, double paydown, double interest, String paymentOption) {
        this.amount = amount;
        this.paydown = paydown;
        this.interest = interest;
        this.paymentOption = paymentOption;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPaydown() {
        return paydown;
    }

    public void setPaydown(double paydown) {
        this.paydown = paydown;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public String getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    @Override
    public String toString() {
        return "Credit [amount=" + amount + ", interest=" + interest + ", paydown=" + paydown + ", paymentOption="
                + paymentOption + "]";
    }

}
