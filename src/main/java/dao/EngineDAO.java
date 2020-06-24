package dao;

import models.Engine;
import models.Game;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;
import java.util.List;

public class EngineDAO {

    public Engine findById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Engine engine = (Engine) session.get(Engine.class, id);
        session.close();
        return engine;
    }

    public void save(Engine engine) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(engine);
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

    public void update(Engine engine) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(engine);
        tx1.commit();
        session.close();
    }

    public void updateGame(Game game) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(game);
        tx1.commit();
        session.close();
    }

    public void delete(Engine engine) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(engine);
        tx1.commit();
        session.close();
    }

    public void deleteGame(Game game) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(game);
        tx1.commit();
        session.close();
    }

    public Game findGameById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Game game = (Game) session.get(Game.class, id);
        session.close();
        return game;
    }

    public List<Engine> findAllEngines() {
        List<Engine> engines = (List<Engine>)  HibernateUtil.getSessionFactory().openSession().createQuery("FROM Engine").list();
        return engines;
    }

    public List<Game> findAllGames() {
        List<Game> games = (List<Game>)  HibernateUtil.getSessionFactory().openSession().createQuery("FROM Game").list();
        return games;
    }

}

