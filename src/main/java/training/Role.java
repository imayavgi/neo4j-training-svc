package training;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

@NodeEntity
public class Role {

    @Id @GeneratedValue private Long id;

    private String name;
    private String description;
    private String responsibility;

    @Relationship(type = "FOR_SKILL", direction = Relationship.UNDIRECTED)
    private Set<Skill> haveSkills;

    public Role() {
    }

    public void needToHave(Skill skill) {
        if (haveSkills == null ) haveSkills = new HashSet<>();
        haveSkills.add(skill);
    }

    public Role(String name, String description, String responsibility) {
        this.name = name;
        this.description = description;
        this.responsibility = responsibility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
