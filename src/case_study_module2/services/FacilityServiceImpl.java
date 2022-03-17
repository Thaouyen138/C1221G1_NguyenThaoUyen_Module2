package case_study_module2.services;

import case_study_module2.models.Facility;
import case_study_module2.models.House;
import case_study_module2.models.Room;
import case_study_module2.models.Villa;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {

    private static Map<Facility, String> facilityIntergerMap = new LinkedHashMap<>();
    List<Facility> facilities = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    protected String nameService;
    protected String areaUsed;
    protected String cost;
    protected String maxPeople;
    protected String[] typeRent = {"year", "month", "date", "hour"};
    protected int index;

    public void add() {
        //Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa,
// Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.
        System.out.println("name service:");
        nameService = scanner.nextLine();
        System.out.println("area used:");
        areaUsed = scanner.nextLine();
        System.out.println("cost rent:");
        cost = scanner.next();
        System.out.println("max people");
        maxPeople = scanner.nextLine();

        for (int i = 0; i < typeRent.length; i++) {
            System.out.println(+i + " :" + typeRent[i]);

        }
        System.out.print("enter your choice:");
        index = Integer.parseInt(scanner.nextLine());

    }

    @Override
    public void display() {
        for (Facility e : facilities) {
            System.out.println(e);
        }
    }



    @Override
    public void addHouse() {
        add();
        System.out.println("standard house:");
        String standardHouse = scanner.nextLine();

        System.out.println("floor house:");
        String floorHouse = scanner.nextLine();
        //String nameService, String areaUsed, String cost, String maxPeople, String typeRent, String standardHouse, String areaPool, String floorHouse)
        House house = new House(nameService, areaUsed, cost, maxPeople, typeRent[index], standardHouse, floorHouse);
        System.out.println(house);
        facilities.add(house);

    }

    @Override
    public void addRoom() {
        add();
        System.out.println("free service");
        String freeService = scanner.nextLine();
        facilities.add(new Room(nameService, areaUsed, cost, maxPeople, typeRent[index],freeService));
        System.out.println(facilities);
    }

    @Override
    public void addVilla() {

//-	Riêng loại Villa sẽ có thêm thông tin: Tiêu chuẩn phòng, Diện tích hồ bơi, Số tầng.
        add();
        System.out.println("standard villa:");
        String standardVilla = scanner.nextLine();
        System.out.println("area pool:");
        String areaPool = scanner.nextLine();
        System.out.println("floor villa");
        String floorVilla = scanner.nextLine();
        System.out.println(nameService);
//String nameService, String areaUsed, String cost, String maxPeople, String typeRent, String standardVilla, String floorVilla
        facilities.add(new Villa(nameService, areaUsed, cost, maxPeople, typeRent[index], standardVilla, areaPool, floorVilla));
        System.out.println(facilities);
    }

    @Override
    public void displayMaintain() {

    }
}
