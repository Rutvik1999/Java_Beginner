/*
9. Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with 
separate methods for each operation whose real and imaginary parts are entered by user.
*/


import java.util.Scanner;
class Complex
{
    double imag;
    double real;
    Complex(double real, double imag)
    {
        this.real = real;
        this.imag = imag;
    }
    static Complex sum(Complex a, Complex b)
    {
        Complex c = new Complex(a.real + b.real, a.imag + b.imag);
        return c;
    }
    static Complex diff(Complex a, Complex b)
    {
        Complex c = new Complex(a.real - b.real, a.imag - b.imag);
        return c;
    }
    static Complex prod(Complex a, Complex b)
    {
        Complex c = new Complex(a.real * b.real - a.imag * b.imag, a.real * b.imag + a.imag * b.real);
        return c;
    }
    
    public static void main(String[] args) 
    {
        Complex c1,c2,c_s,c_d,c_p;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Real and Imag. parts of complex number 1");
        c1 = new Complex(scr.nextDouble(),scr.nextDouble());
        System.out.println("Enter Real and Imag. parts of complex number 2");
        c2 = new Complex(scr.nextDouble(), scr.nextDouble());
        c_s = sum(c1, c2); c_d = diff(c1, c2); c_p = prod(c1, c2); 
        System.out.println("Sum = " + c_s.real + " + i*" + c_s.imag);
        System.out.println("Difference = " + c_d.real + " + i*" + c_d.imag);
        System.out.println("Product = " + c_p.real + " + i*" + c_p.imag);

    }
}