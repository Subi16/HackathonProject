**PROJECT NAME: FIND TRAVEL INSURANCE PLAN FOR STUDENTS**


# Overview
This project aims to automate the Policy Bazzar Website using Selenium WebDriver. The automation process involves displaying three lowest international  travel insurance plan with amount and insurance provider company,Filling the necessary car details to proceed for Car Insurance and passing invalid email or phoneNumber and capturing the error message displayed and Retrieve all Health Insurance menu items and store in a List ,Display the same. 


## Libraries and Dependencies
- **Maven Repository:** Maven 3.12.1
- **Apache POI:** 5.2.3
- **TestNG:** 7.8.0
- **Extent Report-cucumber7-adapter:** 1.14
- **Selenium WebDriver:** 4.15.0
- **Cucumber-junit:** 7.14.1
- **Cucumber-java:** 7.14.1
- **Loggers:** 2.20.0


## Automation Flow
1. Display three lowest international  travel insurance plan with amount and insurance provider company
2. Group of  2 student people (Age 22,21)
3. For any European country
(Suggested Site: policybazaar however you are free to use any other legitimate site)
Detailed Description: Hackath Ideas
 
1. Find travel insurance plan for students, for 2 people (Age 22 & 21) & any European country, fill further dummy details & display three lowest international  travel insurance plan with amount and insurance provider company
2. Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message

1.  Retrieve all Health Insurance menu items and store in a List; Display the same

 
## Libraries Explanation
- **Maven Repository:** Used for project management and dependency resolution.
- **Apache POI:** Handles Excel operations for data-driven testing.
- **TestNG:** Facilitates test case organization and execution.
- **TestNG Report:** Generates comprehensive test reports.
- **Selenium WebDriver:** Automates browser interactions.
- **Loggers:** Facilitates logging for better debugging.
- **Cucumber framework:** Behavior Driven Development tool used to develop test cases for the behavior of software's functionality.
- **Selenium Grid:** It specializes in running multiple tests across different browsers,operating systems and machines in parallel.

## Screenshots
Screenshots are captured at failed test cases for documentation and analysis in the Cucumber-Extent-Report generated on webPage.

## How to Run
1. **Open Eclipse IDE:**
   - Launch Eclipse IDE on your machine.

2. **Import Project:**
   - Select `File` -> `Import` from the menu.
   - Choose `Existing Maven Projects` and click `Next`.
   - Browse to the directory where you cloned the repository and select the project.

3. **Update Maven Project:**
   - Right-click on the project in the Project Explorer.
   - Choose `Maven` -> `Update Project`.
   - Click `OK` to update dependencies.

4. **Set Up Configuration:**
   - Open the `src/test/resources/config.properties` file.
   - Update any configuration parameters like browser type, URLs, etc., as needed.

5. **Run Test Suite:**
   - Locate the test suite file (``)
   - Right-click on the file and choose `Run As` -> `JUnit test or TestNG test `.

6. **View Reports:**
   - After execution, open the `reports` folder.
   - Click myreport.html and view the Cucumber-Extent-Report generated in webPage.

## Reporting
1. **Locate Test Reports:**
   - After the execution, navigate to the `reports` folder in the project directory.

2. **Open Extent Report:**
   - Inside the `reports` folder, find the Cucumber-Extent-Report HTML file named `myreports.html`.

3. **View Test Reports:**
   - Open the `myreports.html` file using any web browser.
   - This report provides a detailed overview of test executions, including passed and failed tests, test duration and with the corresponding Screenshots of the failed tests.

4. **Screenshots and Logs:**
   - screenshots captured during test execution  for failed test cases.

5. **Analyze Results:**
   - Utilize the visual representation in the Cucumber-Extent-Report to quickly identify test status and any issues encountered during the test run.

## Contributors
- ** Durkesh D 2318294 **
- ** Haritha B 2318420 **
- ** Subhashini S 2318393 **
- ** Nikil Sharan S 2318296 **
- ** Udaya Krishna S 2318365 **


## Future Enhancements
- **Enhancement 1: Enhanced Logging**
  - Description: Introduce more detailed logging to aid in debugging and analysis of test results.
  - Timeline: Considered for the upcoming sprint.

- **Enhancement 2: Test Data Generation**
  - Description: Develop a module for generating test data dynamically to increase test coverage.
  - Timeline: Long-term goal for improved data-driven testing.

- **Enhancement 3: Integration with CI/CD**
  - Description: Integrate the automation script with popular CI/CD platforms for continuous    testing.
  - Timeline: Targeting a future release for streamlined workflows.


