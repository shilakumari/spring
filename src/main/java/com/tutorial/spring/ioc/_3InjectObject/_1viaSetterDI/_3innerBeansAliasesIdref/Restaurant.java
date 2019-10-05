package com.tutorial.spring.ioc._3InjectObject._1viaSetterDI._3innerBeansAliasesIdref;

public class Restaurant {
	String idRef;
	Tea tea;
	Tea specialtea;
	Tea superSpecialtea;

	public void setTea(Tea tea) {
		this.tea = tea;
	}

	public void setSpecialtea(Tea specialtea) {
		this.specialtea = specialtea;
	}

	public void setSuperSpecialtea(Tea superSpecialtea) {
		this.superSpecialtea = superSpecialtea;
	}

	
	public String getIdRef() {
		return idRef;
	}

	public void setIdRef(String idRef) {
		this.idRef = idRef;
	}

	public Tea getTea() {
		return tea;
	}

	public Tea getSpecialtea() {
		return specialtea;
	}

	public Tea getSuperSpecialtea() {
		return superSpecialtea;
	}

	public void greetCustomer() {
		System.out.println(idRef);
		tea.prepareHotDrink();
	}
}
