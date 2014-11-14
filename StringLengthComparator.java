/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return new Integer(o1.length()).compareTo(o2.length());
    }
    
}
