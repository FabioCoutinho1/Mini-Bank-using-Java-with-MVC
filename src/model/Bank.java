package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bank {
    private List<Account> accounts = new ArrayList<>();

    private Optional<Account> findAccountByCpf(String cpf) {
        Optional<Account> findAccount;
        return findAccount = accounts.stream().filter(account -> account
                .getHolder()
                .getCpf()
                .equals(cpf))
                .findFirst();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public String deposit(String cpf, double amount) {
        Optional<Account> findAccount = findAccountByCpf(cpf);

        String result;
        if (findAccount.isPresent()) {
            Account account = findAccount.get();
            result = account.deposit(amount);
        }else {
            return "Account not found";
        }
        return result;
    }

    public String withdraw(String cpf, double amount) {
        Optional<Account> findAccount = findAccountByCpf(cpf);

        String result;
        if (findAccount.isPresent()) {
            Account account = findAccount.get();
            result = account.withdraw(amount);
        }
        else {
            return "Account not found";
        }
        return result;
    }

    public String balance(String cpf) {
        Optional<Account> findAccount = findAccountByCpf(cpf);
        String result;
        if (findAccount.isPresent()) {
            Account account = findAccount.get();
            result = Double.toString(account.getBalance());
        }else  {
            return "Account not found";
        }
        return result;
    }

    public ResponseLogin login(String cpf, String password) {
        Optional<Account> findAccount = findAccountByCpf(cpf);
        ResponseLogin result;
        if (findAccount.isPresent()) {
            Account account = findAccount.get();
            String ValidPassword = account.getHolder().getPassword();
            if (ValidPassword.equals(password)) {
                result = new ResponseLogin(account);
            }else  {
                result = new ResponseLogin("Credencias inválidas");
            }
        }else {
            result = new ResponseLogin("Credenciais inválidos");
        }
        return result;
    }

    public void viewAccounts() {
        System.out.println(accounts);
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
