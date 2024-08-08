package enciclo.pet.enciclopet.models.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import enciclo.pet.enciclopet.models.enums.Classe;
import enciclo.pet.enciclopet.models.enums.Filo;
import enciclo.pet.enciclopet.models.enums.Ordem;
import enciclo.pet.enciclopet.models.enums.Reino;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "animal")
public class Animal {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String nome = "";

    @Column(nullable = false)
    private String apelido = "";
    
    @Column(unique = true, nullable = false)
    private UUID animal_code = UUID.randomUUID();

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Reino reino;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Filo filo;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Classe classe;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Ordem ordem;
    
    @Column(nullable = false)
    private String familia = "";
    
    @Column(nullable = false)
    private String genero = "";
    
    @Column(nullable = false)
    private String especie = "";

    @Column(name = "data_entrada", nullable = false)
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "UTC")
    private Date data_entrada;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private Habitat habitat;
}
