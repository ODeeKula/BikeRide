package bicycle.rides;


import bicycles.rides.BikeRideOne;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideOneTest {
    @Test
    public void mountainBikeRideOneTest(){
        //Bicycle bicycle =  new Bicycle();
        MountainBike mountainBike = new MountainBike();

        BikeRideOne travel = new BikeRideOne(mountainBike);
        travel.ride();
        assertEquals(19, travel.currentSpeed());
    }

    @Test
    public void roadBikeRideOneTest(){
        RoadBike roadBike = new RoadBike();
        BikeRideOne explore = new BikeRideOne(roadBike);
        explore.ride();
        assertEquals(47, explore.currentSpeed());

    }

    @Test
    public void tandemBikeRideOneTest(){
        Tandem tandem = new Tandem();
        BikeRideOne world = new BikeRideOne(tandem);
        world.ride();
        assertEquals(46,  world.currentSpeed());

    }



}

