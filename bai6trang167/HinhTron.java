package com.bai6trang167;

public class HinhTron implements DoiTuongHinhHoc{
    private double banKinh;
    public HinhTron(double banKinh){
        this.banKinh = banKinh;
    }
    public HinhTron(){}
    public double getBanKinh() {
        return banKinh;
    }
    public void changeR(double phanTram){
        double bk = banKinh + banKinh*phanTram/100;
        this.banKinh = bk;
    }
    @Override
    public double DienTich(){
        return 3.14*this.banKinh*this.banKinh;
    }
    public double ChuVi(){
        return 3.14*2*banKinh;
    }

    @Override
    public String toString(){
        return "Hình tròn bán kinh " + getBanKinh() + " có diện tích là : "+this.DienTich()+ "\nvà Chu vi là : "+ ChuVi();
    }
}
