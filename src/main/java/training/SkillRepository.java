package training;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "skill", path = "skill")
public interface SkillRepository extends CrudRepository<Skill, Long> {

    Skill findByName(@Param("name") String name);

    @Override
    @Query("MATCH (n:Skill) DETACH DELETE n")
    void deleteAll();
}
