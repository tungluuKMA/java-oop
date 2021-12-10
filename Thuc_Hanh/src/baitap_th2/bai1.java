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
//Viết chương trình in ra giá trịtăng giảm của biến i cho trước.
public class bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("input i: ");
        i = input.nextInt();
        System.out.println("i++ = " + (i+1));
        System.out.println("i-- = " + (i-1));
    }
}
