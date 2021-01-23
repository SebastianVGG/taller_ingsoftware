package libreria;

import java.sql.SQLException;
import login.Main_view_LO;


/**
 *
 * @author Sebastian
 */
public class Libreria extends javax.swing.JFrame{
 
    public static void main(String[] args) throws SQLException {
        Main_view_LO login_is = new Main_view_LO();
        login_is.setLocationRelativeTo(null);
        login_is.setVisible(true);
            }
    
}
