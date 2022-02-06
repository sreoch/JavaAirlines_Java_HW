import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNum;
    private String destination;
    private String depAirport;
    private String depTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> cabinCrewMembers, ArrayList<Passenger> bookedPassengers, Plane plane, String flightNum, String destination, String depAirport, String depTime) {
        this.pilot = pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.bookedPassengers = bookedPassengers;
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.depAirport = depAirport;
        this.depTime = depTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public String getDepTime() {
        return depTime;
    }

    public int getNumberOfPassengers() {
        return getBookedPassengers().size();
    }

    public int getAvailableSeats() {
        return plane.getAvailabileSeats();
    }

    public void bookPassenger(Passenger passenger) {
        if (plane.getPlaneType().getCapacity() > getNumberOfPassengers()) {
            bookedPassengers.add(passenger);
        }
    }

    public int getNumberOfAvailableSeatsOnFlight() {
        return plane.getPlaneType().getCapacity() - getNumberOfPassengers();
    }
}
