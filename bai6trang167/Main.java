package com.bai6trang167;

public class Main {

    public static void main(String[] args) {
        HinhTron tron = new HinhTron(10);
        System.out.println(tron.toString());

        HinhTronThayDoi tron1 = new HinhTronThayDoi(8,-10);
        System.out.println("Sau khi bán kính giảm 10%");
        System.out.println(tron1.toString());


    }
}
