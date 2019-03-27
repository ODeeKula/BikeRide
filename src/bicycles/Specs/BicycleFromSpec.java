package bicycles.Specs;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class BicycleFromSpec extends BicycleBase {

    private BicycleSpecification bicycleSpecification;

    public BicycleFromSpec (BicycleSpecification bicycleSpecification){
        this.bicycleSpecification = bicycleSpecification;
    }


    public void accelerate() {
        changeSpeed(this.bicycleSpecification.getAccelerationSpeed());
    }


    public void brake() {
        changeSpeed(this.bicycleSpecification.getBrakeSpeed());

    }

    public BicycleType getBicycleType(){
        return this.bicycleSpecification.getBicycleType();
    }


}
