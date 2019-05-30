package su.logix.hibernate.dao;

import su.logix.hibernate.models.SubjectEntity;

import java.sql.SQLException;
import java.util.Collection;

public interface SubjectDAO {
    Collection<SubjectEntity> getAllSubjects() throws SQLException;
}
