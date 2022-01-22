package ProjectNosql.example.ProjectNosql.Controller;

import ProjectNosql.example.ProjectNosql.Model.Intervention;
import ProjectNosql.example.ProjectNosql.Model.Patient;
import ProjectNosql.example.ProjectNosql.Repository.InterventionRepository;
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
public class InterventionController {
    @Autowired
    private InterventionRepository repository;




    @PostMapping("/addIntervention")
    @CrossOrigin(origins = "http://localhost:4200")
    public Intervention saveIntervention(@RequestBody Intervention intervention){
        repository.save(intervention);
           return intervention ;
    }

    @GetMapping("/findAllIntervention")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Intervention> getIntervention(){
        return  repository.findAll();
    }



    @GetMapping("/findByPatient/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Intervention> getPatient(@PathVariable String id){
        return  repository.findByidPatient(id);
    }


    @Autowired
    MongoOperations template;



}
