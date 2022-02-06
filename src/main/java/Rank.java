public enum Rank {

    CAPTAIN("Captain"),
    FIRST_OFFICER("First Officer"),
    FLIGHT_ATTENDANT("Flight Attendant");

    private final String rank;

    Rank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
