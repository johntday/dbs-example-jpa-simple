package com.dbs.training.model;

import java.io.Serializable;

import org.springframework.core.style.ToStringCreator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Classroom JPA entity.
 * 
 * @author John T Day
 */
@Entity
@Table(name = "ROOM")
public class Room implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ROOM_ID")
	private Integer id;
	
	@Column(name="ROOM_CD", nullable=false, length=45, updatable=true, insertable=true)
	private String	code;
	
	@Column(name="FLOOR_NBR", nullable=false, updatable=true, insertable=true)
	private int		floor;
	
	@Column(name="ROOM_NM", nullable=false, length=45, updatable=true, insertable=true)
	private String	name;
	
	@Column(name="ROOM_DESC", nullable=true, length=512, updatable=true, insertable=true)
	private String	description;
	
	@Column(name="ROOM_SEATS_NBR", nullable=false, updatable=true, insertable=true)
	private int		numberOfSeats;

	@Override
	public String toString() {
		return new ToStringCreator(this).append("id", this.id).append("code", this.code).append("floor", this.floor)
				.append("name", this.name).append("description", this.description).append("numberOfSeats", this.numberOfSeats)
				.toString();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
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

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
}
