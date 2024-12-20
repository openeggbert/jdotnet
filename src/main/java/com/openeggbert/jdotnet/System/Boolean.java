/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.System;

import com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.struct;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.readonly;
import com.openeggbert.jdotnet.JDotNet.CSharpKeyWords.const_;

/**
 *
 * @author robertvokac
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@readonly
class Boolean extends struct<Boolean> {

    protected Boolean() {
        this.m_value = false;
        //Not meant to be instantiated.
    }
    private @readonly final boolean m_value;
    public boolean get() {
        return m_value;
    }
    public static Boolean of(boolean b) {
        return new Boolean(b);
    }
    @Override
    public Boolean copy() {
        return new Boolean(m_value);
    }

    @Override
    public Boolean reset() {
        throw new UnsupportedOperationException();
    }

}
