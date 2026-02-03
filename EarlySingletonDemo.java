package polymorphism;
class DatabaseConnection {
    // Object is created at the time of class loading
    private static DatabaseConnection instance = new DatabaseConnection();

    // Private constructor so no other class can create object
    private DatabaseConnection() {
        System.out.println("Database Connection Created");
    }
 
    // Public method to return the single instance
    public static DatabaseConnection getInstance() {
        return instance;
    }
}

public class EarlySingletonDemo {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        // Check if both references point to the same object
        if (db1 == db2) {
            System.out.println("Both are same object");
        } else {
            System.out.println("Different objects");
        }
    }
    
}