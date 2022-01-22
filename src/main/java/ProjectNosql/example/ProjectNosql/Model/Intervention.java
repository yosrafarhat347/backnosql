package ProjectNosql.example.ProjectNosql.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Data
@AllArgsConstructor
@Document(collection = "intervention")
public class Intervention {

    private String date;
    private String acte;
    private String recu;
    private String idPatient;
}
