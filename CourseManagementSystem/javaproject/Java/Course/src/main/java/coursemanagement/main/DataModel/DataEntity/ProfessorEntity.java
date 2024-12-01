package coursemanagement.main.DataModel.DataEntity;
import javax.persistence.*;
@Entity
@Table(name = "Professor")
public class ProfessorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "courses")
    private String courses;
    public ProfessorEntity() {
    }
    public ProfessorEntity(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.courses = courses;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setcourses(String courses) {
        this.courses = courses;
    }

    public String getSurname() {
        return surname;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
}
