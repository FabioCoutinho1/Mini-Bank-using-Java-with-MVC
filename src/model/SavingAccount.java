package model;

public class SavingAccount extends Account {
    private final double yieldRate;

    public SavingAccount(int number, Costumer holder) {
        super(number, holder, TypeOfAccount.SAVING);
        this.yieldRate = 0.0111;
    }

    public void investResource (){
        setBalance(getBalance() + (getBalance() * yieldRate));
    }

    @Override
    public void calcularRate() {

    }

    public double getYieldRate() {
        return yieldRate;
    }

}
