package fr.abbo.septArche.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "vendeur")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Vendeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String enseigne;
    private String siret;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEnseigne() {
        return enseigne;
    }
    public void setEnseigne(String enseigne) {
        this.enseigne = enseigne;
    }
    public String getSiret() {
        return siret;
    }
    public void setSiret(String siret) {
        this.siret = siret;
    }

    @Override
    public String toString() {
        return "Vendeur{" +
                "id=" + id + ", enseigne='" + enseigne + '\'' + ", siret='" + siret + '\'' + '}';
    }
}