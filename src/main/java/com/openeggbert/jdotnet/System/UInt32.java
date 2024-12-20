/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.System;

import com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.struct;
import com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.const_;

/**
 *
 * @author robertvokac
 */
public class UInt32 extends struct<UInt32> {

    protected UInt32() {
        //Not meant to be instantiated.
    }
    public @const_ static final long MaxValue = 0xFFFFFFFFL;  // 32-bit unsigned maximum value
    public @const_ static final long MinValue = 0;

    @Override
    public UInt32 copy() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UInt32 reset() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
