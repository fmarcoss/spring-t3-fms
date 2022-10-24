/**
 * 
 */
package com.nttdata.nttdatacentersspringt3fms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.nttdata.nttdatacentersspringt3fms.repository.Customer;
import com.nttdata.nttdatacentersspringt3fms.repository.CustomerRepositoryI;

/**
 * @author fmarcoss
 *
 */
@Service
public class CustomerManagementServiceImpl implements CustomerManagementServiceI {

	@Autowired
	private CustomerRepositoryI customerRepository;

	@Override
	public Customer insertNewCustomer(Customer newCustomer) {

		// Verificación
		if (newCustomer != null && newCustomer.getId() == null) {

			// Insercción
			newCustomer = customerRepository.save(newCustomer);
		}

		return newCustomer;
	}

	@Override
	public void searchAllCustomers() {
		// Consulta
		final Iterable<Customer> customerList = customerRepository.findAll();

		// Itera e imprime
		customerList.forEach((final Customer customer) -> System.out.println(customer.toString()));
	}

	@Override
	public void searchByFullName(String name, String surname) {
		// Obtención de customers por nombre completo
		final List<Customer> searchOne = customerRepository.findByNameAndSurname(name, surname);

		printCustomers(searchOne);
	}

	@Override
	public void searchByName(String name) {
		// Obtiene customers por nombre
		final List<Customer> searchTwo = customerRepository.findByName(name);

		printCustomers(searchTwo);

	}

	/**
	 * Método creado para imprimir listados generados por otros métodos
	 */
	private void printCustomers(final List<Customer> searchX) {
		if (!CollectionUtils.isEmpty(searchX)) {
			for (Customer customer : searchX) {
				System.out.println(customer.toString());
			}
		}
	}
}
