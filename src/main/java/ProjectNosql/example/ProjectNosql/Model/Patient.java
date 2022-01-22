package ProjectNosql.example.ProjectNosql.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@ToString
@Document(collection = "Patient")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Patient {

    @Id
    private String id;
    private String nom;
    private String prenom;
    private int telephone;
    private String date_creation_fiche;
    private String date_naissance;
    private String metier;
    private String adresse;
    private String motif_consultation;
    private String antecedants_medicaux;
    private String antecedants_dentaires;
    private List<Intervention> intervention;


}
