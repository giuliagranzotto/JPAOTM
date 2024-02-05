package it.betacom.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity

public class Impiegato implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private int eid;
	private String ename;
	private double salary;
	private String deg;
	
	
	
	
	
	public Impiegato() {
		super();
	}



	public int getEid() {
		return eid;
	}



	public void setEid(int eid) {
		this.eid = eid;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getDeg() {
		return deg;
	}



	public void setDeg(String deg) {
		this.deg = deg;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}




   
}
