class Complex {

    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imag + b.imag);
    }

    public static Complex sub(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imag - b.imag);
    }

    public static Complex mul(Complex a, Complex b) {
        int x = a.real;
        int y = a.imag;
        int p = b.real;
        int q = b.imag;

        return new Complex(x * p - y * q, x * q + y * p);
    }

    // Must NOT be static
    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } 
        else if (imag == 0 && real != 0) {
            System.out.println(real);
        } 
        else {
            System.out.println(real + " + " + imag + "i");
        }
    }
}

public class ComplexNumber {
    public static void main(String[] args) {
        Complex a = new Complex(7, 8);
        Complex b = new Complex(2, 5);

        Complex m = Complex.add(a, b);
        m.printComplex();   

        Complex n = Complex.sub(a, b);
        n.printComplex();  

        Complex o = Complex.mul(a, b);
        o.printComplex();   
    }
}
