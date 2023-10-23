package coursemanagement.main.RequestCoordinator;

import coursemanagement.main.DataModel.DataEntity.ProfessorEntity;
import coursemanagement.main.DataModel.DataInputs.ProfessorInput;
import coursemanagement.main.ServiceModules.ProfessorServiceModules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class ProfessorRequestCoordinator {

    @Autowired
    private ProfessorServiceModules ProfessorServiceModules;

    @GetMapping("/professor")
    public List<ProfessorEntity> getProfessor() {
        return ProfessorServiceModules.findAll();
    }

    @GetMapping("/professor/{id}")
    public ProfessorEntity findProfessor(@PathVariable Integer id) {
        return ProfessorServiceModules.findProfessorById(id);
    }

    @PostMapping("/professor")
    public ProfessorEntity createProfessor(@RequestBody ProfessorInput ProfessorInput) {
        return ProfessorServiceModules.save(ProfessorInput);
    }

    @PutMapping("/professor/{id}")
    public ProfessorEntity updateProfessor(@PathVariable Integer id,
                                           @RequestBody ProfessorInput ProfessorInput) {

        ProfessorEntity ProfessorEntity = ProfessorServiceModules.findProfessorById(id);
        if (ProfessorEntity == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Note object with " + id + " not found!"
            );
        }

        return ProfessorServiceModules.update(ProfessorEntity, ProfessorInput);
    }

    @DeleteMapping("/professor/{id}")
    public boolean deleteProfessor(@PathVariable Integer id) {
        ProfessorServiceModules.delete(id);
        return true;
    }

}
