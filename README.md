# ClipboardAssesmentIbk
This project is about the search of the second highest priced Samsung television on https://www.amazon.in/ and the automation of user creation using https://reqres.in/api/users.
Selenium Java TestNG Maven framework was used to automate the UI and API Tests using a single framework. Also used in this project is Page Object Model design. This was chosen for easy readability and code maintenance.


## Built With
- Selenium Webdriver  
- Java  
- TestNG  

## Automated BASEURL
- https://www.amazon.in/
- https://reqres.in/api/users



## Getting Started

1.This project is to automate the  selection of the highest priced Samsung on the  Amazon.in website and prints the product details.
2.To run a rest assured post call to create user while the following assertions were made
- i. Response code
- ii. Response schema
- iii. Response time is within 2 seconds
- iv. Response header has “Content-Type” with value containing “application/json”
- v. Response can be deserialised to POJO**
--More Project Explanation:
	1.TestNG - This was used because of it's advantages which include but not limited to the following; 
Helps to run execute test methods (test cases) in parallel - in this project, the number of thread counts used is '5' which means 5 test methods can run at the same time.
It allows us to define dependency of one test method over other method using some of it's annotations- In this project @Beforetest was used in the base class to indicate that before test runs, everything under @Beforetest need to happen first. @After test is another annotation used to ensure after all the test has run, the code under it is executed while @Test used in the project indicates the test methods to be run.
It also allows to assign priority to test methods - Here priority 1 to 9 were assigned to tests under the 'selectsamsungsecondhighestpriceditem' class (which I also term test suite to select the second highest priced samsung)
It supports data driven testing using @DataProvider annotation - This was used for the API automation package. The Data provider helps to pass different values to test cases in a single execution.
	2.More on Page Object Model - In this project, 6 pages were created warehousing the elements categorised to be on those pages. These pages are contained under 'pages' in src.
After creating the pages, the pages were called in the 'selectsamsungsecondHighestPricedItem.java' class which contains all the neccessary test cases. This approach helps to maintain code effectiively. For instance, if the locator of an element changes, there is no need to change the locators in the main test cases as the only thing required is to change the locator corresponding to the variable assigned to it.Ho
A constructor was created in all the pages so as to help the main test recognize the 'driver' that will be used to interact with the browser. In the main test, each test case must contain the argument - driver to conform to the 'pages' class. Without the argument 'driver' an error will be thrown.

The use of Maven Framework made it possible to use dependencies (which are the libraries needed for the project) and have them in one place.This helps in maintaining the project as who ever is going through it will see at once what were used and what need to be added for any other project to work effectively. The needed dependencies are contained in a open and close 'dependencies' tag.
The dependencies include;
TestNG - Already explained above
WebDrivermanager - In order to interact with the browser (in this case Chrome), there is a need for us to use the Chromedriver Class. Without the Chromedriver, the browser cannot be launched let alone navigating the web pages. We can interact with chromediver either by downloading the driver and pointing to it's directory to lauch the browser or through the use of webdrivermanager which does not require any manual driver download. The manual download, has an issue as the user must always ensure that his/her chrome version used for the setup does not change. If it changes, then the driver of the updated one will have to be downloaded and the setup pointed to the new directory. This method is not smooth and can cause delays at times, hence, the reason for using Webdrivermanager which automatically uses any version available to run the codeThis is needed so the system can automatically work with any browser version. Using the directory of the broswer after downloading
SeleniumJava - Without this, interaction with webelements will not be possible because it is SeleniumJava that helps in getting all java bindings for all browsers. Hence, it will be impossible to automate anything without it. 
Guava - This was added to resolve the incompatible library selenium issue - NoClassDefFoundError
rest-assured - This is needed for the rest assured automation. Without it, APIs cannot be automated. It provides support for testing REST APIs.
json-schema-validator - providing a format for what JSON data is required for a given application and how to interact with it. The 'acceptable' format is saved in the project path and the JSON format of the response was validated against it. 
json-simple - To pass the JSON body required for the project in rest assured, json-simple libraries was used. helps in converting strings in rest assured to JSON format
hamcrest - Hamcrest target is to make tests easier to write and read. E.g matchers for response time and assertThat. to confirm a given test, etc. 

For POJO - JSONResponse class was created to store the nodes of the JSON response. or this test, four were returned and hence, four were created. However, the main two i.e. name and job have been put in the code to be checked by the system in POJO method under 'User_Post' class which is under the apiautomation package.
The class io.restassured.response.ResponseBody which represents the response in Rest Assured, was made use of. The '.as()' method (.as(JSONResponse.class)
) in the rest assured response class helps to copy the JSON node variables (in JSONResponse class) to the respective instance variables.

For the Schema assertion, the Json format was converted into schema and the schema stored in a file (schema.json) in the project path. This was later called in the main test (User_Post) with the help of File class using 'system.getproperty' to locate the directory of the file. This was later called and confirmed to be in the expected format with the required parameters - name and job.
For the ParamClass under the apiautomation, this is where the testNG annotation - @dataprovider was used. It is a two dimensional array object (object accepts e.g. String, int etc without displaying error) was created to set the two parameters needed (name and job)

### Prerequisites
- Get JDK version 8 and above installed on your local 
- Set JAVA_HOME in environment variables
- Have an IDE installed on your computer to be able to setup framwork and run tests.


### Setup
- Open the directory where you will like to save the project. Git bash from there by right clicking
- Clone the repository with git clone https://github.com/Ibukun47/ClipboardAssesmentIbk.git
- Then, go to preferred IDE (I used Eclipse) and navigate to File menu. Open the project from your local.
- Go to the the testng.xml file on the project menu pane
- Right-click on the testng.xml file and select run as testng.xml


### Install
- IDE of choice (In my case, I used Eclipse)
- Have a stable internet connection

### Docker Usage
>Prequisite
-Install JDK, Install Maven and set MAVEN_HOME in environmental variable
-Install docker on your local machine
-Go to Command Prompt Window on your local machine
 
- Change Directory to project directory e.g C:\Users\ibukun.omitola\Documents\Projects\ClipboardAssesmentIbk>
-Run this command docker build -t ClipboardAssesmentIbk:latest 


## Author

👤 **Ibukun Omitola**

- GitHub: [@Ibukun47](https://github.com/Ibukun47)
- LinkedIn:[@ibukun-omitola](https://www.linkedin.com/in/ibukun-omitola-a526a430)




## 🤝 Contributing
Open to contributions and comments



## Show your support

Give a ⭐️ if you like this project!