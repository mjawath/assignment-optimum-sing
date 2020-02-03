import com.singtel.assingment.animal.butterfly.Butterfly;
import org.junit.Assert;
import org.junit.Test;

public class DChangeTest {

    @Test
    public void testButterFly(){
        Butterfly butterfly = new Butterfly(Butterfly.LifeState.BUTTERFLY);
        Assert.assertTrue(butterfly.isFlyable());
    }
    @Test
    public void testButterFlyMakeSound(){
        Butterfly butterfly = new Butterfly(Butterfly.LifeState.BUTTERFLY);
        Assert.assertFalse(butterfly.isSing());
    }
    @Test
    public void testCatapiller(){
        Butterfly butterfly = new Butterfly(Butterfly.LifeState.CATERPILLAR);
        Assert.assertFalse(butterfly.isFlyable());
    }

    @Test
    public void testCaterpillarWalk(){
        Butterfly butterfly = new Butterfly(Butterfly.LifeState.CATERPILLAR);
        Assert.assertTrue(butterfly.isWalkable());
    }
}
