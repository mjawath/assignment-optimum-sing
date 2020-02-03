import com.singtel.assingment.animal.Counter;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * Test cases for Counting the number animal behavior
 *
 * E. Counting animals
 */
public class CounterTest {


    @Test
    public void testCounter(){
        Counter counter = new Counter();
        Map<String, Integer> count = counter.count();

        Assert.assertTrue("Singing animals ",count.get(Counter.SING)==0);

    }
}
