package model;

public abstract class Account {
   private String number;
   protected double balance;
   private Costumer holder;
   private TypeOfAccount typeOfAccount;

   public String deposit (double value){

       setBalance(getBalance() + value);
       return "valor de '"+value+"' depositado na conta de '"+holder.getName()+"'";
   }

   public String withdraw (double value){
        setBalance(getBalance() - value);
       return getHolder().getName() + " withdrawn " + value;
   }

   public abstract void calcularRate();

    public Account(String number, Costumer holder, TypeOfAccount typeOfAccount) {
        this.number = number;
        this.balance = 0;
        this.holder = holder;
        this.typeOfAccount = typeOfAccount;
    }

    public Costumer getHolder() {
        return holder;
    }

    public void setHolder(Costumer holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public TypeOfAccount getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(TypeOfAccount typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    @Override
    public String toString() {
        return "\nAccount{\n" +
                "number='"+number+"'\n" +
                "balance='"+balance+"'\n" +
                "holder='"+holder+"'\n" +
                "typeOfAccount='"+typeOfAccount+"'" +
                "\n}";
    }
}
