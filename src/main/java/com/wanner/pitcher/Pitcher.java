package com.wanner.pitcher;

import com.wanner.player.Player;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="pitching")
public class Pitcher {
    @Id
    @NotNull
    @Size(min=4, max=4)
    @Column(name="yearID")
    private int yearID;

    @Column(name="stint")
    private int stint;

    @Column(name="teamID")
    private String teamID;

    @Column(name="lgID")
    private String leagueID;

    @Column(name="W")
    private int wins;

    @Column(name="L")
    private int losses;

    @Column(name="G")
    private int games;

    @Column(name="GS")
    private int gamesStarted;

    @Column(name="CG")
    private int completeGames;

    @Column(name="SHO")
    private int shutouts;

    @Column(name="SV")
    private int saves;

    @Column(name="IPouts")
    private int inningsPitchedPlusOuts;

    @Column(name="H")
    private int hits;

    @Column(name="ER")
    private int earnedRuns;

    @Column(name="HR")
    private int homeRuns;

    @Column(name="BB")
    private int walks;

    @Column(name="SO")
    private int strikeouts;

    @Column(name="BAOpp")
    private String opponentsBattingAvg;

    @Column(name="ERA")
    private double earnedRunAverage;

    @Column(name="IBB")
    private String intentionalWalks;

    @Column(name="WP")
    private String wildPitches;

    @Column(name="HBP")
    private String hitByPitch;

    @Column(name="BK")
    private int balks;

    @Column(name="BFP")
    private String battersFaced;

    @Column(name="GF")
    private String gamesFinished;

    @Column(name="R")
    private int runsAllowed;

    @Column(name="SH")
    private String sacrificeHits;

    @Column(name="SF")
    private String sacrificeFlies;

    @Column(name="GIDP")
    private String groundIntoDoublePlays;

    @ManyToOne
    @JoinColumn(name="playerID")
    private Player player;

    //Default JPA constructor
    protected Pitcher(){}

    public Pitcher(PitcherBuilder builder) {
        this.yearID = builder.yearID;
        this.stint = builder.stint;
        this.teamID = builder.teamID;
        this.leagueID = builder.leagueID;
        this.wins = builder.wins;
        this.losses = builder.losses;
        this.games = builder.games;
        this.gamesStarted = builder.gamesStarted;
        this.completeGames = builder.completeGames;
        this.shutouts = builder.shutouts;
        this.saves = builder.saves;
        this.inningsPitchedPlusOuts = builder.inningsPitchedPlusOuts;
        this.hits = builder.hits;
        this.earnedRuns = builder.earnedRuns;
        this.homeRuns = builder.homeRuns;
        this.walks = builder.walks;
        this.strikeouts = builder.strikeouts;
        this.opponentsBattingAvg = builder.opponentsBattingAvg;
        this.earnedRunAverage = builder.earnedRunAverage;
        this.intentionalWalks = builder.intentionalWalks;
        this.wildPitches = builder.wildPitches;
        this.hitByPitch = builder.hitByPitch;
        this.balks = builder.balks;
        this.battersFaced = builder.battersFaced;
        this.gamesFinished = builder.gamesFinished;
        this.runsAllowed = builder.runsAllowed;
        this.sacrificeHits = builder.sacrificeHits;
        this.sacrificeFlies = builder.sacrificeFlies;
        this.groundIntoDoublePlays = builder.groundIntoDoublePlays;

    }

    public int getYearID() {
        return yearID;
    }

    public void setYearID(int yearID) {
        this.yearID = yearID;
    }

    public int getStint() {
        return stint;
    }

    public void setStint(int stint) {
        this.stint = stint;
    }

    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public String getLeagueID() {
        return leagueID;
    }

