package test_module_2.services;

import test_module_2.view.NotFoundBankAccountException;

public interface IClassRoomService {
    void add();

    void addStudent();

    void removeStudent() throws NotFoundBankAccountException;

    void displayStudent();

    void displayTeacher();

    void searchStudent();
}
