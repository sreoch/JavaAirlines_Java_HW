import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember crewMember;
    CabinCrewMember crewMember1;

    @Before
    public void before(){
        crewMember = new CabinCrewMember("Henrik", Rank.FLIGHT_ATTENDANT);
        crewMember1 = new CabinCrewMember("Devon", Rank.FIRST_OFFICER);
    }

    @Test
    public void hasName(){
        assertEquals("Henrik", crewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.FIRST_OFFICER, crewMember1.getRank());
    }

    @Test
    public void canInformPassengers(){
        assertEquals("Who wants a bottle of vodka?", crewMember.informPassengers());
    }

}
