package controller;

import model.*;

public class BankLoginController {
    Bank bank;

    public BankLoginController(Bank bank) {
        this.bank = bank;
    }

    public ResponseLogin login(String cpf, String password) {
        return bank.login(cpf, password);
    }

    public String createAccount(String name, String cpf, String password, int number, int type) {
        Costumer holder = new Costumer(name, cpf, password);
        Account newAccount;
        if(type == 1){
            newAccount = new CurrentAccount(number, holder);
        }else if(type == 2){
            newAccount = new SavingAccount(number, holder);
        }else {
            return "Typo de conta não disponível";
        }

        bank.addAccount(newAccount);

        return "Conta criado com sucesso para '"+ holder+"'";
    }
}
