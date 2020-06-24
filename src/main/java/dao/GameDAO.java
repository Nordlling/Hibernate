package dao;

import models.Game;
import models.Game;
import models.GameGenreSetting;
import models.GamePlatform;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;
import java.util.List;

public class GameDAO {

    public Game findById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Game game = (Game) session.get(Game.class, id);
        session.close();
        return game;
    }

    public void save(Game game) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(game);
        tx1.commit();
        session.close();
    }

    public void saveGamePlatform(GamePlatform gamePlatform) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(gamePlatform);
        tx1.commit();
        session.close();
    }

    public void saveGameGenreSetting(GameGenreSetting gameGenreSetting) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(gameGenreSetting);
        tx1.commit();
        session.close();
    }

    public void saveGame(Game game) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(game);
        tx1.commit();
        session.close();
    }

    public void update(Game game) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(game);
        tx1.commit();
        session.close();
    }

    public void updateGamePlatform(GamePlatform gamePlatform) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(gamePlatform);
        tx1.commit();
        session.close();
    }

    public void updateGameGenreSetting(GameGenreSetting gameGenreSetting) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(gameGenreSetting);
        tx1.commit();
        session.close();
    }

    public void delete(Game game) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(game);
        tx1.commit();
        session.close();
    }

    public void deleteGamePlatform(GamePlatform gamePlatform) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(gamePlatform);
        tx1.commit();
        session.close();
    }
    public void deleteGameGenreSetting(GameGenreSetting gameGenreSetting) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(gameGenreSetting);
        tx1.commit();
        session.close();
    }

    public GamePlatform findGamePlatformById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        GamePlatform gamePlatform = (GamePlatform) session.get(GamePlatform.class, id);
        session.close();
        return gamePlatform;
    }

    public GameGenreSetting findGameGenreSettingById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        GameGenreSetting gameGenreSetting = (GameGenreSetting) session.get(GameGenreSetting.class, id);
        session.close();
        return gameGenreSetting;
    }

    public List<Game> findAllGames() {
        List<Game> games = (List<Game>)  HibernateUtil.getSessionFactory().openSession().createQuery("FROM Game").list();
        return games;
    }

    public List<GamePlatform> findAllGamePlatforms() {
        List<GamePlatform> gamePlatforms = (List<GamePlatform>)  HibernateUtil.getSessionFactory().openSession().createQuery("FROM GamePlatform").list();
        return gamePlatforms;
    }

    public List<GameGenreSetting> findAllGameGenreSettings() {
        List<GameGenreSetting> gameGenreSettings = (List<GameGenreSetting>)  HibernateUtil.getSessionFactory().openSession().createQuery("FROM GameGenreSetting").list();
        return gameGenreSettings;
    }

}

