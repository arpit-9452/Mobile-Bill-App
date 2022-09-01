import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class SamsungFrame extends JFrame {
    SamsungFrame(){

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
         
        // MainPanel=====================
        //Creating Buttons==============
        JButton samsungS6 = new JButton();
        samsungS6.setLayout(null);
        samsungS6.setText("Samsung S 6");
        samsungS6.setBounds(20, 20, 380, 60);
        samsungS6.setBackground(Color.BLUE);
        samsungS6.setForeground(Color.WHITE);
        samsungS6.setFont(newfont);

        samsungS6.addActionListener((e)->{

            System.out.println("Samsung S6 Button clicked..");
            double samsungS6Price = 35675;
            double taxOnSamsungS6 = 16;
            double totalPriceIphone6s = samsungS6Price*taxOnSamsungS6/100+samsungS6Price;
            String totalsamsungS6PriceStr = Double.toString(totalPriceIphone6s);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Samsung 6S Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 35,675"+"\n"+"\n"
            +" Tax on Product: "+"   16%"+"\n"+"\n"
            +" Total Price of Product: "+totalsamsungS6PriceStr+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );

        });

        JButton samsungS6Plus = new JButton();
        samsungS6Plus.setLayout(null);
        samsungS6Plus.setText("Samsung S 6 Plus");
        samsungS6Plus.setBounds(20, 100, 380, 60);
        samsungS6Plus.setBackground(Color.BLUE);
        samsungS6Plus.setForeground(Color.WHITE);
        samsungS6Plus.setFont(newfont);

        samsungS6Plus.addActionListener((e)->{

            System.out.println("Samsung S6 Plus Button clicked..");
            double samsungS6PlusPrice = 42875;
            double taxOnSamsungS6Plus = 16;
            double totalPriceIphone6s = samsungS6PlusPrice*taxOnSamsungS6Plus/100+samsungS6PlusPrice;
            String totalsamsungS6PlusPriceStr = Double.toString(totalPriceIphone6s);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Samsung 6S Plus Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 42,875"+"\n"+"\n"
            +" Tax on Product: "+"   16%"+"\n"+"\n"
            +" Total Price of Product: "+totalsamsungS6PlusPriceStr+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );
        });

        JButton samsungS7s = new JButton();
        samsungS7s.setLayout(null);
        samsungS7s.setText("Samsung S 7S");
        samsungS7s.setBounds(20, 180, 380, 60);
        samsungS7s.setBackground(Color.BLUE);
        samsungS7s.setForeground(Color.WHITE);
        samsungS7s.setFont(newfont);

        samsungS7s.addActionListener((e)->{

            System.out.println("Samsung S7 Button clicked..");
            double samsungS7sPrice = 46335;
            double taxOnSamsungS7s = 18;
            double totalPriceIphone6s = samsungS7sPrice*taxOnSamsungS7s/100+samsungS7sPrice;
            String totalsamsungS7sPriceStr = Double.toString(totalPriceIphone6s);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Samsung 7S Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 46,335"+"\n"+"\n"
            +" Tax on Product: "+"   16%"+"\n"+"\n"
            +" Total Price of Product: "+totalsamsungS7sPriceStr+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );
        });

        JButton samsungS7sPLus = new JButton();
        samsungS7sPLus.setLayout(null);
        samsungS7sPLus.setText("Samsung S 7S Plus");
        samsungS7sPLus.setBounds(20, 260, 380, 60);
        samsungS7sPLus.setBackground(Color.BLUE);
        samsungS7sPLus.setForeground(Color.WHITE);
        samsungS7sPLus.setFont(newfont);

        samsungS7sPLus.addActionListener((e)->{
            System.out.println("Samsung S7 plus Button clicked..");
            double samsungS7sPLusPrice = 52335;
            double taxOnSamsungS7s = 20;
            double totalPriceIphone6s = samsungS7sPLusPrice*taxOnSamsungS7s/100+samsungS7sPLusPrice;
            String samsungS7sPLusPricePriceStr = Double.toString(totalPriceIphone6s);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Samsung 7S Plus Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 52,335"+"\n"+"\n"
            +" Tax on Product: "+"   20%"+"\n"+"\n"
            +" Total Price of Product: "+samsungS7sPLusPricePriceStr+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );
        });

        JButton samsungS8s = new JButton();
        samsungS8s.setLayout(null);
        samsungS8s.setText("Samsung S 8S");
        samsungS8s.setBounds(20, 340, 380, 60);
        samsungS8s.setBackground(Color.BLUE);
        samsungS8s.setForeground(Color.WHITE);
        samsungS8s.setFont(newfont);

        samsungS8s.addActionListener((e)->{
            System.out.println("Samsung S8 Button clicked..");
            double samsungS8sPrice = 59335;
            double taxOnSamsungS8s = 23;
            double totalPriceIphone6s = samsungS8sPrice*taxOnSamsungS8s/100+samsungS8sPrice;
            String samsungS8sPriceeStr = Double.toString(totalPriceIphone6s);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Samsung S8 Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 59,335"+"\n"+"\n"
            +" Tax on Product: "+"   23%"+"\n"+"\n"
            +" Total Price of Product: "+samsungS8sPriceeStr+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );
        });

        JButton samsungS8slus = new JButton();
        samsungS8slus.setLayout(null);
        samsungS8slus.setText("Samsung S 8S PLus");
        samsungS8slus.setBounds(20, 410, 380, 60);
        samsungS8slus.setBackground(Color.BLUE);
        samsungS8slus.setForeground(Color.WHITE);
        samsungS8slus.setFont(newfont);

        samsungS8slus.addActionListener((e)->{
            System.out.println("Samsung S8 plus Button clicked..");
            double samsungS8sPlusPrice = 64335;
            double taxOnSamsungS8s = 26;
            double totalPriceIphone6s = samsungS8sPlusPrice*taxOnSamsungS8s/100+samsungS8sPlusPrice;
            String samsungS8sPlusPriceStr = Double.toString(totalPriceIphone6s);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Samsung S8 Plus Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 64,335"+"\n"+"\n"
            +" Tax on Product: "+"   26%"+"\n"+"\n"
            +" Total Price of Product: "+samsungS8sPlusPriceStr+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );
        });
        //Creating Buttons==============

        JPanel mainJPanel = new JPanel();
        mainJPanel.setLayout(null);
        mainJPanel.setBackground(Color.LIGHT_GRAY);
        mainJPanel.setBounds(5, 70, 420, 480);
        mainJPanel.add(samsungS6);
        mainJPanel.add(samsungS6Plus);
        mainJPanel.add(samsungS7s);
        mainJPanel.add(samsungS7sPLus);
        mainJPanel.add(samsungS8s);
        mainJPanel.add(samsungS8slus);
        // MainPanel=====================

         // Creating NavPanel=============================
         JLabel navLabel = new JLabel();
         navLabel.setText("Samsung Retail Area");
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
        this.getContentPane().setBackground(Color.GRAY);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Samsung Mobiles");

        this.add(navPanel);
        this.add(backButton);
        this.add(mainJPanel);
        this.add(billPanel);
        this.setVisible(true);
    }
}
