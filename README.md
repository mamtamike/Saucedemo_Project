# SauceDemo Selenium Hybrid Framework

This is a Selenium Hybrid Test Automation Framework designed for testing the [SauceDemo](https://www.saucedemo.com/) web application. The framework integrates multiple testing techniques including Page Object Model (POM), TestNG, Data-Driven Testing, and Utility-Based scripting.

---

## 🚀 Features

- Selenium WebDriver for browser automation
- Page Object Model (POM) design pattern
- TestNG for test management
- Data-driven testing with Excel/CSV
- Maven for build management
- TestNGReports for test reporting
- Cross-browser testing support
- Modular and reusable utility classes

---

## 🗂️ Project Structure

SauceDemo/
│
├── src/
│ ├── main/
│ │ └── java/
│ │ └── pages/ # Page classes for POM
│ │ └── utils/ # Utility files (Excel reader, Config, etc.)
│ ├── test/
│ │ └── java/
│ │ └── tests/ # Test classes
│
├── testdata/
│ └── credentials.xlsx # Test data file (Excel)
│
├── reports/
│ └── testReport.html # Test reports 
│
├── pom.xml # Maven dependencies
├── testng.xml # TestNG suite file
└── README.md # Project documentation

# Clone the repository:
   ```bash
   git clone https://github.com/yourusername/SauceDemo.git
