// 7.1 Polymphism basics

// Write program to define following class hierachy

//     Building
//         Cottage
//         Apartment

// Demonstrate in code that the following uses polymorhism

//     Building building = new Cottage(...):
//     building.address()

//     building = new Apartment(...):
//     building.address()

public class Program {
    public static void main(String[] args) {
            Building building = new Cottage("Cottage Road 123");
            building.address();

            building = new Apartment("Apartment Avenue 321");
            building.address();
    }
}
