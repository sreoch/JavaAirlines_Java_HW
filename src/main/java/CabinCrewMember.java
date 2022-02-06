public class CabinCrewMember extends Person {

    private Rank rank;

    public CabinCrewMember(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public String informPassengers() {
        return "Who wants a bottle of vodka?";
    }
}
