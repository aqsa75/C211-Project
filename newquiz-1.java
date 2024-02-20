
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aqsas
 */

// Where Should You Travel? ; Aqsa Shabbir ; May 1 , 2023
// all code by Aqsa, 1/2 of the code from initData() by Lex


public final class newquiz extends javax.swing.JFrame {

    /**
     * Creates new form newquiz
     */
    String[][] quiz = new String[11][4];
    int question = 0;
    int score = 0;
    
 
  
    
    public newquiz() {
        initComponents();
        initData();
        update();
        
    }

    // this updates the scoring information depending on user answers
    
    public void update(){
         if (question >= quiz.length) {
        System.out.println("Calling showFinalScreen");
        showFinalScreen();
        return;
    }
        jLabel1.setText(quiz[question][0]);
        jLabel3.setText(""+score);
        jButton1.setText(quiz[question][1]); jButton2.setText(quiz[question][2]);
        // jButton3.setText(quiz[question][3]);  jButton4.setText(quiz[question][4]);
    
    }
    
    // this is the additional panel that is opened at the end of the quiz to display the travel destination
    // the if statement determines destination since if the score is higher a hotter destination will be given
    
public void showFinalScreen() {
           JFrame finalFrame = new JFrame();
           JPanel finalPanel = new JPanel();
           JLabel finalLabel = new JLabel();
        if (score == 5) {
            finalLabel.setText("Your Destination: the United States! The United States is a vast country with a temperate and varied landscape, making it an ideal travel destination for those seeking adventure and exploration. From the snow-capped mountains of the Rocky Mountains to the sunny beaches of Florida and California, the US has something to offer for everyone. The country is home to some of the world's most iconic natural wonders, such as the Grand Canyon, Yellowstone National Park, and the Niagara Falls. Additionally, the US boasts bustling cities like New York, Los Angeles, and Chicago, which offer visitors a glimpse into the country's vibrant culture and diverse history. Whether it's hiking through scenic national parks, sampling regional cuisine, or experiencing local traditions, the United States has it all.");
        }
        else if (score > 6) {
            finalLabel.setText("Your Destination: Costa Rica! Costa Rica, located in Central America, is a popular destination for travelers seeking a tropical escape. Known for its lush rainforests, beautiful beaches, and abundant wildlife, Costa Rica offers a diverse range of activities for nature enthusiasts, adventure seekers, and relaxation seekers alike. Visitors can explore the country's many national parks, go surfing or snorkeling in the warm waters of the Pacific or Caribbean coasts, or simply relax on a hammock and soak up the sun. With a welcoming culture and a commitment to sustainability, Costa Rica is an ideal destination for those looking for a tropical paradise.");
        }
        else {
            finalLabel.setText("Your Destination: Sweden! Sweden is a beautiful winter destination with plenty of natural wonders to explore. One of the most stunning experiences that draws visitors to Sweden during the winter months is the Northern Lights. The Aurora Borealis can be seen from many different locations throughout the country, including the Swedish Lapland. Aside from the Northern Lights, there are plenty of other winter activities to enjoy, such as skiing, snowshoeing, and dog sledding. The snowy landscapes, cozy cottages, and warm hospitality of the Swedish people make for a truly unforgettable winter getaway.");
    }
       finalLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        finalLabel.setPreferredSize(new Dimension(400, 50)); // set the size of the label
        finalPanel.setPreferredSize(new Dimension(500, 200)); // set the size of the panel
        finalPanel.add(finalLabel);
        JScrollPane scrollPane = new JScrollPane(finalPanel); // add panel to scroll pane
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        finalFrame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        finalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finalFrame.setPreferredSize(new Dimension(600, 300)); // set the preferred size of the frame
        finalFrame.pack();
        finalFrame.setLocationRelativeTo(null);
        finalFrame.setVisible(true);
}

// these are the questions used to ask the user in an array format, when certain answers to questions are clicked on score increments
// the 'hotter climate' answer results in the score increasing
    
    public void initData(){
        quiz[0][0] = "Would you rather:";
        quiz[0][1] = "Sunbathe on the beach"; quiz[0][2] = "Go skiing";
        quiz[0][3] = "1";
        quiz[1][0] = "Would you rather:";
        quiz[1][1] = "Go hiking in the trees"; quiz[1][2] = "swim in the ocean" ;
        quiz[1][3] = "2";
        quiz[2][0] = "Would you rather:" ;
        quiz[2][1] = "Go fishing in a lake"; quiz[2][2] = "walk along a sandy board walk";
        quiz[2][3] = "2";
        quiz[3][0] = "Would you rather:";
        quiz[3][1] = "Go to a cozy cabin"; quiz[3][2] = "stay in a high-end resort";
        quiz[3][3] = "2";
        quiz[4][0] = "Would you rather:";
        quiz[4][1] = "Wake up with birds chirping by your window"; quiz[4][2] = "wake up with the sound of ocean waves coming to shore";
        quiz[4][3] = "2";
        quiz[5][0] = "Would you rather:";
        quiz[5][1] = "spend your holiday lounging on a tropical beach"; quiz[5][2] = "skiing down snow-covered mountains";
        quiz[5][3] = "1";
        quiz[6][0] = "Would you rather:";
        quiz[6][1] = "indulge in spicy, flavorful food in a tropical climate or warm"; quiz[6][2] = "hearty meals in a cold destination";
        quiz[6][3] = "1";
        quiz[7][0] = "Would you rather:";
        quiz[7][1] = "enjoy a tropical sunset on the beach"; quiz[7][2] = "watch the Northern Lights in a cold, remote location";
        quiz[7][3] = "1";
        quiz[8][0] = "Would you rather:";
        quiz[8][1] = " explore ancient ruins"; quiz[8][2] = "visit historic castles";
        quiz[8][3] = "1";
        quiz[9][0] = "Would you rather:";
        quiz[9][1] = "attend a music festival"; quiz[9][2] = "attend a winter carnival ";
        quiz[9][3] = "1";
        quiz[10][0] = "Would you rather:";
        quiz[10][1] = "go horseback riding through a hot desert"; quiz[10][2] = "take a horse-drawn sleigh ride through a snowy forest";
        quiz[10][3] = "1";

      
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("jLabel1");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Score");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/collage.vacay.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton1)
                        .addGap(70, 70, 70)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // actions performed by the click of each button -AQSA
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if("1".equals(quiz[question][3])){
            score++;
        } else {
        }
        question++;
        update();
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(quiz[question][3]=="2"){
            score++;
        }
        question++;
        update();
  

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(newquiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newquiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newquiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newquiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newquiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}