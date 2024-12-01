package coursemanagement.main.DataModel.DataInputs;

public class CourseInput {

    private String name;
    private String professor;
    private String description;

    public CourseInput(String name, String professor, String description) {
        this.name = name;
        this.professor = professor;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getprofessor() {
        return professor;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
