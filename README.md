# Option Box Selenium Automation Project

This project demonstrates how to automate the interaction with option checkboxes on a practice webpage using **Selenium WebDriver**. The script automates the process of checking and unchecking three car brand checkboxes (BMW, Benz, and Honda). The automation includes delays between actions to allow the user to clearly observe each interaction. 

## Features
- Automates the checking and unchecking of three checkboxes: **BMW**, **Benz**, and **Honda**.
- Uses **WebDriverWait** to wait for the checkboxes to be clickable before interacting with them.
- Adds a 2-second delay between actions (checking/unchecking) to simulate user interactions and make the actions observable.
- Ensures that after checking the checkboxes, they are unchecked in the same sequence.
- Uses **ChromeDriver** for browser automation.
  
## Prerequisites
Before running the project, ensure that you have the following installed:

1. **Java**: Install the Java Development Kit (JDK) on your machine (check by running `java -version` in your terminal).
2. **Selenium WebDriver**: Selenium version 4.25.0 is required for automation. You can add Selenium dependencies in your project using Maven or Gradle.
3. **ChromeDriver**: Download the correct version of **ChromeDriver** that matches your installed version of Google Chrome from [here](https://sites.google.com/a/chromium.org/chromedriver/downloads).
4. **IDE**: Use an IDE like IntelliJ IDEA, Eclipse, or any Java-supported IDE for running the code.

## Technologies Used
- **Java**: The programming language used for writing the automation scripts.
- **Selenium 4.25.0**: WebDriver version used to automate browser actions.
- **ChromeDriver**: The WebDriver for automating Google Chrome.
- **WebDriverWait**: Used to explicitly wait for the web elements to be clickable before performing actions on them.
