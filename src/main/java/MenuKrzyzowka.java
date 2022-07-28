import org.apache.commons.io.FileUtils;
import org.hibernate.SessionFactory;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.*;

public class MenuKrzyzowka extends JFrame implements ActionListener {

    public static KrzyzowkaRysowanie okienko = null;
    public static AddingWord okienkoWord = null;
    public static String[] Słówka = new String[100];

    public JButton bWyjście, bDodawanieSlow, bUzupelnianieKrzyzowki;

    private ImageIcon tlo;
    private JLabel lTlo;

    static Connection con;
    static String connectionString = "jdbc:hsqldb:file:db-data/mydatabase;user=admin123;password=admin123";

    public MenuKrzyzowka() {


        setSize(480, 370);
        setTitle("Okno główne programu");
        setLayout(null);

//        try {
//            con = DriverManager.getConnection(connectionString, "admin123", "admin123");
//            String createContacts = readToString("sql/HR_create.sql");
//            String populateContacts = readToString("sql/HR_loadCorrectData.sql");
//            con.createStatement().executeUpdate(createContacts);
//            con.createStatement().executeUpdate(populateContacts);
//        } catch (Exception e) {
//
//        }

        bUzupelnianieKrzyzowki = new JButton("Uzupelnianie Krzyzowki");
        bUzupelnianieKrzyzowki.setBounds(150, 80, 200, 50);
        add(bUzupelnianieKrzyzowki);

        bDodawanieSlow = new JButton("Słownik");
        bDodawanieSlow.setBounds(150, 150, 200, 50);
        add(bDodawanieSlow);
        bDodawanieSlow.addActionListener(this);

        bWyjście = new JButton("Wyjscie");
        bWyjście.setBounds(150, 220, 200, 50);
        add(bWyjście);
        bWyjście.addActionListener(this);
        bUzupelnianieKrzyzowki.addActionListener(this);

        tlo = new ImageIcon(this.getClass().getResource("/fame.png"));
        lTlo = new JLabel(tlo);
        lTlo.setSize(490, 370);
        lTlo.setFocusable(false);
        add(lTlo);

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        CzarneTlo tlo = new CzarneTlo();
        tlo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tlo.setLocationRelativeTo(null);
        tlo.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tlo.setUndecorated(true);
        tlo.getContentPane().setBackground(Color.DARK_GRAY);
        tlo.setFocusableWindowState(false);
        tlo.setVisible(true);

        MenuKrzyzowka okienkoMenu = new MenuKrzyzowka();
        okienkoMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okienkoMenu.setLocationRelativeTo(null);
        okienkoMenu.setUndecorated(true);
        okienkoMenu.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        Object źródło = e.getSource();
        if (źródło == bUzupelnianieKrzyzowki) {
            okienko = new KrzyzowkaRysowanie(Słówka, 0, false);
            okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            okienko.setLocationRelativeTo(null);
            okienko.setUndecorated(true);
            okienko.setVisible(true);
            this.dispose();
        } else if (źródło == bDodawanieSlow) {
            okienkoWord = new AddingWord();
            okienkoWord.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            okienkoWord.setLocationRelativeTo(null);
            okienkoWord.setUndecorated(true);
            okienkoWord.setVisible(true);
        } else if (źródło == bWyjście) {
            System.exit(1);
        }
    }
    public static String readToString(String fname) throws Exception {
        File file = new File(fname);
        return FileUtils.readFileToString(file, "utf-8");
    }
}
