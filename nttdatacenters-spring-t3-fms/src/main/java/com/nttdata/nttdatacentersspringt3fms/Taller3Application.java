package com.nttdata.nttdatacentersspringt3fms;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.nttdatacentersspringt3fms.repository.Customer;
import com.nttdata.nttdatacentersspringt3fms.service.CustomerManagementServiceI;



@SpringBootApplication
public class Taller3Application implements CommandLineRunner {
	
	@Autowired
	private CustomerManagementServiceI customerService;

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Taller3Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("***Taller 3, Gestión de clientes ***");
		
		//Creación de clientes
		
		// Nuevos clientes.
				final Customer newCustomer1 = new Customer();
				newCustomer1.setName("Fran");
				newCustomer1.setSurname("Marcos");
				newCustomer1.setIdentityDocNumber("12345678A");
				newCustomer1.setBornDate(LocalDate.of(1991, Month.SEPTEMBER, 20));
				customerService.insertNewCustomer(newCustomer1);

				final Customer newCustomer2 = new Customer();
				newCustomer2.setName("Laura");
				newCustomer2.setSurname("Morales");
				newCustomer2.setIdentityDocNumber("87654321Z");
				newCustomer2.setBornDate(LocalDate.of(1992, Month.APRIL, 4));
				customerService.insertNewCustomer(newCustomer2);

				final Customer newCustomer3 = new Customer();
				newCustomer3.setName("Gato");
				newCustomer3.setSurname("McCat");
				newCustomer3.setIdentityDocNumber("99999999X");
				newCustomer3.setBornDate(LocalDate.of(2014, Month.JULY, 15));
				customerService.insertNewCustomer(newCustomer3);
				
				System.out.println("*** Todos los clientes ***");
				
				//Muestra el listado de todos los clientes
				customerService.searchAllCustomers();
				
				System.out.println("*** Busqueda por nombre: Gato ***");
				//Busqueda por nombre
				customerService.searchByName("Gato");
				
				System.out.println("*** Busqueda por nombre y apellido: Fran Marcos");
				
				//Busqueda por nombre y apellido
				customerService.searchByFullName("Fran", "Marcos");
		
	}

}
