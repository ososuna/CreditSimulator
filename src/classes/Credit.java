package classes;

public class Credit {
    
    private double amount;
    private double paydown;
    private double interestRate;
    private String paymentOption;

    public Credit(double amount, double paydown, String paymentOption) {
        this.amount = amount;
        this.paydown = paydown;
        this.interestRate = .1599;
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

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    public Double calculatePayment(int years) {
        Double capital = this.amount - this.paydown;
        return capital * Math.pow((1 + this.interestRate), years);
    }

    @Override
    public String toString() {
        return "Credit [amount=" + amount + ", interest=" + interestRate + ", paydown=" + paydown + ", paymentOption="
                + paymentOption + "]";
    }

}
