package com.Demo06.www;

/**
 * @projectName:
 * @fileName:
 * @packageName: Phone
 * @author: Mr.乐
 * @date: 2020/8/10 23:09
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:
 */

public class Phone {
    String brand ;
    double price;
    String color;

    public Phone(String s) {

    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "手机信息" +
                "品牌:" + brand + '\t' +
                "价格:" + price +'\t'+
                "颜色:" + color + '\t'
                ;
    }
}
