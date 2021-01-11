#encoding:iso-8859-1
#Author: ivtleonel@gmail.com
#AuthorPhone: 92 992120190
@forms
Feature: Filling in the home forms on the Ricentis website to register

  @ehicle_data
  Scenario: Fill out all forms on the home page
    Given I stay the Ricentis website "Vehicle Insurance Application"
    When  I fill the fields with the values:
    |Ford |Scooter| 500  |1000| 01/08/2021| 4 |3 |Diesel |Yes|100 |800|5800| 0000 | 120 | 
    When  I click "Next »"
    
    When  I fill the Insurant Data fields with the values:
    |Teste |Selenium| 01/08/2000 |Female| Rua Ferrabraz| Brazil |93700000|Campo Bom |Employee|Speeding|sampleapp.tricentis.com|
    When  I click "Next »" btn 
       
    When  I fill the product data fields with the values:
    |04/05/2021 |30.000.000,00| 01/08/2000 |Bonus 2| No Coverage| Euro Protection |No|    
    When  I click next price "Next »"
    
    When  I select price "Select Option"
    When  I click next send quote "Next »" 
    
    When  I fill the send quote fields with the values:
    |teste@gmail.com |92991130190|teste2021|Teste2021@|Teste2021@|Desafio selenium| 
    When  I click send button "Send »"
    Then  See mensage Sending e-mail success!        