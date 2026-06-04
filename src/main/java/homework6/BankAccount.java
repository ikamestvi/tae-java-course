package homework6;

public class BankAccount {
    private String owner;
    private double  balance;

    public BankAccount(String owner, double balance){
        this.owner=owner;
        this.balance=balance;
    }


    public void deposit(double amount){
        if(amount>0){
            this.balance+=amount;
        }else System.out.println("თანხა უნდა იყოს დადებითი");
    }



    public void withdraw(double amount){
        if(balance<=amount){
            System.out.println("არასაკმარისი თანხა");
        }else balance-=amount;
    }


    public double getBalance(){
        return  balance;
    }
}
