/**
 * Created by Pawel Krowicki on 19.03.2017.
 */
public class Cars extends Vehicle {

    private int numberGears;
    private int numberOfWheels;
    private String carClass;

    public Cars(int speed, int numberGears, int numberOfWheels, String carClass) {
        super(speed, "manual");
        this.numberGears = numberGears;
        this.numberOfWheels = numberOfWheels;
        this.carClass = carClass;
    }

    @Override
    public void moving(boolean isMoving) {
        super.moving(isMoving);
        System.out.println("Cars.moving() called!");
    }

    public int getNumberGears() {
        return numberGears;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getCarClass() {
        return carClass;
    }
}
