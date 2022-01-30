package Course1.lesson8;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWork8 extends JFrame {
    private int value;

    public HomeWork8(int initialValue) {
        setTitle("Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 510, 140);
        Font font = new Font("Arial", Font.BOLD, 32);

        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        counterValueView.setBounds(200,0,100,100);
        add(counterValueView);

        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        setLayout(null);

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        decrementButton.setBounds(100,0,100,100);
        add(decrementButton);

        JButton decrementButton10 = new JButton("<<");
        decrementButton10.setFont(font);
        decrementButton10.setBounds(0,0,100,100);
        add(decrementButton10);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        incrementButton.setBounds(300,0,100,100);
        add(incrementButton);

        JButton incrementButton10 = new JButton(">>");
        incrementButton10.setFont(font);
        incrementButton10.setBounds(400,0,100,100);
        add(incrementButton10);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });

        decrementButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value-=10;
                counterValueView.setText(String.valueOf(value));
            }
        });

        incrementButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value+=10;
                counterValueView.setText(String.valueOf(value));
            }
        });


        setVisible(true);
    }



    public static void main(String[] args) {
        new HomeWork8(0);
    }

}
