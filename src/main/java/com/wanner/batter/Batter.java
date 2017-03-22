package com.wanner.batter;

import com.wanner.player.Player;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="batting")
public class Batter {
    @Id
    @NotNull
    @Size(min = 4, max = 4)
    @Column(name = "yearID")
    private int yearID;

    @Column(name = "stint")
    private int stint;

    @Column(name = "teamID")
    private String teamID;

    @Column(name = "lgID")
    private String leagueID;

    @Column(name = "G")
    private int games;

    @Column(name = "AB")
    private int atBats;

    @Column(name = "R")
    private int runs;

    @Column(name = "H")
    private int hits;

    @Column(name = "2B")
    private int doubles;

    @Column(name = "3B")
    private int triples;

    @Column(name = "HR")
    private int homeRuns;

    @Column(name = "RBI")
    private int runsBattedIn;

    @Column(name = "SB")
    private int stolenBases;

    @Column(name = "CS")
    private int caughtStealing;

    @Column(name = "BB")
    private int walks;

    @Column(name = "SO")
    private int strikeouts;

    @Column(name = "IBB")
    private String intentionalWalks;

    @Column(name = "HBP")
    private String hitByPitch;

    @Column(name = "SH")
    private String sacrificeHits;

    @Column(name = "SF")
    private String sacrificeFlies;

    @Column(name = "GIDP")
    private String groundIntoDoublePlays;

    @ManyToOne
    @JoinColumn(name = "playerID")
    private Player player;

    //Default JPA Constructor
    protected Batter() {
    }

    public Batter(BatterBuilder builder){
        this.yearID = builder.yearID;
        this.stint = builder.stint;
        this.teamID = builder.teamID;
        this.leagueID = builder.leagueID;
        this.games = builder.games;
        this.atBats = builder.atBats;
        this.runs = builder.runs;
        this.hits = builder.hits;
        this.doubles = builder.doubles;
        this.triples = builder.triples;
        this.homeRuns = builder.homeRuns;
        this.runsBattedIn = builder.runsBattedIn;
        this.stolenBases = builder.stolenBases;
        this.caughtStealing = builder.caughtStealing;
        this.walks = builder.walks;
        this.strikeouts = builder.strikeouts;
        this.intentionalWalks = builder.intentionalWalks;
        this.hitByPitch = builder.hitByPitch;
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

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public int getRunsBattedIn() {
        return runsBattedIn;
    }

    public void setRunsBattedIn(int runsBattedIn) {
        this.runsBattedIn = runsBattedIn;
    }

    public int getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(int stolenBases) {
        this.stolenBases = stolenBases;
    }

    public int getCaughtStealing() {
        return caughtStealing;
    }

    public void setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
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

    public String getIntentionalWalks() {
        return intentionalWalks;
    }

    public void setIntentionalWalks(String intentionalWalks) {
        this.intentionalWalks = intentionalWalks;
    }

    public String getHitByPitch() {
        return hitByPitch;
    }

    public void setHitByPitch(String hitByPitch) {
        this.hitByPitch = hitByPitch;
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
        return "Batter{" +
                "yearID=" + yearID +
                ", stint=" + stint +
                ", teamID='" + teamID + '\'' +
                ", leagueID='" + leagueID + '\'' +
                ", games=" + games +
                ", atBats=" + atBats +
                ", runs=" + runs +
                ", hits=" + hits +
                ", doubles=" + doubles +
                ", triples=" + triples +
                ", homeRuns=" + homeRuns +
                ", runsBattedIn=" + runsBattedIn +
                ", stolenBases=" + stolenBases +
                ", caughtStealing=" + caughtStealing +
                ", walks=" + walks +
                ", strikeouts=" + strikeouts +
                ", intentionalWalks='" + intentionalWalks + '\'' +
                ", hitByPitch='" + hitByPitch + '\'' +
                ", sacrificeHits='" + sacrificeHits + '\'' +
                ", sacrificeFlies='" + sacrificeFlies + '\'' +
                ", groundIntoDoublePlays='" + groundIntoDoublePlays + '\'' +
                '}';
    }

    public static class BatterBuilder {
        private Player player;
        private int yearID;
        private int stint;
        private String teamID;
        private String leagueID;
        private int games;
        private int atBats;
        private int runs;
        private int hits;
        private int doubles;
        private int triples;
        private int homeRuns;
        private int runsBattedIn;
        private int stolenBases;
        private int caughtStealing;
        private int walks;
        private int strikeouts;
        private String intentionalWalks;
        private String hitByPitch;
        private String sacrificeHits;
        private String sacrificeFlies;
        private String groundIntoDoublePlays;

        public BatterBuilder(String playerID, int yearID) {
            this.player.setPlayerID(playerID);
            this.yearID = yearID;
        }

        public BatterBuilder withStint(int stint) {
            this.stint = stint;
            return this;
        }

        public BatterBuilder withTeamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        public BatterBuilder withLeagueID(String leagueID) {
            this.leagueID = leagueID;
            return this;
        }

        public BatterBuilder withGames(int games) {
            this.games = games;
            return this;
        }

        public BatterBuilder withAtBats(int atBats) {
            this.atBats = atBats;
            return this;
        }

        public BatterBuilder withRuns(int runs) {
            this.runs = runs;
            return this;
        }

        public BatterBuilder withHits(int hits) {
            this.hits = hits;
            return this;
        }

        public BatterBuilder withDoubles(int doubles) {
            this.doubles = doubles;
            return this;
        }

        public BatterBuilder withTriples(int triples) {
            this.triples = triples;
            return this;
        }

        public BatterBuilder withHomeRuns(int homeRuns) {
            this.homeRuns = homeRuns;
            return this;
        }

        public BatterBuilder withRunsBattedIn(int runsBattedIn) {
            this.runsBattedIn = runsBattedIn;
            return this;
        }

        public BatterBuilder withStolenBases(int stolenBases) {
            this.stolenBases = stolenBases;
            return this;
        }

        public BatterBuilder withCaughtStealing(int caughtStealing) {
            this.caughtStealing = caughtStealing;
            return this;
        }

        public BatterBuilder withWalks(int walks) {
            this.walks = walks;
            return this;
        }

        public BatterBuilder withStrikeouts(int strikeouts) {
            this.strikeouts = strikeouts;
            return this;
        }

        public BatterBuilder withIntentionalWalks(String intentionalWalks) {
            this.intentionalWalks = intentionalWalks;
            return this;
        }

        public BatterBuilder withHitByPitch(String hitByPitch) {
            this.hitByPitch = hitByPitch;
            return this;
        }

        public BatterBuilder withSacrificeHits(String sacrificeHits) {
            this.sacrificeHits = sacrificeHits;
            return this;
        }

        public BatterBuilder withSacrificeFlies(String sacrificeFlies) {
            this.sacrificeFlies = sacrificeFlies;
            return this;
        }

        public BatterBuilder withGroundIntoDoublePlayes(String groundIntoDoublePlays) {
            this.groundIntoDoublePlays = groundIntoDoublePlays;
            return this;
        }

        public Batter build() {
            return new Batter(this);
        }
    }
}
