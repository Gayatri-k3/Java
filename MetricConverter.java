//11
public class MetricConverter {

    // 1. Convert Kilometers to Miles (int)
    public static void convertToMiles(int km) {
        System.out.println(km * 0.621371);
    }

    // 2. Convert Kilometers to Miles (double)
    public static void convertToMiles(double km) {
        System.out.println(km * 0.621371);
    }

    // 3. Convert Meters to Yards (int)
    public static void convertToYards(int meters) {
        System.out.println(meters * 1.09361);
    }

    // 4. Convert Meters to Yards (double)
    public static void convertToYards(double meters) {
        System.out.println(meters * 1.09361);
    }

    // 5. Convert Centimeters to Inches (int)
    public static void convertToInches(int cm) {
        System.out.println(cm * 0.393701);
    }

    // 6. Convert Centimeters to Inches (double)
    public static void convertToInches(double cm) {
        System.out.println(cm * 0.393701);
    }

    // 7. Convert Kilograms to Pounds (int)
    public static void convertToPounds(int kg) {
        System.out.println(kg * 2.20462);
    }

    // 8. Convert Kilograms to Pounds (double)
    public static void convertToPounds(double kg) {
        System.out.println(kg * 2.20462);
    }

    // 9. Convert Grams to Ounces (int)
    public static void convertToOunces(int grams) {
        System.out.println(grams * 0.035274);
    }

    // 10. Convert Grams to Ounces (double)
    public static void convertToOunces(double grams) {
        System.out.println(grams * 0.035274);
    }

    // 11. Convert Liters to Gallons (int)
    public static void convertToGallons(int liters) {
        System.out.println(liters * 0.264172);
    }

    // 12. Convert Liters to Gallons (double)
    public static void convertToGallons(double liters) {
        System.out.println(liters * 0.264172);
    }

    // 13. Convert Celsius to Fahrenheit (int)
    public static void convertToFahrenheit(int celsius) {
        System.out.println((celsius * 9/5) + 32);
    }

    // 14. Convert Celsius to Fahrenheit (double)
    public static void convertToFahrenheit(double celsius) {
        System.out.println((celsius * 9/5) + 32);
    }

    // 15. Convert Square Meters to Square Feet (int)
    public static void convertToSquareFeet(int sqm) {
        System.out.println(sqm * 10.7639);
    }

    // 16. Convert Square Meters to Square Feet (double)
    public static void convertToSquareFeet(double sqm) {
        System.out.println(sqm * 10.7639);
    }

    // 17. Convert Hectares to Acres (int)
    public static void convertToAcres(int hectares) {
        System.out.println(hectares * 2.47105);
    }

    // 18. Convert Hectares to Acres (double)
    public static void convertToAcres(double hectares) {
        System.out.println(hectares * 2.47105);
    }

    // 19. Convert Newtons to Pounds-force (int)
    public static void convertToPoundForce(int newtons) {
        System.out.println(newtons * 0.224809);
    }

    // 20. Convert Newtons to Pounds-force (double)
    public static void convertToPoundForce(double newtons) {
        System.out.println(newtons * 0.224809);
    }

    public static void main(String[] args) {
        convertToMiles(10);
        convertToMiles(15.5);
        convertToYards(20);
        convertToYards(25.3);
        convertToInches(30);
        convertToInches(45.7);
        convertToPounds(50);
        convertToPounds(60.8);
        convertToOunces(70);
        convertToOunces(80.9);
        convertToGallons(90);
        convertToGallons(100.4);
        convertToFahrenheit(37);
        convertToFahrenheit(20.5);
        convertToSquareFeet(110);
        convertToSquareFeet(120.6);
        convertToAcres(5);
        convertToAcres(8.7);
        convertToPoundForce(15);
        convertToPoundForce(22.3);
    }
}
