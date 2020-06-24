package dao;

import models.GameGenreSetting;
import models.Setting;
import models.Game;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;
import java.util.List;

public class SettingDAO {

    public Setting findById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Setting setting = (Setting) session.get(Setting.class, id);
        session.close();
        return setting;
    }

    public void save(Setting setting) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(setting);
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

    public void update(Setting setting) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(setting);
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

    public void delete(Setting setting) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(setting);
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

    public GameGenreSetting findGameGenreSettingById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        GameGenreSetting gameGenreSetting = (GameGenreSetting) session.get(GameGenreSetting.class, id);
        session.close();
        return gameGenreSetting;
    }

    public List<Setting> findAllSettings() {
        List<Setting> settings = (List<Setting>)  HibernateUtil.getSessionFactory().openSession().createQuery("FROM Setting").list();
        return settings;
    }

    public List<GameGenreSetting> findAllGameGenreSettings() {
        List<GameGenreSetting> gameGenreSettings = (List<GameGenreSetting>)  HibernateUtil.getSessionFactory().openSession().createQuery("FROM GameGenreSetting").list();
        return gameGenreSettings;
    }

}

