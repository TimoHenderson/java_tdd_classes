import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;
    @Before
    public void setUp(){
        bottle = new WaterBottle();
    }

    @Test
    public void startsWith100Volume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canTakeDrink(){
        bottle.drink();
        assertEquals(90,bottle.getVolume());
    }
}
