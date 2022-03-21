package case_study_module2.models;

public abstract class Facility {
    //Tên dịch vụ, Diện tích sử dụng, Chi phí thuê,
    // Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).
    private String nameService;
    private double areaUsed;
    private double cost;
    private int maxPeople;
    private String typeRent;

    public Facility() {
    }

    public Facility(String nameService, double areaUsed, double cost, int maxPeople, String typeRent) {
        this.nameService = nameService;
        this.areaUsed = areaUsed;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.typeRent = typeRent;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return
                "nameService='" + nameService + '\'' +
                ", areaUsed=" + areaUsed +
                ", cost=" + cost +
                ", maxPeople=" + maxPeople +
                ", typeRent='" + typeRent + '\''
                ;
    }
    public String getInFor(){
        return nameService+","+areaUsed+","+cost+","+maxPeople+","+typeRent+",";
    }
}
