import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Eren", Rank.CAPTAIN, "1234");
    }

    @Test
    public void hasName(){
        assertEquals("Eren", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void getLicenseNumber(){
        assertEquals("1234", pilot.getPilotLicenseNum());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Vrooom", pilot.flyPlane());
    }
}
