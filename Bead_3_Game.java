

package bead_3.game;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Bead_3_Game extends javax.swing.JFrame {
    private String startgame = "X";
    private int xcount = 0;
    private int ocount = 0;
    private int[] array = {0,0,0,0,0,0,0,0,0,0};
    /**
     * Creates new form Bead_3_Game
     */
    public Bead_3_Game() {
        initComponents();
    }
    private void gameScore()
    {
    player111.setText(String.valueOf(xcount));
    player222.setText(String.valueOf(ocount));
    
    }
    private void choose_a_player(int x)
    {
        array[x] = 1;
    if(startgame.equalsIgnoreCase("X"))
    {
         startgame="0";
        }
    else
    {
        startgame="X";
        }
    }
    private void winningGame()
             
    {
        String b1 = textbtn1.getText();
        String b2 = textbtn2.getText();
        String b3 = textbtn3.getText();
        
        String b4 = textbtn4.getText();
        String b5 = textbtn5.getText();
        String b6 = textbtn6.getText();
           
        String b7 = textbtn7.getText();
        String b8 = textbtn8.getText();
        String b9 = textbtn9.getText();
        
        //PLAYER 1 CODING
         if(b1==("X")&& b2==("X")&& b3==("X"))
         {
           JOptionPane.showMessageDialog(this, "player 1 win","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
           xcount++;
           gameScore();
           textbtn1.setBackground(Color.yellow);
           textbtn2.setBackground(Color.yellow);
           textbtn3.setBackground(Color.yellow);
         }
          else if(b1==("0")&& b2==("0")&& b3==("0"))
         {
           JOptionPane.showMessageDialog(this, "player 2 win","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
           ocount++;
           gameScore();
           textbtn1.setBackground(Color.yellow);
           textbtn2.setBackground(Color.yellow);
           textbtn3.setBackground(Color.yellow);
         
         }
        
          if(b4==("X")&& b5==("X")&& b6==("X"))
         {
           JOptionPane.showMessageDialog(this, "player 1 win","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
           xcount++;
           gameScore();
           textbtn4.setBackground(Color.yellow);
           textbtn5.setBackground(Color.yellow);
           textbtn6.setBackground(Color.yellow);
         }
           if(b7==("X")&& b8==("X")&& b9==("X"))
         {
           JOptionPane.showMessageDialog(this, "player 1 win","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
           xcount++;
           gameScore();
           textbtn7.setBackground(Color.yellow);
           textbtn8.setBackground(Color.yellow);
           textbtn9.setBackground(Color.yellow);
         }
           if(b1==("X")&& b4==("X")&& b7==("X"))
         {
           JOptionPane.showMessageDialog(this, "player 1 win","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
           xcount++;
           gameScore();
           textbtn1.setBackground(Color.yellow);
           textbtn4.setBackground(Color.yellow);
           textbtn7.setBackground(Color.yellow);
         }
           if(b2==("X")&& b5==("X")&& b8==("X"))
         {
           JOptionPane.showMessageDialog(this, "player 1 win","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
           xcount++;
           gameScore();
           textbtn2.setBackground(Color.yellow);
           textbtn5.setBackground(Color.yellow);
           textbtn8.setBackground(Color.yellow);
         }
           if(b3==("X")&& b6==("X")&& b9==("X"))
         {
           JOptionPane.showMessageDialog(this, "player 1 win","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
           xcount++;
           gameScore();
           textbtn1.setBackground(Color.yellow);
           textbtn2.setBackground(Color.yellow);
           textbtn3.setBackground(Color.yellow);
         }
           if(b1==("X")&& b5==("X")&& b9==("X"))
         {
           JOptionPane.showMessageDialog(this, "player 1 win","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
           xcount++;
           gameScore();
           textbtn1.setBackground(Color.yellow);
           textbtn5.setBackground(Color.yellow);
           textbtn9.setBackground(Color.yellow);
         }
           if(b3==("X")&& b5==("X")&& b7==("X"))
         {
           JOptionPane.showMessageDialog(this, "player 1 win","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
           xcount++;
           gameScore();
           textbtn3.setBackground(Color.yellow);
           textbtn5.setBackground(Color.yellow);
           textbtn7.setBackground(Color.yellow);
         }
           //PLAYER 2 CODING
        
            if(b4==("0")&& b5==("0")&& b6==("0"))
         {
           JOptionPane.showMessageDialog(this, "player 2 win","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
           ocount++;
           gameScore();
           textbtn4.setBackground(Color.yellow);
           textbtn5.setBackground(Color.yellow);
           textbtn6.setBackground(Color.yellow);
         }
           else if(b7==("0")&& b8==("0")&& b9==("0"))
         {
           JOptionPane.showMessageDialog(this, "player 2 win","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
           ocount++;
           gameScore();
           textbtn7.setBackground(Color.yellow);
           textbtn8.setBackground(Color.yellow);
           textbtn9.setBackground(Color.yellow);
         }
           else if(b1==("0")&& b5==("0")&& b9==("0"))
         {
           JOptionPane.showMessageDialog(this, "player 2 win","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
           ocount++;
           gameScore();
           textbtn1.setBackground(Color.yellow);
           textbtn5.setBackground(Color.yellow);
           textbtn9.setBackground(Color.yellow);
         }
           else if(b3==("0")&& b5==("0")&& b7==("0"))
         {
           JOptionPane.showMessageDialog(this, "player 2 win","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
           ocount++;
           gameScore();
           textbtn3.setBackground(Color.yellow);
           textbtn5.setBackground(Color.yellow);
           textbtn7.setBackground(Color.yellow);
         }
              else if(b1==("0")&& b4==("0")&& b7==("0"))
         {
           JOptionPane.showMessageDialog(this, "player 2 win","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
           ocount++;
           gameScore();
           textbtn1.setBackground(Color.yellow);
           textbtn4.setBackground(Color.yellow);
           textbtn7.setBackground(Color.yellow);
         }
              else if(b2==("0")&& b5==("0")&& b8==("0"))
         {
           JOptionPane.showMessageDialog(this, "player 2 win","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
           ocount++;
           gameScore();
           textbtn2.setBackground(Color.yellow);
           textbtn5.setBackground(Color.yellow);
           textbtn8.setBackground(Color.yellow);
         }
             else if(b3==("0")&& b6==("0")&& b9==("0"))
         {
           JOptionPane.showMessageDialog(this, "player 2 win","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
           ocount++;
           gameScore();
           textbtn3.setBackground(Color.yellow);
           textbtn6.setBackground(Color.yellow);
           textbtn9.setBackground(Color.yellow);
         }
          else{
                 int f = 0;
                 for(int i=1;i<=9;i++){
                     if(array[i] == 0){
                         f = 1;
                     }
                 }
                 if(f == 0){
                     JOptionPane.showMessageDialog(this, "Match is Draw Try Again","Bead 3 Game",JOptionPane.INFORMATION_MESSAGE);
                 }
             }
            
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textbtn2 = new javax.swing.JButton();
        textbtn3 = new javax.swing.JButton();
        textbtn1 = new javax.swing.JButton();
        textbtn4 = new javax.swing.JButton();
        textbtn5 = new javax.swing.JButton();
        textbtn6 = new javax.swing.JButton();
        textbtn7 = new javax.swing.JButton();
        textbtn8 = new javax.swing.JButton();
        textreset = new javax.swing.JButton();
        textexit = new javax.swing.JButton();
        textbtn9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        player1 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        player111 = new javax.swing.JLabel();
        player222 = new javax.swing.JLabel();
        Back1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bead 3 Game");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Bead 3 Game");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31))
        );

        textbtn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn2ActionPerformed(evt);
            }
        });

        textbtn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn3ActionPerformed(evt);
            }
        });

        textbtn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn1ActionPerformed(evt);
            }
        });

        textbtn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn4ActionPerformed(evt);
            }
        });

        textbtn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn5ActionPerformed(evt);
            }
        });

        textbtn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn6ActionPerformed(evt);
            }
        });

        textbtn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn7ActionPerformed(evt);
            }
        });

        textbtn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn8ActionPerformed(evt);
            }
        });

        textreset.setBackground(new java.awt.Color(51, 51, 255));
        textreset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textreset.setForeground(new java.awt.Color(51, 51, 51));
        textreset.setText("RESET");
        textreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textresetActionPerformed(evt);
            }
        });

        textexit.setBackground(new java.awt.Color(204, 51, 255));
        textexit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textexit.setForeground(new java.awt.Color(51, 0, 51));
        textexit.setText("EXIT");
        textexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textexitActionPerformed(evt);
            }
        });

        textbtn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn9ActionPerformed(evt);
            }
        });

        player1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        player1.setText("player 1 :");

        player2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        player2.setText("Player 2 :");

        player111.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        player111.setForeground(new java.awt.Color(0, 0, 255));
        player111.setText("xxxxxxxxxx");

        player222.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        player222.setForeground(new java.awt.Color(0, 51, 255));
        player222.setText("xxxxxxxxxx");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(player111, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player222, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player111, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player222, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        Back1.setBackground(new java.awt.Color(51, 204, 0));
        Back1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back1.setText("Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(textbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(textbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textreset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(textexit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Back1)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textreset, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textexit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Back1)
                                .addGap(33, 33, 33))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn3ActionPerformed
        // TODO add your handling code here:
         textbtn3.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X"))
    {
       textbtn3.setForeground(Color.RED);
    }
    else
    {
         textbtn3.setForeground(Color.MAGENTA);
    }
        choose_a_player(3);
        winningGame();
        
       
    }//GEN-LAST:event_textbtn3ActionPerformed

    private void textbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn5ActionPerformed
        // TODO add your handling code here:
         textbtn5.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X"))
    {
       textbtn5.setForeground(Color.RED);
    }
    else
    {
         textbtn5.setForeground(Color.MAGENTA);
    }
         choose_a_player(5);
         winningGame();
    }//GEN-LAST:event_textbtn5ActionPerformed

    private void textexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textexitActionPerformed
        // TODO add your handling code here:
         JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want Exit","Bead 3 Game",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
         {
            System.exit(0);
         }      
    }//GEN-LAST:event_textexitActionPerformed

    private void textbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn1ActionPerformed
        // TODO add your handling code here:
            textbtn1.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X"))
    {
       textbtn1.setForeground(Color.RED);//
    }
    else
    {
         textbtn1.setForeground(Color.MAGENTA);
    }
        choose_a_player(1);
         winningGame();
    }//GEN-LAST:event_textbtn1ActionPerformed

    private void textbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn2ActionPerformed
        // TODO add your handling code here:
          textbtn2.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X"))
    {
       textbtn2.setForeground(Color.RED);
    }
    else
    {
         textbtn2.setForeground(Color.MAGENTA);
    }
        choose_a_player(2);
         winningGame();
    }//GEN-LAST:event_textbtn2ActionPerformed

    private void textbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn4ActionPerformed
        // TODO add your handling code here:
         textbtn4.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X"))
    {
       textbtn4.setForeground(Color.RED);
    }
    else
    {
         textbtn4.setForeground(Color.MAGENTA);
    }
        choose_a_player(4);
         winningGame();
    }//GEN-LAST:event_textbtn4ActionPerformed

    private void textbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn6ActionPerformed
        // TODO add your handling code here:
         textbtn6.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X"))
    {
       textbtn6.setForeground(Color.RED);
    }
    else
    {
         textbtn6.setForeground(Color.MAGENTA);
    }
        choose_a_player(6);
         winningGame();
    }//GEN-LAST:event_textbtn6ActionPerformed

    private void textbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn7ActionPerformed
        // TODO add your handling code here:
         textbtn7.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X"))
    {
       textbtn7.setForeground(Color.RED);
    }
    else
    {
         textbtn7.setForeground(Color.MAGENTA);
    }
        choose_a_player(7);
         winningGame();
    }//GEN-LAST:event_textbtn7ActionPerformed

    private void textbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn8ActionPerformed
        // TODO add your handling code here:
         textbtn8.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X"))
    {
       textbtn8.setForeground(Color.RED);
    }
    else
    {
         textbtn8.setForeground(Color.MAGENTA);
    }
        choose_a_player(8);
         winningGame();
    }//GEN-LAST:event_textbtn8ActionPerformed

    private void textbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn9ActionPerformed
        // TODO add your handling code here:
         textbtn9.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X"))
    {
       textbtn9.setForeground(Color.RED);
    }
    else
    {
         textbtn9.setForeground(Color.MAGENTA);
    }
        choose_a_player(9);
         winningGame();
    }//GEN-LAST:event_textbtn9ActionPerformed

    private void textresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textresetActionPerformed
        // TODO add your handling code here:
        for(int i=0;i<=9;i++){
            array[i] = 0;
        }
        textbtn1.setText(null);
        textbtn2.setText(null);
         textbtn3.setText(null);
         
        textbtn4.setText(null);
        textbtn5.setText(null);
        textbtn6.setText(null);
         
        textbtn7.setText(null);
        textbtn8.setText(null);
        textbtn9.setText(null);
                
        textbtn1.setBackground(Color.LIGHT_GRAY);
        textbtn2.setBackground(Color.LIGHT_GRAY);
        textbtn3.setBackground(Color.LIGHT_GRAY);
                
        textbtn4.setBackground(Color.LIGHT_GRAY);
        textbtn5.setBackground(Color.LIGHT_GRAY);
        textbtn6.setBackground(Color.LIGHT_GRAY);
                
        textbtn7.setBackground(Color.LIGHT_GRAY);
        textbtn8.setBackground(Color.LIGHT_GRAY);
        textbtn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_textresetActionPerformed

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
          mainFrame ob=new mainFrame();
          ob.setVisible(true);
          dispose();
    }//GEN-LAST:event_Back1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bead_3_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bead_3_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bead_3_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bead_3_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bead_3_Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player111;
    private javax.swing.JLabel player2;
    private javax.swing.JLabel player222;
    private javax.swing.JButton textbtn1;
    private javax.swing.JButton textbtn2;
    private javax.swing.JButton textbtn3;
    private javax.swing.JButton textbtn4;
    private javax.swing.JButton textbtn5;
    private javax.swing.JButton textbtn6;
    private javax.swing.JButton textbtn7;
    private javax.swing.JButton textbtn8;
    private javax.swing.JButton textbtn9;
    private javax.swing.JButton textexit;
    private javax.swing.JButton textreset;
    // End of variables declaration//GEN-END:variables
}

