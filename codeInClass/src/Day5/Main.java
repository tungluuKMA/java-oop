/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day5;

/**
 *
 * @author LENOVO
 */
public class Main {
     public static void main(String[] args) {
        Student st = new Student("tung", 2001, "Bac Ninh");
        st.setStudentCode("AT160456");
        st.showInfor();
        System.out.println("========================================");
        Teacher t = new Teacher("PhuongAnh", 1991, "hanoi");
        t.setSalary(1000);
        t.setTcode("TC01234");
        t.showInfor();
    }
}
