package com.report.filereportprocessor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(unique=true)
	private String cnpj;
	private String name;
	private String businessArea;
	
	public Customer(String cnpj, String name, String businessArea) {
		this.cnpj = cnpj;
		this.name = name;
		this.businessArea = businessArea;
	}
}