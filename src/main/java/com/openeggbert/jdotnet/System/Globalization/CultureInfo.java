/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.System.Globalization;

import com.openeggbert.jdotnet.System.IFormatProvider;
import lombok.Getter;

/**
 *
 * @author robertvokac
 */
public class CultureInfo implements IFormatProvider {
    public static CultureInfo getCurrentCulture() {
        //todo
        return null;
    }
    @Getter
    private String TwoLetterISOLanguageName;
    public static final CultureInfo InvariantCulture = new CultureInfo();//todo
//    public String ToString(StringBuilder sb, int number) {
//        
//    }
}
