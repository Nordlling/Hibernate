package models;

import javax.persistence.*;

import javax.persistence.*;
import java.util.ArrayList;
import  java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="game")

public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id")
    private int gameId;
    @Column(name = "game_name")
    private String gameName;
    @Column(name = "game_year")
    private int gameYear;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="engine_id")
    private Engine engine;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="company_id")
    private Company company;

    @OneToMany(mappedBy="game", cascade = CascadeType.PERSIST, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<GamePlatform> gamePlatforms;

    @OneToMany(mappedBy="game", cascade = CascadeType.PERSIST, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<GameGenreSetting> gameGenreSettings;

    public Game() {
    }

    public Game(String gameName, int gameYear)
    {
        this.gameName = gameName;
        this.gameYear = gameYear;
        gamePlatforms = new ArrayList<>();
        gameGenreSettings = new ArrayList<>();
    }

    public void addGamePlatform(GamePlatform gamePlatform) {
        gamePlatform.setGame(this);
        gamePlatforms.add(gamePlatform);
    }

    public void addGameGenreSettings(GameGenreSetting gameGenreSetting) {
        gameGenreSetting.setGame(this);
        gameGenreSettings.add(gameGenreSetting);
    }

    public void removeGamePlatform(GamePlatform gamePlatform) { gamePlatforms.remove(gamePlatform); }

    public void removeGameGenreSetting(GameGenreSetting gameGenreSetting) { gameGenreSettings.remove(gameGenreSetting); }

    public int getGameId() { return gameId; }

    public void setGameId(int gameId) { this.gameId = gameId; }

    public String getGameName() { return gameName; }

    public void setGameName(String gameName) { this.gameName = gameName; }

    public int getGameYear() { return gameYear; }

    public void setGameYear(int gameYear) { this.gameYear = gameYear; }

    public Engine getEngine() { return engine; }

    public void setEngine(Engine engine) { this.engine = engine; }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) { this.company = company; }

    public List<GamePlatform> getGamePlatforms() { return gamePlatforms; }

    public void setGamePlatforms(List<GamePlatform> gamePlatforms) { this.gamePlatforms = gamePlatforms; }

    public List<GameGenreSetting> getGameGenreSettings() { return gameGenreSettings; }

    public void setGameGenreSettings(List<GameGenreSetting> gameGenreSettings) { this.gameGenreSettings = gameGenreSettings; }


    @Override
    public String toString() {
        return gameId + "|" + gameName+ "|" + gameYear + "|" + engine.getEngineId() + "|" + company.getCompanyId() ;
    }
}