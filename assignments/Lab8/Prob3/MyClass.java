package assignments.Lab8.Prob3;

import java.util.function.Predicate;

public class MyClass {
    int x;
    String y;

    public MyClass(int x, String y) {
        this.x = x;
        this.y = y;
    }

    // testing method to check the equality using Lambda and Method reference
    public void myMethod(MyClass cl) {


        //System.out.println(this.equals(cl));

// Implementation
        //lambda
        Predicate<MyClass> newm1 = obj -> this.equals(obj);
        //method reference
        Predicate<MyClass> newm2 = this::equals;

        System.out.println(newm1.test(cl));

        System.out.println(newm2.test(cl));

    }


    @Override
    public boolean equals(Object ob) {
        if (ob == null)
            return false;
        if (ob.getClass() != getClass())
            return false;
        MyClass mc = (MyClass) ob;
        return mc.x == x && mc.y.equals(y);
    }

    public static void main(String[] args) {
        MyClass myclass = new MyClass(1, "A");
        MyClass myclass1 = new MyClass(1, "B");
        myclass.myMethod(myclass); // print true
        myclass.myMethod(myclass1); // print false
    }
}