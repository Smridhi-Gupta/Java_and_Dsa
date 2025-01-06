package classAndObjects;

public class constructors {
    public static void main(String[] args) {
        Students s1 = new Students();
//        System.out.println(s1.name);
        Students s2 = new Students("smridhi");
        Students s3 = new Students(123);
    }
}

class Students {
    String name;
    int roll;

//non parameterised constructor
   Students() {
       System.out.println("constructor is called..");
    }

    //parameterised constructor
    Students(String name) {
        this.name = name;
    }
    Students(int roll) {
        this.roll = roll;
    }
}
