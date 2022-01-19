import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton onOff;
    JButton amFm;
    JButton next;
    JButton prev;
    JButton save;
    JLabel onOffMsg;
    JLabel amFmMsg;
    JLabel station;
    JLabel savedFm;
    JLabel savedAm;

    RadioG8 radio = new RadioG8();

    public MyFrame() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(630, 500);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Radio G8");
        this.getContentPane().setBackground(new Color(100, 100, 100));

        onOff = new JButton("On/Off");
        onOff.setBounds(50, 50, 80, 60);
        onOff.addActionListener(this);
        
        amFm = new JButton("AM/FM");
        amFm.setBounds(150, 50, 100, 60);
        amFm.addActionListener(this);

        next = new JButton(">");
        next.setBounds(480, 50, 80, 60);
        next.addActionListener(this);

        prev = new JButton("<");
        prev.setBounds(380, 50, 80, 60);
        //prev.addActionListener(this);

        save = new JButton("Save");
        save.setBounds(275, 50, 80, 60);
        save.addActionListener(this);
        
        onOffMsg = new JLabel("On");
        onOffMsg.setBounds(80, 100, 80, 60);

        amFmMsg = new JLabel("AM");
        amFmMsg.setBounds(190, 100, 80, 60);

        station = new JLabel("100");
        station.setBounds(460, 100, 40, 60);

        savedFm = new JLabel("Saved FM frequencies: ");
        savedFm.setBounds(50, 150, 200, 60);
        savedAm = new JLabel("Saved AM frequencies: ");
        savedAm.setBounds(50, 300, 200, 60);

        this.add(onOff);
        this.add(amFm);
        this.add(next);
        this.add(prev);
        this.add(onOffMsg);
        this.add(amFmMsg);
        this.add(station);
        this.add(save);
        this.add(savedAm);
        this.add(savedFm);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == onOff) {
            radio.turnOnOff();
            if (radio.isOn()) {
                onOffMsg.setText("On");
            } else {
                onOffMsg.setText("Off");
            }
        }

        if (e.getSource() == amFm) {
            radio.switchAMFM();
            if (radio.getFrequency()) {
                amFmMsg.setText("AM");
            } else {
                amFmMsg.setText("FM");
            }
        }

        if (e.getSource() == prev) {
            if (radio.getFrequency()) {
                radio.prevStation(true);
                station.setText(String.valueOf(radio.getStation()));
            } else {
                radio.prevStation(false); 
                station.setText(String.valueOf(radio.getStation()));
            }
        }

        if (e.getSource() == next) {
            if (radio.getFrequency()) {
                radio.nextStation(true); 
                station.setText(String.valueOf(radio.getStation()));
            } else {
                radio.nextStation(false); 
                station.setText(String.valueOf(radio.getStation()));
            }
        }


        
    }
}
