 
# 🎨 Paint Brush Drawing Tool using Java
A simple Java Paint application that allows users to draw, color, and manage shapes using different tools such as pencil, line, rectangle, oval, and eraser.
<img width="1750" height="877" alt="Image" src="https://github.com/user-attachments/assets/b7b4c9c2-c27a-4715-9f9a-89b7520a9739" />
---
 
## 📁 Project Structure

```
Paint-Brush/
│
├── controllers/
│   ├── FunctionController.java
│   ├── ImageLoader.java
│   ├── ImageSaver.java
│   ├── PaintColorController.java
│   ├── PaintModeController.java
│   ├── PaintStyleController.java
│   └── StrokeSlider.java
│
├── shapes/
│   ├── Shape.java
│   ├── Pencil.java
│   ├── Line.java
│   ├── Rectangle.java
│   ├── Oval.java
│   └── Eraser.java
│
├── view/
│   ├── App.java
│   ├── MyFrame.java
│   └── PaintBrushPanel.java
│
└── README.md
```

---
## ✨ Features

*  Draw using **Pencil**
*  Draw **Lines**
*  Draw **Rectangles**
*  Draw **Ovals**
*  **Eraser** tool
*  Choose different **colors**
*  Change **stroke size**
*  **Undo** last action
*  **Clear canvas**
*  **Save** drawings as images
*  **Load** saved images
*  Simple and user-friendly GUI
---

## 🧠 Architecture Overview

* **controllers**
  Handle user interactions such as color selection, drawing mode, stroke size, saving, and loading images.

* **shapes**
  Contains all drawable objects. Each shape extends the base `Shape` class and implements its own drawing logic.

* **view**
  Manages the GUI, main application window, and drawing panel.

---

## 🚀 How to Run

1. Make sure you have **Java JDK 8 or higher** installed.
2. Open the project in any Java IDE (IntelliJ IDEA, Eclipse, NetBeans).
3. Run the main class:

```java
App.java
```

---

## 🛠️ Technologies Used

* Java
* Java Swing / AWT
* Object-Oriented Programming (OOP)

---

## 📌 Future Improvements

* Zoom in / Zoom out
* Export to different image formats
* Keyboard shortcuts

---

 
