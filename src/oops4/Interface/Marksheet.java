package oops4.Interface;

public class Marksheet {
    public static void main(String[] args){
        System.out.println("Student Marksheet Table");
        Student student = new Student(21,"Hitesh");
        student.subGujarati(10);
        student.subHindi(8);
        student.subEnglish(8);
    }
}

interface Gujarati{
    void subGujarati(int marks);
}

interface Hindi{
    void subHindi(int marks);
}

interface English{
    void subEnglish(int marks);
}

class Student implements Hindi,Gujarati,English{

    int rollNo;
    String studName;

    Student(int rollNumber, String studentName){
        this.rollNo = rollNumber;
        this.studName = studentName;

        studentDetails();
    }

    void studentDetails(){
        System.out.println("Student Roll No : "+this.rollNo);
        System.out.println("Student Name : "+this.studName);
    }

    @Override
    public void subGujarati(int marks) {
        System.out.println("Gujarati : "+marks);
    }

    @Override
    public void subHindi(int marks) {
        System.out.println("Hindi : "+marks);
    }

    @Override
    public void subEnglish(int marks) {
        System.out.println("English : "+marks);
    }
}