/**
 * Created by Pawel on 19.03.2017.
 */
public class Vehicle {

    private int speed;
    private String steering;

    public Vehicle(int speed, String steering){
        this.speed = speed;
        this.steering = steering;
    }

    public void moving(boolean isMoving){
        System.out.println("Vehicle.isMoving called");
        if(isMoving){
            System.out.println("Vehicle.moving() true");
        }
        else{
            System.out.println("Vehicle.moving() false");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public String getSteering() {
        return steering;
    }
}
