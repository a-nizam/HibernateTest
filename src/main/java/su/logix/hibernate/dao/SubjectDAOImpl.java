package su.logix.hibernate.dao;

import org.hibernate.Session;
import su.logix.hibernate.main.HibernateSessionFactoryUtil;
import su.logix.hibernate.models.SubjectEntity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SubjectDAOImpl implements SubjectDAO {
    @Override
    @SuppressWarnings("unchecked")
    public Collection<SubjectEntity> getAllSubjects() throws SQLException {
        Session session = null;
        List<SubjectEntity> subjects = new ArrayList<>();
        try {
            session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
            subjects = session.createQuery("FROM SubjectEntity").list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return subjects;
    }
}
