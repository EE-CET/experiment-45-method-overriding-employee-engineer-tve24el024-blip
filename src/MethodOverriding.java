class Employee {
    void display() {
        System.out.println("Name of class is Employee");
    }
}

public class MethodOverriding extends Employee {

    void display() {
        System.out.println("Name of class is Engineer");
        super.display();
    }

    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.display();
    }
}
