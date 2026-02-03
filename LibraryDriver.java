package polymorphism;

// Library.java
class Library {
    private static Library instance = null;

    private Library() {
        System.out.println("Library Created");
    }

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }Array.java
        
        return instance;
    }

    public void showLibrary() {
        System.out.println("Welcome to the Library!");
    }
}

// Student.java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    public void accessLibrary() {
        Library lib = Library.getInstance();
        System.out.println(name + " is accessing the library using object: " + lib);
        lib.showLibrary();
    }
}

// LibraryDriver.java
public class LibraryDriver {
    public static void main(String[] args) {
        Student s1 = new Student("Student1");
        Student s2 = new Student("Student2");
        Student s3 = new Student("Student3");
        Student s4 = new Student("Student4");

        s1.accessLibrary();
        s2.accessLibrary();
        s3.accessLibrary();
        s4.accessLibrary();
    }
}
