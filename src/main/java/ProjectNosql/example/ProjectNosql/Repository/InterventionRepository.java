package ProjectNosql.example.ProjectNosql.Repository;

import ProjectNosql.example.ProjectNosql.Model.Intervention;
import ProjectNosql.example.ProjectNosql.Model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InterventionRepository extends MongoRepository<Intervention,String> {

    @Query("{ 'idPatient' : ?0 }")
    List<Intervention> findByidPatient(String idPatient);


}
