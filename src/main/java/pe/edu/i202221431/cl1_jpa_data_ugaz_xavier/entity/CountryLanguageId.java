package pe.edu.i202221431.cl1_jpa_data_ugaz_xavier.entity;



import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class CountryLanguageId implements Serializable {

    private String countryCode;

    private String language;
}
