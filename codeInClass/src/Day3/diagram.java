/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

/**
 *
 * @author LENOVO
 */
class diagram {
     public float length,width;
//=================================
    public diagram() {
        this.length = (float) 7.2;
        this.width = (float) 3.2;
    }

    public diagram(float length, float width) {
        this.length = length;
        this.width = width;
    }

//==================================   
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    
    public void showInfor(){
        System.out.println("chiều dài là : "+getLength());
        System.out.println("chiều rộng là: "+getWidth());
        System.out.println("chu vi là : "+(getLength()+getWidth())*2);
        System.out.println("diện tích là : "+getLength()*getWidth());
    }
}
