package com.wanner.player;

import com.wanner.batter.Batter;
import com.wanner.pitcher.Pitcher;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="master")
public class Player {
    @Id
    @NotNull
    @Size(min=6, max=9)
    @Column(name="playerID")
    private String playerID;

    @Column(name="birthYear")
    private int birthYear;

    @Column(name="birthMonth")
    private int birthMonth;

    @Column(name="birthDay")
    private int birthDay;

    @Column(name="birthCountry")
    private String birthCountry;

    @Column(name="birthState")
    private String birthState;

    @Column(name="birthCity")
    private String birthCity;

    @Column(name="deathYear")
    private String deathYear;

    @Column(name="deathMonth")
    private String deathMonth;

    @Column(name="deathDay")
    private String deathDay;

    @Column(name="deathCountry")
    private String deathCountry;

    @Column(name="deathState")
    private String deathState;

    @Column(name="deathCity")
    private String deathCity;

    @NotNull
    @Size(min =2, max = 20)
    @Column(name="nameFirst")
    private String nameFirst;

    @NotNull
    @Size(min =2, max = 20)
    @Column(name="nameLast")
    private String nameLast;

    @Column(name="nameGiven")
    private String nameGiven;

    @Column(name="weight")
    private int weight;

    @Column(name="height")
    private int height;

    @Column(name="bats")
    private String bats;

    @Column(name="throws")
    private String throwsLR;

    @Column(name="debut")
    private String debut;

    @Column(name="finalGame")
    private String finalGame;

    @Column(name="retroID")
    private String retroID;

