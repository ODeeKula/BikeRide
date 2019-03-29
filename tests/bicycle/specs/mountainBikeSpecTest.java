package bicycle.specs;

import bicycles.BicycleType;
import bicycles.specs.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class mountainBikeSpecTest {
    @Test
    public void mountainBikeSpecTest() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, - 3, BicycleType.MountainBike);
        assertEquals(5, mountainBikeSpec.getAccelerationSpeed());
        assertEquals(-3, mountainBikeSpec.getBrakeSpeed());
        assertEquals(BicycleType.MountainBike, mountainBikeSpec.getBicycleType());
    }
}
