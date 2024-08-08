package enciclo.pet.enciclopet.models.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import enciclo.pet.enciclopet.models.enums.HabitatTipo;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="habitat")
public class Habitat {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private HabitatTipo habitatTipo;

    @Column(nullable = false)
    private String descricao;

    @JsonManagedReference
    @OneToMany(mappedBy = "habitat", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Animal> animaisLocais;

}
