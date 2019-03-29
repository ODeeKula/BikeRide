package bicycle.specs;

import bicycles.BicycleType;
import bicycles.specs.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeSpecTest {
    @Test
    public void roadBikeSpecTest() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, - 4, BicycleType.RoadBike );
        assertEquals(11, roadBikeSpec.getAccelerationSpeed());
        assertEquals(-4, roadBikeSpec.getBrakeSpeed());
        assertEquals(BicycleType.RoadBike, roadBikeSpec.getBicycleType());

    }
}
