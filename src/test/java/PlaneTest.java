import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void planeHasWeight(){
        assertEquals(183500, PlaneType.BOEING747.getWeight());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(500, PlaneType.BOEING747.getCapacity());
    }
}
