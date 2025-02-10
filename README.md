# Automating Tool Shop Demo Website
This is an automation project written in Java that performs the following tasks for a website:
Navigate to the website.
Register a new user.
Login with the user credentials.
Add a product to the shopping cart.
Checkout the items in the cart and validate the checkout process.
Complete the transaction by filling in the required checkout information. 

## Requirements
Tools and Libraries
Java: The core programming language.
Selenium WebDriver: For browser automation.
TestNG: For test management and execution.
Maven: For dependency management and build automation.
JUnit: For additional testing framework support

## Installation
1. git clone 
2. Install Java (jdk 20 or higher version)
3. Add dependencies on pom.xml file

## Running the project
Navigate to the project directory.
Execute the test by opening the test folder and run the test rnner file

# Running the project
The test will automatically perform the following steps:
Navigate to the target website.
Register a new user.
Login with the newly registered user.
Add a product to the shopping cart.
Checkout the items in the cart and validate the checkout process.
Complete the transaction by filling in the required details and completing the purchase.
Close the browser 

# Project Structure

|-- src
    |-- main
        |-- java
            |--com.toolshop.config
                |-- load properties
                
    |-- test
        |-- java
            |-- com.toolshop
                |-- base 
                  |-- BasePage
                  |-- TestBase
                |-- Pages
                   |-- CategoriesPage
                   |-- CheckOutPage
                   |-- LoginPage
                   |-- RegisterPage
                 |-- tests
                   |-- BuyItemTest
                   |-- RegisterPage
                 |-- Utils
                   |-- BrowserFactory
|-- pom.xml (Maven configuration)

# Automation Flow:
Navigate to Website:

Open the browser and visit the homepage URL.
Register User:

Fill out the registration form with necessary details (e.g., name, email, password) and submit.
Validate successful registration by verifying the presence of a success message or redirect to the homepage.
Login User:

Provide login credentials (email and password).
Ensure successful login by verifying the presence of the user profile or dashboard.
Add Product to Cart:

Navigate through product categories and click on a product.
Add the product to the shopping cart.
Validate that the product is added to the cart.
Checkout Items:

Click the cart icon, review the items, and proceed to checkout.
Validate that the cart contains the correct products and totals.
Complete Transaction:

Fill out billing and shipping details.
Confirm the purchase and validate the successful transaction by verifying the confirmation message or order number.

# Contributing
Feel free to fork this repository and submit pull requests. If you have any suggestions or improvements, open an issue to discuss them

# License
No licenses required for this project






