import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase MyFrame del grupo 8 que muestra en interfaz grafica el funcionamiento de la radio
 * @author Roberto Rios
 * @author Dariel Villatoro
 * @author Dimitrio Badani
 */
public class MyFrame extends JFrame implements ActionListener {

    private JButton onOff, amFm, next, prev, fm1, fm2, fm3, fm4, fm5, fm6, am1, am2, am3, am4, am5, am6;
    private JLabel onOffMsg, amFmMsg, station, savedFm, savedAm, savedMsg, title;
    private JPanel bg; // panel al fondo
    private JComboBox options; // para guardar las estaciones
    private Radio radio; // instancia de radio que sirve como parametro
    private CompoundBorder border = new CompoundBorder(); // por estetica

    public MyFrame(Radio radio) {
        
        /**
         * configuraciones del frame
         */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(630, 520);
        this.setResizable(false);
        this.setTitle("Radio G8");
        this.radio = radio;
        
        putPanel();
        putComboBox();
        putLabels();
        putButtons();

        amFm.setEnabled(false);
        next.setEnabled(false);
        prev.setEnabled(false);
        fm1.setEnabled(false);
        fm2.setEnabled(false);
        fm3.setEnabled(false);
        fm4.setEnabled(false);
        fm5.setEnabled(false);
        fm6.setEnabled(false);
        am1.setEnabled(false);
        am2.setEnabled(false);
        am3.setEnabled(false);
        am4.setEnabled(false);
        am5.setEnabled(false);
        am6.setEnabled(false);
        options.setEnabled(false);

        this.setVisible(true);

        
    }

    /**
     * coloca un Jpanel personalizado en el JFrame para colocar los componentes
     */
    private void putPanel() {
        bg = new JPanel();
        bg.setBackground(Color.WHITE);
        bg.setLayout(null);
        this.getContentPane().add(bg);
        
    }

    /**
     * coloca las JLabels que indican al usuario que esta pasando en el Jpanel 
     */
    private void putLabels() {
        onOffMsg = new JLabel("Off");
        onOffMsg.setBounds(80, 180, 80, 60);

        amFmMsg = new JLabel("AM");
        amFmMsg.setBounds(190, 180, 80, 60);

        station = new JLabel("530.0");
        station.setBounds(460, 180, 40, 60);

        savedMsg = new JLabel("Save");
        savedMsg.setBounds(275, 180, 80, 60);

        savedFm = new JLabel("Saved FM frequencies: ");
        savedFm.setBounds(50, 230, 200, 60);

        savedAm = new JLabel("Saved AM frequencies: ");
        savedAm.setBounds(50, 330, 200, 60);        

        title = new JLabel("Radio G8!");
        title.setBounds(50, 50, 150, 30);
        title.setFont(new Font("Arial", 1, 30));

        bg.add(onOffMsg);
        bg.add(amFmMsg);
        bg.add(station);
        bg.add(savedAm);
        bg.add(savedFm);
        bg.add(savedMsg);
        bg.add(title);

    }

    /**
     * coloca los Jbuttons necesarios para el funcionamiento del radio en el Jpanel
     */
    private void putButtons() {
        onOff = new JButton("On/Off");
        onOff.setBounds(50, 130, 80, 60);
        onOff.addActionListener(this);
        onOff.setBorder(border);
        
        amFm = new JButton("AM/FM");
        amFm.setBounds(150, 130, 100, 60);
        amFm.addActionListener(this);
        amFm.setBorder(border);

        next = new JButton(">");
        next.setBounds(480, 130, 80, 60);
        next.addActionListener(this);
        next.setBorder(border);

        prev = new JButton("<");
        prev.setBounds(380, 130, 80, 60);
        prev.addActionListener(this);
        prev.setBorder(border);

        fm1 = new JButton("1");
        fm1.setBounds(50, 280, 50, 50);
        fm1.addActionListener(this);
        fm1.setBorder(border);

        fm2 = new JButton("2");
        fm2.setBounds(110, 280, 50, 50);
        fm2.addActionListener(this);
        fm2.setBorder(border);
        
        fm3 = new JButton("3");
        fm3.setBounds(170, 280, 50, 50);
        fm3.addActionListener(this);
        fm3.setBorder(border);
        
        fm4 = new JButton("4");
        fm4.setBounds(230, 280, 50, 50);
        fm4.addActionListener(this);
        fm4.setBorder(border);

        fm5 = new JButton("5");
        fm5.setBounds(290, 280, 50, 50);
        fm5.addActionListener(this);
        fm5.setBorder(border);

        fm6 = new JButton("6");
        fm6.setBounds(350, 280, 50, 50);
        fm6.addActionListener(this);
        fm6.setBorder(border);

        am1 = new JButton("1");
        am1.setBounds(50, 380, 50, 50);
        am1.addActionListener(this);
        am1.setBorder(border);

        am2 = new JButton("2");
        am2.setBounds(110, 380, 50, 50);
        am2.addActionListener(this);
        am2.setBorder(border);

        am3 = new JButton("3");
        am3.setBounds(170, 380, 50, 50);
        am3.addActionListener(this);
        am3.setBorder(border);

        am4 = new JButton("4");
        am4.setBounds(230, 380, 50, 50);
        am4.addActionListener(this);
        am4.setBorder(border);

        am5 = new JButton("5");
        am5.setBounds(290, 380, 50, 50);
        am5.addActionListener(this);
        am5.setBorder(border);

        am6 = new JButton("6");
        am6.setBounds(350, 380, 50, 50);
        am6.addActionListener(this);
        am6.setBorder(border);

        bg.add(onOff);
        bg.add(amFm);
        bg.add(next);
        bg.add(prev);
        bg.add(fm1);
        bg.add(fm2);
        bg.add(fm3);
        bg.add(fm4);
        bg.add(fm5);
        bg.add(fm6);
        bg.add(am1);
        bg.add(am2);
        bg.add(am3);
        bg.add(am4);
        bg.add(am5);
        bg.add(am6);

    }

