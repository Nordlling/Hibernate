package services;

import dao.SettingDAO;
import models.GameGenreSetting;
import models.Setting;
import models.Game;

import java.util.List;

public class SettingService {

    private SettingDAO settingsDao = new SettingDAO();

    public SettingService() { }

    public Setting findSetting(int id) { return settingsDao.findById(id); }

    public void saveSetting(Setting setting) { settingsDao.save(setting); }

    public void saveGameGenreSetting(GameGenreSetting gameGenreSetting) { settingsDao.saveGameGenreSetting(gameGenreSetting); }

    public void deleteSetting(Setting setting) { settingsDao.delete(setting); }

    public void deleteGameGenreSetting(GameGenreSetting gameGenreSetting) { settingsDao.deleteGameGenreSetting(gameGenreSetting); }

    public void updateSetting(Setting setting) { settingsDao.update(setting); }

    public void updateGameGenreSetting(GameGenreSetting gameGenreSetting) { settingsDao.updateGameGenreSetting(gameGenreSetting); }

    public List<Setting> findAllSettings() { return settingsDao.findAllSettings(); }

    public List<GameGenreSetting> findAllGameGenreSettings() { return settingsDao.findAllGameGenreSettings(); }

    public GameGenreSetting findGameGenreSettingById(int id) { return settingsDao.findGameGenreSettingById(id); }


}