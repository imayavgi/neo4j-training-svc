package training;

import java.util.List;
import java.util.Optional;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

@RepositoryRestResource(collectionResourceRel = "offering", path = "offering")
public interface OfferingRepository extends CrudRepository<Offering, Long> {

    @Override
    @PreAuthorize("hasAuthority('RoleEmployee')")
    Optional<Offering> findById(Long aLong);

    Offering findByTitle(@Param("title") String title);

    @Override
    @Query("MATCH (n:Offering) DETACH DELETE n")
    void deleteAll();
}
