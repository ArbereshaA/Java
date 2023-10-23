package coursemanagement.main.ServiceModules;

import coursemanagement.main.DataModel.DataInputs.ProfessorInput;
import coursemanagement.main.DataModel.DataEntity.ProfessorEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DefaultProfessorServiceModules implements ProfessorServiceModules {

    @Autowired
    private coursemanagement.main.DataRepositories.ProfessorRepository ProfessorRepository;

    @Override
    public List<ProfessorEntity> findAll() {
        return ProfessorRepository.findAll();
    }

    @Override
    public ProfessorEntity findProfessorById(Integer id) {
        if (id == null) {
            return null;
        }
        return ProfessorRepository.findProfessorById(id);
    }

    @Override
    public ProfessorEntity save(ProfessorInput ProfessorInput) {
        String newName = ProfessorInput.getName();
        String newSurname = ProfessorInput.getSurname();
        String newCourses = ProfessorInput.getCourses();



        ProfessorEntity ProfessorEntity = new ProfessorEntity();
        ProfessorEntity.setName(newName);
        ProfessorEntity.setSurname(newSurname);
        ProfessorEntity.setcourses(newCourses);


        return ProfessorRepository.save(ProfessorEntity);
    }

    @Override
    public ProfessorEntity update(ProfessorEntity ProfessorEntity, ProfessorInput ProfessorInput) {
        String newName = ProfessorInput.getName();
        String newSurname = ProfessorInput.getSurname();
        String newCourses = ProfessorInput.getCourses();

        ProfessorEntity.setName(newName);
        ProfessorEntity.setSurname(newSurname);
        ProfessorEntity.setcourses(newCourses);


        return ProfessorRepository.save(ProfessorEntity);
    }

    @Override
    public void delete(Integer id) {
        ProfessorRepository.deleteById(id);
    }

}
