/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.JDotNet;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author robertvokac
 */
public class Pair<A,B> {
    @Getter @Setter
    private A value1;
    @Getter @Setter
    private B value2;
    public Pair(A value1, B value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    
}
