package bicycles;

public abstract class BicycleBase implements Bicycle {
    protected int speed = 0;

    protected void changeSpeed(int number){
        //speed = number + speed;
        speed += number;
    }

    public int currentSpeed() {
        return speed;
    }

    public void stop() {
        speed = 0;
    }
}
