/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.System;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Getter;

/**
 *
 * @author robertvokac
 */
public class String_ {

    protected String_() {
        //Not meant to be instantiated.
    }
    @Getter
    private String value;
    
    
    public static boolean IsNullOrEmpty(String string) {
        return string == null || string.isEmpty();
    }

    public static String Format(String template, Object... args) {
    if (template == null || args == null) {
        throw new IllegalArgumentException("Template and arguments must not be null.");
    }

    StringBuilder result = new StringBuilder();
    int length = template.length();

    for (int i = 0; i < length; i++) {
        char c = template.charAt(i);
        if (c == '{') {
            int closingBrace = template.indexOf('}', i);
            if (closingBrace == -1) {
                throw new IllegalArgumentException("Unmatched '{' in the template.");
            }

            String placeholder = template.substring(i + 1, closingBrace);
            int index;
            try {
                index = Integer.parseInt(placeholder);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid placeholder: {" + placeholder + "}");
            }

            if (index < 0 || index >= args.length) {
                throw new IllegalArgumentException("Placeholder index out of range: " + index);
            }

            result.append(args[index].toString());
            i = closingBrace; // Skip to the closing brace
        } else {
            result.append(c);
        }
    }

    return result.toString();
    }
    
    public String_(char ch, int times) {
        if(times < 0) {
            throw new Exception_("times cannot be less than 0");
        }
        if(times == 0) {value = "";return;}
        if(times == 1) {value = String.valueOf(ch); return;}
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i< times;i++) {
            sb.append(ch);
        }
        value = sb.toString();
    }

    @Override
    public String toString() {
        return getValue();
    }
    
    public static String Format(Locale l, String format, Object... args) {
        if (format == null || args == null) {
            throw new IllegalArgumentException("Format string and arguments must not be null.");
        }

        StringBuilder result = new StringBuilder();
        int argIndex = 0;
        int length = format.length();

        for (int i = 0; i < length; i++) {
            char c = format.charAt(i);
            if (c == '%' && i + 1 < length) {
                char next = format.charAt(i + 1);
                if (next == '%') {
                    // Escaped percent sign
                    result.append('%');
                    i++;
                } else if (argIndex < args.length) {
                    result.append(formatArgument(next, args[argIndex++]));
                    i++;
                } else {
                    throw new IllegalArgumentException("Insufficient arguments provided for format string.");
                }
            } else {
                result.append(c);
            }
        }

        if (argIndex < args.length) {
            throw new IllegalArgumentException("Too many arguments provided for format string.");
        }

        return result.toString();
    }

    private static String formatArgument(char formatType, Object arg) {
        if (arg == null) {
            return "null";
        }

        switch (formatType) {
            case 'd': // Integer
                if (arg instanceof Number) {
                    return Integer.toString(((Number) arg).intValue());
                }
                break;
            case 'f': // Floating-point
                if (arg instanceof Number) {
                    return String.valueOf(((Number) arg).doubleValue());
                }
                break;
            case 's': // String
                return arg.toString();
            case 'x': // Hexadecimal
                if (arg instanceof Number) {
                    return Integer.toHexString(((Number) arg).intValue());
                }
                break;
            default:
                throw new IllegalArgumentException("Unsupported format type: %" + formatType);
        }

        throw new IllegalArgumentException("Invalid argument type for format type: %" + formatType);
    }

}
