package com.Qaiyyum;

import java.util.*;

    public class Main {
            public static void main(String[] args) {

                // create a LinkedList
                LinkedList<String> list = new LinkedList<String>();

                // Add elements to the LinkedList
                list.add("AA");
                list.add("BB");
                list.add("CC");
                list.add("DD");

                // Displaying linked list before add
                System.out.println("Before: LinkedList: " + list);

                // create a new list having few elements
                List<String> arrayList = new ArrayList<String>();
                arrayList.add("Item1");
                arrayList.add("Item2");
                arrayList.add("Item3");

                // Append the list elements to LinkedList
                list.addAll(arrayList);

                // Displaying the LinkedList after addAll
                System.out.println("After: LinkedList: " + list);

                Object firstElement = list.getFirst();
                System.out.println(firstElement);

                Object lastElement = list.getLast();
                System.out.println(lastElement);

            }
//            ArrayList<String> obj = new ArrayList<String>();
//
//            obj.add("Siti");
//            obj.add("Qaiyyum");
//            obj.add("Ali");
//
//            System.out.println("currently the array have the following element : " + obj);
//
//            obj.add(0,"Abu");
//
//            System.out.println("currently the array have the following element : " + obj);
//
//            obj.remove("Ali");
//
//            System.out.println("currently the array have the following element : " + obj);
//
//            obj.remove(0);
//
//            System.out.println("currently the array have the following element : " + obj);
//
//            obj.set(0,"sitipayung");
//
//            obj.contains("Qaiyyum");
//
//            System.out.println("currently the array have the following element : " + obj);
//
//            System.out.println(obj.get(1));
//
//            obj.clear();
//
//            System.out.println(obj);

//
    }

