package services;

import dao.PlatformDAO;
import models.GamePlatform;
import models.Platform;
import models.Game;

import java.util.List;

public class PlatformService {

    private PlatformDAO platformsDao = new PlatformDAO();

    public PlatformService() { }

    public Platform findPlatform(int id) { return platformsDao.findById(id); }

    public void savePlatform(Platform platform) { platformsDao.save(platform); }

    public void saveGamePlatform(GamePlatform gamePlatform) { platformsDao.saveGamePlatform(gamePlatform); }

    public void deletePlatform(Platform platform) { platformsDao.delete(platform); }

    public void deleteGamePlatform(GamePlatform gamePlatform) { platformsDao.deleteGamePlatform(gamePlatform); }

    public void updatePlatform(Platform platform) { platformsDao.update(platform); }

    public void updateGamePlatform(GamePlatform gamePlatform) { platformsDao.updateGamePlatform(gamePlatform); }

    public List<Platform> findAllPlatforms() { return platformsDao.findAllPlatforms(); }

    public List<GamePlatform> findAllGamePlatforms() { return platformsDao.findAllGamePlatforms(); }

    public GamePlatform findGamePlatformById(int id) { return platformsDao.findGamePlatformById(id); }


}