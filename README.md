# FirstMobile — Mobile Automation Framework

## 📱 Project Overview

**FirstMobile** is a mobile UI automation testing project developed using **Java, Appium, Selenium WebDriver, and TestNG**.

The project focuses on automating Android application flows such as **user login and registration**, using the **Page Object Model (POM)** design pattern to keep test logic structured and maintainable.

---

## 🛠️ Technologies & Tools

* **Java 17**
* **Appium**
* **Appium Java Client 10.1.1**
* **Selenium WebDriver**
* **TestNG 7.11.0**
* **Maven**
* **Android UIAutomator**
* **Accessibility ID**
* **Git & GitHub**
* **IntelliJ IDEA**

---

## 🏗️ Project Structure

```text
FirstMobile
│
├── src
│   ├── main
│   │   └── java
│   │       ├── base
│   │       └── pages
│   │           ├── LoginPage1
│   │           └── RegisterPage1
│   │
│   └── test
│       └── java
│           └── tests
│
├── pom.xml
└── README.md
```

---

## 🧩 Design Pattern

The project follows the **Page Object Model (POM)** approach.

Each application screen is represented by a separate Page Object class. This helps to:

* Separate test logic from page interactions
* Improve code readability
* Reduce code duplication
* Make test maintenance easier
* Provide a reusable automation structure

---

## 🧪 Automated Scenarios

The project includes automation for key Android application flows, including:

### 🔐 Login

* Open the login screen
* Enter username
* Enter password
* Perform login action

### 📝 Registration

* Open the registration screen
* Enter required user information
* Interact with registration fields
* Perform registration action

---

## 🔎 Mobile Locators

Different mobile locator strategies are used to identify Android UI elements, including:

* **Accessibility ID**
* **Android UIAutomator**
* Appium locators

Example:

```java
AppiumBy.accessibilityId("...")
```

and:

```java
AppiumBy.androidUIAutomator("...")
```

---

## ⏳ Synchronization

The project uses explicit waits to synchronize test execution with application elements.

`WebDriverWait` and `ExpectedConditions` are used to improve test stability and reduce failures caused by elements not being immediately available.

---

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Ramil-Memmedov/FirstMobile.git
```

### 2. Open the project

Open the project in **IntelliJ IDEA**.

### 3. Install dependencies

Maven will automatically download the required dependencies from `pom.xml`.

You can also run:

```bash
mvn clean install
```

### 4. Start Appium Server

Make sure the Appium server is running before executing the tests.

### 5. Connect an Android device or emulator

Configure the required Android device/emulator and make sure it is available through ADB.

### 6. Run the tests

Tests can be executed directly from IntelliJ IDEA or using Maven:

```bash
mvn test
```

---

## 📊 Testing Approach

The project demonstrates practical experience with:

* Mobile UI Automation
* Android application testing
* Appium WebDriver
* Page Object Model
* Explicit Waits
* Mobile element identification
* TestNG test execution
* Maven project management
* Git/GitHub version control

---

## 👨‍💻 Author

**Ramil Məmmədov**

GitHub:
https://github.com/Ramil-Memmedov

LinkedIn:
https://www.linkedin.com/in/ramil-memmedov-150926316/
