# 🏨 Hotel Booking System

![JavaFX](https://img.shields.io/badge/JavaFX-UI-blue)
![MySQL](https://img.shields.io/badge/MySQL-Database-orange)
![Status](https://img.shields.io/badge/Project-Demo-green)

---

## 📌 Overview
This project is a **Hotel Booking System** built with **JavaFX**.  
It demonstrates **Object-Oriented Programming (OOP)** concepts, basic **algorithms**, and **data structures**.  
Users can add, delete, and update reservations with guest details, room number, contact information, and stay period.

---

---

## ✨ Functionalities
- ➕ **Add Reservation** – Input guest details and select check-in/check-out dates.  
- ❌ **Delete Reservation** – Remove selected reservation, IDs are renumbered automatically.  
- 🔄 **Update Table** – Refreshes the table to show the latest data.  
- 📅 **Period Column** – Combines check-in and check-out dates into one readable string.

---

## 🗂️ Data Structures
| Structure        | Purpose |
|------------------|---------|
| `ObservableList` | Stores reservations dynamically and updates the TableView in real time |
| `Reservation`    | Encapsulates reservation data (ID, guest name, room, contact, period) |
| `TableView`      | Displays structured data in tabular format |

---

## 🔑 Algorithms
- **ID Renumbering** – After deletion, IDs are recalculated sequentially to avoid gaps.  
- **Period Formatting** – Dates are combined into a single string using `DateTimeFormatter`.  
- **CRUD Operations** – Basic Create, Read, Update, Delete logic applied to reservations.

---

## 📚 What I Learned
- Building GUIs with **JavaFX** and FXML.  
- Binding data structures (`ObservableList`) to UI components.  
- Implementing simple algorithms for ID management and date formatting.  
- Designing user-friendly interfaces with clear functionality.

---

## 📝 Design Choices & Challenges
- **Design Choices**:  
  - Used JavaFX TableView for clear data visualization.  
  - Added colorful buttons for better UX.  
  - Combined check-in/out into one "Period" column for simplicity.  

- **Challenges**:  
  - Handling exceptions when resources were missing.  
  - Ensuring IDs renumber correctly after deletions.  

---

## 🚀 Improvements
- Add database persistence (MySQL/PostgreSQL).  
- Export reservations to CSV/Excel.  
- Add search/filter functionality.  
- Input/output file usage for saving/loading reservations offline.  

---
## 📸 Screenshots
<img width="1131" height="795" alt="Снимок экрана 2025-12-13 020101" src="https://github.com/user-attachments/assets/1bd69f28-fc9e-4008-8267-d9c5adfe6a00" />


---

## ***Very nice project made by me***
