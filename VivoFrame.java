import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.Font;

public class VivoFrame extends JFrame {
    VivoFrame(){

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

        //Main Panel===============
        // Creating Buttons=-================
        JButton vivoV12 = new JButton();
        vivoV12.setLayout(null);
        vivoV12.setText("Vivo V 12");
        vivoV12.setBounds(20, 20, 380, 60);
        vivoV12.setBackground(Color.BLUE);
        vivoV12.setForeground(Color.WHITE);
        vivoV12.setFont(newfont);

        vivoV12.addActionListener((e)->{

            System.out.println("Vivo V12 Button clicked..");
            double vivoV12Price = 25675;
            double taxOnvivoV12 = 12;
            double totalPriceIphone6s = vivoV12Price*taxOnvivoV12/100+vivoV12Price;
            String totalPriceVivoV12Str = Double.toString(totalPriceIphone6s);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Vivo V12 Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 25,675"+"\n"+"\n"
            +" Tax on Product: "+"   12%"+"\n"+"\n"
            +" Total Price of Product: "+totalPriceVivoV12Str+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );

        });

        JButton vivoV14 = new JButton();
        vivoV14.setLayout(null);
        vivoV14.setText("Vivo V 14");
        vivoV14.setBounds(20, 100, 380, 60);
        vivoV14.setBackground(Color.BLUE);
        vivoV14.setForeground(Color.WHITE);
        vivoV14.setFont(newfont);

        vivoV14.addActionListener((e)->{

            System.out.println("Vivo V14 Button clicked..");
            double vivoV14Price = 28675;
            double taxOnvivoV14 = 13;
            double totalPriceIphone6s = vivoV14Price*taxOnvivoV14/100+vivoV14Price;
            String totalPriceVivoV14Str = Double.toString(totalPriceIphone6s);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Vivo V14 Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 28,675"+"\n"+"\n"
            +" Tax on Product: "+"   13%"+"\n"+"\n"
            +" Total Price of Product: "+totalPriceVivoV14Str+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );
        });

        JButton vivoV16 = new JButton();
        vivoV16.setLayout(null);
        vivoV16.setText("Vivo V 16");
        vivoV16.setBounds(20, 180, 380, 60);
        vivoV16.setBackground(Color.BLUE);
        vivoV16.setForeground(Color.WHITE);
        vivoV16.setFont(newfont);

        vivoV16.addActionListener((e)->{

            System.out.println("Vivo V16 Button clicked..");
            double vivoV16Price = 31675;
            double taxOnvivoV16 = 14;
            double totalPriceIphone6s = vivoV16Price*taxOnvivoV16/100+vivoV16Price;
            String totalPriceVivoV16Str = Double.toString(totalPriceIphone6s);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Vivo V16 Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 31,675"+"\n"+"\n"
            +" Tax on Product: "+"   14%"+"\n"+"\n"
            +" Total Price of Product: "+totalPriceVivoV16Str+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );
        });

        JButton vivoV18 = new JButton();
        vivoV18.setLayout(null);
        vivoV18.setText("Vivo V 18");
        vivoV18.setBounds(20, 260, 380, 60);
        vivoV18.setBackground(Color.BLUE);
        vivoV18.setForeground(Color.WHITE);
        vivoV18.setFont(newfont);

        vivoV18.addActionListener((e)->{
            System.out.println("Vivo V18 Button clicked..");
            double vivoV18Price = 33675;
            double taxOnvivoV18 = 15;
            double totalPriceIphone6s = vivoV18Price*taxOnvivoV18/100+vivoV18Price;
            String totalPriceVivoV18Str = Double.toString(totalPriceIphone6s);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Vivo V18 Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 33,675"+"\n"+"\n"
            +" Tax on Product: "+"   15%"+"\n"+"\n"
            +" Total Price of Product: "+totalPriceVivoV18Str+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );

        });

        JButton vivoV20 = new JButton();
        vivoV20.setLayout(null);
        vivoV20.setText("Vivo V 20");
        vivoV20.setBounds(20, 340, 380, 60);
        vivoV20.setBackground(Color.BLUE);
        vivoV20.setForeground(Color.WHITE);
        vivoV20.setFont(newfont);

        vivoV20.addActionListener((e)->{

                System.out.println("Vivo V20 Button clicked..");
                double vivoV20Price = 35675;
                double taxOnvivoV18 = 17;
                double totalPriceIphone6s = vivoV20Price*taxOnvivoV18/100+vivoV20Price;
                String totalPriceVivoV20Str = Double.toString(totalPriceIphone6s);
                billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
                +" Mobile Name:  "+"Vivo V20 Black Color"+"\n"+"\n"
                +" Country of Origin: "+" Main in India"+"\n"+"\n"
                +" Base Price of Product: "+" 35,675"+"\n"+"\n"
                +" Tax on Product: "+"   17%"+"\n"+"\n"
                +" Total Price of Product: "+totalPriceVivoV20Str+"\n"+"\n"+"\n"
                +"                  Thank You For Purchase"
                );
        });

        JButton vivoV22 = new JButton();
        vivoV22.setLayout(null);
        vivoV22.setText("Vivo V 22");
        vivoV22.setBounds(20, 410, 380, 60);
        vivoV22.setBackground(Color.BLUE);
        vivoV22.setForeground(Color.WHITE);
        vivoV22.setFont(newfont);

        vivoV22.addActionListener((e)->{
            System.out.println("Vivo V22 Button clicked..");
            double vivoV22Price = 39675;
            double taxOnvivoV18 = 19;
            double totalPriceIphone6s = vivoV22Price*taxOnvivoV18/100+vivoV22Price;
            String totalPriceVivoV22Str = Double.toString(totalPriceIphone6s);
            billTextArea.setText("\n"+"                    Welcome to Bill Area"+"\n"+"\n"
            +" Mobile Name:  "+"Vivo V22 Black Color"+"\n"+"\n"
            +" Country of Origin: "+" Main in India"+"\n"+"\n"
            +" Base Price of Product: "+" 39,675"+"\n"+"\n"
            +" Tax on Product: "+"   19%"+"\n"+"\n"
            +" Total Price of Product: "+totalPriceVivoV22Str+"\n"+"\n"+"\n"
            +"                  Thank You For Purchase"
            );
        });

        // Creating Buttons=-================
        JPanel mainJPanel = new JPanel();
        mainJPanel.setLayout(null);
        mainJPanel.setBackground(Color.LIGHT_GRAY);
        mainJPanel.setBounds(5, 70, 420, 480);
        mainJPanel.add(vivoV12);
        mainJPanel.add(vivoV14);
        mainJPanel.add(vivoV16);
        mainJPanel.add(vivoV18);
        mainJPanel.add(vivoV20);
        mainJPanel.add(vivoV22);
        //Main Panel===============

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
        this.getContentPane().setBackground(Color.GRAY);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Vivo Mobiles");
        this.add(backButton);
        this.add(navPanel);
        this.add(mainJPanel);
        this.add(billPanel);
        this.setVisible(true);
    }
    
}
