package Model;

public class Account {
    private int number;
    private int agencyNumber;
    private Double balance;

    public Account(int accountNumber, int agencyNumber, Double accountBalance){
        this.number = accountNumber;
        this.agencyNumber = agencyNumber;
        this.balance = accountBalance;
    }

    public void setNumber(int newNumber){
        number = newNumber;
    }
    public void setAgencyNumber(int agencyNew){
        agencyNumber = agencyNew;
    }

    public int getNumber(){
        return number;
    }

    public int getAgencyNumber(){
        return agencyNumber;
    }

    public Double getAccountBalance(){
        return balance;
    }

    public Double withdraw(int value){
        if (balance >= value){
            return balance -= value;
        } else
            return balance;
    }

}
