public class CosmeticRunner{
	public static void main(String[] args) {
		Cosmetics.storeCosmetic("Foundation");
		Cosmetics.storeCosmetic("Concealer");
		Cosmetics.storeCosmetic("Primer");
		Cosmetics.storeCosmetic("Primer");
		Cosmetics.storeCosmetic("Foundation");
		Cosmetics.readCosmetic();
		Cosmetics.searchCosmetic("Concealer");
	}
}