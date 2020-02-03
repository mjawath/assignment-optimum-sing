import com.singtel.assingment.animal.birds.chickens.roosterpoc.DanishRoosterSong;
import com.singtel.assingment.animal.birds.chickens.roosterpoc.DutchRoosterSong;
import com.singtel.assingment.animal.birds.chickens.roosterpoc.LocalRooster;
import org.junit.Assert;
import org.junit.Test;

public class Bonus01Test {

    @Test
    public void testLocalRooster(){
        LocalRooster rooster = new LocalRooster(new DanishRoosterSong());
        rooster.sing();
        Assert.assertTrue(true);
    }

    @Test
    public void testDutchRooster(){
        LocalRooster rooster = new LocalRooster(new DutchRoosterSong());
        rooster.sing();
        Assert.assertTrue(true);
    }
}
