package training;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

@NodeEntity
public class Skill {

    @Id @GeneratedValue private Long id;

    private String name;
    private String category;
    private String competancy;

    public Skill() {
    }

    public Skill(String name, String category, String competancy) {
        this.name = name;
        this.category = category;
        this.competancy = competancy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCompetancy() {
        return competancy;
    }

    public void setCompetancy(String competancy) {
        this.competancy = competancy;
    }

}
