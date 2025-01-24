package Model;

public class Client {
    private String name;
    private String cpf;
    private Account account;

    public Client(String name, String cpf, Account account){
        this.name = name;
        this.cpf = cpf;
        this.account = account;
    }
    public Client(){

    }

    public String getName(){
      return name;
    }

    public String getCpf(){
        return cpf;
    }

    public Account getAccount(){
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
