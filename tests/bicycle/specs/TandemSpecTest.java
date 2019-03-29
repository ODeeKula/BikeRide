package bicycle.specs;

import bicycles.BicycleType;
import bicycles.specs.BicycleSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemSpecTest {
    @Test
    public void tandemBikeSpecTest() {
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, - 7, BicycleType.Tandem);
        assertEquals(12, tandemBikeSpec.getAccelerationSpeed());
        assertEquals(-7, tandemBikeSpec.getBrakeSpeed());
        assertEquals(BicycleType.Tandem, tandemBikeSpec.getBicycleType());

    }

}
