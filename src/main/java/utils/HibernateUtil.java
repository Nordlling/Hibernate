package utils;

import models.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    private HibernateUtil() {}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration cfg = new Configuration().configure();
                cfg.addAnnotatedClass(Company.class);
                cfg.addAnnotatedClass(Game.class);
                cfg.addAnnotatedClass(Language.class);
                cfg.addAnnotatedClass(Engine.class);
                cfg.addAnnotatedClass(Platform.class);
                cfg.addAnnotatedClass(GamePlatform.class);
                cfg.addAnnotatedClass(Engine.class);
                cfg.addAnnotatedClass(Genre.class);
                cfg.addAnnotatedClass(Setting.class);
                cfg.addAnnotatedClass(GameGenreSetting.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
                sessionFactory = cfg.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        }
        return sessionFactory;
    }
}
