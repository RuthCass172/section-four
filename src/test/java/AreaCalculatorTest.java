import com.zinkworks.AreaCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AreaCalculatorTest {
    AreaCalculator areaCalculator = new AreaCalculator();

    @Test
    void area() {
        assertEquals(314.1592653589793, areaCalculator.area(10));
        assertEquals(100, areaCalculator.area(10, 10));
        assertEquals(-1.0, areaCalculator.area(-1));
        assertEquals(-1.0, areaCalculator.area(1, -1));

    }
}
