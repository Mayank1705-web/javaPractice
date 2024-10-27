/*Write a class Student having fields: Name, Enrollment number, CGPA etc.Write appropriate methods or constructor to set values for these field. Display 
values of the fields by overriding toString() method.*/

public class Student {
    String name;
    int enrollmentNumber;
    double cgpa;
    
    // Constructor
    public Student(String name, int enrollmentNumber, double cgpa) {
        this.name = name;
        this.enrollmentNumber = enrollmentNumber;
        this.cgpa = cgpa;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public int getEnrollmentNumber() {
        return enrollmentNumber;
    }
    
    public double getCGPA() {
        return cgpa;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEnrollmentNumber(int enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }
    
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
    
    // toString method to display the student's details
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", enrollmentNumber=" + enrollmentNumber +
                ", cgpa=" + cgpa +
                '}';
    }
    
    public static void main(String[] args) {
        Student student = new Student("John Doe", 12345, 3.8);
        System.out.println(student);
    }
}