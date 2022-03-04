package userinterfaces;

import functions.Images;
import functions.LinkedList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.Timer;
import static userinterfaces.MainMenuForm.countdown;
import static userinterfaces.MainMenuForm.delay;
import static userinterfaces.MainMenuForm.first_name;
import static userinterfaces.MainMenuForm.last_name;
import static userinterfaces.MainMenuForm.middle_name;

/**
 * Game frame for Clicky Clicky 3000. Creates multiple timers, a linked list, a
 * recursive method, implements abstract methods, instatiates other classes,
 * creates an array, and does lot's of other operations.
 *
 * @author A.randell 
 * @since November 2nd 2021
 */
public class GameplayForm extends javax.swing.JFrame {

    // Properties (Global Variables)
    private LinkedList<JLabel> imageList;    // Creates a Linked List object
    Timer timer;                             // Creation of the game timer
    Timer lengthOfGame;                      // Timer that calls to clickyRecursion
    Timer startCountdown;                    // Creation of the start timer
    private int startTimer = 3;              // Value of the start timer
    private static int imageCount;           // Tracks the images being displayed
    private static int clickCount;           // Track how many images clicked
    private static int missCount;            // Tracks the number of misses
    private final int FRAME_WIDTH = 1900;    // Width of the JFrame
    private final int FRAME_HEIGHT = 1050;   // Height of the JFrame
    private final int IMAGE_WIDTH = 50;      // Width of the image labels
    private final int IMAGE_HEIGHT = 50;     // Height of the image labels
    private final Color FRAME_BACKGROUND = new Color(255, 255, 255); // Frame color

