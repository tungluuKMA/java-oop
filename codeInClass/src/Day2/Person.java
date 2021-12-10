/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

/**
 *
 * @author LENOVO
 */
class Person {
    public String name,address,country;
    public int yob;

    public Person() {
        this.name = "KMA-456";
        this.address = "BacNinh";
        this.country = "VN";
        this.yob = 2001;
    }

    public Person(String name, String address, String country, int yob) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.yob = yob;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYob() {
        return yob;
    } 

    public void setYob(int yob) {
        this.yob = yob;
    }
    
    public void xuatInfor(){
        System.out.println("name: "+getName());
        System.out.println("namSinh: "+getYob());
        System.out.println("quocTich: "+getCountry());
        System.out.println("diaChi: "+getAddress());
    }
    
    public void tuoi(){
        LocalDate localdate= LocalDate.now();
        int year = localdate.getYear();
        System.out.println("tuoi: "+(year-getYob()));
    }
    
    public void xuatInfor( String name){
        System.out.println("name: "+name);
        System.out.println("namSinh: "+getYob());
        System.out.println("quocTich: "+getCountry());
        System.out.println("diaChi: "+getAddress());
    }
}
