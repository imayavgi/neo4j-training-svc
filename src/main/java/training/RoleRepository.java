package training;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "role", path = "role")
public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByName(@Param("name") String name);

    @Override
    @Query("MATCH (n:Role) DETACH DELETE n")
    void deleteAll();
}
