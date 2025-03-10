package academic.model;

/**
* @author 12S23003_Chrismansyah Siahaan
* @author 12S23015_Kevin Kristoforus Samosir
*/

public class Enrollment {
    private String courseId;
    private String studentId;
    private String academicYear;
    private String semester;

    public Enrollment(String courseId, String studentId, String academicYear, String semester) {
        this.courseId = courseId;
        this.studentId = studentId;
        this.academicYear = academicYear;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return courseId + "|" + studentId + "|" + academicYear + "|" + semester + "|None";
    }
}