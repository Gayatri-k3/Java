public class ProductRunner{
    public static void main(String[] args) {
        Product.storeProductNames("Monitor");
        Product.storeProductNames("Keyboard");
        Product.storeProductNames("Mouse");
        Product.storeProductNames("WebCam");
        Product.storeProductNames("Printer");
        Product.readProductName();
        Product.searchProductName("Mouse");
    }
}