import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PlayerPanel extends JPanel {

    JLabel[][] PlayerLabelBoard = new JLabel[6][6];

    public PlayerPanel(){
        this.setLayout(new GridLayout(6,6));
        PlayerLabelBoard[2][2] = new JLabel("player 1");
        PlayerLabelBoard[2][2].setOpaque(false);
        this.add(PlayerLabelBoard[2][2]);
       /* for (int row = 0; row < 6; row ++) {
            for (int col = 0; col < 6; col ++) {
                this.setLayout(new GridLayout(6, 6));*/
                /*PlayerLabelBoard[row][col] = new JLabel("player");
                this.add(PlayerLabelBoard[row][col]);
                PlayerLabelBoard[row][col].setOpaque(true);
                PlayerLabelBoard[row][col].setPreferredSize(new Dimension(75, 25));
            }
        }
    }

    /*public void paintComponent (Graphics g) {
    *   super.paintComponent(g);
        setForeground(Color.BLUE);
        setForeground(new Color(0,0,0));
        g.drawOval(25,35,25,25);
        }
                 */

     }
}
