import com.singtel.assingment.animal.birds.SomeSingableBird;
import org.junit.Assert;
import org.junit.Test;

public class BirdTest {


    @Test
    public void testSing(){
        SomeSingableBird bird = new SomeSingableBird();
        bird.sing();
        Assert.assertTrue(true);
    }
}
