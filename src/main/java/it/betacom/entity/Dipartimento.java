package it.betacom.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
@Entity
public class Dipartimento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id_dipartimento;
	private String name;
	
	@OneToMany(targetEntity = Impiegato.class)
	@JoinColumn(name = "id_dipartimento")
	private List<Impiegato> impiegatoList;
	
	public Dipartimento() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getImpiegatoList() {
		return impiegatoList;
	}
	public void setImpiegatoList(List impiegatoList) {
		this.impiegatoList = impiegatoList;
	}
	
	
	
	

}
