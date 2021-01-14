package libreria;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import login.LoginPrincipal;

/**
 *
 * @author Sebastian
 */
public class Libreria extends javax.swing.JFrame{
 
    JDesktopPane escritorio;
    public static void main(String[] args) {
        
        new LoginPrincipal().setVisible(true);
        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setUndecorated(true);
        
        
        LoginPrincipal login = new LoginPrincipal();
        frame.add(login);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); 
        
    }
    
}
