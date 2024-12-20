/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.System;

import com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.Struct;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author robertvokac
 */
@AllArgsConstructor
@NoArgsConstructor
public class TimeSpan extends Struct<TimeSpan> {
    public static TimeSpan FromTicks(long ticks) {return null;}
    public static TimeSpan FromSeconds(double seconds) {return null;}
    private long _ticks;
    public long Ticks() {
        return this._ticks;
    }

    @Override
    public TimeSpan copy() {
        return new TimeSpan(_ticks);
    }

    @Override
    public TimeSpan reset() {
        this._ticks = 0l;
        return this;
    }
}
