public class CurrencyConverter {

    // 1. Convert INR to USD (int)
    public static void convertToUSD(int amount) {
        System.out.println(amount * 0.012);
    }

    // 2. Convert INR to USD (double)
    public static void convertToUSD(double amount) {
        System.out.println(amount * 0.012);
    }

    // 3. Convert INR to EUR (int)
    public static void convertToEUR(int amount) {
        System.out.println(amount * 0.011);
    }

    // 4. Convert INR to EUR (double)
    public static void convertToEUR(double amount) {
        System.out.println(amount * 0.011);
    }

    // 5. Convert INR to GBP (int)
    public static void convertToGBP(int amount) {
        System.out.println(amount * 0.0095);
    }

    // 6. Convert INR to GBP (double)
    public static void convertToGBP(double amount) {
        System.out.println(amount * 0.0095);
    }

    // 7. Convert INR to JPY (int)
    public static void convertToJPY(int amount) {
        System.out.println(amount * 1.62);
    }

    // 8. Convert INR to JPY (double)
    public static void convertToJPY(double amount) {
        System.out.println(amount * 1.62);
    }

    // 9. Convert INR to AUD (int)
    public static void convertToAUD(int amount) {
        System.out.println(amount * 0.018);
    }

    // 10. Convert INR to AUD (double)
    public static void convertToAUD(double amount) {
        System.out.println(amount * 0.018);
    }

    // 11. Convert INR to CAD (int)
    public static void convertToCAD(int amount) {
        System.out.println(amount * 0.016);
    }

    // 12. Convert INR to CAD (double)
    public static void convertToCAD(double amount) {
        System.out.println(amount * 0.016);
    }

    // 13. Convert INR to SGD (int)
    public static void convertToSGD(int amount) {
        System.out.println(amount * 0.016);
    }

    // 14. Convert INR to SGD (double)
    public static void convertToSGD(double amount) {
        System.out.println(amount * 0.016);
    }

    // 15. Convert INR to CHF (int)
    public static void convertToCHF(int amount) {
        System.out.println(amount * 0.011);
    }

    // 16. Convert INR to CHF (double)
    public static void convertToCHF(double amount) {
        System.out.println(amount * 0.011);
    }

    // 17. Convert INR to CNY (int)
    public static void convertToCNY(int amount) {
        System.out.println(amount * 0.087);
    }

    // 18. Convert INR to CNY (double)
    public static void convertToCNY(double amount) {
        System.out.println(amount * 0.087);
    }

    // 19. Convert INR to MYR (int)
    public static void convertToMYR(int amount) {
        System.out.println(amount * 0.057);
    }

    // 20. Convert INR to MYR (double)
    public static void convertToMYR(double amount) {
        System.out.println(amount * 0.057);
    }

    public static void main(String[] args) {
        convertToUSD(1000);
        convertToUSD(2000.5);
        convertToEUR(1500);
        convertToEUR(2200.75);
        convertToGBP(500);
        convertToGBP(1800.25);
        convertToJPY(2000);
        convertToJPY(3200.60);
        convertToAUD(1500);
        convertToAUD(2700.90);
        convertToCAD(2500);
        convertToCAD(3600.45);
        convertToSGD(3000);
        convertToSGD(4200.55);
        convertToCHF(1800);
        convertToCHF(2900.30);
        convertToCNY(5000);
        convertToCNY(6100.80);
        convertToMYR(600);
        convertToMYR(750.65);
    }
}
