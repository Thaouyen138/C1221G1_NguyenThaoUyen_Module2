package oop_java.oop_java2;

import java.util.ArrayList;

public class Account {
    private long accountNumber;
    private String nameNumber;
    private double amountAccount = 50;
 private final double interest=0.035;


    public Account() {
    }

    public Account(long accountNumber, String nameNumber) {
        this.accountNumber = accountNumber;
        this.nameNumber = nameNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNameNumber() {
        return nameNumber;
    }

    public void setNameNumber(String nameNumber) {
        this.nameNumber = nameNumber;
    }

    public double getAmountAccount() {
        return amountAccount;
    }

    public void setAmountAccount(double amountAccount) {
        this.amountAccount = amountAccount;
    }

    public void napTien(double incomtng) {

        setAmountAccount(this.getAmountAccount() + incomtng);
    }
    public void rutTien(double outcomtng){
        double fee=20;
        if (outcomtng > getAmountAccount()){
            System.out.println("không đủ tiền trong tài khoản:");
        }else {
            setAmountAccount(this.getAmountAccount() - (outcomtng +fee));
        }
    }
    public void expire(){

        setAmountAccount(this.getAmountAccount()+ (this.getAmountAccount()*interest));
    }
    public void transfer(long taiKhoanNguoiNhan,double money){

    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", nameNumber='" + nameNumber + '\'' +
                ", amountAccount=" + amountAccount +
                '}';
    }

}
