package de.mathisneunzig.programmierenvl.travel;

public class LicencePlate {
	
	private String cityCode;
	private String nameCode;
	private String letterCode;
	private int number;
	
	public LicencePlate(String cityCode, String nameCode, int number) {
		
		this.cityCode = cityCode;
		this.nameCode = nameCode;
		this.number = number;
		
	}
	
	public LicencePlate(String letterCode, int number) {

		this.letterCode = letterCode;
		this.number = number;
		
	}
	
	public String getLabel() {
		if(cityCode == null)
			return letterCode + "-" + number;
		if(letterCode == null)
			return cityCode + "-" + nameCode + " " + number;
		return "";
	}
	
}
