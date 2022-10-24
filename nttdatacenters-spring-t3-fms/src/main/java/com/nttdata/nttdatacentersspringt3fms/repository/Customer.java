package com.nttdata.nttdatacentersspringt3fms.repository;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_CUSTOMER")

public class Customer {

	private Long id;

	private String identityDocNumber;

	private String name;

	private String surname;

	private LocalDate bornDate;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "C_ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "C_IDENTITY_DOC_NUMBER", nullable = false, unique = true)
	public String getIdentityDocNumber() {
		return identityDocNumber;
	}

	public void setIdentityDocNumber(String identityDocNumber) {
		this.identityDocNumber = identityDocNumber;
	}

	@Column(name = "C_NAME", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "C_SURNAME", nullable = false)
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Column(name = "C_BORNDATE")
	public LocalDate getBornDate() {
		return bornDate;
	}

	public void setBornDate(LocalDate localDate) {
		this.bornDate = localDate;

	}

	@Override
	public String toString() {

		return "Customer:\n -ID: " + id + " \n -Identity doc Number: " + identityDocNumber + " \n -Name: " + name
				+ " \n -Surname: " + surname + "\n -Born Date: " + bornDate;
	}

}
