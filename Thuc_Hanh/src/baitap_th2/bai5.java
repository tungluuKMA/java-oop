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

//Xây dựng lớp ToanHoc, với n là số nguyên dương.
//1. Kiểm tra xem một số nguyên n có phải là số nguyên tố hay không ? 
//2. Kiểm tra xem một nguyên n có phải là số hoàn hảo hay không ?
//3. In ra các số chính phương <=n (n nhập tử bàn phím).
//4. Tính phần tử thứ n của dãy Fibonaci: public static int tinhFibo(int n)

public class bai5 {
public static void isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            System.out.printf("%d is not a prime number \n",n);
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                System.out.printf("%d is not a prime number \n",n);
                
            }
        }
        System.out.printf("%d is a prime number\n",n);     
    }
    
    public static void perfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) //tổng các ước số của a
            {
                sum += i;
            }
        }
        //nếu tổng ước số sum = a thì a là số hoàn hảo
        if (sum == n) {
            System.out.println(n + " is a perfect number");
        } //ngược lại không phải là số hoàn hảo
        else {
            System.out.println(n + " is not a perfect number");
        }
    }
    
    public static void perfectSquareNumber(int n) {
        System.out.printf("perfect square number :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if( j*j == i){
                    System.out.printf("%d ",i);
                }
            }
        }
    }
    
    public static int fibonacci(int n) {
        int f0 = 2;
        int f1 = 1;
        int fn = 0;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = input.nextInt();
        //isPrimeNumber(n);
        //perfectNumber(n);
        perfectSquareNumber(n);
    }
}
