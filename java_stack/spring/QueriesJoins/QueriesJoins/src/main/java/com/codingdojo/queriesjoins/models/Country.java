package com.codingdojo.queriesjoins.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="countries")
public class Country {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	@Size(min = 3, max = 3)
	private String code;
	@NotNull
	@Size(min = 3, max = 52)
	private String name;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Double getSrfaceArea() {
		return srfaceArea;
	}
	public void setSrfaceArea(Double srfaceArea) {
		this.srfaceArea = srfaceArea;
	}
	public Short getInDepYear() {
		return inDepYear;
	}
	public void setInDepYear(Short inDepYear) {
		this.inDepYear = inDepYear;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public Double getLifeExpectancy() {
		return lifeExpectancy;
	}
	public void setLifeExpectancy(Double lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	public Double getGnp() {
		return gnp;
	}
	public void setGnp(Double gnp) {
		this.gnp = gnp;
	}
	public Double getOldGnp() {
		return oldGnp;
	}
	public void setOldGnp(Double oldGnp) {
		this.oldGnp = oldGnp;
	}
	public String getLocalName() {
		return localName;
	}
	public void setLocalName(String localName) {
		this.localName = localName;
	}
	public String getGovernmentForm() {
		return governmentForm;
	}
	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}
	public String getHeadOfState() {
		return headOfState;
	}
	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getCode2() {
		return code2;
	}
	public void setCode2(String code2) {
		this.code2 = code2;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@NotNull
    private enum continent{
        Asia, Africa, NorthAmerica, SouthAmerica, Antarctica, Europe, Australia
    };
    
	@NotNull
	@Size(min = 5, max = 26)
	private String region;
	@NotNull
	private Double srfaceArea;
	@NotNull
	private Short inDepYear;
	@NotNull
	@Size(max = 11)
	private Integer population;
	@NotNull
	private Double lifeExpectancy;
	@NotNull
	private Double gnp;
	@NotNull
	private Double oldGnp;
	@NotNull
	private String localName;
	@NotNull
	private String governmentForm;
	@NotNull
	private String headOfState;
	@NotNull
	private String capital;
	@NotNull
	private String code2;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
	
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    public Country() {
    	
    }
}
