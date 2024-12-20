/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.openeggbert.jdotnet.System.Collections.Generic;

import com.openeggbert.jdotnet.System.IO.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lombok.NoArgsConstructor;

/**
 *
 * @author robertvokac
 */
@NoArgsConstructor
public class List_<T> implements Iterable<T> {

    private final List<T> internalList = new ArrayList<>();

    public List_ (List_<T> oldList) {
        for (T item : oldList) {
            Add(item);
        }
    }

    public void Clear() {
        internalList.clear();
    }

    public T ElementAt(int i) {
        return internalList.get(i);
    }

    public T Add(T item) {
        internalList.add(item);
        return item;
    }

    public T YieldReturn(T item) {
        return Add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return internalList.iterator();
    }

    public Iterable<T> Reverse() {
        List_<T> copy = new List_(this);
        Collections.reverse(copy.internalList);
        return copy.internalList;
    }

    public boolean Contains(T o) {
        return internalList.contains(o);
    }

    public boolean Any() {
        return !internalList.isEmpty();
    }

    public void RemoveAt(int i) {
        internalList.remove(i);
    }
    public int Count() {
        return internalList.size();
    }
    public java.util.stream.Stream<T> stream() {
        return internalList.stream();
    }

}
