package controller;

import model.*;

public class BankController {
    private final Bank bank;

    public BankController(Bank bank) {
        this.bank = bank;
    }

    public String deposit(String cpf, double amount) {
       return bank.deposit(cpf, amount);

    }

    public String withdraw(String cpf, double amount) {
        return bank.withdraw(cpf, amount);
    }

    public String balance(String cpf) {
      return bank.balance(cpf);
    }

    public String confirmAccount(int number) {
        return bank.confirmAccount(number);
    }

    public String transfer(String cpf, int number, double amount) {
        return bank.transfer(cpf, number, amount);
    }


}
