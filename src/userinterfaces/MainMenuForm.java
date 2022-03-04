package userinterfaces;

import functions.Images;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Main menu for Clicky Clicky 3000. Passes global variables to GameplayForm.
 * Allows the user to manipulate the settings of their game.
 *
 * @author A.randell 
 * @since November 2nd 2021
 */
public class MainMenuForm extends javax.swing.JFrame {

    private static final int EASY = 750;// Sets the easy value(.75 seconds)
    private static final int NORMAL = 600;// Sets the normal value(.6 seconds)
    private static final int HARD = 450;// Sets the hard value(.45 seconds)
    private static final int IMPOSSIBLE = 10; // Sets the impossible value (.01 seconds)

    public static int countdown = 15;     // Countdown time choosen by the user
    // Default value is 15 seconds
    public static int delay = EASY;       // The delay choosen by the user
    // Defualt value is "easy"

    public static final String PATH = "/media/"; // Path to the media package
    public static String first_name = PATH;      // Fistname is set to PATH
    public static String middle_name;            // Create middle name
    public static String last_name;              // Creates last name

    /**
     * Creates new form MainMenuForm
     */
    public MainMenuForm() {
        //Calls to the initialize mthod
        initializing();
        //Places the images onto their labels
        creatingImages();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonPlay = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rBtnTriangle = new javax.swing.JRadioButton();
        rBtnSquare = new javax.swing.JRadioButton();
        rBtnWachs = new javax.swing.JRadioButton();
        jLabelTriangle = new javax.swing.JLabel();
        jLabelWachs = new javax.swing.JLabel();
        jLabelSquare = new javax.swing.JLabel();
        cmbBoxTime = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabelDifficulty = new javax.swing.JLabel();
        btnEasy = new javax.swing.JButton();
        btnNormal = new javax.swing.JButton();
        btnHard = new javax.swing.JButton();
        btnImpossible = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonPlay.setBackground(new java.awt.Color(51, 255, 51));
        jButtonPlay.setForeground(new java.awt.Color(0, 0, 0));
        jButtonPlay.setText("Play");
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        jLabelTitle.setText("Clicky Clicky 3000");

        rBtnTriangle.setText("Triangle");
        rBtnTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnTriangleActionPerformed(evt);
            }
        });

        rBtnSquare.setText("Square");
        rBtnSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnSquareActionPerformed(evt);
            }
        });

        rBtnWachs.setText("Wachs");
        rBtnWachs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnWachsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rBtnTriangle, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(rBtnSquare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rBtnWachs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSquare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelWachs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelWachs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rBtnWachs, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBtnSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBtnTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmbBoxTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15 Seconds", "30 Seconds", "60 Seconds" }));
        cmbBoxTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBoxTimeActionPerformed(evt);
            }
        });

        jLabelDifficulty.setText("Difficulty: Easy");

        btnEasy.setText("Easy");
        btnEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEasyActionPerformed(evt);
            }
        });

        btnNormal.setText("Normal");
        btnNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalActionPerformed(evt);
            }
        });

        btnHard.setText("Hard");
        btnHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHardActionPerformed(evt);
            }
        });

        btnImpossible.setText("Impossible");
        btnImpossible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpossibleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelDifficulty)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnEasy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImpossible, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDifficulty)
                .addGap(18, 18, 18)
                .addComponent(btnEasy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHard, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImpossible, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Length of Game: ");
        jLabel1.setAutoscrolls(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabelTitle))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127)
                        .addComponent(jButtonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Play button, if parameters are met, a gameplayForm object is created
     *
     * @param evt
     */
    private void jButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayActionPerformed
        // If an image is choosen
        if (rBtnSquare.isSelected() || rBtnTriangle.isSelected() || rBtnWachs.isSelected()) {
            GameplayForm gameplayForm = new GameplayForm();
            this.setVisible(false);
        } // If an image is not choosen(error check)
        else {
            // Create a joptionpane that informs the suer they need to choose 
            // an image
            JOptionPane.showMessageDialog(null, "Please Choose an Image",
                     "Clicly Clicky Error", DO_NOTHING_ON_CLOSE);
        }

    }//GEN-LAST:event_jButtonPlayActionPerformed

    /**
     * Wachs image button
     *
     * @param evt
     */
    private void rBtnWachsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnWachsActionPerformed
        // Sets the other two radio buttons to unselected
        rBtnTriangle.setSelected(false);
        rBtnSquare.setSelected(false);

        // Sets the pathway to the image selected
        middle_name = "IMG_4892";
        last_name = ".jpg";
    }//GEN-LAST:event_rBtnWachsActionPerformed

    /**
     * Square image button
     *
     * @param evt
     */
    private void rBtnSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnSquareActionPerformed
        // Sets the other two radio buttons to unselected
        rBtnTriangle.setSelected(false);
        rBtnWachs.setSelected(false);

        // Sets the pathway to the image selected
        middle_name = "square";
        last_name = ".png";
    }//GEN-LAST:event_rBtnSquareActionPerformed

    /**
     * Triangle image button
     *
     * @param evt
     */
    private void rBtnTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnTriangleActionPerformed
        // Sets the other two radio buttons to unselected
        rBtnWachs.setSelected(false);
        rBtnSquare.setSelected(false);

        // Sets the pathway to the image selected
        middle_name = "Red_Triangle";
        last_name = ".jpg";
    }//GEN-LAST:event_rBtnTriangleActionPerformed

    /**
     * Combobox that allows the user to choose the time length of their game
     *
     * @param evt
     */
    private void cmbBoxTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoxTimeActionPerformed
        // Creates an interger that equals the slot choosen by the user
        // in the combobox
        int timeIndex = cmbBoxTime.getSelectedIndex();

        // If selected 15 seconds
        if (timeIndex == 0) {
            countdown = 15;
        } // If selected 30 seconds
        else if (timeIndex == 1) {
            countdown = 30;
        } // If selected 60 seconds
        else if (timeIndex == 2) {
            countdown = 60;
        }
    }//GEN-LAST:event_cmbBoxTimeActionPerformed

    /**
     * Easy mode button option
     *
     * @param evt
     */
    private void btnEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEasyActionPerformed
        // Sets the text of jLabelDiffiuclty to the choosen difficulty
        jLabelDifficulty.setText("Difficulty: Easy");

        // Sets the delay to an easy difficulty
        delay = EASY;
    }//GEN-LAST:event_btnEasyActionPerformed

    /**
     * Normal mode button option
     *
     * @param evt
     */
    private void btnNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalActionPerformed
        // Sets the text of jLabelDiffiuclty to the choosen difficulty
        jLabelDifficulty.setText("Difficulty: Normal");

        // Sets the delay to a normal difficulty
        delay = NORMAL;
    }//GEN-LAST:event_btnNormalActionPerformed

    /**
     * Hard mode button option
     *
     * @param evt
     */
    private void btnHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHardActionPerformed
        // Sets the text of jLabelDiffiuclty to the choosen difficulty
        jLabelDifficulty.setText("Difficulty: Hard");

        // Sets the delay to a hard difficulty
        delay = HARD;
    }//GEN-LAST:event_btnHardActionPerformed

    /**
     * Impossible mode button option
     *
     * @param evt
     */
    private void btnImpossibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpossibleActionPerformed
        // Sets the text of jLabelDiffiuclty to the choosen difficulty
        jLabelDifficulty.setText("Difficulty: Impossible");

        // Sets the delay to a impossible difficulty (I really mean impossible)
        delay = IMPOSSIBLE;
    }//GEN-LAST:event_btnImpossibleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEasy;
    private javax.swing.JButton btnHard;
    private javax.swing.JButton btnImpossible;
    private javax.swing.JButton btnNormal;
    private javax.swing.JComboBox<String> cmbBoxTime;
    private javax.swing.JButton jButtonPlay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDifficulty;
    private javax.swing.JLabel jLabelSquare;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTriangle;
    private javax.swing.JLabel jLabelWachs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rBtnSquare;
    private javax.swing.JRadioButton rBtnTriangle;
    private javax.swing.JRadioButton rBtnWachs;
    // End of variables declaration//GEN-END:variables

    /**
     * Sets the frames properties
     */
    private void initializing() {
        initComponents();

        // Places the frame in the center of the screen, sets it to unresizable
        // and makes the frame visible
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    /**
     * Adds the image options into labels placed next to their respective image
     * button to allow the user to see their options.
     */
    private void creatingImages() {

        // Creates a string that holds the pathway to wachs image
        // Sets the icon of jLabelWachs to the wachs image
        // Resizes the image in jLabelwachs to fit the bounds
        String wachsPath = first_name + "IMG_4892.jpg";
        jLabelWachs.setIcon(new ImageIcon(getClass().getResource(wachsPath)));
        Images.resizeToContainer(jLabelWachs);

        //Repeats this code with the other two images
        String squarePath = first_name + "square.png";
        jLabelSquare.setIcon(new ImageIcon(getClass().getResource(squarePath)));
        Images.resizeToContainer(jLabelSquare);

        String trianglePath = first_name + "Red_Triangle.jpg";
        jLabelTriangle.setIcon(new ImageIcon(getClass().getResource(trianglePath)));
        Images.resizeToContainer(jLabelTriangle);
    }

}
