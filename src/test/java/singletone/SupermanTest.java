package singletone;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for {@link Superman}.
 */
public class SupermanTest {

    @Test
    public void testSingletoneInstance(){
        Superman instance1 = Superman.getInstance();
        Superman instance2 = Superman.getInstance();
        assertEquals(instance1.hashCode(), instance2.hashCode());
    }
}
