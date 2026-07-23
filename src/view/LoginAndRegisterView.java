package view;

import controller.BankController;
import controller.BankLoginController;
import model.ResponseLogin;

import java.util.Scanner;

public class LoginAndRegisterView {
    BankView bankView;
    BankLoginController bankLoginController;
    Scanner sc;

    public LoginAndRegisterView(BankLoginController bankLoginController,  BankView bankView) {
        this.bankLoginController = bankLoginController;
        this.bankView = bankView;
        this.sc = new Scanner(System.in);
    }

    public void InitialInterface(){
        int option = -1;
        while (option != 0){
            System.out.println("=== SISTEMA BANCÁRIO EM JAVA ===");
            System.out.println("1. CRIAR CONTA");
            System.out.println("2. ENTRAR NA CONTA");
            System.out.println("0. SAIR");

            try {
                option = Integer.parseInt(sc.nextLine()) ;
                processOption(option);
            }catch (NumberFormatException e){
                System.out.println("ERRO: DIGITE UM NUMERO VALIDO");
            }
        }
    }

    public void processOption(int option){
        switch (option){
            case 1->{
                viewCreateAccount();
                break;
            }
            case 2->{
                viewAccount();
                break;
            }
            case 0->{
                System.out.println("Saindo...");
            }
        }
    }

    public void viewCreateAccount() {
        System.out.println("\n=== CRIAR CONTA ===");

        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();

        System.out.println("Digite seu CPF sem acentos: ");
        String cpf = sc.nextLine();

        System.out.println("Crie sua senha: ");
        String password = sc.nextLine();

        System.out.println("Digite o número conta: ");
        int numberOfAccount = Integer.parseInt(sc.nextLine());

        System.out.println("Tipo de conta: (1) Corrente | (2) Poupança");
        System.out.print("Escolha o tipo: ");
        int tipo = Integer.parseInt(sc.nextLine());

        String result  = bankLoginController.createAccount(name, cpf, password, numberOfAccount, tipo);

        System.out.println(result);
    }

    public void viewAccount() {
        System.out.println("=== ENTRAR NA CONTA ===");
        System.out.println("Digite seu cpf sem acentos:");
        String cpf = sc.nextLine();
        System.out.println("digite sua senha: ");
        String senha = sc.nextLine();

       ResponseLogin result = bankLoginController.login(cpf, senha);
       if (result.isSuccess()){
           bankView.initialInterface(result.getAccount());
       }
       else{
           System.out.println(result.getMessage());
       }
    }
}
