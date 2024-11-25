package pe.edu.i202221431.cl1_jpa_data_ugaz_xavier.entity;



import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "country_language")
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id;

    @Column(name = "is_official", nullable = false)
    private boolean isOfficial;

    @Column(name = "percentage", nullable = false)
    private double percentage;

    @ManyToOne
    @MapsId("countryCode")
    @JoinColumn(name = "country_code", nullable = false)
    private Country country;
}
