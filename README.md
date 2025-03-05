# Java MySQL Database Connection Tutorial

This guide explains how to set up and run a Java program that connects to MySQL database.

## Prerequisites

1. **Java Development Kit (JDK)** installed on your system
2. **MySQL Server** installed and running
3. **MySQL Connector/J** (JDBC driver) which we'll set up below

## Step-by-Step Setup

### 1. Project Structure Setup
```
project_folder/
├── lib/                    # For storing MySQL JDBC driver
│   └── mysql-connector-j-*.jar
├── ADO_Java_SQLServer.java # Main Java program
└── README.md              # This documentation
```

### 2. Download MySQL JDBC Driver
1. Go to: https://dev.mysql.com/downloads/connector/j/
2. Download the Platform Independent version (ZIP archive)
3. Extract the downloaded file
4. Copy the `mysql-connector-j-{version}.jar` file to your project's `lib` directory

### 3. MySQL Server Configuration
1. Make sure MySQL Server is running
2. Default credentials used in this example:
   - Username: `root`
   - Password: `admin`
   - Port: `3306`

### 4. Compile and Run the Program

#### Windows (PowerShell)
```powershell
# Compile the program
javac -cp "lib/*" "ADO_Java_SQLServer.java"

# Run the program
java -cp ".;lib/*" ADO_Java_SQLServer
```

#### Linux/Mac
```bash
# Compile the program
javac -cp "lib/*" "ADO_Java_SQLServer.java"

# Run the program
java -cp ".:lib/*" ADO_Java_SQLServer
```

## Program Explanation

The Java program (`ADO_Java_SQLServer.java`) does the following:

1. Establishes a connection to MySQL Server
2. Lists all available databases
3. Can be modified to:
   - Connect to a specific database
   - Query specific tables
   - Execute custom SQL queries

## Common Issues and Solutions

1. **"Access denied for user 'root'@'localhost'"**
   - Verify your MySQL username and password
   - Make sure the user has proper permissions

2. **"Unknown database"**
   - Check if the database name is correct
   - Make sure the database exists

3. **ClassNotFoundException: com.mysql.cj.jdbc.Driver**
   - Verify that the MySQL JDBC driver is in the `lib` directory
   - Check if the classpath is correctly set in the compile/run commands

## Code Structure

```java
// Main connection parameters
String url = "jdbc:mysql://localhost:3306";  // Base URL without database
String user = "root";                        // MySQL username
String password = "admin";                   // MySQL password

// Key components:
1. JDBC Driver loading: Class.forName("com.mysql.cj.jdbc.Driver");
2. Connection establishment: DriverManager.getConnection(url, user, password);
3. Query execution: Statement and ResultSet
4. Proper resource cleanup in finally block
```

## Next Steps

After successfully running this basic connection:
1. Choose a specific database to work with
2. Create tables and insert data
3. Implement specific queries for your use case

## Support

If you encounter any issues:
1. Check MySQL Server status
2. Verify credentials
3. Ensure all required files are in the correct locations
4. Check Java and MySQL versions compatibility
