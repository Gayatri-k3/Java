public class ShapeCalculator {

    // 1. Calculate the area of a square
    public static void calculateArea(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    // 2. Calculate the area of a rectangle
    public static void calculateArea(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    // 3. Calculate the area of a circle
    public static void calculateArea(double radius) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    // 4. Calculate the area of a triangle
    public static void calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            System.out.println("Area of Triangle: " + (0.5 * base * height));
        }
    }

    // 5. Calculate the perimeter of a square
    public static void calculatePerimeter(int side) {
        System.out.println("Perimeter of Square: " + (4 * side));
    }

    // 6. Calculate the perimeter of a rectangle
    public static void calculatePerimeter(int length, int breadth) {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));
    }

    // 7. Calculate the perimeter of a circle (circumference)
    public static void calculatePerimeter(double radius) {
        System.out.println("Circumference of Circle: " + (2 * Math.PI * radius));
    }

    // 8. Calculate volume of a cube
    public static void calculateVolume(int side) {
        System.out.println("Volume of Cube: " + (side * side * side));
    }

    // 9. Calculate volume of a rectangular prism
    public static void calculateVolume(int length, int breadth, int height) {
        System.out.println("Volume of Rectangular Prism: " + (length * breadth * height));
    }

    // 10. Calculate volume of a sphere
    public static void calculateVolume(double radius, boolean isSphere) {
        if (isSphere) {
            System.out.println("Volume of Sphere: " + ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3)));
        }
    }

    // 11. Convert Celsius to Fahrenheit
    public static void convertTemperature(double celsius) {
        System.out.println("Celsius to Fahrenheit: " + ((celsius * 9 / 5) + 32));
    }

    // 12. Convert Fahrenheit to Celsius
    public static void convertTemperature(double fahrenheit, boolean isFahrenheit) {
        if (isFahrenheit) {
            System.out.println("Fahrenheit to Celsius: " + ((fahrenheit - 32) * 5 / 9));
        }
    }

    // 13. Convert kilometers to miles
    public static void convertDistance(double km) {
        System.out.println("Kilometers to Miles: " + (km * 0.621371));
    }

    // 14. Convert miles to kilometers
    public static void convertDistance(double miles, boolean isMiles) {
        if (isMiles) {
            System.out.println("Miles to Kilometers: " + (miles / 0.621371));
        }
    }

    // 15. Convert meters to centimeters
    public static void convertLength(int meters) {
        System.out.println("Meters to Centimeters: " + (meters * 100));
    }

    // 16. Convert centimeters to meters
    public static void convertLength(int cm, boolean isCM) {
        if (isCM) {
            System.out.println("Centimeters to Meters: " + (cm / 100.0));
        }
    }

    // 17. Convert grams to kilograms
    public static void convertWeight(int grams) {
        System.out.println("Grams to Kilograms: " + (grams / 1000.0));
    }

    // 18. Convert kilograms to grams
    public static void convertWeight(int kg, boolean isKg) {
        if (isKg) {
            System.out.println("Kilograms to Grams: " + (kg * 1000));
        }
    }

    // 19. Convert seconds to minutes
    public static void convertTime(int seconds) {
        System.out.println("Seconds to Minutes: " + (seconds / 60.0));
    }

    // 20. Convert minutes to seconds
    public static void convertTime(int minutes, boolean isMinutes) {
        if (isMinutes) {
            System.out.println("Minutes to Seconds: " + (minutes * 60));
        }
    }

    public static void main(String[] args) {
        // Area calculations
        calculateArea(5);
        calculateArea(4, 6);
        calculateArea(3.5);
        calculateArea(5.0, 10.0, true);

        // Perimeter calculations
        calculatePerimeter(4);
        calculatePerimeter(5, 7);
        calculatePerimeter(3.0);

        // Volume calculations
        calculateVolume(3);
        calculateVolume(2, 4, 6);
        calculateVolume(4.5, true);

        // Temperature conversions
        convertTemperature(25);
        convertTemperature(77, true);

        // Distance conversions
        convertDistance(10);
        convertDistance(6.2, true);

        // Length conversions
        convertLength(2);
        convertLength(250, true);

        // Weight conversions
        convertWeight(5000);
        convertWeight(5, true);

        // Time conversions
        convertTime(120);
        convertTime(3, true);
    }
}
