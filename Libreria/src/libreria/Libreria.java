package libreria;

import java.sql.SQLException;
import login.Main_login;


/**
 *
 * @author Sebastian
 */
public class Libreria extends javax.swing.JFrame{
 
    public static void main(String[] args) throws SQLException {
        Main_login login_is = new Main_login();
        login_is.setLocationRelativeTo(null);
        login_is.setVisible(true);
            }
    
}
