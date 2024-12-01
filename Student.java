package info_pack;

public class Student {
    String name;
     String rollNumber;
     double cgpa;

    public Student(String n, String number, double marks) {
        name = n;
        rollNumber = number;
        cgpa = marks;
    }

    String determineGrade() {
        if (cgpa >= 9.0) {
            return "A+";
        } else if (cgpa >= 8.0) {
            return "A";
        } else if (cgpa >= 7.0) {
            return "B";
        } else if (cgpa >= 6.0) {
            return "C";
        } else {
            return "D";
        }
    }

    public void showStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + determineGrade());
    }
    public static void main(String[] args) {
        Student student = new Student("RISHIKANTA PANDA", "CSE101", 9.2);
        
        student.showStudentInfo();
    }
}