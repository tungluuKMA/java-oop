/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
class Date {
    Scanner input= new Scanner(System.in);
    public int Day,Month,Year;

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    
    public void nhapInfor(){
        System.out.println("nhập ngày ");
        Day=input.nextInt();
        System.out.println("nhập tháng ");
        Month=input.nextInt();
        System.out.println("nhập năm ");
        Year=input.nextInt();
    }

    public void showInfor(){
        System.out.println("ngày: "+getDay()+" tháng: "+getMonth()+" năm: "+getYear());
    }
}
