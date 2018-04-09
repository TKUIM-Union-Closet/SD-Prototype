import java.awt.*;
import javax.swing.*;

public class Prototype { 
    public static void main(String[] args) { 
        JFrame category = new JFrame();
        category.setExtendedState(JFrame.MAXIMIZED_BOTH);
        category.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        category.getContentPane().setLayout(new GridLayout(4,2));
        Button button1 = new Button("廖冠霖");
        Button button2 = new Button("呂舒喬");
        Button button3 = new Button("徐禎廷");
        Button button4 = new Button("孫偉碩");
        Button button5 = new Button("凌欣恩");
        Button button6 = new Button("黃律鈞");
        Button button7 = new Button("廖秋旻");
                
        
        category.add(button1);
        category.add(button2);
        category.add(button3);
        category.add(button4);
        category.add(button5);
        category.add(button6);
        category.add(button7);
        
        button1.addActionListener(new videolist1());
        button2.addActionListener(new videolist2());
        button3.addActionListener(new videolist3());
        button4.addActionListener(new videolist4());
        button5.addActionListener(new videolist5());
        button6.addActionListener(new videolist6());
        button7.addActionListener(new videolist7());
//123
        ////angela sorry
        
        category.setVisible(true);
    }
    
    
}