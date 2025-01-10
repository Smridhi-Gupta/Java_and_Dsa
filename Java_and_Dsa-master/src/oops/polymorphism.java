package oops;

public class polymorphism {
    class Student {
        String name;
        int roll;
        Student() {
            System.out.println("No parameter");
        }
        Student(String name) {
            this.name = name;
        }
        Student(int roll) {
            this.roll = roll;
        }
    }
    public void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Smridhi");
        Student s3 = new Student(123);
    }
}
