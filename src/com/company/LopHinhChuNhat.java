package com.company;

public class LopHinhChuNhat {


    double width;
    double height;

    public LopHinhChuNhat() {
    }

    public LopHinhChuNhat(double width, double heigth) {
        this.width = width;
        this.height = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return height;
    }

    public void setHeigth(double heigth) {
        this.height = heigth;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}

