public class SportStatistics {
    public String team;
    public String vistingTeam;
    int teamPoits;
    int vistingPoints;

    public SportStatistics(String team, String vistingTeam, int teamPoits, int vistingPoints){
        this.team = team;
        this.vistingTeam = vistingTeam;
        this.teamPoits = teamPoits;
        this.vistingPoints = vistingPoints;
    }
    public String getTeam(){
        return this.team;
    }
    public String getVistingTeam(){
        return this.vistingTeam;
    }
    public int getTeamPoits(){
        return this.teamPoits;
    }
    public int getVistingPoints(){
        return this.vistingPoints;
    }

    public void teamGames(String file, String team){
        return;
    }
}
