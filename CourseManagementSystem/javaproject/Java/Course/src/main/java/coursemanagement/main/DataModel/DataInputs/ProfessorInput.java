package coursemanagement.main.DataModel.DataInputs;


public class ProfessorInput {

    private String name;
    private String surname;

    private String courses;

    public ProfessorInput(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCourses() {
        return courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
}

