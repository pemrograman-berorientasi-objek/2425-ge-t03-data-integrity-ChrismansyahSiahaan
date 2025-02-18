package academic.model;

/**
 * @author 12S23003_Chrismansyah Siahaan
 * @author 12S23015_Kevin Kristoforus Samosir
 */

 public class Enrollment {
    private String studentId;
    private String courseId;
    private String semester;
    private String grade;

    public Enrollment(String studentId, String courseId, String semester, String grade) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.semester = semester;
        this.grade = grade;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getSemester() {
        return semester;
    }

    public String getEnrollmentDetails() {
        return courseId + "|" + studentId + "|" + semester + "|" + grade;
    }
}