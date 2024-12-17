/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.System.IO;

import lombok.Getter;

/**
 *
 * @author robertvokac
 */
public enum FileMode {
    CreateNew(1),
    Create(2),
    Open(3),
    OpenOrCreate(4),
    Truncate(5),
    Append(6);

    FileMode(int number) {
        this.number = number;
    }
    @Getter
    private final int number;
}
