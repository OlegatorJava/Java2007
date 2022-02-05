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

        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);

        JButton decrementButton10 = new JButton("<<");
        decrementButton10.setFont(font);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);

        JButton incrementButton10 = new JButton(">>");
        incrementButton10.setFont(font);

        setLayout(new GridLayout(1, 5));
        add(decrementButton10);
        add(decrementButton);
        add(counterValueView);
        add(incrementButton);
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
