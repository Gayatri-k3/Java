public class UserNameRunner{
	public static void main(String[] args) {
		UserName.storeUserNames("Gayatri");
		UserName.storeUserNames("Shivani");
		UserName.storeUserNames("Srushti");
		UserName.storeUserNames("Gowsika");
		UserName.storeUserNames("Gayatri");
		UserName.readUserName();
		UserName.searchUserNames("Gayatri");
	}
}