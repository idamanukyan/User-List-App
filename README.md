👥 User List App

An Android app built with Kotlin + Jetpack Compose as part of a midterm project.
The app demonstrates Composable UI design, Material 3 theming, and modular UI components (like UserList).

🎯 Overview

This project focuses on practicing Jetpack Compose fundamentals, including:

Theming with Material 3

Building custom Composables

Previewing UI with @Preview

Creating reusable components (e.g., UserList, Greeting)

✨ Features

📋 User List Display

Main screen shows a list of users (via UserList composable).

🎨 Material 3 Theming

Consistent UI design using Midterm_2Theme.

💬 Greeting Component

Simple reusable composable (Greeting) to display personalized text.

👀 UI Preview

Preview mode available via GreetingPreview.

📂 Project Structure

MainActivity → App entry point, sets Compose content.

UserList → Custom composable (defined in ui/) to render a list of users.

Greeting → Example composable for greeting text.

Midterm_2Theme → Material 3 theme setup for consistent design.

🛠️ Tech Stack

Language: Kotlin

UI Framework: Jetpack Compose

Design System: Material 3

Architecture: Compose-based UI with modular components

🚀 Getting Started

Clone the repository:

git clone https://github.com/<your-username>/Midterm_2.git


Open the project in Android Studio (latest version recommended).

Build & run on an emulator or Android device.

📸 Example UI
Greeting Preview
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Midterm_2Theme {
        Greeting("Android")
    }
}


Renders:

Hello Android!

Main Screen

Displays a styled User List inside a Material 3 Surface.

📜 License

This project is licensed under the MIT License – see LICENSE
 for details.
