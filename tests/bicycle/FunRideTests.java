package bicycle;

import bicycles.*;
import bicycles.Specs.BicycleFromSpec;
import bicycles.Specs.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTests {
//  Bicycle speciifications:
    BicycleSpecification mountainBike = new BicycleSpecification(5, -3, BicycleType.MountainBike);
    BicycleSpecification roadBike = new BicycleSpecification(11, -4, BicycleType.RoadBike);
    BicycleSpecification tandem = new BicycleSpecification(12, -7, BicycleType.Tandem);
//  declared obj for bicycleType
    Bicycle bicycle = new BicycleFromSpec(mountainBike);
    Bicycle bicycle2 = new BicycleFromSpec(mountainBike);
    Bicycle bicycle3 = new BicycleFromSpec(mountainBike);
    Bicycle bicycle4 = new BicycleFromSpec(roadBike);
    Bicycle bicycle5 = new BicycleFromSpec(roadBike);
    Bicycle bicycle6 = new BicycleFromSpec(roadBike);
    Bicycle bicycle7 = new BicycleFromSpec(roadBike);
    Bicycle bicycle8 = new BicycleFromSpec(roadBike);
    Bicycle bicycle9 = new BicycleFromSpec(tandem);
    Bicycle bicycle10 = new BicycleFromSpec(tandem);
    Bicycle bicycle11 = new BicycleFromSpec(tandem);
    Bicycle bicycle12 = new BicycleFromSpec(tandem);
    Bicycle bicycle13 = new BicycleFromSpec(tandem);


    @Test
    public void howManyMountainBikes(){
        FunRide funRide = new FunRide(3);
        funRide.acceptMethod(bicycle);
        funRide.acceptMethod(bicycle2);
        funRide.acceptMethod(bicycle3);
        assertEquals(3, funRide.getEnteredCount());
    }



    @Test
    public void howManyRoadBikes(){
        FunRide funRide = new FunRide(20);
        funRide.acceptMethod(bicycle4);
        funRide.acceptMethod(bicycle5);
        funRide.acceptMethod(bicycle6);
        funRide.acceptMethod(bicycle7);
        funRide.acceptMethod(bicycle8);
        assertEquals(5, funRide.getEnteredCount());

    }

    @Test
    public void howManyTandemBikes(){
        FunRide funRide = new FunRide(10);
        funRide.acceptMethod(bicycle9);
        funRide.acceptMethod(bicycle10);
        funRide.acceptMethod(bicycle11);
        funRide.acceptMethod(bicycle12);
        assertEquals(4, funRide.getEnteredCount());
    }

}
