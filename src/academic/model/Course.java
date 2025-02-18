package academic.model;

/**
* @author 12S23003_Chrismansyah Siahaan
* @author 12S23015_Kevin Kristoforus Samosir
*/

public class Course {
    private String code;
    private String name;
    private int credits;
    private String grade;

    public Course(String code, String name, int credits, String grade) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return code + "|" + name + "|" + credits + "|" + grade;
    }

    public String getCode() {
        return code;
    }
}