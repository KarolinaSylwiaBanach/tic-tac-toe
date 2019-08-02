import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ticTacToe {
    private JPanel panel1;
    private JButton p1;
    private JButton p4;
    private JButton p7;
    private JButton p2;
    private JButton p5;
    private JButton p8;
    private JButton p3;
    private JButton p6;
    private JButton p9;
    private JButton replayButton;
    private JButton cleanButton;
    private JLabel miniTurn;
    private JLabel turnLable;
    private JLabel pointsX;
    private JLabel pointsO;
    private ImageIcon xIcon = new ImageIcon("resources/image/xBig.png");
    private ImageIcon oIcon = new ImageIcon("resources/image/oBig.png");
    private ImageIcon xMini = new ImageIcon("resources/image/xSmall.png");
    private ImageIcon oMini = new ImageIcon("resources/image/oSmall.png");
    private char p01='0', p02='0', p03='0', p04='0', p05='0', p06='0', p07='0', p08='0', p09='0', turn='x';
    private int points='0';


    public ticTacToe() {
        miniTurn.setIcon(xMini);
        replayButton.setEnabled(false);
        cleanButton.setEnabled(false);
        p1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn=='x'){
                    p1.setIcon(xIcon);
                    p01='x';
                    miniTurn.setIcon(oMini);
                    turn='o';
                }else if(turn == 'o'){
                    p1.setIcon(oIcon);
                    p01='o';
                    miniTurn.setIcon(xMini);
                    turn='x';
                }
                p1.setEnabled(false);
                checkWin();
            }});
        p4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(turn=='x'){
                        p4.setIcon(xIcon);
                        p04='x';
                        miniTurn.setIcon(oMini);
                        turn='o';
                    }else if(turn == 'o'){
                        p4.setIcon(oIcon);
                        p04='o';
                        miniTurn.setIcon(xMini);
                        turn='x';
                    }
                    p4.setEnabled(false);
                    checkWin();
                }});
        p7.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(turn=='x'){
                            p7.setIcon(xIcon);
                            p07='x';
                            miniTurn.setIcon(oMini);
                            turn='o';
                        }else if(turn == 'o'){
                            p7.setIcon(oIcon);
                            p07='o';
                            miniTurn.setIcon(xMini);
                            turn='x';
                        }
                        p7.setEnabled(false);
                        checkWin();
                    }});
        p2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if(turn=='x'){
                                p2.setIcon(xIcon);
                                p02='x';
                                miniTurn.setIcon(oMini);
                                turn='o';
                            }else if(turn == 'o'){
                                p2.setIcon(oIcon);
                                p02='o';
                                miniTurn.setIcon(xMini);
                                turn='x';
                            }
                            p2.setEnabled(false);
                            checkWin();
                        }});
        p5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn=='x'){
                    p5.setIcon(xIcon);
                    p05='x';
                    miniTurn.setIcon(oMini);
                    turn='o';
                }else if(turn == 'o'){
                    p5.setIcon(oIcon);
                    p05='o';
                    miniTurn.setIcon(xMini);
                    turn='x';
                }
                p5.setEnabled(false);
                checkWin();
            }});
        p8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn=='x'){
                    p8.setIcon(xIcon);
                    p08='x';
                    miniTurn.setIcon(oMini);
                    turn='o';
                }else if(turn == 'o'){
                    p8.setIcon(oIcon);
                    p08='o';
                    miniTurn.setIcon(xMini);
                    turn='x';
                }
                p8.setEnabled(false);
                checkWin();
            }});
        p9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn=='x'){
                    p9.setIcon(xIcon);
                    p09='x';
                    miniTurn.setIcon(oMini);
                    turn='o';
                }else if(turn == 'o'){
                    p9.setIcon(oIcon);
                    p09='o';
                    miniTurn.setIcon(xMini);
                    turn='x';
                }
                p9.setEnabled(false);
                checkWin();
            }});
        p6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(turn=='x'){
                        p6.setIcon(xIcon);
                        p06='x';
                        miniTurn.setIcon(oMini);
                        turn='o';
                    }else if(turn == 'o'){
                        p6.setIcon(oIcon);
                        p06='o';
                        miniTurn.setIcon(xMini);
                        turn='x';
                    }
                    p6.setEnabled(false);
                    checkWin();
                }});
        p3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn=='x'){
                    p3.setIcon(xIcon);
                    p03='x';
                    miniTurn.setIcon(oMini);
                    turn='o';
                }else if(turn == 'o'){
                    p3.setIcon(oIcon);
                    p03='o';
                    miniTurn.setIcon(xMini);
                    turn='x';
                }
                p3.setEnabled(false);
                checkWin();
            }});

        replayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                replay();
            }
        });
        cleanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                replay();
                pointsO.setText("0");
                pointsX.setText("0");
            }
        });
    }
    public void replay(){
        p1.setEnabled(true);
        p2.setEnabled(true);
        p3.setEnabled(true);
        p4.setEnabled(true);
        p5.setEnabled(true);
        p6.setEnabled(true);
        p7.setEnabled(true);
        p8.setEnabled(true);
        p9.setEnabled(true);
        p1.setIcon(null);
        p2.setIcon(null);
        p3.setIcon(null);
        p4.setIcon(null);
        p5.setIcon(null);
        p6.setIcon(null);
        p7.setIcon(null);
        p8.setIcon(null);
        p9.setIcon(null);
        replayButton.setEnabled(false);
        cleanButton.setEnabled(false);
        miniTurn.setIcon(xMini);
        p01='0';
        p02='0';
        p03='0';
        p04='0';
        p05='0';
        p06='0';
        p07='0';
        p08='0';
        p09='0';
    }

    public void turnOffInfield(){
        p1.setEnabled(false);
        p2.setEnabled(false);
        p3.setEnabled(false);
        p4.setEnabled(false);
        p5.setEnabled(false);
        p6.setEnabled(false);
        p7.setEnabled(false);
        p8.setEnabled(false);
        p9.setEnabled(false);
        replayButton.setEnabled(true);
        cleanButton.setEnabled(true);
    }
    public void checkWin(){
        if((p01=='x'&&p02=='x'&&p03=='x')||(p04=='x'&&p05=='x'&&p06=='x')||(p07=='x'&&p08=='x'&&p09=='x')||
           (p01=='x'&&p04=='x'&&p07=='x')||(p02=='x'&&p05=='x'&&p08=='x')||(p03=='x'&&p06=='x'&&p09=='x')||
           (p01=='x'&&p05=='x'&&p09=='x')||(p03=='x'&&p05=='x'&&p09=='x')){
            points=Integer.valueOf(pointsX.getText());
            pointsX.setText(String.valueOf(points+1));
            turnOffInfield();
        }
        else if((p01=='o'&&p02=='o'&&p03=='o')||(p04=='o'&&p05=='o'&&p06=='o')||(p07=='o'&&p08=='o'&&p09=='o')||
                (p01=='o'&&p04=='o'&&p07=='o')||(p02=='o'&&p05=='o'&&p08=='o')||(p03=='o'&&p06=='o'&&p09=='o')||
                (p01=='o'&&p05=='o'&&p09=='o')||(p03=='o'&&p05=='o'&&p09=='o')){
            points=Integer.valueOf(pointsO.getText());
            pointsO.setText(String.valueOf(points+1));
            turnOffInfield();
        }
        else if(p01!='0'&&p02!='0'&&p03!='0'&&p04!='0'&&p05!='0'&&p06!='0'&&p07!='0'&&p08!='0'&&p09!='0'){
            replayButton.setEnabled(true);
            cleanButton.setEnabled(true);
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("tic-tac-toe");
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int size = 800;
        int width = (dimension.width- size) /2;
        int height = (dimension.height- size) /2;
        frame.setBounds(width,height,size, size);
        frame.setResizable(false);
        frame.setContentPane(new ticTacToe().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
