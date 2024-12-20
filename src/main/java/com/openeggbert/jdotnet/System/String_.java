/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.System;

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

        Pattern pattern = Pattern.compile("\\{(\\d+)}");
        Matcher matcher = pattern.matcher(template);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            String placeholder = matcher.group(1); 
            int index = Integer.parseInt(placeholder);

            if (index < 0 || index >= args.length) {
                throw new IllegalArgumentException("Placeholder index out of range: " + index);
            }

            matcher.appendReplacement(result, args[index].toString());
        }

        // Přidej zbývající část šablony
        matcher.appendTail(result);

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
}
