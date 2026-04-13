Automation Assessment – Design Approach (Task 5)
Overview

This repository demonstrates a design-focused automation framework for a dynamic Administration Page.

The goal is to showcase:

Strong automation design thinking
Handling dynamic elements
Building scalable and maintainable test architecture

⚠️ Note: This task focuses on design and structure, not full implementation.

🎯 Objective

Design an automation solution to:

Edit 15+ elements
Across 4 different tabs
Handle dynamic DOM behavior and unstable locators
🏗️ Project Structure
automation_assessment/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── page_base
│   │   │   ├── profile_section
│   │   │   ├── permissions_section
│   │   │   ├── settings_section
│   │   │   ├── notifications_section
│   │   │
│   │   └── resources/
│   │
│   └── test/
│       ├── java/
│       │   ├── test_base
│       │   ├── testCase1_profile
│       │   ├── testCase2_permissions
│       │   ├── testCase3_settings
│       │   ├── testCase4_notifications
│
├── pom.xml
├── .gitignore
└── target/
🧩 Design Approach
🔹 1. Page Object Model (POM)

Each tab is designed as a separate section class:

profile_section
permissions_section
settings_section
notifications_section

This ensures:

Clear separation of responsibilities
Easy maintenance
Better scalability
🔹 2. Base Classes
✅ page_base
تحتوي على:
Common WebDriver methods
Generic actions (click, sendKeys, select)
Reusable wait handling
✅ test_base
مسؤول عن:
Driver setup & teardown
Test configuration
🔍 Locator Strategy (Core Challenge)
❌ Problem:

Elements have dynamic attributes like:

slot="field-45"
IDs are not stable
✅ Solution:
Use parent container + visible text
Example Approach:
Locate label text (e.g., "First Name")
Navigate to its related input field

✔ This avoids dependency on dynamic values
✔ Makes tests more stable

🔄 Handling Dynamic DOM

To handle dynamic behavior:

Use Explicit Waits (WebDriverWait)
Re-locate elements after:
Tab switching
Page updates
Avoid caching WebElements
🔁 Reusability Strategy

Instead of writing methods per element:

Use Generic Methods:
enterText(fieldName, value)
selectOption(fieldName, value)
toggleCheckbox(fieldName)

Each section class uses these reusable methods.
