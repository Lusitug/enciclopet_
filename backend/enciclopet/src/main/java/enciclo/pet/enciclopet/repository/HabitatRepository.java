package enciclo.pet.enciclopet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import enciclo.pet.enciclopet.models.entity.Animal;
import enciclo.pet.enciclopet.models.entity.Habitat;
import enciclo.pet.enciclopet.models.enums.HabitatTipo;

@Repository
@RepositoryRestResource(path = "habitats", collectionResourceRel = "habitats")
public interface HabitatRepository extends JpaRepository<Habitat, Long>{
    
    @Query("SELECT h.animaislocais FROM Habitat h WHERE h.habitattipo = :tipo")
    public List<Animal> findAnimaisByHabitatTipo(@Param("tipo") HabitatTipo tipo);
}
