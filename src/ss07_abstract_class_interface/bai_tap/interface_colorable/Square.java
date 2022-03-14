package ss07_abstract_class_interface.bai_tap.interface_colorable;

public class Square implements Colorable{
    private int canhHinhVuong;
    private String color="red";

    public Square() {
    }

    public Square(int canhHinhVuong, String color) {
        this.canhHinhVuong = canhHinhVuong;
        this.color = color;
    }

    public int getCanhHinhVuong() {
        return canhHinhVuong;
    }

    public void setCanhHinhVuong(int canhHinhVuong) {
        this.canhHinhVuong = canhHinhVuong;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int dienTich(int canhHinhVuong){
        int result;
        result = canhHinhVuong*canhHinhVuong;
        return result;
    }


    @Override
    public void howToColor() {
        System.out.println("color:"+getColor());
    }
}
