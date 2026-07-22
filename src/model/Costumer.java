package model;

public class Costumer {
    String name;
    String cpf;
    String password;
    boolean valid;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Costumer(String name, String cpf, String password) {
        this.name = name;
        this.cpf = cpf;
        this.password = password;
        this.valid = false;
    }

    @Override
    public String toString() {
        return "\nCostumer{\n" +
                "\tname='"+name+"'\n" +
                "\tcpf='"+cpf+"'" +
                "\n\t}";
    }
}