    @Column(name="bbrefID")
    private String bbrefID;

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL)
    private List<Pitcher> pitcherStats;

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL)
    private List<Batter> batterStats;

    // Default JPA constructor
    protected Player() {}

    public Player(PlayerBuilder builder) {
        this.playerID = builder.playerID;
        this.birthYear = builder.birthYear;
        this.birthMonth = builder.birthMonth;
        this.birthDay = builder.birthDay;
        this.birthCountry = builder.birthCountry;
        this.birthState = builder.birthState;
        this.birthCity = builder.birthCity;
        this.deathYear = builder.deathYear;
        this.deathMonth = builder.deathMonth;
        this.deathDay = builder.deathDay;
        this.deathCountry = builder.deathCountry;
        this.deathState = builder.deathState;
        this.deathCity = builder.deathCity;
        this.nameFirst = builder.nameFirst;
        this.nameLast = builder.nameLast;
        this.nameGiven = builder.nameGiven;
        this.weight = builder.weight;
        this.height = builder.height;
        this.bats = builder.bats;
        this.throwsLR = builder.throwsLR;
        this.debut = builder.debut;
        this.finalGame = builder.finalGame;
        this.retroID = builder.retroID;
        this.bbrefID = builder.bbrefID;

        pitcherStats = new ArrayList<>();
        batterStats = new ArrayList<>();
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(String deathYear) {
        this.deathYear = deathYear;
    }

    public String getDeathMonth() {
        return deathMonth;
    }

    public void setDeathMonth(String deathMonth) {
        this.deathMonth = deathMonth;
    }

    public String getDeathDay() {
        return deathDay;
    }

    public void setDeathDay(String deathDay) {
        this.deathDay = deathDay;
    }

    public String getDeathCountry() {
        return deathCountry;
    }

    public void setDeathCountry(String deathCountry) {
        this.deathCountry = deathCountry;
    }

    public String getDeathState() {
        return deathState;
    }

    public void setDeathState(String deathState) {
        this.deathState = deathState;
    }

    public String getDeathCity() {
        return deathCity;
    }

    public void setDeathCity(String deathCity) {
        this.deathCity = deathCity;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public String getNameGiven() {
        return nameGiven;
    }

    public void setNameGiven(String nameGiven) {
        this.nameGiven = nameGiven;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBats() {
        return bats;
    }

    public void setBats(String bats) {
        this.bats = bats;
    }

    public String getThrowsLR() {
        return throwsLR;
    }

    public void setThrowsLR(String throwsLR) {
        this.throwsLR = throwsLR;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFinalGame() {
        return finalGame;
    }

    public void setFinalGame(String finalGame) {
        this.finalGame = finalGame;
    }

    public String getRetroID() {
        return retroID;
    }

    public void setRetroID(String retroID) {
        this.retroID = retroID;
    }

    public String getBbrefID() {
        return bbrefID;
    }

    public void setBbrefID(String bbrefID) {
        this.bbrefID = bbrefID;
    }

    public List<Pitcher> getPitcherStats() {
        return pitcherStats;
    }

    public void addPitcherStats(Pitcher pitcher){
        pitcher.setPlayer(this);
        pitcherStats.add(pitcher);
    }

    public List<Batter> getBatterStats() {
        return batterStats;
    }

    public void addBatterStats(Batter batter){
        batterStats.add(batter);
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerID='" + playerID + '\'' +
                ", birthYear=" + birthYear +
                ", birthMonth=" + birthMonth +
                ", birthDay=" + birthDay +
                ", birthCountry='" + birthCountry + '\'' +
                ", birthState='" + birthState + '\'' +
                ", birthCity='" + birthCity + '\'' +
                ", deathYear='" + deathYear + '\'' +
                ", deathMonth='" + deathMonth + '\'' +
                ", deathDay='" + deathDay + '\'' +
                ", deathCountry='" + deathCountry + '\'' +
                ", deathState='" + deathState + '\'' +
                ", deathCity='" + deathCity + '\'' +
                ", nameFirst='" + nameFirst + '\'' +
                ", nameLast='" + nameLast + '\'' +
                ", nameGiven='" + nameGiven + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", bats='" + bats + '\'' +
                ", throwsLR='" + throwsLR + '\'' +
                ", debut='" + debut + '\'' +
                ", finalGame='" + finalGame + '\'' +
                ", retroID='" + retroID + '\'' +
                ", bbrefID='" + bbrefID + '\'' +
                '}';
    }

    public static class PlayerBuilder {
        private String playerID;
        private int birthYear;
        private int birthMonth;
        private int birthDay;
        private String birthCountry;
        private String birthState;
        private String birthCity;
        private String deathYear;
        private String deathMonth;
        private String deathDay;
        private String deathCountry;
        private String deathState;
        private String deathCity;
        private String nameFirst;
        private String nameLast;
        private String nameGiven;
        private int weight;
        private int height;
        private String bats;
        private String throwsLR;
        private String debut;
        private String finalGame;
        private String retroID;
        private String bbrefID;

        public PlayerBuilder(
                String playerID,
                String nameFirst,
                String nameLast) {
            this.playerID = playerID;
            this.nameFirst = nameFirst;
            this.nameLast = nameLast;
        }

        public PlayerBuilder withBirthYear(int birthYear) {
            this.birthYear = birthYear;
            return this;
        }

        public PlayerBuilder withBirthMonth(int birthMonth) {
            this.birthMonth = birthMonth;
            return this;
        }

        public PlayerBuilder withBirthDay(int birthDay) {
            this.birthDay = birthDay;
            return this;
        }

        public PlayerBuilder withBirthCountry(String birthCountry) {
            this.birthCountry = birthCountry;
            return this;
        }

        public PlayerBuilder withBirthState(String birthState) {
            this.birthState = birthState;
            return this;
        }

        public PlayerBuilder withBirthCity(String birthCity) {
            this.birthCity = birthCity;
            return this;
        }

        public PlayerBuilder withDeathYear(String deathYear) {
            this.deathYear = deathYear;
            return this;
        }

        public PlayerBuilder withDeathMonth(String deathMonth) {
            this.deathMonth = deathMonth;
            return this;
        }

        public PlayerBuilder withDeathDay(String deathDay) {
            this.deathDay = deathDay;
            return this;
        }

        public PlayerBuilder withDeathCountry(String deathCountry) {
            this.deathCountry = deathCountry;
            return this;
        }

        public PlayerBuilder withDeathState(String deathState) {
            this.deathState = deathState;
            return this;
        }

        public PlayerBuilder withDeathCity(String deathCity){
            this.deathCity = deathCity;
            return this;
        }

        public PlayerBuilder withNameGiven(String nameGiven) {
            this.nameGiven = nameGiven;
            return this;
        }

        public PlayerBuilder withWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlayerBuilder withHeight(int height) {
            this.height = height;
            return this;
        }

        public PlayerBuilder withBats(String bats) {
            this.bats = bats;
            return this;
        }

        public PlayerBuilder withThrows(String throwsLR) {
            this.throwsLR = throwsLR;
            return this;
        }

        public PlayerBuilder withDebut(String debut) {
            this.debut = debut;
            return this;
        }

        public PlayerBuilder withFinalGame(String finalGame) {
            this.finalGame = finalGame;
            return this;
        }
        public PlayerBuilder withBbrefID(String bbrefID){
            this.bbrefID = bbrefID;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }
}
