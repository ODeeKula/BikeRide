package bicycles.rides;

import bicycles.Bicycle;

public class BikeRideTwo implements BikeRide {

    private Bicycle bicycle;

    public BikeRideTwo(Bicycle bicycle2){
        this.bicycle = bicycle2;
    }


    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();


    }


    public int currentSpeed() {
        return this.bicycle.currentSpeed();
    }
}
