/**
 * Created by Pawel on 19.03.2017.
 */
public class BAcc {

    private int accNmbr;
    private double balance;
    private String cstName;
    private String cstMail;
    private String cstNumber;

    public BAcc(){
        this(9999,0d,"Unknown", "Unknown", "Unknown", 000000000);
//        This constructor calls other constructor located below, that's why there are both prints.
        System.out.println("Empty constructor called! Setting default values.");
    }

    public BAcc(String cstName, String cstSurname, String cstMail, int cstNumber) {
        this(9999, 0d, cstName, cstSurname, cstMail, cstNumber);
    }

    public BAcc(int accNmbr, double balance, String cstName, String cstSurname, String cstMail, int cstNumber){
        System.out.println("Constructor with parameters called!");
        this.accNmbr = accNmbr;
        this.balance = balance;
        this.cstName = cstName + " " + cstSurname;
        this.cstMail = cstMail;
        this.cstNumber = "+48 " + String.valueOf(cstNumber);
    }


//    Setters:



    public void setAccNmbr(int accNmbr){
        this.accNmbr = accNmbr;
    }

    public void setBalance(double cash){
        this.balance=cash;
    }

    public void setCstName(String cstName, String cstSurname) {
        this.cstName = cstName + " " + cstSurname;
    }

    public void setCstMail(String cstMail) {
        this.cstMail = cstMail;
    }

    public void setCstNumber(int cstNumber) {
        this.cstNumber = "+48 " + String.valueOf(cstNumber);
    }

//    Getters


    public int getAccNmbr() {
        return accNmbr;
    }

    public double getBalance() {
        return balance;
    }

    public String getCstName() {
        return cstName;
    }

    public String getCstMail() {
        return cstMail;
    }

    public String getCstNumber() {
        return cstNumber;
    }

//    Methods

    public void depoFounds(double depositC){
        this.balance +=depositC;
        System.out.println("Thank you! Your balance is now: " + this.balance + "PLN.");
    }
    public void withFounds(double withdrawC){
        if(this.balance-withdrawC >= 0) {
            this.balance -= withdrawC;
            System.out.println("Withdraw amount: " + withdrawC + "PLN.\nPlease take your money.\nAccount balance is now: "+this.balance+"PLN.");
        }
        else{
            System.out.println("Inssuficient founds! Balance is: " + this.balance + "PLN.\nDo you want to try again?");
        }
    }

}
