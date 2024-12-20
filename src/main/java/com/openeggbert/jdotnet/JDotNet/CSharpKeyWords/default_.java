/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.JDotNet.CSharpKeyWords;

/**
 *
 * @author robertvokac
 */
public class default_ {

    private default_() {
        //Not meant to be instantiated.
    }

    public static <T extends struct<T>> T default_(T instance) {
        instance.reset();
        return instance;
    }

}
