package quan_li_tai_khoan_ngan_hang.services;

import quan_li_tai_khoan_ngan_hang.utils.NotFoundBankAccountException;

public interface IService {
    void add();
    void display();
    void delete() throws NotFoundBankAccountException;
    void searching();
}