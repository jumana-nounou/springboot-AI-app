# Devices Price Classification System

## Project Overview

The Devices Price Classification System is an AI-driven solution developed to predict and classify device prices based on their characteristics. This system consists of two main components:

1. **Python Project**: This component handles the prediction of device prices. It employs machine learning models to classify the prices of devices according to their features.

2. **Spring Boot Project**: This component provides a simple API for interacting with the Python project. It includes an entity to represent device data and several endpoints to call the prediction service for test cases and store the results.

## Project Structure

The project is structured as follows:

- **Python Project**: Contains the machine learning models and data processing.
- **Spring Boot Project**: Includes the API endpoints and entity definitions necessary for integrating with the Python project.

## Technologies Used

- Python
- Spring Boot
- MongoDB Atlas
- Machine Learning Libraries

## Setup Instructions

### Python Project Setup

1. Install Python (if not already installed).
2. Navigate to the Python project directory.
3. Install the required dependencies using `pip install -r requirements.txt`.
4. Run the Python scripts to train the machine learning models and set up the prediction service.

### Spring Boot Project Setup

1. Install Java (if not already installed).
2. Navigate to the Spring Boot project directory.
3. Build the project using Maven or Gradle.
4. Run the Spring Boot application to start the API server.

### MongoDB Atlas Setup

1. Sign up for an account on MongoDB Atlas (if not already done).
2. Create a new cluster and configure it according to your requirements.
3. Obtain the connection URI for your MongoDB Atlas cluster.
4. Configure the Spring Boot application to use the MongoDB Atlas URI for database connectivity.

## Usage

### Running the APIs

To run the APIs implemented in Java using Spring Boot, you need to ensure that the Python project is running the API service. The Python project handles the prediction of device prices and exposes endpoints that the Spring Boot application interacts with.

1. **Start the Python API Service**: Navigate to the Python project directory and run the notebook to start the API service.

2. **Run the Spring Boot Application**: Navigate to the Spring Boot project directory and run the application. This will start the Spring Boot server, allowing you to interact with the APIs.

### Testing Endpoints

To test the API endpoints provided by the Spring Boot application, you can use tools like ThunderClient or Postman.
