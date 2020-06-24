//package dao;
//
//import models.Language;
//import models.Engine;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import utils.HibernateUtil;
//import java.util.List;
//
//public class LanguageDAO {
//
//    public Language findById(int id) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Language language = (Language) session.get(Language.class, id);
//        session.close();
//        return language;
//    }
//
//    public void save(Language language) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx1 = session.beginTransaction();
//        session.save(language);
//        tx1.commit();
//        session.close();
//    }
//
//    public void saveEngine(Engine engine) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx1 = session.beginTransaction();
//        session.save(engine);
//        tx1.commit();
//        session.close();
//    }
//
//    public void update(Language language) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx1 = session.beginTransaction();
//        session.update(language);
//        tx1.commit();
//        session.close();
//    }
//
//    public void updateEngine(Engine engine) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx1 = session.beginTransaction();
//        session.update(engine);
//        tx1.commit();
//        session.close();
//    }
//
//    public void delete(Language language) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx1 = session.beginTransaction();
//        session.delete(language);
//        tx1.commit();
//        session.close();
//    }
//
//    public void deleteEngine(Engine engine) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx1 = session.beginTransaction();
//        session.delete(engine);
//        tx1.commit();
//        session.close();
//    }
//
//    public Engine findEngineById(int id) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Engine engine = (Engine) session.get(Engine.class, id);
//        session.close();
//        return engine;
//    }
//
//    public List<Language> findAllLanguages() {
//        List<Language> languages = (List<Language>)  HibernateUtil.getSessionFactory().openSession().createQuery("FROM Language").list();
//        return languages;
//    }
//
//    public List<Engine> findAllEngines() {
//        List<Engine> engines = (List<Engine>)  HibernateUtil.getSessionFactory().openSession().createQuery("FROM Engine").list();
//        return engines;
//    }
//
//}
//
