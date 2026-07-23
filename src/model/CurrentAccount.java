package model;

public class CurrentAccount extends Account {
    private double limite;

    public CurrentAccount(int number, Costumer holder) {
        super(number, holder, TypeOfAccount.CURRENT);
        this.limite = 1500;
    }

    @Override
    public String withdraw (double value){
        String result;

        if(value > limite){
            result = "Limite excede.";
        }else if(value > getBalance()){
            result = "Insufficient funds!";
        }else{
            setBalance(getBalance() - value);
            result = getHolder().getName() + " withdrawn " + value;
        }

        return result;
    }

    @Override
    public void calcularRate() {

    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
