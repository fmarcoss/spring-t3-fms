package com.nttdata.nttdatacentersspringt3fms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositoryI extends JpaRepository<Customer, Long> {

	/**
	 * Obtención del Customer por nombre
	 * 
	 * @param value
	 * @return
	 */
	public List<Customer> findByName(final String value);

	/**
	 * Obtención del Custoer por nombre y apellido
	 * 
	 * @param value1
	 * @param value2
	 * @return
	 */
	public List<Customer> findByNameAndSurname(final String value1, final String value2);

}
