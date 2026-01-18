package com.sayali.practice.collections.set;

import com.sayali.practice.collections.queue.StudentMarks;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(2);// no errors but only one 2 is in set
//        System.out.println(set);//[1, 2, 3]


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        Set<Integer> set1 = new HashSet<>(list);
//
//        Set<Integer> set2 = new HashSet<>();
//        set2.add(2);
//        set2.add(3);
//        set2.add(4);
//        set2.add(2);
//        set.remove(2); // [1,3,4]
//        set.clear();

//        System.out.println("set1 : " + set1); // [1,2,3]
//        System.out.println("set2 : " + set2); // [2,3,4]

//        set1.retainAll(set2);    // common in both set
//        System.out.println(set1);// [2,3]
//        System.out.println(set2);// [2,3,4]

//        set1.removeAll(set2);     // intersection of sets
//        System.out.println(set1); // [1]
//        System.out.println(set2); // [2,3,4]

//        set1.addAll(set2);     // union of sets
//        System.out.println(set1); // [1,2,3,4]
//        System.out.println(set2); // [2,3,4]

//        for (int x : set2) {
//            System.out.println(x);
//        }

        Set<Integer> set1 = new HashSet<>(list);
//        System.out.println(set1.contains(1));
//        System.out.println(set1.contains(200));

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(2);
        set2.add(0);

//        Set<Integer> set3 = new LinkedHashSet<>();
//        set3.add(2);
//        set3.add(3);
//        set3.add(4);
//        set3.add(2);
//        set3.add(0);

//        for (int x : set2) {
//            System.out.println(x);
//        }
//
//        for (int x : set3) {
//            System.out.println(x);
//        }
        List<StudentMarks> sm = new ArrayList<>();
        sm.add(new StudentMarks(70,80));
        sm.add(new StudentMarks(38,10));
        sm.add(new StudentMarks(100,38));
        sm.add(new StudentMarks(40,88));
        sm.add(new StudentMarks(97,19));

        Set<StudentMarks> set3 = new LinkedHashSet<>(sm);

        System.out.println(set3.contains(new StudentMarks(70,80)));
        //false reference is compared -> implement equals and hashcode
        //true with equals and hashcode generated

//        System.out.println(set3);



    }
}
