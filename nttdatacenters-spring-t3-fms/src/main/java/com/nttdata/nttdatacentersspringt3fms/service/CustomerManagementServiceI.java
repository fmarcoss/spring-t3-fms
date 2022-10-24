/**
 * 
 */
package com.nttdata.nttdatacentersspringt3fms.service;

import com.nttdata.nttdatacentersspringt3fms.repository.Customer;

/**
 * @author fmarcoss
 *
 */
public interface CustomerManagementServiceI {

	/**
	 * Añade un customer
	 * 
	 * @param newCustomer
	 * @return Customer
	 */
	public Customer insertNewCustomer(final Customer newCustomer);

	/**
	 * Consulta todos los customers.
	 */
	public void searchAllCustomers();

	/**
	 * Búsqueda por nombre y apellido
	 * 
	 * @param name
	 * @param surname
	 */
	public void searchByFullName(final String name, final String surname);

	/**
	 * Búsqueda por nombre
	 * 
	 * @param name
	 */
	public void searchByName(final String name);

}
