/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.JDotNet.CSharpKeyWords;

import com.openeggbert.jdotnet.JDotNet.AdditionalClassForDotNetSimulation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author robertvokac
 * Simulates the C# key word out.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@AdditionalClassForDotNetSimulation
public @interface out {
    String description() default "";
}
