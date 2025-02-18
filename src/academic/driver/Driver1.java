package academic.driver;
import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 12S23003_Chrismansyah Siahaan
 * @author 12S23015_Kevin Kristoforus Samosir
 */
 
 public class Driver1 {
     public static void main(String[] args) {
         List<Course> courses = new ArrayList<>();
         List<Student> students = new ArrayList<>();
         List<Enrollment> enrollments = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
 
         while (true) {
             String input = scanner.nextLine();
             if (input.equals("---")) {
                 break;
             }
             String[] parts = input.split("#");
             switch (parts[0]) {
                 case "course-add":
                     courses.add(new Course(parts[1], parts[2], Integer.parseInt(parts[3]), parts[4]));
                     break;
                 case "student-add":
                     students.add(new Student(parts[1], parts[2], Integer.parseInt(parts[3]), parts[4]));
                     break;
                 case "enrollment-add":
                     if (courseExists(courses, parts[1]) && studentExists(students, parts[2])) {
                         enrollments.add(new Enrollment(parts[1], parts[2], parts[3], parts[4]));
                     }
                     break;
             }
         }
 
         // Print output
         printCourses(courses);
         printStudents(students);
         printEnrollments(enrollments);
 
         scanner.close();
     }
 
     private static boolean courseExists(List<Course> courses, String code) {
         for (Course course : courses) {
             if (course.getCode().equals(code)) {
                 return true;
             }
         }
         return false;
     }
 
     private static boolean studentExists(List<Student> students, String id) {
         for (Student student : students) {
             if (student.getId().equals(id)) {
                 return true;
             }
         }
         return false;
     }
 
     private static void printCourses(List<Course> courses) {
         for (Course course : courses) {
             System.out.println(course);
         }
     }
 
     private static void printStudents(List<Student> students) {
         for (Student student : students) {
             System.out.println(student);
         }
     }
 
     private static void printEnrollments(List<Enrollment> enrollments) {
         for (Enrollment enrollment : enrollments) {
             System.out.println(enrollment);
         }
     }
 }