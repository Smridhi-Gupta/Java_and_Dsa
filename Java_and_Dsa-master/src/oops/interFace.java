package oops;

public class interFace {
    class Student {
        String name;
        int roll;
        String password;
        int marks[];
        Student(copyConstructor.Student s1) {
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            this.marks = s1.marks;
        }
        Student() {
            marks = new int[3];
            System.out.println("constructor is called...");
        }
        Student(String name) {
            marks = new int[3];
            this.name = name;
        }
        Student(int roll) {
            marks = new int[3];
            this.roll = roll;
        }
    }

    public void main(String[] args) {
        copyConstructor.Student s1 = new copyConstructor.Student();
        s1.name = "Smridhi";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        copyConstructor.Student s2 = new copyConstructor.Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
