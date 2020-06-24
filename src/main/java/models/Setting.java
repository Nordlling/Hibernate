package models;

import javax.persistence.*;
import java.util.ArrayList;
import  java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "setting")

public class Setting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "setting_id")
    private int settingId;
    @Column(name = "setting_name")
    private String settingName;

    @OneToMany(mappedBy="setting", cascade = CascadeType.PERSIST, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<GameGenreSetting> gamesGenreSettings;

    public Setting() {
    }

    public Setting(String settingName) {
        this.settingName = settingName;
        gamesGenreSettings = new ArrayList<>();
    }


    public void addGameGenreSetting(GameGenreSetting gameGenreSetting) {
        gameGenreSetting.setSetting(this);
        gamesGenreSettings.add(gameGenreSetting);
    }

    public void removeGameGerneSetting(GameGenreSetting gameGenreSetting) {
        gamesGenreSettings.remove(gameGenreSetting);
    }

    public int getSettingId() {
        return settingId;
    }

    public void setSettingId(int settingId) {
        this.settingId = settingId;
    }

    public String getSettingName() { return settingName; }

    public void setSettingName(String settingName) {
        this.settingName = settingName;
    }

    public List<GameGenreSetting> getGameGerneSettings() {
        return gamesGenreSettings;
    }

    public void setGameGerneSettings(List<GameGenreSetting> gamesGenreSettings) {
        this.gamesGenreSettings = gamesGenreSettings;
    }

    @Override
    public String toString() {

        return settingId + "|" + settingName;
    }

}