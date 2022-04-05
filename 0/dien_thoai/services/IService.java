package dien_thoai.services;

//
//import c09_quan_ly_dien_thoai.utils.NotFoundProductException;

import dien_thoai.utils.NotFoundProductException;

public interface IService {
    void add();

    void remove() throws NotFoundProductException;

    void display();

    void search();
}