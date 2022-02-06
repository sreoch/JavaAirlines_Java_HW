import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Flight testFlight;
    private Passenger passenger1;
    private Passenger passenger2;
    private CabinCrewMember crewMember1;
    private CabinCrewMember crewMember2;
    private Pilot pilot;
    private Plane plane1;
    private Plane testPlane;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> bookedPassengers;


    @Before
    public void before(){
        passenger1 = new Passenger("Scott", 2);
        passenger2 = new Passenger("Daniel", 1);
        crewMember1 = new CabinCrewMember("Elias", Rank.FLIGHT_ATTENDANT);
        crewMember2 = new CabinCrewMember("Henrik", Rank.FIRST_OFFICER);
        pilot = new Pilot("Lamont", Rank.CAPTAIN, "037");
        cabinCrewMembers = new ArrayList<CabinCrewMember>();
        bookedPassengers = new ArrayList<Passenger>();
        cabinCrewMembers.add(crewMember1);
        cabinCrewMembers.add(crewMember2);
        cabinCrewMembers.add(pilot);
        plane1 = new Plane(PlaneType.BOEING747);
        testPlane = new Plane(PlaneType.TESTPLANE);
        flight = new Flight(pilot, cabinCrewMembers, bookedPassengers, plane1, "GLA22", "GLA", "EDI", "12:00");
        testFlight = new Flight(pilot, cabinCrewMembers, bookedPassengers, testPlane, "GLA22", "GLA", "EDI", "12:00");
    }

    @Test
    public void passengersListStartsEmpty(){
        assertEquals(0, flight.getNumberOfPassengers());
    }

    @Test
    public void getNumberOfAvailableSeats(){
        assertEquals(500, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(2, bookedPassengers.size());
    }

    @Test
    public void cantAddPassengerBecauseTooManyAlreadyOnboard(){
        testFlight.bookPassenger(passenger1);
        testFlight.bookPassenger(passenger1);
        testFlight.bookPassenger(passenger1);
        testFlight.bookPassenger(passenger1);
        testFlight.bookPassenger(passenger1);
        testFlight.bookPassenger(passenger1);
        testFlight.bookPassenger(passenger1);
        testFlight.bookPassenger(passenger1);
        assertEquals(5, bookedPassengers.size());
    }

    @Test
    public void canGetAvailableSeatsOnFlight(){
        testFlight.bookPassenger(passenger1);
        testFlight.bookPassenger(passenger1);
        testFlight.bookPassenger(passenger1);
        testFlight.bookPassenger(passenger1);
        assertEquals(1, testFlight.getNumberOfAvailableSeatsOnFlight());
    }




}
