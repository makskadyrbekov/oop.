public class triangle {

    private double a, b, c;

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }
    public double area(){
       double s = (a+b+c) /2;
       double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
       return area;


    }


}



