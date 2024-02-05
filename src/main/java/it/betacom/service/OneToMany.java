package it.betacom.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import it.betacom.entity.Dipartimento;
import it.betacom.entity.Impiegato;

public class OneToMany {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("JPAOTM");
		EntityManager entityManager = emFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Impiegato impiegato1 = new Impiegato();
		impiegato1.setEname("Maria");
		impiegato1.setSalary(2000);
		impiegato1.setDeg("Web Developer");

		Impiegato impiegato2 = new Impiegato();
		impiegato2.setEname("Luca");
		impiegato2.setSalary(1500);
		impiegato2.setDeg("Writer");
		
		Impiegato impiegato3 = new Impiegato();
		impiegato3.setEname("Davide");
		impiegato3.setSalary(1500);
		impiegato3.setDeg("Analyst");
		
		entityManager.persist(impiegato1);
		entityManager.persist(impiegato2);
		entityManager.persist(impiegato3);
		
		List <Impiegato> lista = new ArrayList<Impiegato>();
		lista.add(impiegato1);
		lista.add(impiegato2);
		
		List <Impiegato> lista2 = new ArrayList<Impiegato>();
		lista2.add(impiegato3);
	
		Dipartimento dipartimento = new Dipartimento();
		dipartimento.setName("Sviluppo");
		dipartimento.setImpiegatoList(lista);
		entityManager.persist(dipartimento);
		
		Dipartimento dipartimento2 = new Dipartimento();
		dipartimento2.setName("Analisi");
		dipartimento2.setImpiegatoList(lista2);
		entityManager.persist(dipartimento2);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		emFactory.close();
		
		
		
		
		
		

	}

}
