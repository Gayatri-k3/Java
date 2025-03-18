public class Shopping {
    static double total;
    static double totalPayableAmount;
    static double finalBill;

    public static void items(String item1, String item2) {
        System.out.println("\nItem1: " + item1);
        System.out.println("Item2: " + item2);
    }

    public static void items(double price1, double price2) {
        System.out.println("\nPrice of item1: " + price1);
        System.out.println("Price of item2: " + price2);
        total = price1 + price2;
        System.out.println("Total Bill before GST: " + total);
    }

    public static void items(String brandName, String itemName, double price, double gst) {
        System.out.println("\nBrand: " + brandName);
        System.out.println("Item: " + itemName);
        System.out.println("Original Price: " + price);

        if (brandName.equalsIgnoreCase("Frill and Thrill")) {
            double discount = price * 0.50; // 50% discount
            price -= discount;
            System.out.println("After 50% Discount: " + price);
        }

        double gstAmount = price * gst;
        double finalPrice = price + gstAmount;

        System.out.println("GST: " + gstAmount);
        System.out.println("Total Price after GST: " + finalPrice);
    }

    // Method to process an array of prices
    public static void items(double[] prices, double gst) {
        double[] pricesWithGST = new double[prices.length]; // Array to store final prices
        double maxPrice = 0; // To find the maximum value

        System.out.println("\nGST Calculation for Each Price:");
        for (int i = 0; i < prices.length; i++) {
            double gstAmount = prices[i] * gst;
            pricesWithGST[i] = prices[i] + gstAmount;

            System.out.println("Price: " + prices[i] + " | GST: " + gstAmount + " | After GST: " + pricesWithGST[i]);

            if (pricesWithGST[i] > maxPrice) {
                maxPrice =  pricesWithGST[i]; // Find max value
            }
        }

        System.out.println("\nFinal Prices After Adding GST:");
        for (int i = 0; i < pricesWithGST.length; i++) {
            System.out.println("Price[" + i + "]: " + pricesWithGST[i]);
        }

        System.out.println("\nMaximum Price After GST: " + maxPrice);
    }

    // Method to process arrays of items and prices
    public static void items(String[] itemNames, double[] prices) {
        if (itemNames.length != prices.length) {
            System.out.println("\nError: Item names and prices count do not match.");
            return;
        }

        System.out.println("\nItems with Prices:");
        for (int i = 0; i < itemNames.length; i++) {
            System.out.println(itemNames[i] + " : " + prices[i]);
        }
    }
    public static void items(String couponCode, String itemName, double price, double gst, boolean isCoupon) {
        System.out.println("\nItem: " + itemName);
        System.out.println("Original Price: " + price);

        double gstAmount = price * gst;
        double priceAfterGST = price + gstAmount;

        double discount = 0;
        if (couponCode.equals("2024Ut0!")) {
            discount = priceAfterGST * 0.25; 
        } else if (couponCode.equals("202345hgd") && itemName.equalsIgnoreCase("T-shirt")) {
            discount = priceAfterGST * 0.333; 
        } else {
            discount = priceAfterGST * 0.10; 
        }

        double finalPrice = priceAfterGST - discount;

        System.out.println("GST: " + gstAmount);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Price After GST & Discount: " + finalPrice);
    }
    public static void items(int[] arr1, int[] arr2, int[] arr3) {
        System.out.println("\nFinding Common Elements:");

        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];
            boolean foundInSecond = false, foundInThird = false;

            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == num) {
                    foundInSecond = true;
                    break;
                }
            }

            for (int k = 0; k < arr3.length; k++) {
                if (arr3[k] == num) {
                    foundInThird = true;
                    break;
                }
            }

            if (foundInSecond && foundInThird) {
                System.out.println("Common Number: " + num);
            }
        }
    }
}