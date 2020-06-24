//package services;
//
//import dao.GameGenreSettingDAO;
//import models.GameGenreSetting;
//import models.Engine;
//
//import java.util.List;
//
//public class GameGenreSettingService {
//
//    private GameGenreSettingDAO gamesGenresSettingsDao = new GameGenreSettingDAO();
//
//    public GameGenreSettingService() {
//    }
//
//    public GameGenreSetting findGameGenreSetting(int id) {
//        return gamesGenresSettingsDao.findById(id);
//    }
//
//    public void saveGameGenreSetting(GameGenreSetting gameGenreSetting) {
//        gamesGenresSettingsDao.save(gameGenreSetting);
//    }
//
//    public void saveEngine(Engine engine) {
//        gamesGenresSettingsDao.saveEngine(engine);
//    }
//
//    public void deleteGameGenreSetting(GameGenreSetting gameGenreSetting) { gamesGenresSettingsDao.delete(gameGenreSetting); }
//
//    public void deleteEngine(Engine engine) { gamesGenresSettingsDao.deleteEngine(engine); }
//
//    public void updateGameGenreSetting(GameGenreSetting gameGenreSetting) { gamesGenresSettingsDao.update(gameGenreSetting); }
//
//    public void updateEngine(Engine engine) { gamesGenresSettingsDao.updateEngine(engine); }
//
//    public List<GameGenreSetting> findAllGameGenreSettings() { return gamesGenresSettingsDao.findAllGameGenreSettings(); }
//
//    public List<Engine> findAllEngines() { return gamesGenresSettingsDao.findAllEngines(); }
//
//    public Engine findEngineById(int id) { return gamesGenresSettingsDao.findEngineById(id); }
//
//
//}