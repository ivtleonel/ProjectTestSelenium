Para executar automação é necessario as seguintes configurações.

Passos: 
1- Clone o projeto na sua maquina;
2- Abra o Eclipse IDE;
3- Abra o projeto clonado;
4- Entra em src/test/java;
5- No pacote Runners e execute a class FormRunner.java (Run As/JUnit Test)
6- Para ver o resultado basta clicar no Console da IDE

O esultado deve ser igual a:

#encoding:iso-8859-1
#Author: ivtleonel@gmail.com
#AuthorPhone: 92 992120190
@forms
Feature: Filling in the home forms on the Ricentis website to register
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Starting ChromeDriver 87.0.4280.88 (89e2380a3e36c3464b5dd1302349b1382549290d-refs/branch-heads/4280@{#1761}) on port 20422
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
jan 11, 2021 7:58:55 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFORMAÇÕES: Detected dialect: W3C

  @ehicle_data
  Scenario: Fill out all forms on the home page                       # forms.feature:8
    Given I stay the Ricentis website "Vehicle Insurance Application" # FormsSteps.iStayTheRicentisWebsite(String)
    When I fill the fields with the values:                           # FormsSteps.iFillTheFieldsWithTheValues(DataTable)
    When I click "Next »"                                             # FormsSteps.iClick(String)
    When I fill the Insurant Data fields with the values:             # FormsSteps.iFillTheInsurantDataFieldsWithTheValues(DataTable)
    When I click "Next »" btn                                         # FormsSteps.iClickBtn(String)
    When I fill the product data fields with the values:              # FormsSteps.iFillTheProductDataFieldsWithTheValues(DataTable)
    When I click next price "Next »"                                  # FormsSteps.iClickNextPrice(String)
    When I select price "Select Option"                               # FormsSteps.iSelectPrice(String)
    When I click next send quote "Next »"                             # FormsSteps.iClickNextSendQuote(String)
    When I fill the send quote fields with the values:                # FormsSteps.iFillTheSendQuoteFieldsWithTheValues(DataTable)
    When I click send button "Send »"                                 # FormsSteps.iClickSendButton(String)
    Then See mensage Sending e-mail success!                          # FormsSteps.seeMensageSendingEMailSuccess()

1 Scenarios (1 passed)
12 Steps (12 passed)
0m35,147s

NOTA:
Não é necessario configurar driver na sua maquina, pois o projeto faz uso da ferramenta Selenium WebDriver que faz isso automatico.