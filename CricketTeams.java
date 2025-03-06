public class CricketTeams{
    static String []teamNames ={null,null,null,null};
    static int index;
    public static void storeTeamNames(String name){
        if (teamNames != null) {
            if (index < teamNames.length) {
                teamNames[index] = name; 
                index++;
                System.out.println("Team Name added to the list successfully");
            } else {
                System.out.println("Team Name not added to the list, as list is full");
            }
        } else {
            System.out.println("List is null");
        }
    }
    
    public static void readTeamName(){
        System.out.println();
        System.out.println("The Team Names stored in the array are: ");
        for (int i = 0; i < teamNames.length; i++) {
            System.out.println(teamNames[i]);
        }
    }

    public static void searchTeamName(String name){
        System.out.println();
        for (int i = 0; i < index; i++) {
            if (teamNames[i].equalsIgnoreCase(name)) {
                System.out.println(name + " found at position " + (i + 1));
                return;
            }
        }
        System.out.println(name + " not found in the list.");
    }
}

