package models;

import javax.persistence.*;

import javax.persistence.*;
import java.util.ArrayList;
import  java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="engine")

public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "engine_id")
    private int engineId;
    @Column(name = "engine_name")
    private String engineName;
    @Column(name = "engine_year")
    private int engineYear;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="language_id")
    private Language language;

    @OneToMany(mappedBy="engine", cascade = CascadeType.PERSIST, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Game> games;

    public Engine() {
    }

    public Engine(String engineName, int engineYear)
    {
        this.engineName = engineName;
        this.engineYear = engineYear;
        games = new ArrayList<>();
    }

    public void addGame(Game game) {
        game.setEngine(this);
        games.add(game);
    }

    public void removeGame(Game game) { games.remove(game); }

    public int getEngineId() {
        return engineId;
    }

    public void setEngineId(int engineId) {
        this.engineId = engineId;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public int getEngineYear() { return engineYear; }

    public void setEngineYear(int engineYear) {
        this.engineYear = engineYear;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) { this.language = language; }

    public List<Game> getGames() { return games; }

    public void setGames(List<Game> games) { this.games = games; }

    @Override
    public String toString() {
        return engineId + "|" + engineName+ "|" + engineYear + "|" + language.getLanguageId() ;
    }
}