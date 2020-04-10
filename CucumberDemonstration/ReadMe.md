<h1>
Project Title:

This project has been created for demonstrating Cucumber + Selenium Integration Capabilities.

Getting Started:

Ensure the folder is correctly imported in IDE - say Eclipse and now perform a clean operation from Project dropdown. Same can be achieved by using "mvn clean install" from command line from the project directory.

Prerequisites:

Maven, JUnit, Cucumber, Selenium - All applicable jars have been identified, added and also required plugins and dependencies have been added to pom.xml

Project Folder Structure:

Src/test/java/dataProvider - ConfigFileReader.java

Src/test/java/stepDefinition - FacebookAgreementSteps.java, FacebookCreatePageSteps.java, FacebookLoginSteps.java

Src/test/java/testRunner - AllTests.java, Runner.java

Src/test/java/utils - CommonFunctions.java, Constants.java

Src/test/resources/consol/output - FacebookAgreement.feature, FacebookCreatePage.feature, FacebookLogin.feature

Running the Tests:
 - From Eclipse - Select AllTests and click on Run button
 - From Command Line - mvn install -Dtest=AllTests
 
 Version:
 
 This is version 1.0
 
 Author:
 
 Amol Deshpande

