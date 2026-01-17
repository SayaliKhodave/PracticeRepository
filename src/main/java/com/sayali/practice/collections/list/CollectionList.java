package com.sayali.practice.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionList {
    public static void main(String[] args) {

//        OurGenericList<Integer> list = new OurGenericList<>();

//        list.add(1);
//        list.add(2);
//        list.add(3);


//        Iterator<Integer> it = list.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }


//        for (int x : list) //also uses iterator in the backend hasnext() and next()
//            System.out.println(x);



//        List<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        System.out.println(list);

        //replace element
//        list.set(1,100);
//        System.out.println(list);
//
//        List<Integer> list2 = new ArrayList<>(list);
//        list2.add(4);
//
//        System.out.println("list : " + list);
//        System.out.println("list2 : " + list2);
//
//        List<Integer> list3 = new ArrayList<>();
//        list3.add(4);
//        list3.add(5);
//        list3.add(6);
//
//        System.out.println(list3);
//        list3.addAll(list);
//        System.out.println(list3.indexOf(4));
//        System.out.println(list3); //[4, 5, 6, 1, 100, 3]
//
//        List<Integer> list4 = list3.subList(1,4); // shallow copy
//        System.out.println(list4);
//
//        list4.set(0,10);
//        System.out.println("list4 : " +list4); //[10, 6, 1]
//        System.out.println("list3 : "+list3);  //[4, 10, 6, 1, 100, 3] changed in list3 as well since its shallow copy unlike other methods


        List<Integer> lk = new ArrayList<>();

        lk.add(null);
        lk.add(2);
        lk.add(null);
        System.out.println(lk);

        Iterator<Integer> it = lk.iterator();
        while (it.hasNext()){
            if (it.next() == 1) {
                it.remove();
            }

        }
        System.out.println(lk); //removes safely correct
//        System.out.println(it.next());     //1
//        System.out.println(it.next());     //2 return and then move cursor             (next++)
//        System.out.println(it.previous()); //2 moves cursor to 2 first and then return (--prev)

//        List<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//
//        System.out.println(list);
//
//        Integer[] arr = list.toArray(new Integer[0]);// no issues if we use 0 size it internally resizes to list.size
//
//        for (int x : arr) {
//            System.out.println( x + ",");
//        }


    }

}
