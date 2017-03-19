/**
 * Created by Pawel on 19.03.2017.
 */
public class VipCustomers {

    private String cName;
    private double cCreditLimit;
    private String cEmail;

    public VipCustomers(String cName, double cCreditLimit, String cEmail){
        this.cName = cName;
        this.cCreditLimit = cCreditLimit;
        this.cEmail = cEmail;
    }

    public VipCustomers(String cName, double cCreditLimit){
        this(cName,cCreditLimit, "unknown@default");
    }

    public VipCustomers(){
        this("unknown name", 0d, "unknown@default");
    }

    public String getcName() {
        return cName;
    }

    public double getcCreditLimit() {
        return cCreditLimit;
    }

    public String getcEmail() {
        return cEmail;
    }
}
