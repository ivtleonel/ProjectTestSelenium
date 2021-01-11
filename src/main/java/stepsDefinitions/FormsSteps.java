package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.List;
import org.junit.Test;
import Pages.FurmulariosPage;
import core.DriverFectory;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class FormsSteps {

	private FurmulariosPage formPage = new FurmulariosPage(DriverFectory.getDriver());
	
	@Test
	@Given("^I stay the Ricentis website \"([^\"]*)\"$")
	public void iStayTheRicentisWebsite(String website) throws Throwable {
		assertEquals("Is not opening the website: " +website+ " ",website, formPage.acessarSite());
	}
     //Enter vehicle data
	@When("^I fill the fields with the values:$")
	public void iFillTheFieldsWithTheValues(DataTable values) throws Throwable {
		List<String> list = values.asList(String.class);
		  
		   formPage.selectMake(list.get(0));
		   formPage.model(list.get(1));
		   formPage.cylinderCapacity(list.get(2));
		   formPage.enginePerformance(list.get(3));
		   formPage.dateManufacture(list.get(4));
		   formPage.numberSeats(list.get(5));
		   formPage.rightHandDrive(list.get(6));
		   formPage.numberofSeats(list.get(7));
		   formPage.fuelType(list.get(8));
		   formPage.payloadP(list.get(9));
		   formPage.totalWeight(list.get(10));
		   formPage.listPrice(list.get(11));
		   formPage.licensePlateNumber(list.get(12));
		   formPage.annualMileage(list.get(13));
		   
	}

	@When("^I click \"([^\"]*)\"$")
	public void iClick(String next) throws Throwable {		
		   assertEquals("Next button does not exist: " +next+ " ",next, formPage.confirmNext());
		   formPage.btnNext();

	}
	@Test//Enter Insurant Data
	@When("^I fill the Insurant Data fields with the values:$")
	public void iFillTheInsurantDataFieldsWithTheValues(DataTable values) throws Throwable {
		List<String> list = values.asList(String.class);
		  formPage.lastName(list.get(0));
		  formPage.firstName(list.get(1));
		  formPage.dateBirth(list.get(2));
		  formPage.feGender(list.get(3));		  
		  formPage.streetAddress(list.get(4));
		  formPage.selectCountry(list.get(5));
		  formPage.zipCode(list.get(6));
		  formPage.inputCity(list.get(7));
		  formPage.occupation(list.get(8));
		  formPage.hHobbie(list.get(9));
		  formPage.webSite(list.get(10));
	}

	@When("^I click \"([^\"]*)\" btn$")
	public void iClickBtn(String btnnext) throws Throwable {
		   formPage.nextBtn();
	}

	@Test //Enter Produc Data	
	@When("^I fill the product data fields with the values:$")
	public void iFillTheProductDataFieldsWithTheValues(DataTable values) throws Throwable {
		List<String> list = values.asList(String.class);
		  formPage.startDate(list.get(0));
		  formPage.insuranceSum(list.get(1));
		  formPage.meritRating(list.get(2));
		  formPage.damageInsuranceg(list.get(3));		  
		  formPage.optionalProducts(list.get(4));
		  formPage.courtesyCar(list.get(5));		  		
	}

	@When("^I click next price \"([^\"]*)\"$")
	public void iClickNextPrice(String nextprice) throws Throwable {
		 assertEquals("Next button does not exist: " +nextprice+ " ",nextprice, formPage.confirmNextProduct());
		 formPage.nextPriceoption(nextprice);
	}
	
	@When("^I select price \"([^\"]*)\"$")
	public void iSelectPrice(String price) throws Throwable {
		formPage.selectOption(price);
	}

	@When("^I click next send quote \"([^\"]*)\"$")
	public void iClickNextSendQuote(String quote) throws Throwable {
		formPage.nextSendQuote(quote);
	}
	
	@When("^I fill the send quote fields with the values:$")
	public void iFillTheSendQuoteFieldsWithTheValues(DataTable values) throws Throwable {
		List<String> list = values.asList(String.class);
		  formPage.inputEmail(list.get(0));
		  formPage.inputPhone(list.get(1));
		  formPage.userName(list.get(2));
		  formPage.inputPassword(list.get(3));		  
		  formPage.confirmPassword(list.get(4));
		  formPage.inputComments(list.get(5));
	}

	@When("^I click send button \"([^\"]*)\"$")
	public void iClickSendButton(String send) throws Throwable {
         formPage.sendButton(send);
	}
	
	@Then("^See mensage Sending e-mail success!$")
	public void seeMensageSendingEMailSuccess() throws Throwable {		
		String mensage ="Sending e-mail success!" + 
		"\nOK";		
		assertEquals("Registration failed: " +mensage+ " ",mensage, formPage.mensageSucesso());       
	}
	
    @After
	    public void kill() throws Throwable {
    	   Thread.sleep(8000);
		   DriverFectory.killDriver();
	    }

}
