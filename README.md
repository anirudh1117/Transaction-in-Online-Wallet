# Transaction in Online Wallet

Welcome to the Transaction in Online Wallet repository! This project is an online wallet application that allows users to manage monetary transactions securely and efficiently. The application supports functionalities such as sending money, receiving money, adding funds, and managing account details.

## Project Overview

The online wallet system is designed to simulate real-world financial transactions in a secure and user-friendly environment. It provides a platform for users to engage in activities typically associated with a physical wallet or bank account, but in a digital format.

## Key Features

- **Send Money**: Users can transfer money to other users registered in the system.
- **Receive Money**: Users can receive money from others.
- **Add Funds**: Users can add funds to their wallet using a simulated card system.
- **Account Management**: Users can create an account, log in, log out, and update their account details.

## Technologies Used

- **Angular**: For building the frontend interface.
- **Java**: Used for backend services.
- **Spring Boot**: Simplifies the backend development process and reduces development time.
- **MySQL**: Database to store user and transaction data.

## Getting Started

These instructions will guide you on how to set up and run the project locally.

### Prerequisites

Ensure you have the following installed on your local machine:

- Java (JDK 1.8 or later)
- Node.js and npm (for Angular)
- MySQL
- An IDE (like IntelliJ IDEA or Visual Studio Code)

### Installation

Follow these steps to get your development environment running:

1. **Clone the repository**

   ```bash
   git clone https://github.com/anirudh1117/Transaction-in-Online-Wallet.git
   cd Transaction-in-Online-Wallet

2. Set up the database

  Create a new MySQL database named online_wallet.
  Import the provided SQL script to set up the tables.

3. Configure the backend

  Open the backend application in your IDE.
  Update the application.properties file with your database credentials.


4. **Run the backend**
   ```bash
   mvn spring-boot:run

5. **Configure and run the frontend**
   ```bash
   
    cd frontend
    npm install
    ng serve

