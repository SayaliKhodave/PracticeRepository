package com.sayali.practice.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class CollectionQueue {

    public static void main(String[] args) {

        //FIFO Queue
//        Queue<Integer> q = new LinkedList<>();
//
//        q.offer(1);
//        q.offer(2);
//
//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q.peek());
//        System.out.println(q.isEmpty());
//
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(1);
//        stack.push(2);
//
//        while(!stack.isEmpty()) {
//            System.out.println(stack.peek());
//            System.out.println(stack.pop());
//        }

        // Double Ended Queue Array Deque
//        Deque<Integer> dq = new ArrayDeque<>();
//
//        dq.offerFirst(1);
//        dq.offerFirst(2);
//
//        dq.offerLast(3);
//        System.out.println(dq);
//
//        dq.peekFirst();
//        dq.pollFirst();
//        System.out.println();

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//
//        pq.offer(1);
//        pq.offer(2);
//        pq.offer(0);
//        pq.offer(100);
//
//        System.out.println(pq);

        //top 2 elements
//        List<Integer> top2 = new ArrayList<>();
//        int index = 0;
//        while (!pq.isEmpty()) {
//            if (index == 2)
//                break;
//            top2.add(pq.poll());
//            index++;
//        }

//        System.out.println(top2);
//        System.out.println(pq);



        //bottom 2 elements
//        List<Integer> bot2 = new ArrayList<>();
//        int index = 0;
//        while (!pq.isEmpty()) {
//            if (index == 2)
//                break;
//            bot2.add(pq.poll());
//            index++;
//        }
//
//        System.out.println(bot2);
//        System.out.println(pq);


//        get me top 3 student accd to their maths marks
//        List<StudentMarks> sm = new ArrayList<>();
//        sm.add(new StudentMarks(70,80));
//        sm.add(new StudentMarks(38,10));
//        sm.add(new StudentMarks(100,38));
//        sm.add(new StudentMarks(40,88));
//        sm.add(new StudentMarks(97,19));
//        System.out.println(sm);
//
//
//        PriorityQueue<StudentMarks> pq = new PriorityQueue<>(sm);
//
//        List<StudentMarks> top3 = new ArrayList<>();
//        int index = 0;
//        while(!pq.isEmpty()){
//            if(index == 3)
//                break;
//            top3.add(pq.poll());
//            index++;
//        }
//        System.out.println(top3);


        // get top2 elements of bot2
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCustomComparator());

        //lambda anonymous compare method
//        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2) -> o2-o1);
//
//        pq.offer(1);
//        pq.offer(2);
//        pq.offer(0);
//        pq.offer(100);
//
//        List<Integer> bot2 = new ArrayList<>();
//        int index = 0;
//        while (!pq.isEmpty()) {
//            if (index == 2)
//                break;
//            bot2.add(pq.poll());
//            index++;
//        }
//
//        System.out.println("bottom array : " +bot2);
//        System.out.println("pq : " + pq);


        List<StudentMarks> sm = new ArrayList<>();
        sm.add(new StudentMarks(70,80));
        sm.add(new StudentMarks(38,10));
        sm.add(new StudentMarks(100,38));
        sm.add(new StudentMarks(40,88));
        sm.add(new StudentMarks(97,19));
        System.out.println(sm);


        PriorityQueue<StudentMarks> pq = new PriorityQueue<>((s1,s2) -> {
            System.out.println("Comparators compare is called");// precedes over Comparables compareTo
            return s2.getMaths()-s1.getMaths();
        });

        for (StudentMarks s : sm) {
            pq.add(s);
        }

        List<StudentMarks> top3 = new ArrayList<>();
        int index = 0;
        while(!pq.isEmpty()){
            if(index == 3)
                break;
            top3.add(pq.poll());
            index++;
        }
        System.out.println("top3 : " + top3);


    }
}
