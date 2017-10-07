package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.net.URL;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.ResourceBundle;

import java.sql.*;


public class InterfaceController implements Initializable {

    @FXML
    private Text appTitle;
    private Button btnSave;

    @FXML
    private void initialize() {
    }

    public void setAppTitle(String text) {
        appTitle.setText(text);
    }

    @FXML
    private void test(ActionEvent event) throws InterruptedException, SQLException {

        ResultSet rs = dbConnexion("SELECT id, nom, prenom, naissance  FROM bibliothecaire;");

        System.out.print(rs.toString());

    }

    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        appTitle.setText("> Bibliothèque");
    }


    // -----------------------------------------------------------------------------------------------------------------


    // Traitement des requêtes
    private ResultSet dbConnexion(String request) {

        /* Chargement du driver JDBC pour MySQL */
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        /* Connexion à la base de données */
        String url = "jdbc:mysql://localhost:3306/java_bibliotheque";
        String user = "corler1u";
        String pass = "ohtooYei1y";
        Connection connexion = null;
        ResultSet resultat = null;

        try {
            connexion = DriverManager.getConnection(url, user, pass);
            Statement statement = connexion.createStatement();

            resultat = statement.executeQuery(request);

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if (connexion != null) {
                try {
                    connexion.close(); // Fermeture de la connexion
                } catch (SQLException ignore) {
                    /* Si une erreur survient lors de la fermeture, l'ignorer. */
                }
            }
        }

        return resultat;
    }
}
