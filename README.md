# 📝 Java Swing ToDo App
## Task 6: Java GUI – ToDo App
A simple and intuitive ToDo application built with Java Swing. Easily add, complete, and delete tasks while keeping track of your daily to-dos. Includes a scrollable task list, task counter, and responsive GUI.

---
## ✨ Features
- ➕ Add new tasks  
- ✅ Mark tasks as complete (with strikethrough)  
- ❌ Delete individual tasks  
- 🗑️ Clear all tasks at once  
- 🔢 Task counter in window title  
- 📜 Responsive design with scrollable task list

---
## 📸 Screenshots
#### 1. Added Tasks & Completed One
<img width="300" height="300" alt="screenshot1 png" src="https://github.com/user-attachments/assets/51cfb2d6-004a-4629-ac42-07a6d3c8d1a6" />

#### 2. Clear All Tasks
<img width="300" height="300" alt="screenshot2 png" src="https://github.com/user-attachments/assets/58940f6f-16f0-47a6-9751-38c7133b5752" />
<img width="300" height="300" alt="screenshot3 png" src="https://github.com/user-attachments/assets/90359a1f-f5e9-4f24-a0a1-25fd262ad46d" />

---

## 🚀 Installation & Setup
- ### 📋 Prerequisites
    - ☕ Java 17 or later  
    - 🛠️ A Java IDE (IntelliJ IDEA, Eclipse) or command line  

- #### ▶️ Running the App

   #### Option 1: Using an IDE
   -> 1. Clone or Download this repository:
    ```
    git clone https://github.com/satwinder9069/JavaGUI-ToDoApp.git
    cd JavaGUI-ToDoApp
    ```
    -> 2. Open in IntelliJ IDEA:
      - File → Open → Select project folder
      - Wait for indexing to complete
  
    -> 3. Open in Eclipse:
      - File → Import → Existing Projects into Workspace
      - Select root directory → Finish
 

   #### Option 2: Command Line
   -> 1. Compile the code:  
   ```
   javac task6_JavaGUI_TodoApp/*.java
   ```
   -> 2. Run the application:
   ```
   java task6_JavaGUI_TodoApp.TodoApp
   ```
---

## 📂 Code Structure

task6_JavaGUI_TodoApp/

├── TodoApp.java       # Main application class

├── Task.java          # Custom component for individual tasks

└── README.md          # This file

---
## 🗂️ Key Classes
### 1. 🖥️  TodoApp.java
- Main application window
- Handles task creation and management
- Manages the overall UI layout

### 2. 📝  Task.java
- Custom JPanel representing a single task
- Contains checkbox, label, and delete button
- Handles completion toggling and deletion
---
## 🖱️ How to Use
**1. Add a Task**➕
- Type your task in the text field ✍️
- Press Enter ⏎ or click "Add Task"

**2. Mark as Complete** ✅
- Check the checkbox ☑️ next to a task
- The task will be grayed out and struck through

**3. Delete a Task** ❌

    - Click the 🗑️ button next to any task

    - Clear All Tasks 🧹

    - Click the "🗑️ Clear All" button

    - Confirm the action in the dialog box
  
---
## 🎨 Customization
- 🖌 **Colors:**  
  - Task background: `Task.java` → `setBackground(Color.WHITE)`  
  - Completed task background: `new Color(248, 248, 255)`  

- ✍️ **Fonts:**  
  - Change font type/size in `Task.java` → `taskLabel.setFont(new Font("Arial", Font.PLAIN, 12))`  

- 📐 **Layout & Dimensions:**  
  - Task panel max size: `setMaximumSize(new Dimension(380, 45))`  
  - Delete button size: `deleteButton.setPreferredSize(new Dimension(60, 25))`

---

##  🛠️  Technologies Used
- ☕ Java 17
- 🖥️ Java Swing for GUI
- 📚 Core Java libraries (no external dependencies)

---
