package su.logix.hibernate.main;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import su.logix.hibernate.models.*;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(CertificationEntity.class);
                configuration.addAnnotatedClass(FacultyEntity.class);
                configuration.addAnnotatedClass(KeyEntity.class);
                configuration.addAnnotatedClass(OptionEntity.class);
                configuration.addAnnotatedClass(ResultEntity.class);
                configuration.addAnnotatedClass(StudentEntity.class);
                configuration.addAnnotatedClass(SubjectEntity.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
