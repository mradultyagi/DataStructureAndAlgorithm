package inheritance;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        this.weight=-1;
    }
    public BoxWeight(double l,double w,double h,double weight){
        super(l,w,h);

        System.out.println(this.w);
        System.out.println(super.w);//use when super class have same variable as in this
        // class so to use explicitelu of super class jaise agar
        // weight box mai bhi hota toh usse use krne ko super use krte

        this.weight=weight;
    }
    BoxWeight(BoxWeight other) {
        this.l = other.l;
        this.w = other.w;
        this.h = other.h;
    }

}
