import org.apache.commons.io.FileUtils;
import org.hibernate.SessionFactory;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

public class MenuKrzyzowka extends JFrame implements ActionListener {

    public static KrzyzowkaRysowanie okienko = null;
    public static String[] Słówka = new String[100];

    public JButton bWyjście, bDodawanieSlow, bUzupelnianieKrzyzowki;

    private ImageIcon tlo;
    private JLabel lTlo;

    static Connection con;
    static String connectionString = "jdbc:hsqldb:file:db-data/mydatabase;user=admin123;password=admin123";

    public static final String PATH = "C:/Users/Larko/IdeaProjects/project/Krzyzowka/src/main/java/PS_WYRAZY4.txt";

    public static void ReadFile() throws FileNotFoundException {
        File dataSQL = new File("SQL/HR_loadData.sql");
        int i = 1;
        PrintWriter writer = new PrintWriter(dataSQL);
        writer.print("");
        JFileChooser fc = new JFileChooser();
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File plik = fc.getSelectedFile();
            boolean workOK = true;
            try {
                Scanner input = new Scanner(plik);
                while (input.hasNext()) {
                    String s = input.nextLine();
                    s = s.toLowerCase();
                    if (s.length() == 3 || s.length() == 4 || s.length() == 5 || s.length() == 6 || s.length() == 7 || s.length() == 13) {
                        for (int j = 0; j < s.length(); j++) {
                            if (s.charAt(j) >= 97 && s.charAt(j) <= 122) {
                                workOK = true;
                            } else {
                                workOK = false;
                                break;
                            }
                        }
                        if (workOK) {
                            writer.append("INSERT INTO words(word_id,word_name) VALUES (" + i + "," + s + ");\n");
                            i++;
                        }
                        workOK = true;
                    }
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            writer.close();
        }
    }

    public MenuKrzyzowka() throws FileNotFoundException {


        setSize(480, 370);
        setTitle("Okno główne programu");
        setLayout(null);



        bUzupelnianieKrzyzowki = new JButton("Uzupelnianie Krzyzowki");
        bUzupelnianieKrzyzowki.setBounds(150, 80, 200, 50);
        add(bUzupelnianieKrzyzowki);

        bDodawanieSlow = new JButton("Wczytywanie Słów");
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

    public static void main(String[] args) throws FileNotFoundException {
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

    public static String readToString(String fname) throws Exception {
        File file = new File(fname);
        return FileUtils.readFileToString(file, "utf-8");
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
            try {
                ReadFile();
                try {
                    con = DriverManager.getConnection(connectionString, "admin123", "admin123");
                    String createContacts = readToString("sql/HR_create.sql");
                    String populateContacts = readToString("sql/HR_loadCorrectData.sql");
                    con.createStatement().executeUpdate(createContacts);
                    con.createStatement().executeUpdate(populateContacts);
                } catch (Exception ex) {

                }
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        } else if (źródło == bWyjście) {
            System.exit(1);
        }
    }

}
