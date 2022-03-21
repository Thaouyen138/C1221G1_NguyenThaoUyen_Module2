package case_study_module2.models;

public class Villa extends Facility {
    private String standardVilla;
    private Double swimmingPool;
    private int floorVilla;

    public Villa() {
    }

    public Villa(String standardVilla, Double swimmingPool, int floorVilla) {
        this.standardVilla = standardVilla;
        this.swimmingPool = swimmingPool;
        this.floorVilla = floorVilla;
    }

    public Villa(String nameService, double areaUsed, double cost, int maxPeople, String typeRent, String standardVilla, Double swimmingPool, int floorVilla) {
        super(nameService, areaUsed, cost, maxPeople, typeRent);
        this.standardVilla = standardVilla;
        this.swimmingPool = swimmingPool;
        this.floorVilla = floorVilla;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public Double getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(Double swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public int getFloorVilla() {
        return floorVilla;
    }

    public void setFloorVilla(int floorVilla) {
        this.floorVilla = floorVilla;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString()+
                "standardVilla='" + standardVilla + '\'' +
                ", swimmingPool=" + swimmingPool +
                ", floorVilla=" + floorVilla +
                '}';
    }
    public String getInFor(){
        return super.getInFor()+standardVilla+","+ swimmingPool+","+floorVilla;
    }
}
