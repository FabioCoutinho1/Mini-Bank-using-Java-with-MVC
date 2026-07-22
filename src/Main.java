import controller.BankController;
import controller.BankLoginController;
import model.Bank;
import view.BankView;
import view.LoginAndRegisterView;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankController bankController = new BankController(bank);
        BankLoginController bankLoginController = new BankLoginController(bank);
        BankView bankView = new BankView(bankController);


        LoginAndRegisterView loginAndRegisterView = new LoginAndRegisterView(bankLoginController, bankView);
        loginAndRegisterView.InitialInterface();

    }
}