package academic.model;

/**
 * @author 12S23003_Chrismansyah Siahaan
 * @author 12S23015_Kevin Kristoforus Samosir
 */
public class Course {
    private String courseId;
    private String courseName;
    private int credits;
    private String grade;

    public Course(String courseId, String courseName, int credits, String grade) {
    this.courseId = courseId;
    this.courseName = courseName;
    this.credits = credits;
    this.grade = grade;
    }
    
    // Accessor dan mutator yang tidak diperlukan
    // public void setCourseId(String courseId) { this.courseId = courseId; } // Dihapus
    
    public String getCourseId() { 
        return courseId; 
    }
    public String getCourseName() { 
        return courseName; 
    }
    public int getCredits() { 
        return credits; 
    }
    public String getGrade() { 
        return grade; 
    }

    @Override
    public String toString() {
    return courseId + "|" + courseName + "|" + credits + "|" + grade;
    }
}