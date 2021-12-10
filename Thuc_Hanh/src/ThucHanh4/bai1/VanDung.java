/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh4.bai1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class VanDung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào n: ");
        int n=input.nextInt();
        boolean a = ToanHoc.isPrime(n);
        if (a==true) {
            System.out.println(" is Prime");
        }else
            System.out.println("not is prime");
        
        ToanHoc.isPerfectNumber(n);
        ToanHoc.isNumberSquare(n);
        ToanHoc.sum(n);
    }
}
