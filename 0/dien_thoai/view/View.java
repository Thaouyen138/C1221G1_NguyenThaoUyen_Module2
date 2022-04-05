package dien_thoai.view;
//import c09_quan_ly_dien_thoai.controllers.PhonesController;

import dien_thoai.controllers.PhonesController;

public class View {
    public static void main(String[] args) {
        PhonesController phonesController = new PhonesController();
        phonesController.displayMainPhonesMenu();
    }
}