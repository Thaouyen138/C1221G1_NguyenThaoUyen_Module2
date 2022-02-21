package ss04_layer_and_object_in_java.bai_tap.quadratic_equation;

public class QuadracticEquation {
    double a,b,c;
    public QuadracticEquation(){
    }
    public QuadracticEquation(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double  getDiscriminant (){
        return (this.b*this.b) - (4*a*c);
    }
    public double getRoot(){
        return -this.b/(2*a);
    }
    public double  getRoot1 (){
        return (-this.b + Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double getRoot2 (){
        return (-this.b - Math.sqrt(getDiscriminant()))/(2*a);
    }


}
