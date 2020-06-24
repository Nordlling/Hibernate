package services;

import dao.EngineDAO;
import models.Engine;
import models.Game;

import java.util.List;

public class EngineService {

    private EngineDAO enginesDao = new EngineDAO();

    public EngineService() { }

    public Engine findEngine(int id) { return enginesDao.findById(id); }

    public void saveEngine(Engine engine) { enginesDao.save(engine); }

    public void saveGame(Game game) { enginesDao.saveGame(game); }

    public void deleteEngine(Engine engine) { enginesDao.delete(engine); }

    public void deleteGame(Game game) { enginesDao.deleteGame(game); }

    public void updateEngine(Engine engine) { enginesDao.update(engine); }

    public void updateGame(Game game) { enginesDao.updateGame(game); }

    public List<Engine> findAllEngines() { return enginesDao.findAllEngines(); }

    public List<Game> findAllGames() { return enginesDao.findAllGames(); }

    public Game findGameById(int id) { return enginesDao.findGameById(id); }


}