    public void setLeagueID(String leagueID) {
        this.leagueID = leagueID;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getGamesStarted() {
        return gamesStarted;
    }

    public void setGamesStarted(int gamesStarted) {
        this.gamesStarted = gamesStarted;
    }

    public int getCompleteGames() {
        return completeGames;
    }

    public void setCompleteGames(int completeGames) {
        this.completeGames = completeGames;
    }

    public int getShutouts() {
        return shutouts;
    }

    public void setShutouts(int shutouts) {
        this.shutouts = shutouts;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public int getInningsPitchedPlusOuts() {
        return inningsPitchedPlusOuts;
    }

    public void setInningsPitchedPlusOuts(int inningsPitchedPlusOuts) {
        this.inningsPitchedPlusOuts = inningsPitchedPlusOuts;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getEarnedRuns() {
        return earnedRuns;
    }

    public void setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public int getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }

    public String getOpponentsBattingAvg() {
        return opponentsBattingAvg;
    }

    public void setOpponentsBattingAvg(String opponentsBattingAvg) {
        this.opponentsBattingAvg = opponentsBattingAvg;
    }

    public double getEarnedRunAverage() {
        return earnedRunAverage;
    }

    public void setEarnedRunAverage(double earnedRunAverage) {
        this.earnedRunAverage = earnedRunAverage;
    }

    public String getIntentionalWalks() {
        return intentionalWalks;
    }

    public void setIntentionalWalks(String intentionalWalks) {
        this.intentionalWalks = intentionalWalks;
    }

    public String getWildPitches() {
        return wildPitches;
    }

    public void setWildPitches(String wildPitches) {
        this.wildPitches = wildPitches;
    }

    public String getHitByPitch() {
        return hitByPitch;
    }

    public void setHitByPitch(String hitByPitch) {
        this.hitByPitch = hitByPitch;
    }

    public int getBalks() {
        return balks;
    }

    public void setBalks(int balks) {
        this.balks = balks;
    }

    public String getBattersFaced() {
        return battersFaced;
    }

    public void setBattersFaced(String battersFaced) {
        this.battersFaced = battersFaced;
    }

    public String getGamesFinished() {
        return gamesFinished;
    }

    public void setGamesFinished(String gamesFinished) {
        this.gamesFinished = gamesFinished;
    }

    public int getRunsAllowed() {
        return runsAllowed;
    }

    public void setRunsAllowed(int runsAllowed) {
        this.runsAllowed = runsAllowed;
    }

    public String getSacrificeHits() {
        return sacrificeHits;
    }

    public void setSacrificeHits(String sacrificeHits) {
        this.sacrificeHits = sacrificeHits;
    }

    public String getSacrificeFlies() {
        return sacrificeFlies;
    }

    public void setSacrificeFlies(String sacrificeFlies) {
        this.sacrificeFlies = sacrificeFlies;
    }

    public String getGroundIntoDoublePlays() {
        return groundIntoDoublePlays;
    }

    public void setGroundIntoDoublePlays(String groundIntoDoublePlays) {
        this.groundIntoDoublePlays = groundIntoDoublePlays;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "Pitcher{" +
                "yearID=" + yearID +
                ", stint=" + stint +
                ", teamID='" + teamID + '\'' +
                ", leagueID='" + leagueID + '\'' +
                ", wins=" + wins +
                ", losses=" + losses +
                ", games=" + games +
                ", gamesStarted=" + gamesStarted +
                ", completeGames=" + completeGames +
                ", shutouts=" + shutouts +
                ", saves=" + saves +
                ", inningsPitchedPlusOuts=" + inningsPitchedPlusOuts +
                ", hits=" + hits +
                ", earnedRuns=" + earnedRuns +
                ", homeRuns=" + homeRuns +
                ", walks=" + walks +
                ", strikeouts=" + strikeouts +
                ", opponentsBattingAvg='" + opponentsBattingAvg + '\'' +
                ", earnedRunAverage=" + earnedRunAverage +
                ", intentionalWalks='" + intentionalWalks + '\'' +
                ", wildPitches='" + wildPitches + '\'' +
                ", hitByPitch='" + hitByPitch + '\'' +
                ", balks=" + balks +
                ", battersFaced='" + battersFaced + '\'' +
                ", gamesFinished='" + gamesFinished + '\'' +
                ", runsAllowed=" + runsAllowed +
                ", sacrificeHits='" + sacrificeHits + '\'' +
                ", sacrificeFlies='" + sacrificeFlies + '\'' +
                ", groundIntoDoublePlays='" + groundIntoDoublePlays + '\'' +
                '}';
    }

    public static class PitcherBuilder {
        private Player player;
        private int yearID;
        private int stint;
        private String teamID;
        private String leagueID;
        private int wins;
        private int losses;
        private int games;
        private int gamesStarted;
        private int completeGames;
        private int shutouts;
        private int saves;
        private int inningsPitchedPlusOuts;
        private int hits;
        private int earnedRuns;
        private int homeRuns;
        private int walks;
        private int strikeouts;
        private String opponentsBattingAvg;
        private double earnedRunAverage;
        private String intentionalWalks;
        private String wildPitches;
        private String hitByPitch;
        private int balks;
        private String battersFaced;
        private String gamesFinished;
        private int runsAllowed;
        private String sacrificeHits;
        private String sacrificeFlies;
        private String groundIntoDoublePlays;

        public PitcherBuilder(String playerID, int yearID) {
            this.player.setPlayerID(playerID);
            this.yearID = yearID;
        }

        public PitcherBuilder withStint(int stint) {
            this.stint = stint;
            return this;
        }

        public PitcherBuilder withTeamID(String teamID){
            this.teamID = teamID;
            return this;
        }

        public PitcherBuilder withLeagueID(String leagueID){
            this.leagueID = leagueID;
            return this;
        }

        public PitcherBuilder withWins(int wins){
            this.wins = wins;
            return this;
        }

        public PitcherBuilder withLosses(int losses){
            this.losses = losses;
            return this;
        }

        public PitcherBuilder withGames(int games){
            this.games = games;
            return this;
        }

        public PitcherBuilder withGamesStarted(int gamesStarted){
            this.gamesStarted = gamesStarted;
            return this;
        }

        public PitcherBuilder withCompleteGames(int completeGames){
            this.completeGames = completeGames;
            return this;
        }

        public PitcherBuilder withShutouts(int shutouts){
            this.shutouts = shutouts;
            return this;
        }

        public PitcherBuilder withSaves(int saves) {
            this.saves = saves;
            return this;
        }

        public PitcherBuilder withInningsPitchedPlusOuts(int inningsPitchedPlusOuts){
            this.inningsPitchedPlusOuts = inningsPitchedPlusOuts;
            return this;
        }

        public PitcherBuilder withHits(int hits){
            this.hits = hits;
            return this;
        }

        public PitcherBuilder withEarnedRuns(int earnedRuns){
            this.earnedRuns = earnedRuns;
            return this;
        }

        public PitcherBuilder withHomeRuns(int homeRuns){
            this.homeRuns = homeRuns;
            return this;
        }

        public PitcherBuilder withWalks(int walks){
            this.walks = walks;
            return this;
        }

        public PitcherBuilder withStrikeouts(int strikeouts){
            this.strikeouts = strikeouts;
            return this;
        }

        public PitcherBuilder withOpponentsBattingAvg(String opponentsBattingAvg){
            this.opponentsBattingAvg = opponentsBattingAvg;
            return this;
        }

        public PitcherBuilder withEarnedRunAverage(double earnedRunAverage){
            this.earnedRunAverage = earnedRunAverage;
            return this;
        }

        public PitcherBuilder withIntentionalWalks(String intentionalWalks){
            this.intentionalWalks = intentionalWalks;
            return this;
        }

        public PitcherBuilder withWildPitches(String wildPitches){
            this.wildPitches = wildPitches;
            return this;
        }

        public PitcherBuilder withHitByPitch(String hitByPitch){
            this.hitByPitch = hitByPitch;
            return this;
        }

        public PitcherBuilder withBalks(int balks){
            this.balks = balks;
            return this;
        }

        public PitcherBuilder withBattersFaced(String battersFaced){
            this.battersFaced = battersFaced;
            return this;
        }

        public PitcherBuilder withGamesFinishd(String gamesFinishd){
            this.gamesFinished = gamesFinishd;
            return this;
        }

        public PitcherBuilder withRuns(int runsAllowed){
            this.runsAllowed = runsAllowed;
            return this;
        }

        public PitcherBuilder withSacrificeHits(String sacrificeHits){
            this.sacrificeHits = sacrificeHits;
            return this;
        }

        public PitcherBuilder withSacrificeFlies(String sacrificeFlies){
            this.sacrificeFlies = sacrificeFlies;
            return this;
        }

        public PitcherBuilder withGroundIntoDoublePlays(String groundIntoDoublePlays){
            this.groundIntoDoublePlays = groundIntoDoublePlays;
            return this;
        }

        public Pitcher build() {
            return new Pitcher(this);
        }
    }

}
