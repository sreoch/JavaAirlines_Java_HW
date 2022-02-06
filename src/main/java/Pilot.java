public class Pilot extends CabinCrewMember{

    private String pilotLicenseNum;

    public Pilot(String name, Rank rank, String pilotLicenseNum) {
        super(name, rank);
        this.pilotLicenseNum = pilotLicenseNum;
    }

    public String getPilotLicenseNum() {
        return pilotLicenseNum;
    }


    public String flyPlane() {
        return "Vrooom";
    }
}
