package bicycle;

import bicycles.Bicycle;
import bicycles.BicycleFromSpec;
import bicycles.BicycleSpecification;
import bicycles.BicycleType;
import bicycles.models.RoadBike;
import bicycles.rides.BikeRide;
import bicycles.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleFromSpecTest {
    @Test
    public void roadBikeSpecTest() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, - 4, BicycleType.RoadBike );
//        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
//        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
//        bikeRideOne.ride();
        assertEquals(11, roadBikeSpec.getAccelerationSpeed());
        assertEquals(-4, roadBikeSpec.getBrakeSpeed());
        assertEquals(BicycleType.RoadBike, roadBikeSpec.getBicycleType());

    }

    @Test
    public void mountainBikeSpecTest() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, - 3, BicycleType.MountainBike);
//        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
//        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
//        bikeRideOne.ride();
        assertEquals(5, mountainBikeSpec.getAccelerationSpeed());
        assertEquals(-3, mountainBikeSpec.getBrakeSpeed());
        assertEquals(BicycleType.MountainBike, mountainBikeSpec.getBicycleType());
    }

    @Test
    public void tandemBikeSpecTest() {
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, - 7, BicycleType.Tandem);
//        Bicycle bicycle = new BicycleFromSpec(tandemBikeSpec);
//        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
//        bikeRideOne.ride();
        assertEquals(12, tandemBikeSpec.getAccelerationSpeed());
        assertEquals(-7, tandemBikeSpec.getBrakeSpeed());
        assertEquals(BicycleType.Tandem, tandemBikeSpec.getBicycleType());

    }

}
