public class CricketRunner{
	public static void main(String args[]){
	Cricket.totalTeams = 10;
	Cricket.team = "RCB";
	Cricket.noOfPlayers = 11;
	Cricket.noOfMatches = 10;
	Cricket.matchPlace = "Bengaluru";
	System.out.println("Total teams:"+Cricket.totalTeams+"\nTeam:"+Cricket.team+"\nNumber of players:"+Cricket.noOfPlayers+"\nNumber of Matches"+Cricket.noOfMatches+"\nStadium:"+Cricket.matchPlace);
	}
}