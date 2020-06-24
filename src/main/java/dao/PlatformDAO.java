package dao;

import models.GamePlatform;
import models.Platform;
import models.Game;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;
import java.util.List;

public class PlatformDAO {

    public Platform findById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Platform platform = (Platform) session.get(Platform.class, id);
        session.close();
        return platform;
    }

    public void save(Platform platform) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(platform);
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

    public void update(Platform platform) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(platform);
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

    public void delete(Platform platform) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(platform);
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

    public GamePlatform findGamePlatformById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        GamePlatform gamePlatform = (GamePlatform) session.get(GamePlatform.class, id);
        session.close();
        return gamePlatform;
    }

    public List<Platform> findAllPlatforms() {
        List<Platform> platforms = (List<Platform>)  HibernateUtil.getSessionFactory().openSession().createQuery("FROM Platform").list();
        return platforms;
    }

    public List<GamePlatform> findAllGamePlatforms() {
        List<GamePlatform> gamePlatforms = (List<GamePlatform>)  HibernateUtil.getSessionFactory().openSession().createQuery("FROM GamePlatform").list();
        return gamePlatforms;
    }

}

