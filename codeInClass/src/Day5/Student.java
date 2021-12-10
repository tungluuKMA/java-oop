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
public class Student extends Person{
    private String studentCode;
    
    public Student(String name, int yob, String address) {
        super(name, yob, address);
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "Student{" + "studentCode=" + studentCode + '}';
    }
    
    @Override
    public void showInfor(){
        super.showInfor();
        System.out.println("studentCode=" + studentCode );
    }
}