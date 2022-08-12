import com.zinkworks.AreaCalculator;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

public class AreaCalculatorTest {
    @InjectMocks
    AreaCalculator calc;

    @Test
    void area() {
        assertEquals(314.1592653589793, calc.area(10));
        assertEquals(100, calc.area(10, 10));
        assertEquals(-1.0, calc.area(-1));
        assertEquals(-1.0, calc.area(1, -1));

        //verify(calc, atLeastOnce()).area(10);
    }

}
