package case_study_module2.services.impl;

import case_study_module2.models.Facility;
import case_study_module2.models.House;
import case_study_module2.models.Room;
import case_study_module2.models.Villa;
import case_study_module2.services.FacilityService;
import case_study_module2.utils.ReadAndWrite;
import case_study_module2.utils.Validate;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";
    public static final String REGEX_NAME_SERVICE_STANDARD_TYPE_RENT = "[A-Z][a-z]+";
    public static final String REGEX_AREA_USED = "^([1-9]\\d{2,}|[3-9]\\d)\\.\\d+$";
    public static final String REGEX_SWIM_POOL = "^([1-9]\\d{2,}|[3-9]\\d)\\.\\d+$";
    public static final String REGEX_COST = "^[1-9]\\d*$";
    public static final String REGEX_MAX_PEOPLE = "([1-9]|1[0-9])";
    public static final String REGEX_FLOOR = "^[1-9]\\d*$";
    private static Map<Facility, String> facilityIntergerMap = new LinkedHashMap<>();
    static List<Facility> facilities = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    protected String nameService;
    protected double areaUsed;
    protected double cost;
    protected int maxPeople;
    protected String[] typeRent = {"year", "month", "date", "hour"};
    protected int index;
    protected String standardHouse;
    protected int floorHouse;
    protected double areaPool;
    protected String standardVilla;
    protected int floorVilla;
    protected String idVilla;
    protected String idHouse;
    protected String idRoom;

    public void add() {
        //Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa,
// Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.
        nameService = inputNameService();
        areaUsed = Double.parseDouble(inputAreaUsed());
        cost = Double.parseDouble(inputCost());
        maxPeople = Integer.parseInt(inputMaxPeople());
        System.out.println("type rent");
        for (int i = 0; i < typeRent.length; i++) {
            System.out.println(+i + " :" + typeRent[i]);

        }
        System.out.print("enter your choice:");
        index = Integer.parseInt(scanner.nextLine());

    }

    public String inputIdVilla() {
        System.out.println("Enter Villa:");
        return Validate.regexString(scanner.nextLine(), REGEX_ID_VILLA,
                "bạn đã nhập sai định dang,mã dịch vụ phải có dạng SVVL:");
    }

    public String inputIdHouse() {
        System.out.println("Enter House:");
        return Validate.regexString(scanner.nextLine(), REGEX_ID_HOUSE,
                "bạn đã nhập sai định dang,mã dịch vụ phải có dạng SVVL:");
    }

    public String inputIdRoom() {
        System.out.println("Enter room:");
        return Validate.regexString(scanner.nextLine(), REGEX_ID_ROOM,
                "bạn đã nhập sai định dang,mã dịch vụ phải có dạng SVVL:");
    }

    public String inputNameService() {
        System.out.println("Enter name service :");
        return Validate.regexString(scanner.nextLine(), REGEX_NAME_SERVICE_STANDARD_TYPE_RENT,
                "bạn đã nhập sai định dang,mã dịch vụ phải bắt đầu bằng chừ Hoa:");
    }

    public String inputAreaUsed() {
        System.out.println("Enter area used:");
        return Validate.regexString(scanner.nextLine(), REGEX_AREA_USED,
                "bạn đã nhập sai định dang,diện tích sử dụng phải là số thực lớn hơn 30:");
    }

    public String inputSwimPool() {
        System.out.println("Enter area swim pool:");
        return Validate.regexString(scanner.nextLine(), REGEX_SWIM_POOL,
                "bạn đã nhập sai định dang,diện tích hồ bơi phải là số thực lớn hơn 30:");
    }

    public String inputCost() {
        System.out.println("Enter cost rent:");
        return Validate.regexString(scanner.nextLine(), REGEX_COST,
                "bạn đã nhập sai định dang,chi phí thuê phải là số dương:");
    }

    public String inputMaxPeople() {
        System.out.println("Enter max people:");
        return Validate.regexString(scanner.nextLine(), REGEX_MAX_PEOPLE,
                "bạn đã nhập sai định dang,Số lượng người tối đa phải >0 và nhỏ hơn <20:");
    }

    public String inputFloor() {
        System.out.println("Enter floor:");
        return Validate.regexString(scanner.nextLine(), REGEX_FLOOR,
                "bạn đã nhập sai định dang,số tầng phải là số dương:");
    }

    public String inputTypeRent() {
        System.out.println("Enter type rent:");
        return Validate.regexString(scanner.nextLine(), REGEX_NAME_SERVICE_STANDARD_TYPE_RENT,
                "bạn đã nhập sai định dang,kiểu thuê phải bắt đầu bằng chữ Hoa:");
    }

    public String inputStandard() {
        System.out.println("Enter standard:");
        return Validate.regexString(scanner.nextLine(), REGEX_NAME_SERVICE_STANDARD_TYPE_RENT,
                "bạn đã nhập sai định dang,tiêu chuẩn phòng kiểu thuê phải bắt đầu bằng chữ Hoa:");
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
        idHouse=inputIdHouse();
        System.out.print("standard house:");
        standardHouse = inputStandard();
        floorHouse = Integer.parseInt(inputFloor());
        areaPool = Double.parseDouble(inputSwimPool());

        //String nameService, String areaUsed, String cost, String maxPeople, String typeRent, String standardHouse, String areaPool, String floorHouse)
        House house = new House(nameService, areaUsed, cost, maxPeople, typeRent[index], standardHouse, floorHouse);
        System.out.println(house);
        facilities.add(house);

    }

    @Override
    public void addRoom() {
        add();
        idRoom=inputIdRoom();
        System.out.print("free service");
        String freeService = scanner.nextLine();
        facilities.add(new Room(nameService, areaUsed, cost, maxPeople, typeRent[index], freeService));
        System.out.println(facilities);
    }

    @Override
    public void addVilla() {

//-	Riêng loại Villa sẽ có thêm thông tin: Tiêu chuẩn phòng, Diện tích hồ bơi, Số tầng.
        add();
        idVilla=inputIdVilla();
        System.out.print("standard villa:");
        standardVilla = inputStandard();
        System.out.print("area pool:");
        areaPool = Double.parseDouble(inputSwimPool());
        System.out.print("floor villa");
        floorVilla = Integer.parseInt(inputFloor());
        System.out.println(nameService);
//String nameService, String areaUsed, String cost, String maxPeople, String typeRent, String standardVilla, String floorVilla
        facilities.add(new Villa(nameService, areaUsed, cost, maxPeople, typeRent[index], standardVilla, areaPool, floorVilla));
        System.out.println(facilities);
    }

    @Override
    public void displayMaintain() {

    }

}
