/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh4.bai1;

/**
 *
 * @author LENOVO
 */
public class ToanHoc {
    public static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println(n + " is perfect number");
        } else {
            System.out.println(n + " is not perfect number");
        }
    }
    
    public static void isNumberSquare(int n){
        double sq = Math.sqrt(n);
        
        if ((sq - Math.floor(sq)) == 0)
            System.out.println(n+ " is number square");
        else
            System.out.println(n+ " is not number square");
    }
    
    public static void sum(int n){
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + (i/(i+1));
        }
        System.out.println("sum s :"+String.valueOf(s));
    }
}
