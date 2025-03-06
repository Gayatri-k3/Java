public class CricketTeamsRunner{
    public static void main(String[] args) {
        CricketTeams.storeTeamNames("RCB");
        CricketTeams.storeTeamNames("CSK");
        CricketTeams.storeTeamNames("MI");
        CricketTeams.storeTeamNames("KKR");
        CricketTeams.storeTeamNames("CSK");
        CricketTeams.readTeamName();
        CricketTeams.searchTeamName("CSK");
    }
}