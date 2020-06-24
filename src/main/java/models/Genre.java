package models;

import javax.persistence.*;
import java.util.ArrayList;
import  java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "genre")

public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id")
    private int genreId;
    @Column(name = "genre_name")
    private String genreName;

    @OneToMany(mappedBy="genre", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<GameGenreSetting> gamesGenreSettings;

    public Genre() {
    }

    public Genre(String genreName) {
        this.genreName = genreName;
        gamesGenreSettings = new ArrayList<>();
    }


    public void addGameGenreSetting(GameGenreSetting gameGenreSetting) {
        gameGenreSetting.setGenre(this);
        gamesGenreSettings.add(gameGenreSetting);
    }

    public void removeGameGerneSetting(GameGenreSetting gameGenreSetting) {
        gamesGenreSettings.remove(gameGenreSetting);
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() { return genreName; }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public List<GameGenreSetting> getGameGerneSettings() {
        return gamesGenreSettings;
    }

    public void setGameGerneSettings(List<GameGenreSetting> gamesGenreSettings) {
        this.gamesGenreSettings = gamesGenreSettings;
    }

    @Override
    public String toString() {

        return genreId + "|" + genreName;
    }

}