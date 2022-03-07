import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Screen extends JFrame {
    private JPanel Mainpanel;
    private JPanel Leftpanel;
    private JPanel Rightpanel;
    private JList listGrade;
    private JLabel Tasklabel;
    private JButton Addbutton;
    private JButton Deletebutton;
    private JButton Generatebutton;
    private JTextField Name;
    private JTextField Marks;
    private JTextField TotalMarks;
    private JPanel TextFieldpanel;
    private JPanel Buttonspanel;
    private JLabel Gradebooklabel;
    ArrayList<Grade> array = new ArrayList<Grade>();
    private DefaultListModel listGradeModel;


    Screen(){
        super("Grade Book");
        this.setContentPane(this.Mainpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        listGradeModel = new DefaultListModel();
        listGrade.setModel(listGradeModel);

        Addbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Grade g = new Grade(
                        Name.getText(),
                        Integer.parseInt(Marks.getText()),
                        Integer.parseInt(TotalMarks.getText())
                       );
                array.add(g);
                refreshGradeList();
            }
        });

        Deletebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Name.setText("");
                Marks.setText("");
                TotalMarks.setText("");
            }
        });

        listGrade.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int gradeNumber = listGrade.getSelectedIndex();
                Grade g = array.get(gradeNumber);
                Name.setText(g.getName());
                Marks.setText(String.valueOf(g.getMarks()));
                TotalMarks.setText(String.valueOf(g.getTotalmarks()));

            }
        });
    }

    public void refreshGradeList(){
        listGradeModel.removeAllElements();
        for (Grade g : array){
            listGradeModel.addElement(g.getName());
        }
    }

    public static void main(String[] args) throws IOException{
        Screen screen = new Screen();
        screen.setSize(750,500);
        screen.setVisible(true);

    }
}
