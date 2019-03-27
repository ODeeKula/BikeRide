package bicycle;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.rides.BikeRideThree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideThreeTest {
    @Test

    public void mountainBikeTestThree(){
        MountainBike mountainBike = new MountainBike();
        BikeRideThree all =  new BikeRideThree(mountainBike);
        all.ride();
        assertEquals(15, all.currentSpeed());
    }

    @Test
    public void roadBikeTestThree(){
        RoadBike roadBike =  new RoadBike();
        BikeRideThree places = new BikeRideThree(roadBike);
        places.ride();
        assertEquals(46, places.currentSpeed());

    }

    @Test
    public void tandemTestThree(){
        Tandem tandem = new Tandem();
        BikeRideThree space = new BikeRideThree(tandem);
        space.ride();
        assertEquals(37, space.currentSpeed());
    }


}


