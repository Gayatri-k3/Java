public class CollegeRunner{
    public static void main(String[] args) {
        College.storeCollegeNames("AGMR College of Engineering and Technology");
        College.storeCollegeNames("AGM Ayurvedic and Medical College");
        College.storeCollegeNames("AGM College of Pharmacy");
        College.storeCollegeNames("AGM College of Polytechnic");
        College.storeCollegeNames("AGMR College of Engineering and Technology");
        College.readCollegeName();
        College.searchCollegeName("AGMR College of Engineering and Technology");
    }
}