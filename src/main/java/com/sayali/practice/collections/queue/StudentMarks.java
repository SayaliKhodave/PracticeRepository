package com.sayali.practice.collections.queue;

public class StudentMarks {
//public class StudentMarks implements Comparable {

    private int maths;
    private int physics;

    public int getMaths() {
        return maths;
    }

    public int getPhysics() {
        return physics;
    }

    public StudentMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "maths=" + maths +
                ", physics=" + physics +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//
//        // currObj < otherObj return -1 (any neg num)
//        // currObj > otherObj return +1 (any pos num)
//        // currObj = otherObj return 0
//        System.out.println("Comparable's compareTo called");
//        StudentMarks marks = (StudentMarks)o;
//        return marks.maths - this.maths;
//    }
}
