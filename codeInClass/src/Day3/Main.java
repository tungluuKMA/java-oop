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
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Date/Circle/Home/Diagram/Account");
        String key = input.nextLine();
        switch (key) {
            case "Date":
                Date q = new Date();
                q.nhapInfor();
                q.showInfor();
                break;
            case "Circle":
                Circle c = new Circle();
                c.setColor("red");
                c.setRadius(25);
                c.showInfor();
                break;
            case "Home":
                Home h = new Home();
                h.setFirstName("Vu");
                h.setLastName("khai");
                h.setId(260101);
                h.setSalaryMonthly(3000);
                h.showInfor();
                break;

            case "Diagram":
                diagram d = new diagram();
                d.setLength(20);
                d.setWidth(15);
                d.showInfor();
                break;
            case "Account":
                Account a = new Account();
                a.setBalence(3000);
                a.setName("khai");
                //a.Balence();
                a.showInfor();
                break;
        }
    }
}
