import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
//import javax.swing.JComboBox;
import javax.swing.JFrame;
//import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    MainFrame(){

        Font font = new Font("ROBOTO",Font.BOLD,28);
        Font newfont = new Font("ROBOTO",Font.BOLD,22);
        //Font regularfont = new Font("ROBOTO",Font.BOLD,18);

        //String[] optionToChoose = {"Apple","Samsung","Vivo","Redmi"};

        // TextBar Panel================
        JLabel textLabel = new JLabel();
        textLabel.setText("Pic your Favroite Comapany");
        textLabel.setForeground(Color.WHITE);
        textLabel.setFont(newfont);
        textLabel.setBounds(240, 5, 450, 50);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(null);
        textPanel.setBackground(Color.BLUE);
        textPanel.setBounds(0, 70, 840, 60);
        textPanel.add(textLabel);
        // TextBar Panel================

        // Creating NavBar=====
        JLabel navLabel = new JLabel();
        navLabel.setText("Mobile Retail Area");
        navLabel.setForeground(Color.WHITE);
        navLabel.setFont(font);
        navLabel.setBounds(240, 5, 250, 50);

        JPanel navBar = new JPanel();
        navBar.setLayout(null);
        navBar.setBackground(Color.RED);
        navBar.setBounds(0, 2, 840, 60);
        navBar.add(navLabel);
        // Creating NavBar=====

        // ComboBox--------------
        /*
        JComboBox<String> comboBox = new JComboBox<>(optionToChoose);
        comboBox.setBounds(5, 5, 250, 60);
         */
        // ComboBox--------------

        // Creating Comnapany Button------------------
        JButton appleButton = new JButton();
        appleButton.setText("Apple Mobiles");
        appleButton.setFont(newfont);
        appleButton.setLayout(null);
        appleButton.setBackground(Color.BLACK);
        appleButton.setForeground(Color.WHITE);
        appleButton.setBounds(20, 20, 200, 60);

        appleButton.addActionListener((e)->{
            System.out.println("Apple Button is Clicked..");
            new AppleFrame();
            this.setVisible(false);
        });

        JButton samsungButton = new JButton();
        samsungButton.setText("Samsung Mobiles");
        samsungButton.setFont(newfont);
        samsungButton.setLayout(null);
        samsungButton.setBackground(Color.BLACK);
        samsungButton.setForeground(Color.WHITE);
        samsungButton.setBounds(320, 20, 260, 60);

        samsungButton.addActionListener((e)->{
            System.out.println("Samsung Mobiles Button Clicked..");
            new SamsungFrame();
            this.setVisible(false);
        });

        JButton vivoButton = new JButton();
        vivoButton.setText("Vivo Mobiles");
        vivoButton.setFont(newfont);
        vivoButton.setLayout(null);
        vivoButton.setBackground(Color.BLACK);
        vivoButton.setForeground(Color.WHITE);
        vivoButton.setBounds(20, 200, 200, 60);

        vivoButton.addActionListener((e)->{
            System.out.println("Vivo Mobile BUtton Clicked");
            new VivoFrame();
            this.setVisible(false);
        });

        JButton redmiButton = new JButton();
        redmiButton.setText("Redmi Mobiles");
        redmiButton.setFont(newfont);
        redmiButton.setLayout(null);
        redmiButton.setBackground(Color.BLACK);
        redmiButton.setForeground(Color.WHITE);
        redmiButton.setBounds(320, 200, 200, 60);

        redmiButton.addActionListener((e)->{
            System.out.println("Redmi Button Clicked");
            new RedmiFrame();
            this.setVisible(false);
        });
        // Creating Comnapany Button------------------

        // Creating MainPanel==================
        JPanel mainJPanel = new JPanel();
        mainJPanel.setLayout(null);
        mainJPanel.setBackground(Color.LIGHT_GRAY);
        mainJPanel.setBounds(5, 150, 820, 350);

        mainJPanel.add(appleButton);
        mainJPanel.add(samsungButton);
        mainJPanel.add(vivoButton);
        mainJPanel.add(redmiButton);
        //mainJPanel.add(comboBox);

        // Creating MainPanel==================

        this.setSize(850,650);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Arpit Mobile Shop");

        this.add(navBar);
        this.add(textPanel);
        this.add(mainJPanel);
        this.setVisible(true);
    }
}
