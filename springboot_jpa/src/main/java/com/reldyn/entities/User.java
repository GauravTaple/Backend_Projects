package com.reldyn.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Users_detailed")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "uid", nullable = false)
	private int id;

	@Column(name = "Uname", nullable = false)
	private String name;

	@Column(name = "Ucity", nullable = false)
	private String city;

	@Column(name = "Ustatus", nullable = false)
	private String status;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", status=" + status + "-------]";
	}


}
