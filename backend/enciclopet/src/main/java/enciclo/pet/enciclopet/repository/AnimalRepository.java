package enciclo.pet.enciclopet.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import enciclo.pet.enciclopet.models.entity.Animal;
import enciclo.pet.enciclopet.models.entity.Habitat;

@Repository
@RepositoryRestResource(collectionResourceRel = "animais", path = "animais")
public interface AnimalRepository extends JpaRepository<Animal, Long>{

    Animal findAnimalByCode(UUID animalCode);
    
    @Query("SELECT a.habitat FROM Animal a")
    List<Habitat> findAllHabitats();

    @Query("SELECT a.habitat FROM  Animal a WHERE a.id = :id" )
    List<Habitat> findHabitatByAnimalId(@Param("id") long id);
} 
