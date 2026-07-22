package model;

public class ResponseLogin {
    Account account;
    boolean success;
    String message;

    public ResponseLogin(String message) {
        this.account = null;
        this.success = false;
        this.message = message;
    }

    public ResponseLogin(Account account) {
        this.account = account;
        this.success = true;
        this.message = null;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
