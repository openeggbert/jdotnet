/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.System;

/**
 *
 * @author robertvokac
 */
public interface EventHandler<T> {
    
    void addEventListener(EventListener<T> listener);
    void removeEventListener(EventListener<T> listener);
    void invoke(T eventArgs);

    
}
