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
    private JLabel pointsO;
    ImageIcon xIcon = new ImageIcon("xBig.png");
    ImageIcon oIcon = new ImageIcon("xBig.png");
    ImageIcon xMini = new ImageIcon("xSmall.png");
    ImageIcon oMini = new ImageIcon("xSmall.png");
    int p01=0, p02=0, p03=0, p04=0, p05=0, p06=0, p07=0, p08=0, p09=0, points=0;



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

    public void checkWin(){
        if((p01==1&&p02==1&&p03==1)||(p04==1&&p05==1&&p06==1)||(p07==1&&p08==1&&p09==1)||
           (p01==1&&p04==1&&p07==1)||(p02==1&&p05==1&&p08==1)||(p03==1&&p06==1&&p09==1)||
           (p01==1&&p05==1&&p09==1)||(p03==1&&p05==1&&p09==1)){
            points=Integer.valueOf(pointsX.getText());
            pointsX.setText(String.valueOf(points+1));
        }
        else if((p01==2&&p02==2&&p03==2)||(p04==2&&p05==2&&p06==2)||(p07==2&&p08==2&&p09==2)||
                (p01==2&&p04==2&&p07==2)||(p02==2&&p05==2&&p08==2)||(p03==2&&p06==2&&p09==2)||
                (p01==2&&p05==2&&p09==2)||(p03==2&&p05==2&&p09==2)){
            points=Integer.valueOf(pointsO.getText());
            pointsO.setText(String.valueOf(points+1));
        }

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