    /* 
     * Constructor method. calls to initializing method and then creates
     * a 3 second timer. When the timer ends, the game begins
     */
    public GameplayForm() {
        setUndecorated(true);
        initializing();

        // Timer with a one second delay that calls the the start timer method
        startCountdown = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startTimer();
            }
        });
        // Start the timer
        startCountdown.start();

        // Makes the frame visible
        setVisible(true);
    }

    /**
     * Sets the properties of the frame
     */
    public final void initializing() {
        initComponents();
        // Places J Frame into the center of the screen and makes it unresizable
        setLocationRelativeTo(null);
        setResizable(false);
        
        // Sets the Jframe to its largest state
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Sets background color to white
        this.setBackground(FRAME_BACKGROUND);
        this.getContentPane().setBackground(Color.white);

        // Calls the two methods which place the labelScore and labelCountdown
        centerStartLabel();
        placeScoreLabel();
    }

    /**
     * Places the labelCountodwn into the center of the screen
     *
     * @throws HeadlessException
     */
    private void centerStartLabel() throws HeadlessException {
        // Gets the width and height of the countdown label
        int w = labelCountdown.getWidth();
        int h = labelCountdown.getHeight();

        // Creates integers that are the values of the screensize
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Creates integers that are the values of the screensize
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();

        // Creates the x and y values that will place the label in the 
        // center of the screen
        int x = (width / 2) - (w / 2);
        int y = (height / 2) - (h / 2);

        // Sets the location of label countdown
        labelCountdown.setBounds(x, y, w, h);
    }

    /**
     * Places the labelScore into the bottom left corner
     */
    private void placeScoreLabel() {
        // Gets the width and height of the score label
        int w = labelScore.getWidth();
        int h = labelScore.getHeight();

        // Creates integers that are the values of the screensize
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Gets the hieght of the screen and casts it to int
        int height = (int) screenSize.getHeight();

        // Sets x value to 0 and the y value to it's greatest value
        int x = 0;
        int y = (height) - (h);

        // Sets the location of the label score
        labelScore.setBounds(x, y, w, h);

    }

    /**
     * Timer for the start of the game. When the the timer ends, the game
     * begins.
     */
    private void startTimer() {
        // Removes time from the timer
        startTimer--;

        // Creates a string which is the value of the start timer
        String time = String.valueOf(startTimer);

        // Sets the text of labelCountodwn to the "time"
        labelCountdown.setText(time);

        // When the timer hits zero, the startCountdown timer stops, the 
        // labelCountowdn is set to invisible, and setDataStructures is called
        if (startTimer <= 0) {
            startCountdown.stop();
            labelCountdown.setVisible(false);
            setDataStructures();
        }
    }

    /**
     * Sets the data structures for the class Instantiates imageList into a
     * linked list Adds a mouse listener for missed clicks Creates the timer
     * that ends the game when it reaches 0 Creates the timer that calls to the
     * recursive method that creates the labels
     */
    private void setDataStructures() {
        // Sets data values to zero
        imageCount = 0;
        clickCount = 0;

        // Instantiates imageList into a linked list
        imageList = new LinkedList<>();

        // Adds a mouse listener for missed clicks
        this.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
                // When the jrame is clicked, missed clicks add one
                missCount++;
                // Outputs the updated values onto the labelScore
                labelScore.setText("Clicked " + clickCount + " images with "
                        + imageCount + " images currently on screen and " + missCount
                        + " missed clicks");
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });

        // Countdown timer with a one second delay
        lengthOfGame = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Calls to the timer method
                timer();
            }
        });
        // Start the countdown timer
        lengthOfGame.start();

        // Creating the timer. The delay is choosen in mainmenuform by the user
        timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickyRecursion(.5);
            }
        });
        // Start the timer
        timer.start();
    }

    /**
     * Countdown timer for the game When countdown equals zero, both active
     * timers stop, the frame is set to not visible, a joptionpane is created
     * which allows the user to pick what they would like to do next
     */
    private int timer() {
        // Removes time for the timer
        countdown--;

        // Creates an array of "options"
        String[] options = {"Retry", "Quit"};

        // Creates a string that has it's text set to the value of countdown and
        // then outputs the string onto the labelTimer
        String time = String.valueOf(countdown);
        labelTimer.setText("Time Left: " + time);

        // If the countdown equals or is less than 0(When the game ends)
        if (countdown <= 0) {
            // Both active timers stop
            lengthOfGame.stop();
            timer.stop();

            // JFrames visibility is set to false
            this.setVisible(false);

            // A JOptionPane is created that allows the user to retry or to quit
            // The options array is used in this, depending on what choice the
            // user makes will affect the value of choice
            int choice = JOptionPane.showOptionDialog(null, "Images Left: "
                    + imageCount + "\nClicked Images: "
                    + clickCount + "\nMissed Clicks: " + missCount
                    + "\n\bDo you wish to retry?",
                    "Clicky Clicky 3000 Round Review",
                    JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                    options, options[0]);

            // If the user chooses to retry
            if (choice == 0) {
                // An object of the mainmenuform is created
                MainMenuForm mainmenuform = new MainMenuForm();
                // Miss count is reset
                missCount = 0;
                countdown = 15;
            } // If the user chooses to quit
            else if (choice == 1) {
                // Exits the system
                System.exit(0);
            }
        }
        // returns the countdown value
        return countdown;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jFileChooser1 = new javax.swing.JFileChooser();
        labelImage = new javax.swing.JLabel();
        labelTimer = new javax.swing.JLabel();
        labelScore = new javax.swing.JLabel();
        labelCountdown = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(2147483647, 2147483647));
        getContentPane().setLayout(null);
        getContentPane().add(labelImage);
        labelImage.setBounds(773, 144, 0, 0);

        labelTimer.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        getContentPane().add(labelTimer);
        labelTimer.setBounds(6, 6, 176, 53);

        labelScore.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        getContentPane().add(labelScore);
        labelScore.setBounds(20, 686, 640, 100);

        labelCountdown.setFont(new java.awt.Font("Verdana", 1, 250)); // NOI18N
        labelCountdown.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCountdown.setText("3");
        getContentPane().add(labelCountdown);
        labelCountdown.setBounds(900, 259, 178, 305);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel labelCountdown;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelScore;
    private javax.swing.JLabel labelTimer;
    // End of variables declaration//GEN-END:variables

    /**
     * Recursive method which determines when to create a new "clicky"
     */
    private void clickyRecursion(double time) {
        // Create a random location on the frame
        int x = (int) ((((double) (FRAME_WIDTH - IMAGE_WIDTH)) + 1d) * Math.random());
        int y = (int) ((((double) (FRAME_HEIGHT - IMAGE_HEIGHT)) + 1d) * Math.random());

        // Creates a string that is the path to the image
        String filename = first_name
                + middle_name
                + last_name;

        // Create a JLabel, sets the icon of the jlabel to the image choosen 
        // by the user and then adds the user
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(getClass().getResource(filename)));
        this.getContentPane().add(label);

        // Adds a mouse listener to the label 
        label.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
                // Passes the label to the mouseclick methid when the label is 
                // pressed
                mouseClick(label);
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }

        });

        // If time equals zero
        if (time <= 0) {
            // Basecase
            // Image count increases
            imageCount++;

            // The label is placed in its random location and its bounds are set
            label.setBounds(x, y, IMAGE_WIDTH, IMAGE_HEIGHT);

            // Set score label is updated with the new imageCount value
            labelScore.setText("Clicked " + clickCount + " images with "
                    + imageCount + " images currently on screen and " + missCount
                    + " missed clicks");
            imageList.add(label);

            // Resizes the image to fit the bounds of the label
            Images.resizeToContainer(label);
        } else {
            // Recursive case (calls back to itself)
            clickyRecursion(time - 1);
        }
    }

    /**
     * The action that should occur when the user clicks a label (image)
     *
     * @param target the specific label object the mouse clicked on
     */
    private void mouseClick(JLabel target) {
        // We find the location of the target label clicked on in the 
        // collection (Linked List) of labels - using a builtin method of
        // the linkedlist class we created
        int location = imageList.firstIndexOf(target);

        // Now using an accessor method to get that label we found out of 
        // the list
        JLabel label = imageList.get(location);

        // Error check to make sure the label was found
        if (label != null) {
            clickCount++;                           // Count this as clicked
            imageCount--;                           // Reduce this count
            label.setVisible(false);                // Hide label
            this.getContentPane().remove(label);    // Remove from container            
            imageList.remove(location);             // Remove from list

            // Update the title of the form
            labelScore.setText("Clicked " + clickCount + " images with "
                    + imageCount + " images currently on screen and " + missCount
                    + " missed clicks");
        }
    }

}
