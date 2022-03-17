package case_study_module2.models;

public class Villa extends Facility {
    private String standardVilla;
    private String swimmingPool;
    private String floorVilla;

    public Villa() {
    }

    public Villa(String standardVilla, String floorVilla) {
        this.standardVilla = standardVilla;
        this.floorVilla = floorVilla;
    }

    public Villa(String nameService, String areaUsed, String cost, String maxPeople, String typeRent, String standardVilla,String swimmingPool, String floorVilla) {
        super(nameService, areaUsed, cost, maxPeople, typeRent);
        this.standardVilla = standardVilla;
        this.swimmingPool =swimmingPool;
        this.floorVilla = floorVilla;
    }

    public String getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public String getFloorVilla() {
        return floorVilla;
    }

    public void setFloorVilla(String floorVilla) {
        this.floorVilla = floorVilla;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString()+
                "standardVilla='" + standardVilla + '\'' +
                ", floorVilla='" + floorVilla + '\'' +
                '}';
    }
}
