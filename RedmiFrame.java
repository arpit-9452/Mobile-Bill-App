import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class RedmiFrame extends JFrame {
    RedmiFrame(){

        Font newfont = new Font("ROBOTO",Font.BOLD,22);
        Font font = new Font("ROBOTO",Font.BOLD,28);
        Font regularfont = new Font("ROBOTO",Font.BOLD,18);

         // Bill Panel
         JTextArea billTextArea = new JTextArea();
         billTextArea.setLayout(null);
         billTextArea.setFont(regularfont);
         billTextArea.setBounds(5, 5, 390, 470);
 
         JPanel billPanel = new JPanel();
         billPanel.setLayout(null);
         billPanel.setBackground(Color.LIGHT_GRAY);
         billPanel.setBounds(430, 70, 400, 480);
         billPanel.add(billTextArea);
         // Bill Panel

        // Main Panel============
        // Creating Bill Panel=======================
        JButton redmiNote4 = new JButton();
        redmiNote4.setLayout(null);
        redmiNote4.setText("Redmi Note 4");
        redmiNote4.setBounds(20, 20, 380, 60);
        redmiNote4.setBackground(Color.BLUE);
        redmiNote4.setForeground(Color.WHITE);
        redmiNote4.setFont(newfont);

        redmiNote4.addActionListener((e)->{

            System.out.println("Note 4 button clicked..");
            double redmiNote4Price = 15675;
            double taxOnRedmiNote4 = 12;
            double totalPriceRedmiNote4 = redmiNote4Price*taxOnRedmiNote4/100+redmiNote4Price;
            String totalPriceRedmiNote4Str = Double.toString(totalPriceRedmiNote4);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Redmi Note 4 Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 15,675"+"\n"+"\n"
            +" Tax on Product: "+"   12%"+"\n"+"\n"
            +" Total Price of Product: "+totalPriceRedmiNote4Str+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );

        });

        JButton redmiNote5 = new JButton();
        redmiNote5.setLayout(null);
        redmiNote5.setText("Redmi Note 5");
        redmiNote5.setBounds(20, 100, 380, 60);
        redmiNote5.setBackground(Color.BLUE);
        redmiNote5.setForeground(Color.WHITE);
        redmiNote5.setFont(newfont);

        redmiNote5.addActionListener((e)->{

            System.out.println("Note 5 button clicked..");
            double redmiNote5Price = 16675;
            double taxOnRedmiNote5 = 13;
            double totalPriceRedmiNote4 = redmiNote5Price*taxOnRedmiNote5/100+redmiNote5Price;
            String totalPriceRedmiNote5Str = Double.toString(totalPriceRedmiNote4);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Redmi Note 5 Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 16,675"+"\n"+"\n"
            +" Tax on Product: "+"   13%"+"\n"+"\n"
            +" Total Price of Product: "+totalPriceRedmiNote5Str+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );
        });

        JButton redmiNote6 = new JButton();
        redmiNote6.setLayout(null);
        redmiNote6.setText("Redmi Note 6");
        redmiNote6.setBounds(20, 180, 380, 60);
        redmiNote6.setBackground(Color.BLUE);
        redmiNote6.setForeground(Color.WHITE);
        redmiNote6.setFont(newfont);

        redmiNote6.addActionListener((e)->{

            System.out.println("Note 6 button clicked..");
            double redmiNote6Price = 17675;
            double taxOnRedmiNote6 = 14;
            double totalPriceRedmiNote4 = redmiNote6Price*taxOnRedmiNote6/100+redmiNote6Price;
            String totalPriceRedmiNote6Str = Double.toString(totalPriceRedmiNote4);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Redmi Note 6 Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 17,675"+"\n"+"\n"
            +" Tax on Product: "+"   14%"+"\n"+"\n"
            +" Total Price of Product: "+totalPriceRedmiNote6Str+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );
        });

        JButton redmiNote7 = new JButton();
        redmiNote7.setLayout(null);
        redmiNote7.setText("Redmi Note 7");
        redmiNote7.setBounds(20, 260, 380, 60);
        redmiNote7.setBackground(Color.BLUE);
        redmiNote7.setForeground(Color.WHITE);
        redmiNote7.setFont(newfont);

        redmiNote7.addActionListener((e)->{
            System.out.println("Note 7 button clicked..");
            double redmiNote7Price = 19875;
            double taxOnRedmiNote7 = 15;
            double totalPriceRedmiNote4 = redmiNote7Price*taxOnRedmiNote7/100+redmiNote7Price;
            String totalPriceRedmiNote7Str = Double.toString(totalPriceRedmiNote4);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Redmi Note 7 Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 19,675"+"\n"+"\n"
            +" Tax on Product: "+"   15%"+"\n"+"\n"
            +" Total Price of Product: "+totalPriceRedmiNote7Str+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );
        });

        JButton redmiNote8 = new JButton();
        redmiNote8.setLayout(null);
        redmiNote8.setText("Redmi Note 8");
        redmiNote8.setBounds(20, 360, 380, 60);
        redmiNote8.setBackground(Color.BLUE);
        redmiNote8.setForeground(Color.WHITE);
        redmiNote8.setFont(newfont);

        redmiNote8.addActionListener((e)->{

            System.out.println("Note 8 button clicked..");
            double redmiNote8Price = 22275;
            double taxOnRedmiNote8 = 17;
            double totalPriceRedmiNote4 = redmiNote8Price*taxOnRedmiNote8/100+redmiNote8Price;
            String totalPriceRedmiNote8Str = Double.toString(totalPriceRedmiNote4);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Redmi Note 8 Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 22,275"+"\n"+"\n"
            +" Tax on Product: "+"   17%"+"\n"+"\n"
            +" Total Price of Product: "+totalPriceRedmiNote8Str+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );
        });

        JButton redmiNote9 = new JButton();
        redmiNote9.setLayout(null);
        redmiNote9.setText("Redmi Note 9");
        redmiNote9.setBounds(20, 410, 380, 60);
        redmiNote9.setBackground(Color.BLUE);
        redmiNote9.setForeground(Color.WHITE);
        redmiNote9.setFont(newfont);

        redmiNote9.addActionListener((e)->{
            System.out.println("Note 9 button clicked..");
            double redmiNote9Price = 24275;
            double taxOnRedmiNote9 = 19;
            double totalPriceRedmiNote4 = redmiNote9Price*taxOnRedmiNote9/100+redmiNote9Price;
            String totalPriceRedmiNote9Str = Double.toString(totalPriceRedmiNote4);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Redmi Note 9 Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 24,275"+"\n"+"\n"
            +" Tax on Product: "+"   19%"+"\n"+"\n"
            +" Total Price of Product: "+totalPriceRedmiNote9Str+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );
        });
        

        JPanel mainJPanel = new JPanel();
        mainJPanel.setLayout(null);
        mainJPanel.setBackground(Color.LIGHT_GRAY);
        mainJPanel.setBounds(5, 70, 420, 480);
        mainJPanel.add(redmiNote4);
        mainJPanel.add(redmiNote5);
        mainJPanel.add(redmiNote6);
        mainJPanel.add(redmiNote7);
        mainJPanel.add(redmiNote8);
        mainJPanel.add(redmiNote8);
    
        // Main Panel============

         // Creating NavPanel=============================
         JLabel navLabel = new JLabel();
         navLabel.setText("Vivo Retail Area");
         navLabel.setForeground(Color.WHITE);
         navLabel.setFont(font);
         navLabel.setBounds(240, 5, 300, 50);
 
         JPanel navPanel = new JPanel();
         navPanel.setLayout(null);
         navPanel.setBackground(Color.RED);
         navPanel.setBounds(0, 2, 840, 60);
         navPanel.add(navLabel);
         // Creating NavPanel=============================

        JButton backButton = new JButton();
        backButton.setText("Return");
        backButton.setLayout(null);
        backButton.setFont(newfont);
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.RED);
        backButton.setBounds(0, 570, 200, 40);
        backButton.addActionListener((e)->{
            new MainFrame();
            this.setVisible(false);
        });

        this.setSize(850,650);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.GRAY);;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Redmi Mobiles");

        this.add(backButton);
        this.add(navPanel);
        this.add(mainJPanel);
        this.add(billPanel);
        this.setVisible(true);
    }
}
