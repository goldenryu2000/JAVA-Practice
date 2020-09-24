import java.util.*;
public class AutoBoxing {

    public static void main(String[] args) {

        //Autoboxing: conversion of primitve data type into their respective Wrapper classes

        char ch = 'a';

        Character x = ch; // Creating a object of Character wrapper class and initialising it with 'ch' ,, which is a primitve data type.

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(25);

        System.out.println(arrayList.get(0));

    }

}
