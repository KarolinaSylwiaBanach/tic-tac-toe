import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ticTacToe {
    private JButton p1;
    private JPanel panel1;
    private JButton p4;
    private JButton p7;
    private JButton p2;
    private JButton p5;
    private JButton p8;
    private JButton replayButton;
    private JButton cleanButton;
    private JLabel miniTurn;
    private JLabel turnLable;
    private JButton p3;
    private JButton p6;
    private JButton p9;
    private JLabel pointsX;
    private JLabel pointsY;
    ImageIcon xIcon = new ImageIcon("xBig.png");
    ImageIcon yIcon = new ImageIcon("xBig.png");
    ImageIcon xMini = new ImageIcon("xSmall.png");



    public ticTacToe() {
        p1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.setIcon(xIcon);
                miniTurn.setIcon(xMini);
            }});
        p4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }});
        p7.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }});
        p2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }});
        p5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }});
        p8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }});
        p9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }});
        p6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }});
        p3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }});

        replayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cleanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("tic-tac-toe");
        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setContentPane(new ticTacToe().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
