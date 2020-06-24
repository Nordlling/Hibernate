package services;

import dao.LanguageDAO;
import models.Game;
import models.Language;
import models.Engine;

import java.util.List;

public class LanguageService {

    private LanguageDAO languagesDao = new LanguageDAO();

    public LanguageService() { }

    public Language findLanguage(int id) {
        return languagesDao.findById(id);
    }

    public void saveLanguage(Language language) {
        languagesDao.save(language);
    }

    public void saveEngine(Engine engine) {
        languagesDao.saveEngine(engine);
    }

    public void saveGame(Game game) { languagesDao.saveGame(game); }

    public void deleteLanguage(Language language) { languagesDao.delete(language); }

    public void deleteEngine(Engine engine) { languagesDao.deleteEngine(engine); }

    public void updateLanguage(Language language) { languagesDao.update(language); }

    public void updateEngine(Engine engine) { languagesDao.updateEngine(engine); }

    public List<Language> findAllLanguages() { return languagesDao.findAllLanguages(); }

    public List<Engine> findAllEngines() { return languagesDao.findAllEngines(); }

    public Engine findEngineById(int id) { return languagesDao.findEngineById(id); }


}