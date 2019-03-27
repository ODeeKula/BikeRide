package bicycle;

import bicycles.*;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.rides.BikeRide;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTests {
//  Bicycle speciifications:
    BicycleSpecification mountainBike = new BicycleSpecification(5, -3, BicycleType.MountainBike);
    BicycleSpecification roadBike = new BicycleSpecification(11, -4, BicycleType.RoadBike);
    BicycleSpecification tandem = new BicycleSpecification(12, -7, BicycleType.Tandem);
//  declared obj for bicycleType
    Bicycle bicycle = new BicycleFromSpec(mountainBike);
    Bicycle bicycle2 = new BicycleFromSpec(roadBike);
    Bicycle bicycle3 = new BicycleFromSpec(tandem);

    @Test
    public void howManyMountainBikes(){
        FunRide funRide = new FunRide(3);
        funRide.acceptMethod(bicycle);
        funRide.acceptMethod(bicycle);
        funRide.acceptMethod(bicycle);
        assertEquals(3, funRide.getEnteredCount());
    }



    @Test
    public void howManyRoadBikes(){
        FunRide funRide = new FunRide(20);
        funRide.acceptMethod(bicycle2);
        funRide.acceptMethod(bicycle2);
        funRide.acceptMethod(bicycle2);
        funRide.acceptMethod(bicycle2);
        funRide.acceptMethod(bicycle2);
        funRide.acceptMethod(bicycle2);
    }

    @Test
    public void howManyTandemBikes(){
        FunRide funRide = new FunRide(10);
        funRide.acceptMethod(bicycle3);
        funRide.acceptMethod(bicycle3);
        funRide.acceptMethod(bicycle3);
        funRide.acceptMethod(bicycle3);
        assertEquals(4, funRide.getEnteredCount());
    }

}
