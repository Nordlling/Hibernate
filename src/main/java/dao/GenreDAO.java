package dao;

import models.GameGenreSetting;
import models.Genre;
import models.Game;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;
import java.util.List;

public class GenreDAO {

    public Genre findById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Genre genre = (Genre) session.get(Genre.class, id);
        session.close();
        return genre;
    }

    public void save(Genre genre) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(genre);
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

    public void update(Genre genre) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(genre);
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

    public void delete(Genre genre) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(genre);
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

    public List<Genre> findAllGenres() {
        List<Genre> genres = (List<Genre>)  HibernateUtil.getSessionFactory().openSession().createQuery("FROM Genre").list();
        return genres;
    }

    public List<GameGenreSetting> findAllGameGenreSettings() {
        List<GameGenreSetting> gameGenreSettings = (List<GameGenreSetting>)  HibernateUtil.getSessionFactory().openSession().createQuery("FROM GameGenreSetting").list();
        return gameGenreSettings;
    }

}

