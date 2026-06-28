# Vangti Chai (ভাঙতি চাই)
**Academic Assignment | CSE489**

Vangti Chai is a simple and intuitive Android application developed as an academic assignment for the course CSE489. It is designed to help users calculate the exact number of currency notes and coins required for a given amount of Bangladeshi Taka (BDT). It's a handy tool for retailers, bank employees, or anyone who frequently deals with cash and needs to break down large amounts into specific denominations.

## Features

*   **Quick Calculation:** Instantly calculates the breakdown of notes as you type the amount.
*   **Bangladeshi Denominations:** Supports all major BDT notes and coins:
    *   500, 100, 50, 20, 10 Taka notes
    *   5, 2, 1 Taka coins
*   **Built-in Numeric Keypad:** Includes a custom on-screen keypad (0–9) for fast input.
*   **Clear Functionality:** A dedicated button to reset the amount and start over.
*   **Responsive Layout:** Fully optimized for both **portrait** and **landscape** orientations using specific resource qualifiers.
*   **Clean UI:** Simple and distraction-free interface using modern Android components.

---

## Technologies Used

*   **Language:** Kotlin
*   **UI Framework:** XML Layouts (ConstraintLayout, LinearLayout, GridLayout)
*   **Development Tools:** Android Studio
*   **Resources:** Uses dimension resources (`sizes.xml`) for consistent styling across screen orientations.

---

## Project Structure

```text
app/
├── java/
│   └── com.example.vangtichai/
│       └── MainActivity.kt
│
├── res/
│   ├── layout/
│   │   └── activity_main.xml (Portrait)
│   ├── layout-land/
│   │   └── activity_main.xml (Landscape)
│   ├── values/
│   │   ├── strings.xml, colors.xml, themes.xml
│   │   └── sizes.xml
│   └── values-land/
│       └── sizes.xml
```

---

## Installation & How to Run

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/shahriar-abid/vangtichai.git
    ```
2.  **Open the project** in Android Studio.
3.  **Sync Gradle** to ensure all dependencies are loaded.
4.  **Build and run** the app on an emulator or a physical Android device.
5.  **Usage:** Enter an amount using the keypad to see the breakdown update in real-time.

---

## Devices Tested

The application was verified to function correctly in both portrait and landscape orientations on:

| Device                          | Type                    | Status |
| ------------------------------- | ----------------------- | ------ |
| Nothing Phone (3a) Pro          | Physical Android Device | Verified |
| Pixel Emulator (Android Studio) | Emulator                | Verified |

---

## AI Usage Declaration

AI (ChatGPT) was used as a learning and guidance tool during the development of this project. It assisted in understanding Android Studio, Kotlin programming concepts, XML layouts, resource management, and debugging. The application was implemented, modified, and tested by the author based on those concepts.

---

## Author

**Md. Al Shahriar Abid**  
**Id : 23301613**
Department of Computer Science and Engineering (CSE)  
BRAC University

---


