package Class_Object;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Snoopy on 2016/12/6.
 */
public class GUIComponents {
    public static void main(String[] args) {
        JButton jbtOK = new JButton("OK");
        JButton jbtCancle = new JButton("Cancel");
        JLabel jlblName = new JLabel("Enter Your Name：");
        JTextField jtfName = new JTextField("Type Name Here");
        JCheckBox jchkBold = new JCheckBox("Bold");
        JCheckBox jchkItalic = new JCheckBox("Italic");
        JRadioButton jrbRed = new JRadioButton("Red");
        JRadioButton jrbYellow = new JRadioButton("Yellow");
        JComboBox jcboColor = new JComboBox(new String[]{"Freshman", "Sophomore", "Junior", "Senior"});
        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jbtCancle);
        panel.add(jlblName);
        panel.add(jtfName);
        panel.add(jchkBold);
        panel.add(jchkItalic);
        panel.add(jrbRed);
        panel.add(jrbYellow);
        panel.add(jcboColor);
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setTitle("Show GUI Components");
        frame.setSize(400, 100);
        frame.setLocation(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
