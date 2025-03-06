public class ClothesRunner{
    public static void main(String[] args) {
        Clothes.storeBrandNames("Zara");
        Clothes.storeBrandNames("Bonkers");
        Clothes.storeBrandNames("Freakins");
        Clothes.storeBrandNames("OFF-Duty");
        Clothes.storeBrandNames("Zara");
        Clothes.readBrandName();
        Clothes.searchBrandName("Off-duty");
    }
}