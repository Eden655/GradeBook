import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Screen2 extends JFrame{
    private JPanel Mainpanel;
    private JLabel AverageGrade;
    private JLabel Lable;

    Screen2() {
        super("Grade Book");
        this.setContentPane(this.Mainpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        public void calculation(){
            /*
            - first I will have to loop through the array and only get the marks and TotalMarks (make into int)
            - put them into two different arrays
            - then loop through both arrays and get the percentage
            - create a gradelist of much percent is what grade
            - add all the grades together and crate an average
             */


        }

    }
}
