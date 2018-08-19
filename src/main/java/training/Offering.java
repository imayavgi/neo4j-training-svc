package training;


import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

@NodeEntity
public class Offering {

	@Id @GeneratedValue private Long id;

	private String title;
	private String description;
	private String providedBy;
	private String deliveryChannel;
	private String level;

	@Relationship(type = "FOR_ROLE", direction = Relationship.UNDIRECTED)
	private Set<Role> forRoles;

	public Offering() {

	}

	public Offering(String title, String description, String providedBy, String deliveryChannel, String level, String phase) {
		this.title = title;
		this.description = description;
		this.providedBy = providedBy;
		this.deliveryChannel = deliveryChannel;
		this.level = level;
		this.phase = phase;
	}

	public void offeredFor(Role role) {
		if (forRoles == null) forRoles = new HashSet<>();
		forRoles.add(role);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		description = description;
	}

	public String getProvidedBy() {
		return providedBy;
	}

	public void setProvidedBy(String providedBy) {
		this.providedBy = providedBy;
	}

	public String getDeliveryChannel() {
		return deliveryChannel;
	}

	public void setDeliveryChannel(String deliveryChannel) {
		this.deliveryChannel = deliveryChannel;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	private String phase;



}
