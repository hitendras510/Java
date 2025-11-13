////1. Create a class Student with fields name, rollNumber, and marks. Write a method to display
//// student details. Create 3 student objects and display their data.
//
//class Student1{
//    String name = "Hitendra";
//    int marks = 10;
//    int rollno = 26;
//    static void a(){
//        Student1 a=new Student1();
//        System.out.println("Name of 1st student:"+a.name);
//        System.out.println("Marks of 1st student:"+a.marks);
//        System.out.println("Rollno of 1st student:"+a.rollno);
//        System.out.println("\n");
//    }
//}
//class Student2{
//    String name = "om";
//    int marks = 1;
//    int rollno = 226;
//    static void a(){
//        Student2 a=new Student2();
//        System.out.println("Name of 2st student:"+a.name);
//        System.out.println("Marks of 2st student:"+a.marks);
//        System.out.println("Rollno of 2st student:"+a.rollno);
//        System.out.println("\n");
//    }
//}
//class Student3{
//    String name = "Krishna";
//    int marks = 0;
//    int rollno = 6;
//    static void a(){
//        Student3 a=new Student3();
//        System.out.println("Name of 3st student:"+a.name);
//        System.out.println("Marks of 3st student:"+a.marks);
//        System.out.println("Rollno of 3st student:"+a.rollno);
//        System.out.println("\n");
//    }
//}
//
//class Main{
//    public static void main(String[] args){
//        Student1.a();
//        Student2.a();
//        Student3.a();
//    }
//}
///////////////////////////////////////////////////////////////////////////////////////////////
// 2. Create a class Rectangle with length and breadth as fields. Add methods to calculate area and
// perimeter. Create objects with different values and call those methods.

//    class Rectangle{
//    int length=10;
//    int breadth=20;
//    int area=length*breadth;
//    int Perimeter=2*length+breadth;
//    static void a(){
//        Rectangle r1=new Rectangle();
//        System.out.println("Perimeter:"+r1.Perimeter);
//        System.out.println("area:"+r1.area);
//    }
//}
//class Main{
//    public static void main(String[] args) {
//        Rectangle.a();
//    }
//}
//////////////////////////////////////////////////////////////////////////////////////////////////
// 3. Create a class BankAccount with fields accountNumber, accountHolder, and balance. Implement
// methods to deposit and withdraw money.
//class BankAccount{
//    int accountNumber;
//    String accountHolder;
//    int balance;
//    BankAccount(int accountNumber, String accountHolder, int balance){
//        this.accountNumber = accountNumber;
//        this.accountHolder = accountHolder;
//        this.balance = balance;
//    }
//    void deposit(int amount){
//        if(amount > 0){
//        balance += amount;
//            System.out.println("Deposited " + amount + " to account number " + accountNumber);
//        } else {
//            System.out.println("Insufficient funds!");
//        }
//    }
//    void withdraw(int amount){
//        if(amount<0){
//            System.out.println("Insufficient funds!");
//        }else if (amount > balance){
//            System.out.println("Insufficient balance!");
//        }else{
//            balance -= amount;
//            System.out.println(amount + "\n"+"updated balance = "+balance);
//        }
//    }
//    void display(){
//            System.out.println("\n--- Account Details ---");
//            System.out.println("Account Number: " + accountNumber);
//            System.out.println("Account Holder: " + accountHolder);
//            System.out.println("Balance: " + balance);
//        }
//}
//
//    class Main {
//        public static void main(String[] args) {
//
//
//            BankAccount b = new BankAccount(12345, "Hitendra", 1000);
//
//            b.display();
//
//            b.deposit(500);
//            b.withdraw(200);
//            b.withdraw(2000); // insufficient balance
//        }
//    }
//////////////////////////////////////////////////////////////////////////////////////////////////
/** 4. Create a class Car with fields brand, model, and price.
 Write a method to display car details.
 Create multiple objects and display info.
 **/
//class Car {
//    String brand;
//    String model;
//    double price;
//
//    Car(String brand, String model, double price) {
//        this.brand = brand;
//        this.model = model;
//        this.price = price;
//    }
//
//    void display() {
//        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//
//
//        Car car1 = new Car("Ford", "Figo", 50000);
//        Car car2 = new Car("Toyota", "Innova", 60000);
//        Car car3 = new Car("Tata", "Nexon", 120000);
//
//
//        car1.display();
//        car2.display();
//        car3.display();
//    }
//}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  5. Create a class Circle with radius. Write methods to calculate area and circumference of the circle.
class Circle{
    int radius;
    int area;
    int circumference;

}


//////////////////////////////////////////////////////////////////////////////////////////////////
// 6. Create a class Book with title, author, and price. Add a method to apply a discount of 10% and
// display the final price.



//////////////////////////////////////////////////////////////////////////////////////////////////
//  7. Create a class Employee with name, id, and salary. Write a method to give a 5% salary
// increment. Print details before and after increment.


//////////////////////////////////////////////////////////////////////////////////////////////////
// 8. Create a class Movie with name, rating, and releaseYear. Create 5 movie objects and display
// movies released after 2020.


//////////////////////////////////////////////////////////////////////////////////////////////////
//  9. Create a class Calculator with methods add, subtract, multiply, and divide. Use objects to call
// these methods.


//////////////////////////////////////////////////////////////////////////////////////////////////
// 10. Create a class Laptop with brand, RAM, and price. Add a constructor to initialize values and a
// method to display them
//class Laptop{
//    String brand;
//    String ram;
//    int price;
//    Laptop(String brand,String ram,int price){
//        this.brand=brand;
//        this.ram=ram;
//        this.price=price;
//        System.out.println("Laptop brand:"+brand);
//        System.out.println("Laptop ram:"+ram);
//        System.out.println("Laptop price:"+price);
//    }
//}
//class Main{
//    public static void main(String[] args){
//        Laptop l1=new Laptop("LENOVO","8GB",50000);
//        System.out.println("\n");
//        Laptop l2=new Laptop("ACER","16GB",55000);
//        System.out.println("\n");
//        Laptop l3=new Laptop("ASUS","8GB",60000);
//
//    }
//}
//////////////////////////////////////////////////////////////////////////////////////////////////