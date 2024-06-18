package pkg1.user;

public class UserModel {
	String name,country_code,gmail,password,location,language;
	long phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public UserModel(String name, String country_code, String gmail, String password, long phone, String location, String language) {
		super();
		this.name = name;
		this.country_code = country_code;
		this.gmail = gmail;
		this.password = password;
		this.phone = phone;
		this.location = location;
		this.language = language;
	}
	public UserModel(String name, String country_code, String gmail, long phone, String location, String language) {
		super();
		this.name = name;
		this.country_code = country_code;
		this.gmail = gmail;
		this.phone = phone;
		this.location = location;
		this.language = language;
	}
}
