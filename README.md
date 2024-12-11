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



# IPL Teams Management System

## Overview
This IPL Teams Management System is a simple application for managing players, teams, and their statistics in the Indian Premier League (IPL). It allows users to view players, add or remove players, and get detailed statistics for specific players, teams, batsmen, and bowlers. The system uses a MySQL database to store player data and provides a text-based user interface to interact with the application.

## Features

1. **View All Teams** - Display all team names in the IPL.
2. **View Players of a Specific Team** - View players of a specific team by entering the team name.
3. **Add a Player** - Insert a new player into the database.
4. **Remove a Player** - Delete a player from the database by name.
5. **View Player Statistics** - Display statistics like jersey number, total runs, wickets, and team of a player.
6. **View Batsmen of a Specific Team** - View batsmen from a specific team who have scored more than 2000 runs.
7. **View Bowlers of a Specific Team** - View bowlers from a specific team who have taken more than 50 wickets.
8. **View Best Batsmen** - Display batsmen who have scored more than 4000 runs in the IPL.
9. **View Best Bowlers** - Display bowlers who have taken more than 100 wickets in the IPL.

## Technologies Used

- **Java** - The core programming language used for the application.
- **MySQL** - Database management system used to store player data.
- **JDBC** - Java Database Connectivity to interact with MySQL database.
- **Scanner** - For accepting user input.

## Prerequisites

Before running the application, ensure the following:

1. **MySQL Database**:
    - Create a MySQL database called `batch1199bd`.
    - Create a table named `players` with the following structure:
    
    ```sql
    CREATE TABLE players (
        jersy_no INT PRIMARY KEY,
        name VARCHAR(100),
        runs INT,
        wickets INT,
        team VARCHAR(50)
    );
    ```

2. **JDBC Driver**:
    - Make sure the MySQL JDBC driver is included in your project for database connectivity.

3. **Java Development Kit (JDK)**:
    - Ensure JDK is installed on your machine (JDK 8 or later).

## Setup and Installation

1. Clone the repository to your local machine.
2. Configure your MySQL connection in the `IPLUtility.java` file (username, password, database URL).
3. Compile and run the application using your IDE or command line.

## How to Use

Once the application is running, the user will be prompted with a menu of choices. You can interact with the system by choosing one of the following options:

1. **View Teams** - List all IPL teams.
2. **View Players** - View the list of players for a specific team.
3. **Add Player** - Add a new player to the database.
4. **Remove Player** - Remove an existing player from the database.
5. **View Player Statistics** - Get detailed statistics of a player.
6. **View Batsmen of a Specific Team** - List all batsmen from a team who have more than 2000 runs.
7. **View Bowlers of a Specific Team** - List all bowlers from a team who have more than 50 wickets.
8. **View Best Batsmen** - List all batsmen with over 4000 runs.
9. **View Best Bowlers** - List all bowlers with more than 100 wickets.
10. **Exit** - Exit the application.

## Example of Application Output

```text
  ** Welcome to Our Website **   
***** IPL Teams Management *****

1. View Teams
2. View Players
3. Add Player
4. Remove Player
5. View Player Statistics
6. View Batsmen of specific team
7. View Bowlers of specific team 
8. View Best Batsmen
9. View Best Bowlers
10. Exit
Enter your choice: 1

-----------------
| Name of Teams |
-----------------
| Mumbai Indians|
| Chennai Super Kings|
| Royal Challengers Bangalore|
-----------------

