/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.System;

import com.openeggbert.jdotnet.JDotNet.AdditionalClassForDotNetSimulation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robertvokac
 */
@AdditionalClassForDotNetSimulation
public class EventHandlerImpl<T> implements EventHandler<T> {

    private final List<EventListener<T>> list = new ArrayList<>();
    
    @Override
    public void addEventListener(EventListener<T> listener) {
        list.add(listener);
    }

    @Override
    public void removeEventListener(EventListener<T> listener) {
        list.remove(listener);
    }

    @Override
    public void invoke(T eventArgs) {
        for(EventListener<T> e : list) {
            e.onEventHappened(eventArgs);
        }
    }
    
}
