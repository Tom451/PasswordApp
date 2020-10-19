import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordApp extends JFrame {

    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JPanel tabHome;
    private JPanel tabPasswordGenerator;
    private JTextField passwordInput;
    private JLabel passwordPageHeader;
    private JButton enterButton;
    private JButton cancelButton;
    private JTabbedPane tabbedMainPanel;

    //getters and setters for main panel
    public String getPasswordInput(){

        return passwordInput.getText();
    }

    public static void main(String[] args){
        PasswordApp page = new PasswordApp();
        page.setVisible(true);

    }


    public PasswordApp() {

        //create the main frame for the app
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();


        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                passwordCheck(getPasswordInput());


            }
        });
    }

    public void passwordCheck(String input){

        if(input.length() < 8){
            JOptionPane.showMessageDialog(mainPanel,
                    "Your Password is not secure",
                    "Unsecure Password",
                    JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(mainPanel,
                    "Your Password is secure");
        }

    }

}
