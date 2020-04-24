package wv.commonutilities;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.github.javafaker.Company;
import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

public class FakerData {

	public Faker faker;
	public FakeValuesService fakeValueService = new FakeValuesService(new Locale("en-GB"), new RandomService());
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String address_firstname;
	private String address_lastname;
	private Company address_company;
	private String address_address;
	private String city;
	private String zipcode;
	private PhoneNumber mobile;
	private String alternateAddress;
	private String state;
	private String companycode;
	private String stationname;
	private String descriptionname;
	private String lat;
	private String lag;
	private String website;
	///////////////////////// Charger creation
	private String charger_chargerid;
	private String new_Charger_Charger_Type;
	private String new_Charger_Chargin_Speed;
	private String new_Charger_Max_Energy_Usage;
	private String connectors;
	private String hrtime;
	private String mintime;
	
	//////////////////////////////////////// Rate profile////
	
	private String perminute;
	private String fixedamount;
	private String amountperminute;
	
	
	
	
	
	
	
	
	public String getCompanycode() {
		return companycode;
	}

	public void setCompanycode() {
		this.companycode = faker.bothify("????###");
	}

	public String getstate() {
		return state;
	}
	
	public void setState() {
		this.state = faker.bothify("Telangana");
	}


	public Faker getFaker() {
		return faker;
	}

	public void setFaker(Faker faker) {
		this.faker = faker;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname() {
		this.firstname = faker.address().firstName();
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname() {
		this.lastname = faker.address().lastName();
	}

	public String getEmail() {

		return email;

	}

	public void setEmail() {

		this.email = fakeValueService.bothify("????##@gmail.com");

	}

	public String getPassword() {
		return password;
	}

	public void setPassword() {
		this.password = "Pass1234";
	}

	public String getAddress_firstname() {
		return address_firstname;
	}

	public void setAddress_firstname() {
		this.address_firstname = faker.address().firstName();
	}

	public String getAddress_lastname() {
		return address_lastname;
	}

	public void setAddress_lastname() {
		this.address_lastname = faker.address().lastName();
	}

	public Company getAddress_company() {
		return address_company;
	}

	public void setAddress_company() {
		this.address_company = faker.company();
	}

	public String getAddress_address() {
		return address_address;
	}

	public void setAddress_address() {
		this.address_address = faker.address().fullAddress();
	}

	public String getCity() {
		return city;
	}

	public void setCity() {
		this.city = faker.address().city();
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode() {
		this.zipcode = "35005";
	}

	public PhoneNumber getMobile() {
		return mobile;
	}

	public void setMobile() {
		this.mobile = faker.phoneNumber();
	}

	public String getAlternateAddress() {
		return alternateAddress;
	}

	public void setAlternateAddress() {
		this.alternateAddress = faker.address().streetAddress();
	}
	public String getStationname() {
		return stationname;
	}
	public void setStationname() {
		this.stationname = fakeValueService.letterify("Vijay???????");
	}
	public String getDescriptionname() {
		return descriptionname;
	}
	public void setDescriptionname() {
		this.descriptionname = fakeValueService.letterify("???????????????????");
	}
	public String getlat() {
		return lat;
	}
	public void setLat() {
		this.lat = fakeValueService.letterify("17.4023796");
	}
	public String getlag() {
		return lag;
	}
	public void setLag() {
		this.lag = fakeValueService.letterify("78.37285380000003");
	}

	public String getwebsite() {
		return website;
	}
	public void setWebsite() {
		this.website = fakeValueService.letterify("https://www.oati.com");
	}
	///////////////////////Charger Creation
	public String getCharger_chargerid() {
		return charger_chargerid;
	}
	public void setCharger_chargerid() {
		this.charger_chargerid = fakeValueService.letterify("AT000011");
	}
	
	public String getNew_Charger_Charger_Type() {
		return new_Charger_Charger_Type;
	}
	public void setNew_Charger_Charger_Type() {
		this.new_Charger_Charger_Type = fakeValueService.letterify("AT000011");
	}
	public String getNew_Charger_Chargin_Speed() {
		return new_Charger_Chargin_Speed;
	}
	public void setNew_Charger_Chargin_Speed(){
		this.new_Charger_Chargin_Speed = fakeValueService.letterify("45");
	}
	public String getNew_Charger_Max_Energy_Usage() {
		return new_Charger_Chargin_Speed;
	}
	public void setNew_Charger_Max_Energy_Usage(){
		this.new_Charger_Chargin_Speed = fakeValueService.letterify("100");
	}
	public String getConnectors() {
		return connectors;
	}
	public void setConnectors(){
		this.connectors = fakeValueService.letterify("2");
	}
	
	public String getHrtime() {
		return hrtime;
	}

	public void setHrtime() {
		this.hrtime = "04";
	}
	public String getMintime() {
		return mintime;
	}

	public void setMintime() {
		this.mintime = "01";
	}
	
	public String getPerminute() {
		return perminute;
	}
	public void setPerminute(){
		this.perminute = fakeValueService.letterify("10");
	}
	
	public String getFixedamount() {
		return fixedamount;
	}
	public void setFixedamount(){
		this.fixedamount = fakeValueService.letterify("3");
	}
	

	public String getAmountperminute() {
		return amountperminute;
	}
	public void setAmountperminute(){
		this.amountperminute = fakeValueService.letterify("2");
	}
	

	
	
	
	public FakerData() {
		faker = new Faker();
		setState();
		setFirstname();
		setAddress_firstname();
		setLastname();
		setAddress_lastname();
		setPassword();
		setEmail();
		setMobile();
		setAlternateAddress();
		setZipcode();
		setCity();
		setAddress_company();
		setAddress_address();
		setCompanycode();
		setStationname();
		setDescriptionname();
		setLat();
		setLag();
		setWebsite();
		setCharger_chargerid();
		setNew_Charger_Charger_Type();
		setNew_Charger_Chargin_Speed();
		setNew_Charger_Max_Energy_Usage();
		setPerminute();
		setFixedamount();
		setAmountperminute();
		
		
		

	}

}
