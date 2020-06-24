package dao;

import models.Company;
import models.Game;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;
import java.util.List;

public class CompanyDAO {

    public Company findById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Company company = (Company) session.get(Company.class, id);
        session.close();
        return company;
    }

    public void save(Company company) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(company);
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

    public void update(Company company) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(company);
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

    public void delete(Company company) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(company);
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

    public List<Company> findAllCompanies() {
        List<Company> companies = (List<Company>)  HibernateUtil.getSessionFactory().openSession().createQuery("FROM Company").list();
        return companies;
    }

    public List<Game> findAllGames() {
        List<Game> games = (List<Game>)  HibernateUtil.getSessionFactory().openSession().createQuery("FROM Game").list();
        return games;
    }

}

