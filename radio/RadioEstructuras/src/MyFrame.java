import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyFrame() {

        JButton onOff = new JButton("On/Off");
        onOff.setBounds(50, 50, 80, 60);

        JButton amFm = new JButton("AM/FM");
        amFm.setBounds(150, 50, 100, 60);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800, 500);
        this.setVisible(true);
        this.add(onOff);
        this.add(amFm);
        this.setBackground(new Color(120, 120, 120));
        
    }
}
