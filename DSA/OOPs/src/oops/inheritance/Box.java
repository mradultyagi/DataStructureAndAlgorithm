package oops.inheritance;


public class Box {
    double l;
    double b;
    double h;

   //no side passed
    Box() {
        this.l=-1;
        this.h=-1;
        this.b=-1;
    }
    //CUBE
    Box(double side){
        this.l=side;
        this.h=side;
        this.b=side;
    }
    Box(double l, double b,double h){
        this.l=l;
        this.h=h;
        this.b=b;
    }
    Box( Box old){
        this.l=old.l;
        this.b=old.b;
        this.h=old.h;
    }
    public void information(){
        System.out.println("running trhe box");
    }
}
