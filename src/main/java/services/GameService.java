package services;

import dao.GameDAO;
import models.Game;
import models.Game;
import models.GameGenreSetting;
import models.GamePlatform;

import java.util.List;

public class GameService {

    private GameDAO gamesDao = new GameDAO();

    public GameService() { }

    public Game findGame(int id) { return gamesDao.findById(id); }

    public void saveGame(Game game) { gamesDao.save(game); }

    public void saveGamePlatform(GamePlatform gamePlatform) { gamesDao.saveGamePlatform(gamePlatform); }

    public void saveGameGenreSetting(GameGenreSetting gameGenreSetting) { gamesDao.saveGameGenreSetting(gameGenreSetting); }

    public void deleteGame(Game game) { gamesDao.delete(game); }

    public void deleteGameGenreSetting(GameGenreSetting gameGenreSetting) { gamesDao.deleteGameGenreSetting(gameGenreSetting); }

    public void deleteGamePlatform(GamePlatform gamePlatform) { gamesDao.deleteGamePlatform(gamePlatform); }

    public void updateGame(Game game) { gamesDao.update(game); }

    public void updateGamePlatform(GamePlatform gamePlatform) { gamesDao.updateGamePlatform(gamePlatform); }

    public void updateGameGenreSetting(GameGenreSetting gameGenreSetting) { gamesDao.updateGameGenreSetting(gameGenreSetting); }

    public List<Game> findAllGames() { return gamesDao.findAllGames(); }

    public List<GamePlatform> findAllGamePlatforms() { return gamesDao.findAllGamePlatforms(); }

    public GamePlatform findGamePlatformById(int id) { return gamesDao.findGamePlatformById(id); }

    public List<GameGenreSetting> findAllGameGenreSettings() { return gamesDao.findAllGameGenreSettings(); }

    public GameGenreSetting findGameGenreSettingById(int id) { return gamesDao.findGameGenreSettingById(id); }


}