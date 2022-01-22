package ProjectNosql.example.ProjectNosql.Repository;

import ProjectNosql.example.ProjectNosql.Model.Intervention;
import ProjectNosql.example.ProjectNosql.Model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends MongoRepository<Patient,String> {




}
