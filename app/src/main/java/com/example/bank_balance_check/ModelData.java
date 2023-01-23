package com.example.bank_balance_check;

public class ModelData {

    String BankName;
    int BankImage ;
    String BankNumber;

    public String getBankName() {
        return BankName;
    }

    public String getBankNumber() {
        return BankNumber;
    }

    public void setBankNumber(String bankNumber) {
        BankNumber = bankNumber;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public int getBankImage() {
        return BankImage;
    }

    public void setBankImage(int bankImage) {
        BankImage = bankImage;
    }

}
