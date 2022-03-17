package case_study_module2.models;

public abstract class Facility {
    //Tên dịch vụ, Diện tích sử dụng, Chi phí thuê,
    // Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).
    private String nameService;
    private String areaUsed;
    private String cost;
    private String maxPeople;
    private String typeRent;

    public Facility() {
    }

    public Facility(String nameService, String areaUsed, String cost, String maxPeople, String typeRent) {
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

    public String getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(String areaUsed) {
        this.areaUsed = areaUsed;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
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
                ", areaUsed='" + areaUsed + '\'' +
                ", cost='" + cost + '\'' +
                ", maxPeople='" + maxPeople + '\'' +
                ", typeRent='" + typeRent + '\''
                ;
    }
}
