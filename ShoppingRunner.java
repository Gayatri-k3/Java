public class ShoppingRunner{
	public static void main(String[] args) {
		Shopping.items("Milk", "Chair"); 
        Shopping.items(229, 9876);  
        Shopping.items("Frill and Thrill", "Top", 2999, 0.18); 

        double[] prices = {500, 1200, 2999, 100}; 
        double gstRate = 0.18; 
        Shopping.items(prices, gstRate); 

        String[] itemNames = {"Shirt", "Jeans", "Jacket", "Shoes"};  
        double[] itemPrices = {500, 1200, 2999, 100};  
        Shopping.items(itemNames, itemPrices);  

        // Coupon-based discount
        Shopping.items("2024Ut0!", "Laptop", 50000, 0.18);
        Shopping.items("202345hgd", "T-shirt", 1500, 0.18);
        Shopping.items("randomCode", "Shoes", 3000, 0.18);

        // Finding common elements in three arrays
        int[] arr1 = {1, 3};  
        int[] arr2 = {1, 4, 3};  
        int[] arr3 = {3, 7, 8, 9};  
        Shopping.items(arr1, arr2, arr3);
    }
}