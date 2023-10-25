/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Exceptions.ArgumentException;

/**
 *
 * @author ordinateur
 */
public class Operation {
     public static int Addition(int a, int b) {
        int r = a + b;
        return r;
    }

    public static int multiplication(Integer a, Integer b) {
        Integer r;

        if (b == null) {

            throw new ArgumentException("le second argument ne peut etre null");

        }else{

            r = a*b;
            return r;
        }
    }

    public static double division(double a, double b) {
        double r;
        if (b == 0) {

            throw new ArgumentException("Division par impossible!!!");
        }else {
            r = a/b;
            return r;
        }
    }
}
