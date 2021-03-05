package com.erg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer>  List01 = new ArrayList<>();
        List01.add(5);
        List01.add(9);
        List01.add(2);
        List01.add(6);
        int long01 = List01.size();
        System.out.println("Long of List01 :" +long01);
        int firstelement = List01.get(0);
        int secondelement = List01.get(1);
        int thirdelement = List01.get(2);
        int fourthelement = List01.get(3);
        for (int i = 0; i < List01.size(); i++) {
            System.out.println((i+1) + "nd element is :" + List01.get(i));
            
        }
    }
}
