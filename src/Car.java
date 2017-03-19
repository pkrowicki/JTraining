/**
 * Created by Pawel on 19.03.2017.
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String OCmodel){
        String modelValidation = OCmodel.toLowerCase();
        if(modelValidation.equals("a7") || modelValidation.equals("a3")){
            this.model=OCmodel;
        }
        else{
            this.model="unknow";
        }
    }

    public String getModel() {
        return this.model;
    }
}
