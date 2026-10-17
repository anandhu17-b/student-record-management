# Student Record Management System

A robust, feature-rich Java console application built using Object-Oriented Programming (OOP) principles and the Java Collections Framework (`ArrayList`). This system allows users to seamlessly manage student records with a comprehensive 15-option menu system.

## Features

- **1. Add Student:** Add new students with unique ID validation to prevent duplicates.
- **2. Display All Students:** View a complete list of all registered students.
- **3 & 4. Search:** Quickly find student records by their **ID** or **Name**.
- **5. Update Student:** Modify existing student names or courses dynamically.
- **6 & 12. Delete Records:** Remove individual students by ID or batch-delete students based on their course using lambda expressions.
- **7. Filter by Course:** Display all students enrolled in a specific course.
- **8. Count Students:** Get the total count of active student records.
- **9 & 10. First & Last Records:** View the first and last entries in the collection.
- **11. Existence Check:** Check if a specific student ID currently exists in the system.
- **13. Reverse Order Display:** View student records in reverse order.
- **14. Clear Records:** Safely clear the entire student database with a confirmation prompt.

## Tech Stack

- **Language:** Java
- **Core Concepts:** Object-Oriented Programming, Java Collections, Scanner Input Handling.

## Project Structure

StudentManagement/
│
├── Student.java           # Model class defining student attributes and getters/setters
└── StudentManagement.java # Main application handling the menu flow and CRUD logic
