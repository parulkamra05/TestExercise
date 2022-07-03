# TestExercise

Tools Used:- Java, eclipse, Selenium Webdriver, Maven build, POM, Junit testing framework.

1. Download Java in your machine. Set the Path and class path in Environment variables. I have used version 1.8.
2. Download Maven-Apache. Set the path and class path in Environment variables. I have used version 3.8.6.
3. Download eclipse java IDE for developers. Create a new maven project. Create Group Id and artifact id in the maven build. 
	Wait for the explorer to automatically fully load the structure and reference libraries required like Junit (version 4), selenium libraries.
4. Download chromedriver.exe and put in some safe location which will be referred in the setproperty command in the setup method. 
	The chromeDriver version should be corresponding to the Chrome browser of your machine.
5. Append selenium dependencies in POM.xml file. 
	<artifactId>selenium-api</artifactId>, <artifactId>selenium-server</artifactId>, <artifactId>selenium-remote-driver</artifactId> from <groupId>org.seleniumhq.selenium</groupId>.
6. The project structure is divided in to POM based model. The pages and tests are depicted in separate folder packages.
7. Write the java and selenium code to create pages and tests. Add Junit annotations like @Before, @Test, @After to better structure the flow of execution.
8. Save all changes before executing the test.
9. Right click the project and Run the test class using Junit application.
10. The output is displayed on console. The testcase count, pass, failures is displayed under Junit result tab.

I have provide the fleixibility to run all the tests in one single click.
Right click on the file 'TestSuite_BuggyCars.java' ad run as Junit application. All the tests will run automatically without manual intervention.
You can also run each test separately by individually running each testcase class.

