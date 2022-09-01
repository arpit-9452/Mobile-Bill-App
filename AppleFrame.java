import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class AppleFrame extends JFrame {
    AppleFrame(){
        Font newfont = new Font("ROBOTO",Font.BOLD,22);
        Font font = new Font("ROBOTO",Font.BOLD,28);
        Font regularfont = new Font("ROBOTO",Font.BOLD,18);

        // Creating NavPanel=============================
        JLabel navLabel = new JLabel();
        navLabel.setText("Apple Retail Area");
        navLabel.setForeground(Color.WHITE);
        navLabel.setFont(font);
        navLabel.setBounds(240, 5, 250, 50);

        JPanel navPanel = new JPanel();
        navPanel.setLayout(null);
        navPanel.setBackground(Color.RED);
        navPanel.setBounds(0, 2, 840, 60);
        navPanel.add(navLabel);
        // Creating NavPanel=============================

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

        // Main Panel================================

        // Phones Button=======================
        JButton iphone6s = new JButton();
        iphone6s.setLayout(null);
        iphone6s.setText("I Phone 6s");
        iphone6s.setBounds(20, 20, 380, 60);
        iphone6s.setBackground(Color.BLUE);
        iphone6s.setForeground(Color.WHITE);
        iphone6s.setFont(newfont);

        iphone6s.addActionListener((e)->{
            
            System.out.println("I phone 6s Button clicked..");
            double iphone6sPrice = 42675;
            double taxOnIphone6s = 16;
            double totalPriceIphone6s = iphone6sPrice*taxOnIphone6s/100+iphone6sPrice;
            String totalPriceIphone6sStr = Double.toString(totalPriceIphone6s);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"I Phone 6s 32GB White Color"+"\n"+"\n"
            +" Country of Origin: "+" U.S.A"+"\n"+"\n"
            +" Base Price of Product: "+" 42,675"+"\n"+"\n"
            +" Tax on Product: "+"   16%"+"\n"+"\n"
            +" Total Price of Product: "+totalPriceIphone6sStr+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );

        });

        JButton iphone6splus = new JButton();
        iphone6splus.setLayout(null);
        iphone6splus.setText("I Phone 6s Plus");
        iphone6splus.setBounds(20, 100, 380, 60);
        iphone6splus.setBackground(Color.BLUE);
        iphone6splus.setForeground(Color.WHITE);
        iphone6splus.setFont(newfont);

        iphone6splus.addActionListener((e)->{
            System.out.println("I phone 6s Plus Button clicked..");
            double iphone6splusPrice = 48675;
            double taxOnIphone6s = 17;
            double totalPriceIphone6s = iphone6splusPrice*taxOnIphone6s/100+iphone6splusPrice;
            String totalPriceIphone6splusStr = Double.toString(totalPriceIphone6s);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"I Phone 6s Plus 32GB White Color"+"\n"+"\n"
            +" Country of Origin: "+" U.S.A"+"\n"+"\n"
            +" Base Price of Product: "+" 48,675"+"\n"+"\n"
            +" Tax on Product: "+"   17%"+"\n"+"\n"
            +" Total Price of Product: "+totalPriceIphone6splusStr+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"

            );

        });

        JButton iphone7s = new JButton();
        iphone7s.setLayout(null);
        iphone7s.setText("I Phone 7s");
        iphone7s.setBounds(20, 180, 380, 60);
        iphone7s.setBackground(Color.BLUE);
        iphone7s.setForeground(Color.WHITE);
        iphone7s.setFont(newfont);

        iphone7s.addActionListener((e)->{
            System.out.println("I phone 7s Button clicked..");
            double iphone7sPrice = 53875;
            double taxOnIphone6s = 18;
            double totalPriceIphone6s = iphone7sPrice*taxOnIphone6s/100+iphone7sPrice;
            String iphone7sPriceStr = Double.toString(totalPriceIphone6s);

            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"I Phone 7s 32GB White Color"+"\n"+"\n"
            +" Country of Origin: "+" U.S.A"+"\n"+"\n"
            +" Base Price of Product: "+" 53,875"+"\n"+"\n"
            +" Tax on Product: "+"   18%"+"\n"+"\n"
            +" Total Price of Product: "+iphone7sPriceStr+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"

            );
        });

        JButton iphone7splus = new JButton();
        iphone7splus.setLayout(null);
        iphone7splus.setText("I Phone 7s Plus");
        iphone7splus.setBounds(20, 260, 380, 60);
        iphone7splus.setBackground(Color.BLUE);
        iphone7splus.setForeground(Color.WHITE);
        iphone7splus.setFont(newfont);

        iphone7splus.addActionListener((e)->{
            System.out.println("I phone 7s Plus Button clicked..");
            double iphone7sPlusPrice = 59875;
            double taxOnIphone6s = 19;
            double totalPriceIphone6s = iphone7sPlusPrice*taxOnIphone6s/100+iphone7sPlusPrice;
            String  iphone7sPlusPriceStr = Double.toString(totalPriceIphone6s);

            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"I Phone 7s Plus 32GB White Color"+"\n"+"\n"
            +" Country of Origin: "+" U.S.A"+"\n"+"\n"
            +" Base Price of Product: "+" 59,875"+"\n"+"\n"
            +" Tax on Product: "+"   19%"+"\n"+"\n"
            +" Total Price of Product: "+iphone7sPlusPriceStr+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"

            );
        });

        JButton iphone8s = new JButton();
        iphone8s.setLayout(null);
        iphone8s.setText("I Phone 8s ");
        iphone8s.setBounds(20, 340, 380, 60);
        iphone8s.setBackground(Color.BLUE);
        iphone8s.setForeground(Color.WHITE);
        iphone8s.setFont(newfont);

        iphone8s.addActionListener((e)->{

            System.out.println("I phone 8s Button clicked..");
            double iphone8sPrice = 63375;
            double taxOnIphone8s = 21;
            double totalPriceIphone6s = iphone8sPrice*taxOnIphone8s/100+iphone8sPrice;
            String iphone8sPriceStr = Double.toString(totalPriceIphone6s);

            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"I Phone 8s 32GB White Color"+"\n"+"\n"
            +" Country of Origin: "+" U.S.A"+"\n"+"\n"
            +" Base Price of Product: "+" 63,375"+"\n"+"\n"
            +" Tax on Product: "+"   21%"+"\n"+"\n"
            +" Total Price of Product: "+iphone8sPriceStr+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"

            );

        });

        JButton iphone8splus = new JButton();
        iphone8splus.setLayout(null);
        iphone8splus.setText("I Phone 8s Plus ");
        iphone8splus.setBounds(20, 415, 380, 60);
        iphone8splus.setBackground(Color.BLUE);
        iphone8splus.setForeground(Color.WHITE);
        iphone8splus.setFont(newfont);

        iphone8splus.addActionListener((e)->{
            System.out.println("I phone 8s Plus Button clicked..");
            double iphone8splusPrice = 69975;
            double taxOnIphone8splus = 23;
            double totalPriceIphone6s = iphone8splusPrice*taxOnIphone8splus/100+iphone8splusPrice;
            String iphone8splusPriceStr = Double.toString(totalPriceIphone6s);

            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"I Phone 8s Plus 32GB White Color"+"\n"+"\n"
            +" Country of Origin: "+" U.S.A"+"\n"+"\n"
            +" Base Price of Product: "+" 69,975"+"\n"+"\n"
            +" Tax on Product: "+"   23%"+"\n"+"\n"
            +" Total Price of Product: "+iphone8splusPriceStr+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"

            );
        });
        // Phones Button=======================

        JPanel mainJPanel = new JPanel();
        mainJPanel.setLayout(null);
        mainJPanel.setBackground(Color.LIGHT_GRAY);
        mainJPanel.setBounds(5, 70, 420, 480);
        mainJPanel.add(iphone6s);
        mainJPanel.add(iphone6splus);
        mainJPanel.add(iphone7s);
        mainJPanel.add(iphone7splus);
        mainJPanel.add(iphone8s);
        mainJPanel.add(iphone8splus);
        // Main Panel================================

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
        this.setTitle("Apple Mobiles");

        this.add(backButton);
        this.add(navPanel);
        this.add(mainJPanel);
        this.add(billPanel);
        this.setVisible(true);
    }
}
