/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_th2;

import java.util.Scanner;

/*
1. Tính tổng dãy
S=1+2-3+……(-1)n+1.n
2. Tính tổng dãy:
S=1!+2!+3!+……+n!
3. Nhập n, nếu n lẻ : tính tổng các số lẻ <n, nếu n chẵn: tính tổng các số chẵn <n.
4. Tính tổng dãy...
*/
public class bai6 {
    //S=1!+2!+3!+......+n!
   public static void sum(int n) {
       int s=0 ;
       int x=1 ;
       for (int i = 1; i <= n; i++) {
               x = x*i;
               s = s+x;
       }
       System.out.println("sum s = " + s);
    } 
    //Nhập n, nếu n lẻ: tính tổng các sốlẻ<n, nếu n chẵn: tính tổng các sốchẵn<n
   
    public static void sum2(int n) {
        int s=0;
        if(n % 2 == 0){
            for (int i = 0; i < n; i++) {
                if(i % 2 == 0)
                    s = s + i ;
            }
        }else{
            for (int i = 0; i < n; i++) {
                if(i % 2 != 0)
                    s = s + i ;
            }
        }
        System.out.println("sum s = "+s);
    }
    //tổng dãy
    
    public static void sum3(int n) {
        double s=0 ;
        for (int i = 1; i <= n; i++) {
            s = s + (double)( i / (i+1) );
        }
        System.out.println("sum s = " +String.valueOf(s));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = input.nextInt();
        sum(n);
        sum2(n);
        sum3(n);
    }
}
