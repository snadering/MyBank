package myBank;

public class SalaryAccount extends BankAccount {

    private double creditlimit;

    public void setCreditlimit(double creditlimit) {
        this.creditlimit = creditlimit;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    @Override
    public void setOwner(Customer owner) {

    }

    @Override
    public boolean withdraw(double amount) {
        return false;
    }
}
