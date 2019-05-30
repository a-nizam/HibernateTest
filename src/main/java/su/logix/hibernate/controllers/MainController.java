package su.logix.hibernate.controllers;

import javafx.scene.control.TextArea;
import su.logix.hibernate.dao.SubjectDAO;
import su.logix.hibernate.dao.SubjectDAOImpl;

import java.sql.SQLException;

public class MainController extends Controller {

    public TextArea taText;

    public void initialize() {
        SubjectDAO subjectDAO = new SubjectDAOImpl();
        try {
            subjectDAO.getAllSubjects().forEach(s -> taText.setText(taText.getText() + s.getSubName() + "\r\n"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
