/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh4.bai2;

/**
 *
 * @author LENOVO
 */
class Diem {
    private double x,y;

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Diem(){
        
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void inTTDiem(){
        System.out.println("tọa độ x: "+ x +"tọa độ y: "+y);
    }
}
