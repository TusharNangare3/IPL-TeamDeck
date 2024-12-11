# IPL TEAM DECK

The **IPL TeamDeck** is a Java-based application designed to streamline and enhance the management of IPL teams and player data. This project is perfect for cricket enthusiasts, students learning Java, and developers looking to explore database integration in a real-world scenario.

## Features

- **View Teams and Players**: Easily view all IPL teams and their players.
- **Dynamic Player Management**: Add, update, or remove players dynamically.
- **Player Statistics**: Access detailed statistics for individual players.
- **Performance-Based Filtering**: Filter and list players based on performance, such as top batsmen or bowlers.
- **User-Friendly Navigation**: Navigate through a command-line interface (CLI) with intuitive prompts.

## Tech Stack

- **Language**: Java
- **Database**: MySQL
- **Tools**: JDBC for database connectivity

## How to Run

1. **Clone the Repository**: Download or clone the repository to your local machine.
2. **Set Up the Database**: Use the provided MySQL schema to create the required database and tables.
3. **Configure Database Connection**: Update the database connection details in `IPLUtility.java` to match your local setup.
4. **Run the Application**: Execute the `IPLClient` class to start the application.

## Project Structure

- **Entity**: Contains the `Player` class, which represents the player model.
- **DAO (Data Access Object)**: Handles all database operations such as retrieving, adding, and removing players.
- **Service**: Implements business logic such as filtering and categorizing players.
- **Controller**: Manages user input and coordinates between service and DAO
