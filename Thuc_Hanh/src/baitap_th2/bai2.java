/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_th2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
//Viết các chương trình nhập vào một sốnguyên n và in ra số nhị phân tương ứng với n

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to convert : ");
        int n = sc.nextInt();
        System.out.printf("%d in binary is : %s \n ",n,Integer.toBinaryString(n));
    }
}
