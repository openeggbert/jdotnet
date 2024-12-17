/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.System;

import com.openeggbert.jdotnet.JDotNet.AdditionalClassForDotNetSimulation;

/**
 *
 * @author robertvokac
 */
@AdditionalClassForDotNetSimulation
public interface EventListener<T>{
    
    void onEventHappened(T eventArgs);
    
}
