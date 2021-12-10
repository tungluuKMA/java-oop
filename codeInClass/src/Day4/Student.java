/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
class Student {
    
    public String Id;
    public String lop;
    public double diemTb;
    public int yob;

    public Student(String Id, String lop, double diemTb, int yob) {
        this.Id = Id;
        this.lop = lop;
        this.diemTb = diemTb;
        this.yob = yob;
    }

    public Student() {
        this.Id = "12345678";
        this.lop = "at16";
        this.diemTb = 2.7;
        this.yob = 2001;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public void addInfor() {
        Scanner input = new Scanner(System.in);
        while (true) {

            try {
                System.out.println("Enter id : ");
                Id = input.nextLine();
                if (Id.isEmpty() == false && Id.length() == 8) {
                    break;
                } else {
                    System.out.println("Id khong duoc để trống và đủ 8 ký tự ");
                }

            } catch (Exception e) {
                System.out.println("kkkkkkkkkkkkk");
            }
        }
        while (true) {
            try {
                System.out.println("nhập điểm tb: ");
                diemTb = Double.parseDouble(input.nextLine());
                if (diemTb >= 0 && diemTb <= 10) {
                    break;
                } else {
                    System.out.println("nhập lại điểm diemTb >= 0 && diemTb <= 10 ");
                }
            } catch (NumberFormatException e) {

            }
        }
        while (true) {
            try {
                System.out.println("nhập tuổi: ");
                yob = Integer.parseInt(input.nextLine());
                if (yob >= 18) {
                    break;
                } else {
                    System.out.println("nhập lại tuổi >=18 :");
                }
            } catch (NumberFormatException e) {
            }
        }
        while (true) {
            try {
                System.out.println("nhập lớp: ");
                lop = input.nextLine();
                if ('a' == lop.charAt(0) || lop.charAt(0) == 'c') {
                    break;
                } else {
                    System.out.println("nhập lại lớp có kí tự đầu bằng 'A'hoặc'C'");
                }
            } catch (Exception e) {
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" + "Id= " + Id + ", lop= " + lop + ", diemTb= " + diemTb + ", yob= " + yob + '}';
    }

    public void printInfor() {
        System.out.println("Student{" + "Id= " + Id + ", lop= " + lop + ", diemTb= " + diemTb + ", yob= " + yob + '}');
        hocBong();
    }

    public void hocBong() {
        if (diemTb >= 8) {
            System.out.println("ĐẠT HỌC BỔNG !!!!");
        } else {
            System.out.println("ko đạt học bổng!");
        }
    }
}
