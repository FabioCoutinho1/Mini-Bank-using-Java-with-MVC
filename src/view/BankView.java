package view;

import controller.BankController;
import model.Account;

import java.util.Scanner;

public class BankView {
    private final BankController bankController;
    private final Scanner sc;


    public BankView(BankController bankController) {
        this.bankController = bankController;
        this.sc = new Scanner(System.in);
    }

    public void initialInterface(Account account) {
        int option = -1;
        while (option != 0){
            System.out.println("\n=== SISTEMA BANCÁRIO EM JAVA ===");
            System.out.println("1. DEPOSITO");
            System.out.println("2. SAQUE");
            System.out.println("3. CONSULTAR SALDO");
            System.out.println("0. SAIR");

            try {
                option = Integer.parseInt(sc.nextLine()) ;
                processOption(option, account);
            }catch (NumberFormatException e){
                System.out.println("ERRO: DIGITE UM NUMERO VALIDO");
            }
        }
    }

    public void processOption(int option, Account account) {
        String cpf = account.getHolder().getCpf();

        switch (option){
            case 1 -> {
                viewDeposit(cpf);
                break;
            }
            case 2 -> {
                viewWithdraw(cpf);
            }
            case 3 -> {
                viewBalance(cpf);
                break;
            }
            case 0 -> {
                System.out.println("Sistema encerrado. Até logo!");
                break;
            }

        }
    }


    public void viewDeposit(String cpf) {
        System.out.println("=== DEPOSITO ===");

        System.out.println("valor do deposito: ");
        double amount = Double.parseDouble(sc.nextLine());


        String result = bankController.deposit(cpf, amount);
        System.out.println(result );

    }
    public void viewWithdraw(String cpf) {
        System.out.println("=== SAQUE ===");

        System.out.println("valor do saque: ");
        double amount = Double.parseDouble(sc.nextLine());


        String result = bankController.withdraw(cpf, amount);
        System.out.println(result );
    }

    public void viewBalance(String cpf) {
        System.out.println("=== BALANCE ===");
        String result = bankController.balance(cpf);
        System.out.println(result);
    }

}
