/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.System;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

/**
 *
 * @author robertvokac
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class int_ {
    private int value;
    public int get() {return value;}
    public void set(int valueIn) {this.value = valueIn;}
    public static int_ of(int i) {
        return new int_(i);
    }
    public String ToString() {
        return Integer.toString(value);
    }
    public String ToString(String format) {
    if (format == null || format.isEmpty()) {
        return Integer.toString(value);
    }

    char formatSpecifier = format.charAt(0);
    switch (formatSpecifier) {
        case 'D': { // Decimal with leading zeros
            int digits = Integer.parseInt(format.substring(1));
            String valueStr = Integer.toString(value);
            int padding = Math.max(0, digits - valueStr.length());
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < padding; i++) {
                result.append('0');
            }
            result.append(valueStr);
            return result.toString();
        }

        case 'X': // Hexadecimal
            return Integer.toHexString(value).toUpperCase();

        case 'N': { // Number with grouping
            String valueStr = Integer.toString(value);
            StringBuilder result = new StringBuilder();
            int length = valueStr.length();
            for (int i = 0; i < length; i++) {
                result.append(valueStr.charAt(i));
                if ((length - i - 1) % 3 == 0 && i != length - 1) {
                    result.append(','); // Add grouping separator
                }
            }
            return result.toString();
        }

        default:
            throw new IllegalArgumentException("Unsupported format: " + format);
    }
    }
    
}
