/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.System;

import com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.nullable;

/**
 *
 * @author robertvokac
 */
public class object {
    public static boolean ReferenceEquals(@nullable Object objA, @nullable Object objB) {
        if(objA == null && objB == null) {return true;}
        if(objA == null || objB == null) {return false;}
        return objA.equals(objB);
    }
}
