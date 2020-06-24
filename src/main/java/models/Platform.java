package models;

import javax.persistence.*;
import java.util.ArrayList;
import  java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "platform")

public class Platform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "platform_id")
    private int platformId;
    @Column(name = "platform_name")
    private String platformName;
    @Column(name = "platform_year")
    private int platformYear;

    @OneToMany(mappedBy="platform", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<GamePlatform> gamePlatforms;

    public Platform() {
    }

    public Platform(String platformName, int platformYear)
    {
        this.platformName = platformName;
        this.platformYear = platformYear;
        gamePlatforms = new ArrayList<>();
    }

    public void addGamePlatform(GamePlatform gamePlatform) {
        gamePlatform.setPlatform(this);
        gamePlatforms.add(gamePlatform);
    }

    public void removeGamePlatform(GamePlatform gamePlatform) { gamePlatforms.remove(gamePlatform); }

    public int getPlatformId() { return platformId; }

    public void setPlatformId(int platformId) { this.platformId = platformId; }

    public String getPlatformName() { return platformName; }

    public void setPlatformName(String platformName) { this.platformName = platformName; }

    public int getPlatformYear() { return platformYear; }

    public void setPlatformYear(int platformYear) { this.platformYear = platformYear; }

    public List<GamePlatform> getGamePlatforms() { return gamePlatforms; }

    public void setGamePlatforms(List<GamePlatform> gamePlatforms) { this.gamePlatforms = gamePlatforms; }

    @Override
    public String toString() {
        return platformId + "|" + platformName+ "|" + platformYear;
    }
    
}
