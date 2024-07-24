# CucumberFramework


# Description: Selenium WebDriver and Cucumber Automation for Bus Ticket Booking
# Overview
This project demonstrates the automation of bus ticket booking on the AbhiBus website using Selenium WebDriver and Cucumber with Java. The automation script performs actions such as opening the website, entering travel details, selecting bus seats, and validating the seat selection process.

# Features
# Open Website:

The script initiates the Firefox browser using WebDriverManager.
It navigates to the AbhiBus website and maximizes the browser window for better visibility.
# Enter Travel Credentials:

Selects the source and destination stations (Bangalore to Hyderabad) by interacting with dropdown menus.
Chooses the travel date (e.g., Tomorrow) for the bus journey.
# Select Bus Seat:

Applies a price drop filter to narrow down bus options.
Selects a bus partner from the available options.
Chooses up to three bus partners for seat selection.
# Validate Seat Selection:

Clicks the "Show Seats" button for the chosen bus.
Selects a specific seat (e.g., 9U) from the available seats.
Validates the selection by interacting with additional elements on the page.
# Technologies Used
Java: The core programming language for writing the test scripts.
Selenium WebDriver: For automating browser actions.
Cucumber: For behavior-driven development (BDD) and creating readable test scenarios.
WebDriverManager: For managing browser drivers.
JUnit/TestNG: For running the test scenarios (not explicitly mentioned but commonly used with Cucumber).
Setup Instructions

# Install Dependencies:

Ensure you have Java and Maven installed on your machine.
Add dependencies for Selenium, Cucumber, WebDriverManager, and JUnit/TestNG in your pom.xml file if using Maven.
# Run the Test:
Navigate to the project directory.
Execute the test scenarios using your preferred test runner (e.g., mvn test for Maven).
# Future Enhancements
Integrate additional test scenarios for different travel routes and dates.
Implement reporting for better visualization of test results.
Enhance error handling and add more assertions for validation.
# Contributing
Contributions are welcome! Feel free to fork the repository and submit pull requests for improvements or new features.

# License
This project is licensed under the MIT License - see the LICENSE file for details.