    /**
     * coloca el JcomboBox en el Jpanel para guardar la estacion
     */
    private void putComboBox() {
        String [] items = {"Select", "1", "2", "3", "4", "5", "6"};
        options = new JComboBox(items);
        options.setBounds(275, 130, 70, 60);
        options.addActionListener(this);
        bg.add(options);
    }

    /**
     * metodo implementado para que se ejecuten las acciones al tocar los componentes
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == onOff) {
            radio.turnOnOff();
            if (radio.isOn()) {
                onOffMsg.setText("On");
                if (radio.getFrequency()) {
                    am1.setEnabled(true);
                    am2.setEnabled(true);
                    am3.setEnabled(true);
                    am4.setEnabled(true);
                    am5.setEnabled(true);
                    am6.setEnabled(true);
                } else {
                    fm1.setEnabled(true);
                    fm2.setEnabled(true);
                    fm3.setEnabled(true);
                    fm4.setEnabled(true);
                    fm5.setEnabled(true);
                    fm6.setEnabled(true);
                }
                amFm.setEnabled(true);
                next.setEnabled(true);
                prev.setEnabled(true);
                options.setEnabled(true);
            } else {
                onOffMsg.setText("Off");
                amFm.setEnabled(false);
                next.setEnabled(false);
                prev.setEnabled(false);
                fm1.setEnabled(false);
                fm2.setEnabled(false);
                fm3.setEnabled(false);
                fm4.setEnabled(false);
                fm5.setEnabled(false);
                fm6.setEnabled(false);
                am1.setEnabled(false);
                am2.setEnabled(false);
                am3.setEnabled(false);
                am4.setEnabled(false);
                am5.setEnabled(false);
                am6.setEnabled(false);
                options.setEnabled(false);
            }
        }

        if (e.getSource() == amFm) {
            radio.switchAMFM();
            if (radio.getFrequency()) {
                amFmMsg.setText("AM");
                fm1.setEnabled(false);
                fm2.setEnabled(false);
                fm3.setEnabled(false);
                fm4.setEnabled(false);
                fm5.setEnabled(false);
                fm6.setEnabled(false);
                am1.setEnabled(true);
                am2.setEnabled(true);
                am3.setEnabled(true);
                am4.setEnabled(true);
                am5.setEnabled(true);
                am6.setEnabled(true);
            } else {
                amFmMsg.setText("FM");
                fm1.setEnabled(true);
                fm2.setEnabled(true);
                fm3.setEnabled(true);
                fm4.setEnabled(true);
                fm5.setEnabled(true);
                fm6.setEnabled(true);
                am1.setEnabled(false);
                am2.setEnabled(false);
                am3.setEnabled(false);
                am4.setEnabled(false);
                am5.setEnabled(false);
                am6.setEnabled(false);
            }
            station.setText(String.valueOf(radio.getStation()));
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

        if (e.getSource() == am1) {
            radio.getSavedStation(0);
            station.setText(String.valueOf(radio.getSavedStation(0)));
        }
        
        if (e.getSource() == am2) {
            radio.getSavedStation(1);
            station.setText(String.valueOf(radio.getSavedStation(1)));
        }

        if (e.getSource() == am3) {
            radio.getSavedStation(2);
            station.setText(String.valueOf(radio.getSavedStation(2)));
        }

        if (e.getSource() == am4) {
            radio.getSavedStation(3);
            station.setText(String.valueOf(radio.getSavedStation(3)));
        }

        if (e.getSource() == am5) {
            radio.getSavedStation(4);
            station.setText(String.valueOf(radio.getSavedStation(4)));
        }

        if (e.getSource() == am6) {
            radio.getSavedStation(5);
            station.setText(String.valueOf(radio.getSavedStation(5)));
        }

        if (e.getSource() == fm1) {
            radio.getSavedStation(0);
            station.setText(String.valueOf(radio.getSavedStation(0)));
        }

        if (e.getSource() == fm2) {
            radio.getSavedStation(1);
            station.setText(String.valueOf(radio.getSavedStation(1)));
        }

        if (e.getSource() == fm3) {
            radio.getSavedStation(2);
            station.setText(String.valueOf(radio.getSavedStation(2)));
        }

        if (e.getSource() == fm4) {
            radio.getSavedStation(3);
            station.setText(String.valueOf(radio.getSavedStation(3)));
        }

        if (e.getSource() == fm5) {
            radio.getSavedStation(4);
            station.setText(String.valueOf(radio.getSavedStation(4)));
        }

        if (e.getSource() == fm6) {
            radio.getSavedStation(5);
            station.setText(String.valueOf(radio.getSavedStation(5)));
        }

        if (e.getSource() == options) {
            if (options.getSelectedItem() == "1") {
                radio.saveStation(0, radio.getStation());
            } else if (options.getSelectedItem() == "2") {
                radio.saveStation(1, radio.getStation());
            } else if (options.getSelectedItem() == "3") {
                radio.saveStation(2, radio.getStation());
            } else if (options.getSelectedItem() == "4") {
                radio.saveStation(3, radio.getStation());
            }  else if (options.getSelectedItem() == "5") {
                radio.saveStation(4, radio.getStation());
            }  else if (options.getSelectedItem() == "6") {
                radio.saveStation(5, radio.getStation());
            }
        }
    }
}
