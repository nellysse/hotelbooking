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

---


---
## 📸 Screenshot

![image](https://github.com/user-attachments/assets/518ecbbe-e345-4a3a-884f-e87be377fcbc)


---
📌 Изменения в проекте
✨ Новая функциональность
Добавлен метод saveToFile() в ReservationController.java.

Сохраняет все текущие брони в файл reservations.json.

Формат хранения — JSON, удобный для чтения и интеграции.

Добавлен обработчик handleSaveButton() и кнопка Save в sample.fxml.

При нажатии кнопки данные сохраняются в файл.

📂 Пример результата
json
{

  "reservations": [
  
    {
      "id": 1,
      "name": "Billie Eilish",
      "room": "19",
      "contact": "+996-xxx-xxx-xxx",
      "checkIn": "2025-12-21",
      "checkOut": "2025-12-25"
    }
  ]
}
# ✅ Что это даёт

Реализован критерий File Handling.

Данные теперь можно хранить вне программы.

JSON‑формат делает проект современным и удобным для демонстрации.
## СКРИН С ВНЕСЕННЫМИ ИЗМЕНЕНИЯМИ
# interface
<img width="1915" height="1016" alt="Снимок экрана 2025-12-21 172755" src="https://github.com/user-attachments/assets/8a38b10e-eddd-46fa-bbeb-e8f55dd336e9" />

# added code
<img width="939" height="631" alt="Снимок экрана 2025-12-21 172144" src="https://github.com/user-attachments/assets/c343d2e3-b119-4895-ae76-f60701102c56" />

**Very nice project made by me**
