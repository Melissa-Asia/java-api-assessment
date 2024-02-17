# Hairstyle Management System

This project is a simple management system for hairstyles. It allows users to retrieve and update hairstyle data stored in a JSON file. The Hairstyle API is a simple RESTful API that allows users to manage a collection of hairstyles. Users can perform various operations such as adding new hairstyles, updating existing ones, deleting hairstyles, and retrieving information about hairstyles.

## Overview

The system consists of the following components:
- **Controller:** Handles incoming HTTP requests and delegates them to the service layer.
- **Service:** Contains business logic for handling hairstyle-related operations.
- **Repository:** Interface for data access operations.
- **Model (Hairstyle):** Represents a hairstyle object.

## Components

### Controller

The `HairstyleController` class handles incoming HTTP requests related to hairstyles. It contains methods for retrieving and updating hairstyle data.

### Service

The `HairstyleService` class contains business logic for handling hairstyle-related operations. It includes methods for retrieving hairstyles with treatment, and updating treatment status.

### Repository

The `HairstyleRepository` class is responsible for data access operations. It includes methods for reading, updating, and saving hairstyle data to a JSON file.

### Model

The `Hairstyle` class represents a hairstyle object with attributes such as ID, name, treatment status, etc.

## Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
  - [Endpoints](#endpoints)
  - [Request Examples](#request-examples)
- [Error Handling](#error-handling)
- [Contributing](#contributing)
- [License](#license)

## Features

- View all hairstyles
- Add a new hairstyle
- Update an existing hairstyle
- Delete a hairstyle
- Search for a hairstyle by name

## Technologies

The API is built using the following technologies:

- Java
- Spring Boot
- Gson
- Maven
- Json dataset of Hairstyles

## Getting Started

### Prerequisites

Make sure you have the following installed on your system:

- **Java (version 8 or later)**
- **Maven**
- **IDE (e.g., IntelliJ IDEA, Eclipse, VSCode)**

**Make sure you have the following installed:**

1. [JDK 17](https://learn.microsoft.com/en-gb/java/openjdk/download#openjdk-17) (or higher)

2. [Git](https://git-scm.com/downloads)

3. [Visual Studio Code](https://code.visualstudio.com/Download)
   1. [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
   2. [Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack)

Also make sure you have accounts for the following:

1. [GitHub](https://github.com/signup)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/hair-api.git


## Getting Started

To run the project locally, follow these steps:
1. Clone the repository to your local machine.
2. Ensure you have Java installed on your system.
3. Open the project in your preferred IDE.
4. Build and run the project.

## Usage

Once the project is running, you can use an HTTP client (e.g., Postman) to interact with the API endpoints provided by the controller. Below are some example requests:

Endpoints
- GET /api/hairstyles: Get all hairstyles
- GET /api/hairstyles/{name}: Get a hairstyle by name
- POST /api/hairstyles: Add a new hairstyle
- PUT /api/hairstyles/{name}: Update a hairstyle by name
- DELETE /api/hairstyles/{name}: Delete a hairstyle by name

## Error Handling
- If the requested hairstyle does not exist, the API will return a 404 error with the message "Hairstyle not found".
- If the requested operation results in a file not found error, the API will return a 500 error with the message "File not found".

## Dependencies

The project uses the following dependencies:
- Gson: for JSON serialization and deserialization.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

------------

### **Requirements List:**
- **Core**: Make use of Java and SpringBoot.
- **End Points**: Ensure they are detailed and fully operational.
- **Error Handling**: Your API should handle mishaps gracefully and return informative feedback.
