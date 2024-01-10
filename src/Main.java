import java.security.cert.CertPathValidatorException;

public class Main {
    public static void main(String[] args) {

        triangle triangle = new triangle();

        triangle.setA(10);
        triangle.setB(10);
        triangle.setC(9);
        triangle.area();

        System.out.println(triangle.area());



    }
}