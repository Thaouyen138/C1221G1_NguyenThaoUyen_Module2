package case_study_module2.models;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String nameService, double areaUsed, double cost, int maxPeople, String typeRent, String freeService) {
        super(nameService, areaUsed, cost, maxPeople, typeRent);
        this.freeService = freeService;
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }
    public String getInFor(){
        return super.getInFor()+freeService;
    }
}
