package coursemanagement.main.DataRepositories;

import coursemanagement.main.DataModel.DataEntity.ProfessorEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProfessorRepository extends CrudRepository<ProfessorEntity, Integer> {

    List<ProfessorEntity> findAll();
    ProfessorEntity findProfessorById(Integer id);

}
