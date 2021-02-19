// 7.2 Polymphism with classes

// By using the previous exercise, implement a method which can
// take any Building. Return the livable floor area in cubic
// meters.

//     double area(Building building)

// In main():

//     Cottage cottage = new Cottage(...):
//     double area = area(cottage);

public class Program {
    public static void main(String[] args) {
        Cottage cottage = new Cottage("Cottage Road 123", 72.3);
        double area = area(cottage);
        System.out.println(area);
        Apartment apartment = new Apartment("Apartment Avenue 321", 101.5);
        area = area(apartment);
        System.out.println(area);
    }

    private static double area(Building building) {
        return building.getArea();
    }
}
