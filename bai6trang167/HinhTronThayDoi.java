package com.bai6trang167;

public class HinhTronThayDoi extends HinhTron implements ThayDoiKichThuoc{
    private double phanTram;

    public HinhTronThayDoi(double banKinh, double phanTram){
        super(banKinh);
        changeR(phanTram);
        this.phanTram = phanTram;
    }
    @Override
    public void thayDoi(double phanTram){
        changeR(phanTram);
    }
}
