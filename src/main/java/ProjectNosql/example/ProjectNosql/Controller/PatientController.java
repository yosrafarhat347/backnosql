package ProjectNosql.example.ProjectNosql.Controller;

import ProjectNosql.example.ProjectNosql.Model.Intervention;
import ProjectNosql.example.ProjectNosql.Model.Patient;
import ProjectNosql.example.ProjectNosql.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


@RestController
public class PatientController {
    @Autowired
    private PatientRepository repository;




    @PostMapping("/addPatient")
    @CrossOrigin(origins = "http://localhost:4200")
    public Patient savePatient(@RequestBody Patient patient){
        repository.save(patient);
           return patient;
    }

    @GetMapping("/findAllPatients")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Patient> getPatients(){
        return  repository.findAll();
    }



    @GetMapping("/findAllPatients/{id}")
    public Optional<Patient> getPatient(@PathVariable String id){
        return  repository.findById(id);
    }
    @DeleteMapping ("delete/{id}")
    public String deletePatient(@PathVariable String id){
        repository.deleteById(id);
        return "Patient deleted with id:" +id;
    }

    @Autowired
    MongoOperations template;


    @PostMapping("/addIntervention/{id}")
    public List<Intervention> addIntervention(@RequestBody Intervention I, @PathVariable int id){
        Patient P = template.findOne(new Query(Criteria.where("id").is(id)),Patient.class);
        if(P !=null){
            List newIntervention = Collections.singletonList(P.getIntervention().add(I));

            P.setIntervention(newIntervention);


        }
        return P.getIntervention();
    }

}
