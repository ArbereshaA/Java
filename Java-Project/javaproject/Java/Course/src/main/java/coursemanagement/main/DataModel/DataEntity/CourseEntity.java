package coursemanagement.main.DataModel.DataEntity;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "professor")
    private String professor;


    @Column(name = "description")
    private String description;

    public CourseEntity() {
    }

    public CourseEntity(Integer id, String name, String professor, String description) {
        this.id = id;
        this.name = name;
        this.professor = professor;
        this.description = description;
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

    public void setprofessor(String professor) {
        this.professor = professor;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDescription() {
        return description;
    }
}
