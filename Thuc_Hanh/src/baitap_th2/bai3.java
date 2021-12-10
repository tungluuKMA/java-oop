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
//Nhập vào ngày, thàng, năng và cho biết đó là ngày thứ bao nhiêu trong năm (biết
//rằng một năm có 365 ngày hoặc 366 ngày với năm nhuận).
public class bai3 {
    public static boolean laNamNhuan(int c) {
	return (c % 4 == 0 && c % 100 != 0) || c % 400 == 0;

	
    }
    
    public static int tinhSoNgayTrongThang(int b, int c)
    {
	int soNgay = 0;

	switch (b)
	{
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12: 
		soNgay = 31;
		break;
	case 4:
	case 6:
	case 9:
	case 11: 
		soNgay = 30;
		break;
	case 2:
		if (laNamNhuan(c))
		{
			soNgay = 29;
		}
		else
		{
			soNgay = 28;
		}
		break;
	}

	return soNgay;
    }
    
    public static boolean laNgayHopLe(int a, int b, int c) {
	boolean check = true; 

	// Kiểm tra năm
	if ((c > 0))
	{
		check = false; 
                System.out.println("năm không hợp lệ");
	}

	// Kiểm tra tháng
	if ((b >= 1 && b <= 12))
	{
		check = false; 
                System.out.println("tháng không hợp lệ ");
	}

	// Kiểm tra ngày
	if (!(c >= 1 && c <= tinhSoNgayTrongThang(b,c)))
	{
		check = false;
                System.out.println("ngày không hợp lệ");
	}

	return check; 
    }
    
    public static int tinhSTTNgayTrongNam(int a, int b, int c) {
	int count = 0;

	for (int i = 1; i <= b ; i++)
	{
		count = count + tinhSoNgayTrongThang(i, c);
	}

	return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào ngày : ");
        int a = sc.nextInt();
        System.out.println("nhập vào tháng : ");
        int b = sc.nextInt();
        System.out.println("nhập vào năm : ");
        int c = sc.nextInt();
        
        System.out.println(""+tinhSTTNgayTrongNam(a,b,c));
        
        
    }
}
