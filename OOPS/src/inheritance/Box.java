package inheritance;

public class Box {

    double l;
    double h;
    double w;

    Box(){
        super();//object class
        this.h =-1;
        this.l = -1;
        this.w = -1;
    }
    //cube
    Box( double side){
        super();
        this.w= side;
        this.l=side;
        this.h=side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old ){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

}
