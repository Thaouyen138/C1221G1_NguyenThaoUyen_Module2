package case_study_module2.models;

public class House  extends Facility{
    private String standardHouse;
    private String floorHouse;

    public House() {
    }

    public House(String standardHouse, String floorHouse) {
        this.standardHouse = standardHouse;

        this.floorHouse = floorHouse;
    }

    public House(String nameService, String areaUsed, String cost, String maxPeople, String typeRent, String standardHouse, String floorHouse) {
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



    public String getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(String floorHouse) {
        this.floorHouse = floorHouse;
    }

    @Override
    public String toString() {
        return "House{" + super.toString()+
                "standardHouse='" + standardHouse + '\'' +
                ", floorHouse='" + floorHouse + '\'' +
                '}';
    }
}
