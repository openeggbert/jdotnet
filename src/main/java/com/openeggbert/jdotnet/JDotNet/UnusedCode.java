/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.JDotNet;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author robertvokac
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
@AdditionalClassForDotNetSimulation
public @interface UnusedCode {
    String description() default "";
}