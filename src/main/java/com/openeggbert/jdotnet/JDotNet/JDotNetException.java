/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.JDotNet;

import com.openeggbert.jdotnet.System.*;
import lombok.AllArgsConstructor;

/**
 *
 * @author robertvokac
 */
@AllArgsConstructor
public class JDotNetException extends RuntimeException {
    public JDotNetException(String msg) {
        super(msg);
    }
    
}
