package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import core.DriverFectory;



public class FurmulariosPage extends DriverFectory{
	
	public WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
public FurmulariosPage(WebDriver driver) {
	super(driver);
	}
	 
private static final String Site= ("//*[@id='app_sub_title']");	
private static final String Make= ("//*[@id='make']/option[4]");
private static final String EnginePerform= ("//*[@id='engineperformance']"); 
private static final String Model=  ("//*[@id='model']/option[2]");
private static final String CylinderCapacity= ("//*[@id='cylindercapacity']");
private static final String DateManufacture= ("//*[@id='dateofmanufacture']");
private static final String NumberSeats= ("//*[@id='numberofseats']/option[5]");
private static final String RightHandDrive= ("//*[@class='ideal-radio']");
private static final String NumberofSeats= ("//*[@id='numberofseatsmotorcycle']/option[3]");//
private static final String FuelType= ("//*[@id='fuel']/option[3]");
private static final String Payload= ("//*[@id='payload']"); 
private static final String TotalWeight= ("//*[@id='totalweight']");
private static final String ListPrice= ("//*[@id='listprice']"); 
private static final String LicensePlateNumber= ("//*[@id='licenseplatenumber']"); 
private static final String AnnualMileage= ("//*[@id='annualmileage']");
private static final String Next= ("//*[@id='nextenterinsurantdata']");
private static final String FirstName= ("//*[@id='firstname']");
private static final String LastName= ("//*[@id='lastname']");
private static final String DateofBirth= ("//*[@id='birthdate']");
private static final String Gender= ("//*[@id='insurance-form']/div/section[2]/div[4]/p/label[2]/span");
private static final String StreetAddress= ("//*[@id='streetaddress']");
private static final String Country= ("//*[@id='country']/option[32]");
private static final String ZipCode= ("//*[@id='zipcode']");
private static final String City= ("//*[@id='city']");
private static final String Occupation= ("//*[@id='occupation']/option[2]");
private static final String Hobbies= ("//*[@class='ideal-check']");
private static final String Website= ("//*[@id='website']");
private static final String NextBtn= ("//*[@id='nextenterproductdata']");
private static final String StartDate= ("//*[@id='startdate']"); 
private static final String InsuranceSum= ("//*[@id='insurancesum']/option[2]");
private static final String MeritRating= ("//*[@id='meritrating']/option[5]");
private static final String DamageInsurance= ("//*[@id='damageinsurance']/option[2]");
private static final String OptionalProducts= ("//*[@id='insurance-form']/div/section[3]/div[5]/p/label[1]/span");
private static final String CourtesyCar= ("//*[@id='courtesycar']/option[2]");
private static final String NextPriceoption= ("//*[@name='Next (Select Price Option)']");
private static final String SelectOption= ("//*[@id='priceTable']/tfoot/tr/th[2]/label[4]/span");
private static final String Nextsendquote= ("//*[@id='nextsendquote']");
private static final String Email= ("//*[@id='email']");
private static final String Phone= ("//*[@id='phone']");
private static final String Username= ("//*[@id='username']");
private static final String Password= ("//*[@id='password']");
private static final String ConfirmPassword= ("//*[@id='confirmpassword']");
private static final String Comments= ("//*[@id='Comments']");
private static final String ButtonSend= ("//*[@id='sendemail']");
private static final String MensagenSucesso= ("//*[@class='sweet-alert showSweetAlert visible']");


//start
public String acessarSite(){	
	return driver.findElement(By.xpath(Site)).getText();}

public String mensageSucesso(){	
	return driver.findElement(By.xpath(MensagenSucesso)).getText();}

public String confirmNext(){	
	return driver.findElement(By.xpath(Next)).getText();}

public String confirmNextProduct(){	
	return driver.findElement(By.xpath(NextPriceoption)).getText();}

//Form5
public void inputEmail(String email) { 
	driver.findElement(By.xpath(Email)).sendKeys(email);}

public void inputPhone(String phone) { 
	driver.findElement(By.xpath(Phone)).sendKeys(phone);}

public void userName(String username) { 
	driver.findElement(By.xpath(Username)).click();
	driver.findElement(By.xpath(Username)).sendKeys(username);}
	
public void inputPassword(String password) { 
	driver.findElement(By.xpath(Username)).click();
	driver.findElement(By.xpath(Password)).sendKeys(password);}

public void confirmPassword(String cpassword) { 
	driver.findElement(By.xpath(Username)).click();
	driver.findElement(By.xpath(ConfirmPassword)).sendKeys(cpassword);}

public void inputComments(String comments) { 
	driver.findElement(By.xpath(Comments)).sendKeys(comments);}

public void sendButton(String send) { 
	driver.findElement(By.xpath(ButtonSend)).click(); }

//Form4
public void selectOption(String selectoption) { 
	driver.findElement(By.xpath(SelectOption)).click(); }

public void nextSendQuote(String nextsendquote) { 
	driver.findElement(By.xpath(Nextsendquote)).click(); }


//Form3
public void startDate(String startdate) { 
	driver.findElement(By.xpath(StartDate)).sendKeys(startdate);}

public void insuranceSum(String insurancesumr) { 
	driver.findElement(By.xpath(InsuranceSum)).click(); }

public void meritRating(String meritrating) { 
	driver.findElement(By.xpath(MeritRating)).click(); }

public void damageInsuranceg(String damageinsurance) { 
	driver.findElement(By.xpath(DamageInsurance)).click(); }

public void optionalProducts(String optionalproducts) { 
	driver.findElement(By.xpath(OptionalProducts)).click(); }

public void courtesyCar(String courtesycar) { 
	driver.findElement(By.xpath(CourtesyCar)).click(); }

public void nextPriceoption(String nextPrice) { 
	driver.findElement(By.xpath(NextPriceoption)).click();}

//Form2
public void firstName(String firstname) { 
	driver.findElement(By.xpath(FirstName)).sendKeys(firstname);}

public void lastName(String lastname) { 
	driver.findElement(By.xpath(LastName)).sendKeys(lastname);	}

public void dateBirth(String datebirth) { 
	driver.findElement(By.xpath(DateofBirth)).sendKeys(datebirth); }

public void feGender(String gender) { 
	driver.findElement(By.xpath(Gender)).click(); }

public void streetAddress(String address) { 
	driver.findElement(By.xpath(StreetAddress)).sendKeys(address); }

public void selectCountry(String country) { 
	driver.findElement(By.xpath(Country)).click(); }

public void inputCity(String city) { 
	driver.findElement(By.xpath(City)).sendKeys(city);; }

public void zipCode(String zipCode) { 
	driver.findElement(By.xpath(ZipCode)).sendKeys(zipCode); }

public void occupation(String skill) { 
	driver.findElement(By.xpath(Occupation)).click(); }

public void hHobbie(String hobbie) { 
	driver.findElement(By.xpath(Hobbies)).click(); }

public void webSite(String website) { 
	driver.findElement(By.xpath(Website)).sendKeys(website); }

public void nextBtn() { 
	driver.findElement(By.xpath(NextBtn)).click(); 
	}

//Form1
public void selectMake(String make) { 
	driver.findElement(By.xpath(Make)).click(); }

public void model(String model) { 
	driver.findElement(By.xpath(Model)).click(); } 

public void cylinderCapacity(String cylinder) { 
	driver.findElement(By.xpath(CylinderCapacity)).sendKeys(cylinder); }

public void enginePerformance(String performance) { 
	driver.findElement(By.xpath(EnginePerform)).sendKeys(performance); }

public void dateManufacture(String date) { 
	driver.findElement(By.xpath(DateManufacture)).click();
	driver.findElement(By.xpath(DateManufacture)).sendKeys(date); }

public void numberSeats(String seats) { 
	driver.findElement(By.xpath(NumberSeats)).click(); } 

public void rightHandDrive(String fueltype) { 
	js.executeScript("window.scrollBy(0,600)");
	driver.findElement(By.xpath(RightHandDrive)).click(); }

public void numberofSeats(String fueltype) { 
	driver.findElement(By.xpath(NumberofSeats)).click(); }

public void fuelType(String fueltype) { 
	driver.findElement(By.xpath(FuelType)).click(); } 

public void payloadP(String payload) { 
	driver.findElement(By.xpath(Payload)).sendKeys(payload); 
}

public void totalWeight(String totalweight) { 
	driver.findElement(By.xpath(TotalWeight)).sendKeys(totalweight); }
	
public void listPrice(String price) { 
	driver.findElement(By.xpath(ListPrice)).sendKeys(price); }
	  
public void licensePlateNumber(String platenumber) { 
	driver.findElement(By.xpath(LicensePlateNumber)).sendKeys(platenumber); }


public void annualMileage(String mileage) { 
	driver.findElement(By.xpath(AnnualMileage)).sendKeys(mileage); }

public void btnNext() { 
	driver.findElement(By.xpath(Next)).click();}

}