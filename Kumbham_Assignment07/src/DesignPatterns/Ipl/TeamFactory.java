package DesignPatterns.Ipl;



public class TeamFactory {

	public Team getTeam(String name) {
		if(name.equalsIgnoreCase("RoyalChallengersBanglore")) {
			return new RCB();
		}
		else if(name.equalsIgnoreCase("SunRisersHyderabad")) {
			return new SRH();
		}
		else if(name.equalsIgnoreCase("DelhiCapitals")) {
			return new DC();
		}
		else{
			return null;
		}
	}
}
