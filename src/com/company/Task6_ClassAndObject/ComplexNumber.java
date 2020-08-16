/*
* Print the sum, difference and product of two
* complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by user.
 */



package com.company.Task6_ClassAndObject;

import java.util.Scanner;

/*
 * ComplexNumber.java
 * Defines a Complex number in the form a + bi
 * where a and b are real numbers
 * and i is the imaginary part
 */
public class ComplexNumber {

    // Attributes
    private double a;
    private double b;

    /**
     * Default constructor
     */
    public ComplexNumber() {
        this.a = 0;
        this.b = 0;
    }

    /**
     * Parameterized constructor
     *
     * @param a
     * - real number
     * @param b
     * - real number
     */
    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * This method checks whether obj is equal to this object
     */
    @Override
    public boolean equals(Object obj) {
        // Check if obj is null or whether obj is not an instance of
        // ComplexNumber
        if ((obj == null) || !(obj instanceof ComplexNumber))
            return false;

        // Cast obj to ComplexNumber
        ComplexNumber c = (ComplexNumber) obj;

        // Check whether a and b of this and c are same
        if ((this.a == c.a) && (this.b == c.b))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        // Check if a and b both are zero
        if ((a == 0.0) && (b == 0.0))
            return String.format("%.6f", 0.0);
        else {
            StringBuffer sb = new StringBuffer();

            // Append a if a is not zero
            if (a != 0.0)
                sb.append(String.format("%.6f", a));

            // Check if b is not zero
            if (b != 0.0) {
                // Append sign and b
                if (b < 0.0)
                    sb.append(" - " + String.format("%.6f", b * -1) + "i");
                else {
                    if (a != 0.0)
                        sb.append(" + ");
                    sb.append(String.format("%.6f", b) + "i");
                }
            }

            // Return sb
            return sb.toString();
        }
    }

    /**
     * This method adds ComplexNumber c to ComplexNumber this and returns the
     * result as a new ComplexNumber object.
     *
     * @param c
     * - ComplexNumber reference object
     */
    public ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber((this.a + c.a), (this.b + c.b));
    }

    /**
     * This method subtracts ComplexNumber c from ComplexNumber this and returns
     * the result as a new ComplexNumber object.
     *
     * @param c
     * - ComplexNumber reference object
     */
    public ComplexNumber subtract(ComplexNumber c) {
        return new ComplexNumber((this.a - c.a), (this.b - c.b));
    }

    /**
     * This method multiplies ComplexNumber c with ComplexNumber this and
     * returns the result as a new ComplexNumber object.
     *
     * @param c
     * - ComplexNumber reference object
     */
    public ComplexNumber multiply(ComplexNumber c) {
        double a = (this.a * c.a) - (this.b * c.b);
        double b = (this.b * c.a) + (this.a * c.b);
        return new ComplexNumber(a, b);
    }

    /**
     * This method multiplies ComplexNumber this by ComplexNumber c and returns
     * the result as a new ComplexNumber object.
     *
     * @param c
     * - ComplexNumber reference object
     */
    public ComplexNumber divide(ComplexNumber c) throws Exception {
        if ((c.a == 0) && (c.b == 0))
            throw new Exception("Cannot divide by 0");

        double denominator = Math.pow(c.a, 2) + Math.pow(c.b, 2);
        double a = ((this.a * c.a) + (this.b * c.b)) / denominator;
        double b = ((this.b * c.a) - (this.a * c.b)) / denominator;
        return new ComplexNumber(a, b);
    }



    public static class ComplexNumberTest {

        public static void main(String[] args) {
            // Scanner to get user input
            Scanner in = new Scanner(System.in);

            // Get first complex number
            System.out.print("Enter the first complex number's real part => ");
            double a = in.nextDouble();
            System.out.print("Enter the first complex number's imaginary part => ");
            double b = in.nextDouble();

            // Create ComplexNumber from a and b
            ComplexNumber c1 = new ComplexNumber(a, b);

            // Get second complex number
            System.out.print("Enter the second complex number's real part => ");
            a = in.nextDouble();
            System.out.print("Enter the second complex number's imaginary part => ");
            b = in.nextDouble();

            // Create ComplexNumber from a and b
            ComplexNumber c2 = new ComplexNumber(a, b);

            // Print c1 and c2
            System.out.print("\ncomplex number 1: " + c1);
            System.out.print("\ncomplex number 2: " + c2);

            // Check whether c1 and c2 are equal
            System.out.print("\nthe numbers are equal? " + c1.equals(c2));

            // Add c1 and c2
            System.out.print("\nadd result: " + c1.add(c2));

            // Subtract c2 from c1
            System.out.print("\nsubtract result: " + c1.subtract(c2));

            // Multiply c1 and c2
            System.out.print("\nmultiply result: " + c1.multiply(c2));

            // Divide c1 by c2
            try{
                System.out.print("\ndivide result: " + c1.divide(c2));
            } catch(Exception e) {
                System.out.print("\n" + e.getMessage());
            }
        }
    }
}