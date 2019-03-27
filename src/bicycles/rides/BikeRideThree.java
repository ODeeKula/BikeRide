package bicycles.rides;

import bicycles.Bicycle;

public class BikeRideThree implements BikeRide{

    private Bicycle bicycle;

    public BikeRideThree(Bicycle bicycle3){
        this.bicycle = bicycle3;
    }


    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();


    }


    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }
}
