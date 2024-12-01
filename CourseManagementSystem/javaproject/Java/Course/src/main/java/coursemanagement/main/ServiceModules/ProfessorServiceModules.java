package coursemanagement.main.ServiceModules;

import coursemanagement.main.DataModel.DataInputs.ProfessorInput;
import coursemanagement.main.DataModel.DataEntity.ProfessorEntity;

import java.util.List;

public interface ProfessorServiceModules {

    List<ProfessorEntity> findAll();
    ProfessorEntity findProfessorById(Integer id);
    ProfessorEntity save(ProfessorInput ProfessorInput);
    ProfessorEntity update(ProfessorEntity location, ProfessorInput ProfessorInput);
    void delete(Integer id);
}
