# Hairstyle Management System

This project is a simple management system for hairstyles. It allows users to retrieve and update hairstyle data stored in a JSON file.

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

## Getting Started

To run the project locally, follow these steps:
1. Clone the repository to your local machine.
2. Ensure you have Java installed on your system.
3. Open the project in your preferred IDE.
4. Build and run the project.

## Usage

Once the project is running, you can use an HTTP client (e.g., Postman) to interact with the API endpoints provided by the controller. Below are some example requests:

- Retrieve hairstyles with treatment: `GET /hairstyles/with-treatment`
- Update treatment status: `PUT /hairstyles/{id}/treatment`
  Request Body: `{"treatment": false}`

## Dependencies

The project uses the following dependencies:
- Gson: for JSON serialization and deserialization.
- (Add any other dependencies used in the project)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

------------

# **Java Hair Salon API**

## **Introduction**
This is a Salon API, using Java and SpringBoot it allows the user to retrieve the price and features of a certain hair request.

This API includes the following:

1. At least one algorithm
1. Unit test at least one class
1. Store the data in a JSON file 
1. Exception handling 
1. Evidence of inheritance
1. Good use of HTTP Protocols - methods, request and response, have full CRUD operations supported 
1. Documentation

### **What is Required:**
-**Java V.17**
-**SpringBoot**
-**JSON dataset of hairstyles**

**Make sure you have the following installed:**

1. [JDK 17](https://learn.microsoft.com/en-gb/java/openjdk/download#openjdk-17) (or higher)

2. [Git](https://git-scm.com/downloads)

3. [Visual Studio Code](https://code.visualstudio.com/Download)
   1. [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
   2. [Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack)

Also make sure you have accounts for the following:

1. [GitHub](https://github.com/signup)

- **API Flow**: Map out your API's progression, from endpoints to their functionalities.

### **Requirements List:**
- **Core**: Make use of Java and SpringBoot.
- **End Points**: Ensure they are detailed and fully operational.
- **Error Handling**: Your API should handle mishaps gracefully and return informative feedback.


## **Repository Management**

- **Consistent Commits**: Commit often, capturing your progress and thought process.
- **README**: Not just an afterthought. Fill it with the essence of your API, setup instructions, and other salient details.


---


## **Deliverables**

Ensure that your work is merged to the `main` branch of your GitHub repository by the specified deadline (original or extended). Your solution will assessed based on its state *at that point*; any later commits will **not** be taken into account.

## FAQs

- Q: How can I process JSON in Java?
    
    A: There are a number of open-source packages that you can use to manipulate JSON. We recommend [Gson](https://github.com/google/gson), but you can also investigate alternatives like [json-simple](https://github.com/cliftonlabs/json-simple) or [Jackson](https://github.com/FasterXML/jackson-databind/).

- Q: Can I use another IDE I'm more familiar with instead of VS Code, like IntelliJ or Eclipse?

    A: You can if you wish, but only VS Code is formally supported by CBF Academy staff, so you do so at your own risk.

## Top Tips

- :camera_flash: Commit frequently and use meaningful commit messages. A granular, well-labelled history becomes an increasingly valuable asset over time.
- :cactus: Use feature branches. Build the habit of isolating your changes for specific tasks and merging them into your default branch when complete.
- :vertical_traffic_light: Use consistent naming conventions. Choose easily understandable names and naming patterns for your classes, functions and variables.
- :triangular_ruler: Keep your code tidy. Using the built-in formatting of VS Code or other IDEs makes your code easier to read and mistakes easier to spot.
- :books: Read the docs. Whether via Intellisense in your IDE, or browsing online documentation, build a clear understanding of the libraries your code leverages.
- :calendar: Don't wait until the last minute. Plan your work early and make the most of the time available to complete the assessment and avoid pre-deadline palpitations.
- :sos: Ask. :clap: For. :clap: Help! :clap: Your mentors, instructors and assistants are literally here to support you, so *make use of them* - don't sit and struggle in silence.

Best of luck! Remember, it's not just about the destination; it's the journey. Happy coding! 🚀
