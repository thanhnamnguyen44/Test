import java.math.*;
public class ptb2 {
    double a,b,c,dt;
    public ptb2(double a, double b, double c){
        this.a =  a ;
        this.b = b ;
        this.c = c ;
    }
    public double delta(){
        dt = b*b-4*a*c;
        b=b*-1;a=2*a;
        return Math.sqrt(dt);
    }
    public String x12(){
        if (dt< 0)return "phuong trinh vo nghiem";
        if (dt==0) return "phuong trinh co 1 nghiem x=" + b/a;
        if (dt>0)return "phuong trinh co 2 nghiem x1=" + (b-delta())/a + " x2=" + (b-delta())/a;
    }
}
