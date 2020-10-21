import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.*;

public class PasswordApp extends JFrame {

    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JPanel tabHome;
    private JPanel tabPasswordGenerator;
    private JTextField passwordInput;
    private JLabel passwordPageHeader;
    private JButton enterButton;
    private JButton cancelButton;
    private JPanel tabPasswordHasher;
    private JSpinner spinner1;
    private JLabel lblHash;
    private JPasswordField passwordCipherEnter;
    private JButton enterButtonCipher;
    private JTextField userEntryCipher;
    private JLabel passwordInputLabel;
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

        enterButtonCipher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordHasher(userEntryCipher.getText(), (int) spinner1.getValue());
            }
        });
    }

    public void passwordHasher(String Input, int CipherSelect){

        passwordInputLabel.setText(cipher.encrypt(Input, CipherSelect ).toString());



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
