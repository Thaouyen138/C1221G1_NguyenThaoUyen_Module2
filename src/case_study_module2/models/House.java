package case_study_module2.models;

public class House  extends Facility{
    private String standardHouse;
    private int floorHouse;

    public House() {
    }

    public House(String standardHouse, int floorHouse) {
        this.standardHouse = standardHouse;
        this.floorHouse = floorHouse;
    }

    public House(String nameService, double areaUsed, double cost, int maxPeople, String typeRent, String standardHouse, int floorHouse) {
        super(nameService, areaUsed, cost, maxPeople, typeRent);
        this.standardHouse = standardHouse;
        this.floorHouse = floorHouse;
    }


    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public int getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(int floorHouse) {
        this.floorHouse = floorHouse;
    }

    @Override
    public String toString() {
        return "House{" + super.toString()+
                "standardHouse='" + standardHouse + '\'' +
                ", floorHouse=" + floorHouse +
                '}';
    }
    public String getInFo(){
        return super.getInFor()+standardHouse+","+floorHouse;
    }
}
