/**
 * Created by Pawel Krowicki on 19.03.2017.
 */
public class Subaru extends Cars {

    private int currentGear;
    private int speedTop;
    private String colour;

    public Subaru(int speed, int numberGears, String carClass, int currentGear, int speedTop, String colour) {
        super(speed, numberGears, 4, carClass);
        this.currentGear = currentGear;
        this.speedTop = speedTop;
        this.colour = colour;
    }

    public void changeGear(int change){
        if(change==0&&this.currentGear>1){
            this.currentGear--;
            System.out.println("Subaru.changeGear() called!\nGear changed to one gear lower! - " + this.currentGear);
        } else if (change==1){
            System.out.println("Subaru.changeGear() called!\nGear is now -" + this.currentGear);
        } else if (change==2&&currentGear!=getNumberGears()){
            this.currentGear++;
            System.out.println("Subaru.changeGear() called!\nGear changed to one gear higher! - " + this.currentGear);
        } else {
            System.out.println("Subaru.changeGear() called!\nWrong gear change command!\nCurrent gear: " + currentGear);
        }
    }

    @Override
    public void moving(boolean isMoving) {
        super.moving(isMoving);
        System.out.println("Subaru.moving() called!");
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getSpeedTop() {
        return speedTop;
    }

    public String getColour() {
        return colour;
    }
}
