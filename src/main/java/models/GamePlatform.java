package models;

import javax.persistence.*;

import javax.persistence.*;
import java.util.ArrayList;
import  java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="game_platform")

public class GamePlatform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_platform_id")
    private int gamePlatformId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="game_id")
    private Game game;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="platform_id")
    private Platform platform;

    public GamePlatform() { }

    public int getGamePlatformId() { return gamePlatformId; }

    public void setGamePlatformId(int gamePlatformId) { this.gamePlatformId = gamePlatformId; }

    public Game getGame() { return game; }

    public void setGame(Game game) { this.game = game; }

    public Platform getPlatform() { return platform; }

    public void setPlatform(Platform platform) { this.platform = platform; }

    @Override
    public String toString() {
        return gamePlatformId + "|" + game.getGameId() + "|" + platform.getPlatformId() ;
    }
    
}
