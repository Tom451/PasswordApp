import javax.swing.*;
import java.awt.*;

public class PasswordApp extends JFrame {

    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JPanel tabHome;
    private JPanel tabPasswordGenerator;
    private JTabbedPane tabbedMainPanel;

    public static void setTabbedMainPanel(){

    }

    public PasswordApp() {

        //create the main frame for the app
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();



    }



    public static void main(String[] args){
        PasswordApp page = new PasswordApp();
        page.setVisible(true);




    }

}
