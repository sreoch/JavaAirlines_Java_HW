public enum PlaneType {

    BOEING747(500, 183500),
    AIRBUSA380(850, 580000),
    TESTPLANE(5, 10);

    private final int capacity;
    private final long weight;

    PlaneType(int capacity, long weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public long getWeight() {
        return weight;
    }
}
