package bicycle;

import bicycles.Specs.BicycleSpecification;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleFromSpecTest {
    @Test
    public void roadBikeSpecTest() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, - 4, BicycleType.RoadBike );
        assertEquals(11, roadBikeSpec.getAccelerationSpeed());
        assertEquals(-4, roadBikeSpec.getBrakeSpeed());
        assertEquals(BicycleType.RoadBike, roadBikeSpec.getBicycleType());

    }

    @Test
    public void mountainBikeSpecTest() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, - 3, BicycleType.MountainBike);
        assertEquals(5, mountainBikeSpec.getAccelerationSpeed());
        assertEquals(-3, mountainBikeSpec.getBrakeSpeed());
        assertEquals(BicycleType.MountainBike, mountainBikeSpec.getBicycleType());
    }

    @Test
    public void tandemBikeSpecTest() {
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, - 7, BicycleType.Tandem);
        assertEquals(12, tandemBikeSpec.getAccelerationSpeed());
        assertEquals(-7, tandemBikeSpec.getBrakeSpeed());
        assertEquals(BicycleType.Tandem, tandemBikeSpec.getBicycleType());

    }

}
