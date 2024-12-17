/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.System;

/**
 *
 * @author robertvokac
 */
public class Math_ {
    private Math_() {
        //Not meant to be instantiated.
    }
    public static final double PI = Math.PI;

    public static int Min(int a, int b) {
        return Math.min(a, b);
    }
    
    public static int Max(int a, int b) {
        return Math.max(a, b);
    }
    
    public static double Min(double a, double b) {
        return Math.min(a, b);
    }
    
    public static double Max(double a, double b) {
        return Math.max(a, b);
    }
    public static double Cos(double a) {
        return Math.cos(a);
    }
    
    public static double Sin(double a) {
        return Math.sin(a);
    }
    
    public static int Abs(int a) {
        return Math.abs(a);
    }
    public static double Abs(double a) {
        return Math.abs(a);
    }
    public static double Pow(double a, double b) {
        return Math.pow(a, b);
    }
}
