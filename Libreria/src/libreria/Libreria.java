package libreria;


import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import login.Main_login;

/**
 *
 * @author Sebastian
 */
public class Libreria extends javax.swing.JFrame{
 
    public static void main(String[] args) {
        
        new Main_login().setVisible(true);
        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setUndecorated(true);
        
        
        Main_login login = new Main_login();
        frame.add(login);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); 
        
    }
    
}
