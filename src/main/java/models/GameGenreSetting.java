package models;

import javax.persistence.*;

import javax.persistence.*;
import java.util.ArrayList;
import  java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="game_genre_setting")

public class GameGenreSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_genre_setting_id")
    private int gameGenreSettingId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="game_id")
    private Game game;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="genre_id")
    private Genre genre;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="setting_id")
    private Setting setting;

    public GameGenreSetting() { }

    public int getGameGenreSettingId() { return gameGenreSettingId; }

    public void setGameGenreSettingId(int gameGenreSettingId) { this.gameGenreSettingId = gameGenreSettingId; }

    public Genre getGenre() { return genre; }

    public void setGenre(Genre genre) { this.genre = genre; }

    public Setting getSetting() { return setting; }

    public void setSetting(Setting setting) { this.setting = setting; }

    public Game getGame() { return game; }

    public void setGame(Game game) { this.game = game; }

    @Override
    public String toString() {
        return gameGenreSettingId + "|" + game.getGameId() + "|" + genre.getGenreId() + "|" + setting.getSettingId();
    }
}