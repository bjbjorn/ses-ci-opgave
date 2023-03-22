import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    @Test
    public  void onePlusFourEqualsFive() {
        Calculator c = new Calculator(1,4);
        Assertions.assertEquals(5,c.getZ());
    }
}
