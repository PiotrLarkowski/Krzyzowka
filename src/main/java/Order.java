import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Order extends JFrame implements ActionListener {

    public static int[] order = new int[37];
    public static int[] order2 = new int[37];

    public static KrzyzowkaRysowanie okienko = null;
    public JButton bWyjście, bZatwierdzNowaKolenosc, bWprowadzZmiany;
    public JLabel lWiadomosc, lWiadomosc2;
    public JTextField tfKolejnosc1,tfKolejnosc2,tfKolejnosc3,tfKolejnosc4,tfKolejnosc5,tfKolejnosc6,tfKolejnosc7,tfKolejnosc8,
            tfKolejnosc9, tfKolejnosc10,tfKolejnosc11,tfKolejnosc12,tfKolejnosc13,tfKolejnosc14,tfKolejnosc15,tfKolejnosc16,
            tfKolejnosc17,tfKolejnosc18, tfKolejnosc19,tfKolejnosc20,tfKolejnosc21,tfKolejnosc22,tfKolejnosc23,tfKolejnosc24,
            tfKolejnosc25,tfKolejnosc26,tfKolejnosc27,tfKolejnosc28,tfKolejnosc29,tfKolejnosc30,tfKolejnosc31, tfKolejnosc32,
            tfKolejnosc33,tfKolejnosc34,tfKolejnosc35,tfKolejnosc36,tfKolejnosc37;
    public JTextField tfZmienionaKolejnosc1,tfZmienionaKolejnosc2,tfZmienionaKolejnosc3,tfZmienionaKolejnosc4,tfZmienionaKolejnosc5,tfZmienionaKolejnosc6,tfZmienionaKolejnosc7,tfZmienionaKolejnosc8,
            tfZmienionaKolejnosc9, tfZmienionaKolejnosc10,tfZmienionaKolejnosc11,tfZmienionaKolejnosc12,tfZmienionaKolejnosc13,tfZmienionaKolejnosc14,tfZmienionaKolejnosc15,tfZmienionaKolejnosc16,
            tfZmienionaKolejnosc17,tfZmienionaKolejnosc18, tfZmienionaKolejnosc19,tfZmienionaKolejnosc20,tfZmienionaKolejnosc21,tfZmienionaKolejnosc22,tfZmienionaKolejnosc23,tfZmienionaKolejnosc24,
            tfZmienionaKolejnosc25,tfZmienionaKolejnosc26,tfZmienionaKolejnosc27,tfZmienionaKolejnosc28,tfZmienionaKolejnosc29,tfZmienionaKolejnosc30,tfZmienionaKolejnosc31, tfZmienionaKolejnosc32,
            tfZmienionaKolejnosc33,tfZmienionaKolejnosc34,tfZmienionaKolejnosc35,tfZmienionaKolejnosc36,tfZmienionaKolejnosc37;

    private ImageIcon tlo;
    private JLabel lTlo;
    public JLabel lZmiana1, lZmiana2;
    public JTextField tfZmiana1, tfZmiana2;
    public Order() {

        for (int i = 0; i < KrzyzowkaRysowanie.mainOrderFindingTheWords.length; i++) {
            order[i] = KrzyzowkaRysowanie.mainOrderFindingTheWords[i] + 1;
            order2[i] = KrzyzowkaRysowanie.mainOrderFindingTheWords[i] + 1;
        }

        setSize(980, 380);
        setTitle("Kolejnosc wyszukiwania");
        setLayout(null);

        lZmiana1 = new JLabel("DOKONAJ ZMIANY: ");
        lZmiana1.setBounds(200, 150, 550, 20);
        add(lZmiana1);

        tfZmiana1 = new JTextField();
        tfZmiana1.setBounds(330, 150, 25, 30);
        add(tfZmiana1);

        lZmiana2 = new JLabel("ZMIEN NA: ");
        lZmiana2.setBounds(370, 150, 100, 20);
        add(lZmiana2);

        tfZmiana2 = new JTextField();
        tfZmiana2.setBounds(450, 150, 25, 30);
        add(tfZmiana2);

        lWiadomosc = new JLabel("Aktualna kolejnosc");
        lWiadomosc.setBounds(440, 65, 550, 20);
        add(lWiadomosc);

        bWprowadzZmiany = new JButton("Wykonaj zmiane");
        bWprowadzZmiany.setBounds(510, 150, 130, 30);
        add(bWprowadzZmiany);
        bWprowadzZmiany.addActionListener(this);

        lWiadomosc2 = new JLabel("Zmieniona kolejnosc");
        lWiadomosc2.setBounds(440, 220, 550, 20);
        add(lWiadomosc2);

        bZatwierdzNowaKolenosc = new JButton("Zatwierdz zmiany");
        bZatwierdzNowaKolenosc.setBounds(600, 340, 130, 20);
        add(bZatwierdzNowaKolenosc);
        bZatwierdzNowaKolenosc.addActionListener(this);

        bWyjście = new JButton("Wyjscie");
        bWyjście.setBounds(750, 340, 100, 20);
        add(bWyjście);
        bWyjście.addActionListener(this);
        // ------------------------------------------------------------------------------------------

        tfKolejnosc1 = new JTextField();
        tfKolejnosc1.setText("" + order[0]);
        tfKolejnosc1.setBounds(40, 90, 20, 30);
        tfKolejnosc1.setEnabled(false);
        add(tfKolejnosc1);

        tfKolejnosc2 = new JTextField(order[1]);
        tfKolejnosc2.setText("" + order[1]);
        tfKolejnosc2.setBounds(65, 90, 20, 30);
        tfKolejnosc2.setEnabled(false);
        add(tfKolejnosc2);

        tfKolejnosc3 = new JTextField(order[2]);
        tfKolejnosc3.setText("" + order[2]);
        tfKolejnosc3.setBounds(90, 90, 20, 30);
        tfKolejnosc3.setEnabled(false);
        add(tfKolejnosc3);

        tfKolejnosc4 = new JTextField(order[3]);
        tfKolejnosc4.setText("" + order[3]);
        tfKolejnosc4.setBounds(115, 90, 20, 30);
        tfKolejnosc4.setEnabled(false);
        add(tfKolejnosc4);

        tfKolejnosc5 = new JTextField(order[4]);
        tfKolejnosc5.setText("" + order[4]);
        tfKolejnosc5.setBounds(140, 90, 20, 30);
        tfKolejnosc5.setEnabled(false);
        add(tfKolejnosc5);

        tfKolejnosc6 = new JTextField(order[5]);
        tfKolejnosc6.setText("" + order[5]);
        tfKolejnosc6.setBounds(165, 90, 20, 30);
        tfKolejnosc6.setEnabled(false);
        add(tfKolejnosc6);

        tfKolejnosc7 = new JTextField(order[6]);
        tfKolejnosc7.setText("" + order[6]);
        tfKolejnosc7.setBounds(190, 90, 20, 30);
        tfKolejnosc7.setEnabled(false);
        add(tfKolejnosc7);

        tfKolejnosc8 = new JTextField(order[7]);
        tfKolejnosc8.setText("" + order[7]);
        tfKolejnosc8.setBounds(215, 90, 20, 30);
        tfKolejnosc8.setEnabled(false);
        add(tfKolejnosc8);

        tfKolejnosc9 = new JTextField(order[8]);
        tfKolejnosc9.setText("" + order[8]);
        tfKolejnosc9.setBounds(240, 90, 20, 30);
        tfKolejnosc9.setEnabled(false);
        add(tfKolejnosc9);

        tfKolejnosc10 = new JTextField(order[9]);
        tfKolejnosc10.setText("" + order[9]);
        tfKolejnosc10.setBounds(265, 90, 20, 30);
        tfKolejnosc10.setEnabled(false);
        add(tfKolejnosc10);

        // ----------------------------------------------------------------------------------------

        tfKolejnosc11 = new JTextField(order[10]);
        tfKolejnosc11.setText("" + order[10]);
        tfKolejnosc11.setBounds(290, 90, 25, 30);
        tfKolejnosc11.setEnabled(false);
        add(tfKolejnosc11);

        tfKolejnosc12 = new JTextField(order[11]);
        tfKolejnosc12.setText("" + order[11]);
        tfKolejnosc12.setBounds(315, 90, 25, 30);
        tfKolejnosc12.setEnabled(false);
        add(tfKolejnosc12);

        tfKolejnosc13 = new JTextField(order[12]);
        tfKolejnosc13.setText("" + order[12]);
        tfKolejnosc13.setBounds(340, 90, 25, 30);
        tfKolejnosc13.setEnabled(false);
        add(tfKolejnosc13);

        tfKolejnosc14 = new JTextField(order[13]);
        tfKolejnosc14.setText("" + order[13]);
        tfKolejnosc14.setBounds(365, 90, 25, 30);
        tfKolejnosc14.setEnabled(false);
        add(tfKolejnosc14);

        tfKolejnosc15 = new JTextField(order[14]);
        tfKolejnosc15.setText("" + order[14]);
        tfKolejnosc15.setBounds(390, 90, 25, 30);
        tfKolejnosc15.setEnabled(false);
        add(tfKolejnosc15);

        tfKolejnosc16 = new JTextField(order[15]);
        tfKolejnosc16.setText("" + order[15]);
        tfKolejnosc16.setBounds(415, 90, 25, 30);
        tfKolejnosc16.setEnabled(false);
        add(tfKolejnosc16);

        tfKolejnosc17 = new JTextField(order[16]);
        tfKolejnosc17.setText("" + order[16]);
        tfKolejnosc17.setBounds(440, 90, 25, 30);
        tfKolejnosc17.setEnabled(false);
        add(tfKolejnosc17);

        tfKolejnosc18 = new JTextField(order[17]);
        tfKolejnosc18.setText("" + order[17]);
        tfKolejnosc18.setBounds(465, 90, 25, 30);
        tfKolejnosc18.setEnabled(false);
        add(tfKolejnosc18);

        tfKolejnosc19 = new JTextField(order[18]);
        tfKolejnosc19.setText("" + order[18]);
        tfKolejnosc19.setBounds(490, 90, 25, 30);
        tfKolejnosc19.setEnabled(false);
        add(tfKolejnosc19);

        tfKolejnosc20 = new JTextField(order[19]);
        tfKolejnosc20.setText("" + order[19]);
        tfKolejnosc20.setBounds(515, 90, 25, 30);
        tfKolejnosc20.setEnabled(false);
        add(tfKolejnosc20);

        // ----------------------------------------------------------------------------------------

        tfKolejnosc21 = new JTextField(order[20]);
        tfKolejnosc21.setText("" + order[20]);
        tfKolejnosc21.setBounds(540, 90, 25, 30);
        tfKolejnosc21.setEnabled(false);
        add(tfKolejnosc21);

        tfKolejnosc22 = new JTextField(order[21]);
        tfKolejnosc22.setText("" + order[21]);
        tfKolejnosc22.setBounds(565, 90, 25, 30);
        tfKolejnosc22.setEnabled(false);
        add(tfKolejnosc22);

        tfKolejnosc23 = new JTextField(order[22]);
        tfKolejnosc23.setText("" + order[22]);
        tfKolejnosc23.setBounds(590, 90, 25, 30);
        tfKolejnosc23.setEnabled(false);
        add(tfKolejnosc23);

        tfKolejnosc24 = new JTextField(order[23]);
        tfKolejnosc24.setText("" + order[23]);
        tfKolejnosc24.setBounds(615, 90, 25, 30);
        tfKolejnosc24.setEnabled(false);
        add(tfKolejnosc24);

        tfKolejnosc25 = new JTextField(order[24]);
        tfKolejnosc25.setText("" + order[24]);
        tfKolejnosc25.setBounds(640, 90, 25, 30);
        tfKolejnosc25.setEnabled(false);
        add(tfKolejnosc25);

        tfKolejnosc26 = new JTextField(order[25]);
        tfKolejnosc26.setText("" + order[25]);
        tfKolejnosc26.setBounds(665, 90, 25, 30);
        tfKolejnosc26.setEnabled(false);
        add(tfKolejnosc26);

        tfKolejnosc27 = new JTextField(order[26]);
        tfKolejnosc27.setText("" + order[26]);
        tfKolejnosc27.setBounds(690, 90, 25, 30);
        tfKolejnosc27.setEnabled(false);
        add(tfKolejnosc27);

        tfKolejnosc28 = new JTextField(order[27]);
        tfKolejnosc28.setText("" + order[27]);
        tfKolejnosc28.setBounds(715, 90, 25, 30);
        tfKolejnosc28.setEnabled(false);
        add(tfKolejnosc28);

        tfKolejnosc29 = new JTextField(order[28]);
        tfKolejnosc29.setText("" + order[28]);
        tfKolejnosc29.setBounds(740, 90, 25, 30);
        tfKolejnosc29.setEnabled(false);
        add(tfKolejnosc29);

        tfKolejnosc30 = new JTextField(order[29]);
        tfKolejnosc30.setText("" + order[29]);
        tfKolejnosc30.setBounds(765, 90, 25, 30);
        tfKolejnosc30.setEnabled(false);
        add(tfKolejnosc30);

        // ----------------------------------------------------------------------------------------

        tfKolejnosc31 = new JTextField(order[30]);
        tfKolejnosc31.setText("" + order[30]);
        tfKolejnosc31.setBounds(790, 90, 25, 30);
        tfKolejnosc31.setEnabled(false);
        add(tfKolejnosc31);

        tfKolejnosc32 = new JTextField(order[31]);
        tfKolejnosc32.setText("" + order[31]);
        tfKolejnosc32.setBounds(815, 90, 25, 30);
        tfKolejnosc32.setEnabled(false);
        add(tfKolejnosc32);

        tfKolejnosc33 = new JTextField(order[32]);
        tfKolejnosc33.setText("" + order[32]);
        tfKolejnosc33.setBounds(840, 90, 25, 30);
        tfKolejnosc33.setEnabled(false);
        add(tfKolejnosc33);

        tfKolejnosc34 = new JTextField(order[33]);
        tfKolejnosc34.setText("" + order[33]);
        tfKolejnosc34.setBounds(865, 90, 25, 30);
        tfKolejnosc34.setEnabled(false);
        add(tfKolejnosc34);

        tfKolejnosc35 = new JTextField(order[34]);
        tfKolejnosc35.setText("" + order[34]);
        tfKolejnosc35.setBounds(890, 90, 25, 30);
        tfKolejnosc35.setEnabled(false);
        add(tfKolejnosc35);

        tfKolejnosc36 = new JTextField(order[35]);
        tfKolejnosc36.setText("" + order[35]);
        tfKolejnosc36.setBounds(915, 90, 25, 30);
        tfKolejnosc36.setEnabled(false);
        add(tfKolejnosc36);

        tfKolejnosc37 = new JTextField(order[36]);
        tfKolejnosc37.setText("" + order[36]);
        tfKolejnosc37.setBounds(940, 90, 25, 30);
        tfKolejnosc37.setEnabled(false);
        add(tfKolejnosc37);

        // ----------------------------------------------------------------------------------------

        // ------------------------------------------------------------------------------------------

        tfZmienionaKolejnosc1 = new JTextField();
        tfZmienionaKolejnosc1.setText("" + order2[0]);
        tfZmienionaKolejnosc1.setBounds(40, 250, 20, 30);
        tfZmienionaKolejnosc1.setEnabled(false);
        add(tfZmienionaKolejnosc1);

        tfZmienionaKolejnosc2 = new JTextField(order[1]);
        tfZmienionaKolejnosc2.setText("" + order2[1]);
        tfZmienionaKolejnosc2.setBounds(65, 250, 20, 30);
        tfZmienionaKolejnosc2.setEnabled(false);
        add(tfZmienionaKolejnosc2);

        tfZmienionaKolejnosc3 = new JTextField(order[2]);
        tfZmienionaKolejnosc3.setText("" + order2[2]);
        tfZmienionaKolejnosc3.setBounds(90, 250, 20, 30);
        tfZmienionaKolejnosc3.setEnabled(false);
        add(tfZmienionaKolejnosc3);

        tfZmienionaKolejnosc4 = new JTextField(order[3]);
        tfZmienionaKolejnosc4.setText("" + order2[3]);
        tfZmienionaKolejnosc4.setBounds(115, 250, 20, 30);
        tfZmienionaKolejnosc4.setEnabled(false);
        add(tfZmienionaKolejnosc4);

        tfZmienionaKolejnosc5 = new JTextField(order[4]);
        tfZmienionaKolejnosc5.setText("" + order2[4]);
        tfZmienionaKolejnosc5.setBounds(140, 250, 20, 30);
        tfZmienionaKolejnosc5.setEnabled(false);
        add(tfZmienionaKolejnosc5);

        tfZmienionaKolejnosc6 = new JTextField(order[5]);
        tfZmienionaKolejnosc6.setText("" + order2[5]);
        tfZmienionaKolejnosc6.setBounds(165, 250, 20, 30);
        tfZmienionaKolejnosc6.setEnabled(false);
        add(tfZmienionaKolejnosc6);

        tfZmienionaKolejnosc7 = new JTextField(order[6]);
        tfZmienionaKolejnosc7.setText("" + order2[6]);
        tfZmienionaKolejnosc7.setBounds(190, 250, 20, 30);
        tfZmienionaKolejnosc7.setEnabled(false);
        add(tfZmienionaKolejnosc7);

        tfZmienionaKolejnosc8 = new JTextField(order[7]);
        tfZmienionaKolejnosc8.setText("" + order2[7]);
        tfZmienionaKolejnosc8.setBounds(215, 250, 20, 30);
        tfZmienionaKolejnosc8.setEnabled(false);
        add(tfZmienionaKolejnosc8);

        tfZmienionaKolejnosc9 = new JTextField(order[8]);
        tfZmienionaKolejnosc9.setText("" + order2[8]);
        tfZmienionaKolejnosc9.setBounds(240, 250, 20, 30);
        tfZmienionaKolejnosc9.setEnabled(false);
        add(tfZmienionaKolejnosc9);

        tfZmienionaKolejnosc10 = new JTextField(order[9]);
        tfZmienionaKolejnosc10.setText("" + order2[9]);
        tfZmienionaKolejnosc10.setBounds(265, 250, 20, 30);
        tfZmienionaKolejnosc10.setEnabled(false);
        add(tfZmienionaKolejnosc10);

        // ----------------------------------------------------------------------------------------

        tfZmienionaKolejnosc11 = new JTextField(order[10]);
        tfZmienionaKolejnosc11.setText("" + order2[10]);
        tfZmienionaKolejnosc11.setBounds(290, 250, 25, 30);
        tfZmienionaKolejnosc11.setEnabled(false);
        add(tfZmienionaKolejnosc11);

        tfZmienionaKolejnosc12 = new JTextField(order[11]);
        tfZmienionaKolejnosc12.setText("" + order2[11]);
        tfZmienionaKolejnosc12.setBounds(315, 250, 25, 30);
        tfZmienionaKolejnosc12.setEnabled(false);
        add(tfZmienionaKolejnosc12);

        tfZmienionaKolejnosc13 = new JTextField(order[12]);
        tfZmienionaKolejnosc13.setText("" + order2[12]);
        tfZmienionaKolejnosc13.setBounds(340, 250, 25, 30);
        tfZmienionaKolejnosc13.setEnabled(false);
        add(tfZmienionaKolejnosc13);

        tfZmienionaKolejnosc14 = new JTextField(order[13]);
        tfZmienionaKolejnosc14.setText("" + order2[13]);
        tfZmienionaKolejnosc14.setBounds(365, 250, 25, 30);
        tfZmienionaKolejnosc14.setEnabled(false);
        add(tfZmienionaKolejnosc14);

        tfZmienionaKolejnosc15 = new JTextField(order[14]);
        tfZmienionaKolejnosc15.setText("" + order2[14]);
        tfZmienionaKolejnosc15.setBounds(390, 250, 25, 30);
        tfZmienionaKolejnosc15.setEnabled(false);
        add(tfZmienionaKolejnosc15);

        tfZmienionaKolejnosc16 = new JTextField(order[15]);
        tfZmienionaKolejnosc16.setText("" + order2[15]);
        tfZmienionaKolejnosc16.setBounds(415, 250, 25, 30);
        tfZmienionaKolejnosc16.setEnabled(false);
        add(tfZmienionaKolejnosc16);

        tfZmienionaKolejnosc17 = new JTextField(order[16]);
        tfZmienionaKolejnosc17.setText("" + order2[16]);
        tfZmienionaKolejnosc17.setBounds(440, 250, 25, 30);
        tfZmienionaKolejnosc17.setEnabled(false);
        add(tfZmienionaKolejnosc17);

        tfZmienionaKolejnosc18 = new JTextField(order[17]);
        tfZmienionaKolejnosc18.setText("" + order2[17]);
        tfZmienionaKolejnosc18.setBounds(465, 250, 25, 30);
        tfZmienionaKolejnosc18.setEnabled(false);
        add(tfZmienionaKolejnosc18);

        tfZmienionaKolejnosc19 = new JTextField(order[18]);
        tfZmienionaKolejnosc19.setText("" + order2[18]);
        tfZmienionaKolejnosc19.setBounds(490, 250, 25, 30);
        tfZmienionaKolejnosc19.setEnabled(false);
        add(tfZmienionaKolejnosc19);

        tfZmienionaKolejnosc20 = new JTextField(order[19]);
        tfZmienionaKolejnosc20.setText("" + order2[19]);
        tfZmienionaKolejnosc20.setBounds(515, 250, 25, 30);
        tfZmienionaKolejnosc20.setEnabled(false);
        add(tfZmienionaKolejnosc20);

        // ----------------------------------------------------------------------------------------

        tfZmienionaKolejnosc21 = new JTextField(order[20]);
        tfZmienionaKolejnosc21.setText("" + order2[20]);
        tfZmienionaKolejnosc21.setBounds(540, 250, 25, 30);
        tfZmienionaKolejnosc21.setEnabled(false);
        add(tfZmienionaKolejnosc21);

        tfZmienionaKolejnosc22 = new JTextField(order[21]);
        tfZmienionaKolejnosc22.setText("" + order2[21]);
        tfZmienionaKolejnosc22.setBounds(565, 250, 25, 30);
        tfZmienionaKolejnosc22.setEnabled(false);
        add(tfZmienionaKolejnosc22);

        tfZmienionaKolejnosc23 = new JTextField(order[22]);
        tfZmienionaKolejnosc23.setText("" + order2[22]);
        tfZmienionaKolejnosc23.setBounds(590, 250, 25, 30);
        tfZmienionaKolejnosc23.setEnabled(false);
        add(tfZmienionaKolejnosc23);

        tfZmienionaKolejnosc24 = new JTextField(order[23]);
        tfZmienionaKolejnosc24.setText("" + order2[23]);
        tfZmienionaKolejnosc24.setBounds(615, 250, 25, 30);
        tfZmienionaKolejnosc24.setEnabled(false);
        add(tfZmienionaKolejnosc24);

        tfZmienionaKolejnosc25 = new JTextField(order[24]);
        tfZmienionaKolejnosc25.setText("" + order2[24]);
        tfZmienionaKolejnosc25.setBounds(640, 250, 25, 30);
        tfZmienionaKolejnosc25.setEnabled(false);
        add(tfZmienionaKolejnosc25);

        tfZmienionaKolejnosc26 = new JTextField(order[25]);
        tfZmienionaKolejnosc26.setText("" + order2[25]);
        tfZmienionaKolejnosc26.setBounds(665, 250, 25, 30);
        tfZmienionaKolejnosc26.setEnabled(false);
        add(tfZmienionaKolejnosc26);

        tfZmienionaKolejnosc27 = new JTextField(order[26]);
        tfZmienionaKolejnosc27.setText("" + order2[26]);
        tfZmienionaKolejnosc27.setBounds(690, 250, 25, 30);
        tfZmienionaKolejnosc27.setEnabled(false);
        add(tfZmienionaKolejnosc27);

        tfZmienionaKolejnosc28 = new JTextField(order[27]);
        tfZmienionaKolejnosc28.setText("" + order2[27]);
        tfZmienionaKolejnosc28.setBounds(715, 250, 25, 30);
        tfZmienionaKolejnosc28.setEnabled(false);
        add(tfZmienionaKolejnosc28);

        tfZmienionaKolejnosc29 = new JTextField(order[28]);
        tfZmienionaKolejnosc29.setText("" + order2[28]);
        tfZmienionaKolejnosc29.setBounds(740, 250, 25, 30);
        tfZmienionaKolejnosc29.setEnabled(false);
        add(tfZmienionaKolejnosc29);

        tfZmienionaKolejnosc30 = new JTextField(order[29]);
        tfZmienionaKolejnosc30.setText("" + order2[29]);
        tfZmienionaKolejnosc30.setBounds(765, 250, 25, 30);
        tfZmienionaKolejnosc30.setEnabled(false);
        add(tfZmienionaKolejnosc30);

        // ----------------------------------------------------------------------------------------

        tfZmienionaKolejnosc31 = new JTextField(order[30]);
        tfZmienionaKolejnosc31.setText("" + order2[30]);
        tfZmienionaKolejnosc31.setBounds(790, 250, 25, 30);
        tfZmienionaKolejnosc31.setEnabled(false);
        add(tfZmienionaKolejnosc31);

        tfZmienionaKolejnosc32 = new JTextField(order[31]);
        tfZmienionaKolejnosc32.setText("" + order2[31]);
        tfZmienionaKolejnosc32.setBounds(815, 250, 25, 30);
        tfZmienionaKolejnosc32.setEnabled(false);
        add(tfZmienionaKolejnosc32);

        tfZmienionaKolejnosc33 = new JTextField(order[32]);
        tfZmienionaKolejnosc33.setText("" + order2[32]);
        tfZmienionaKolejnosc33.setBounds(840, 250, 25, 30);
        tfZmienionaKolejnosc33.setEnabled(false);
        add(tfZmienionaKolejnosc33);

        tfZmienionaKolejnosc34 = new JTextField(order[33]);
        tfZmienionaKolejnosc34.setText("" + order2[33]);
        tfZmienionaKolejnosc34.setBounds(865, 250, 25, 30);
        tfZmienionaKolejnosc34.setEnabled(false);
        add(tfZmienionaKolejnosc34);

        tfZmienionaKolejnosc35 = new JTextField(order[34]);
        tfZmienionaKolejnosc35.setText("" + order2[34]);
        tfZmienionaKolejnosc35.setBounds(890, 250, 25, 30);
        tfZmienionaKolejnosc35.setEnabled(false);
        add(tfZmienionaKolejnosc35);

        tfZmienionaKolejnosc36 = new JTextField(order[35]);
        tfZmienionaKolejnosc36.setText("" + order2[35]);
        tfZmienionaKolejnosc36.setBounds(915, 250, 25, 30);
        tfZmienionaKolejnosc36.setEnabled(false);
        add(tfZmienionaKolejnosc36);

        tfZmienionaKolejnosc37 = new JTextField(order[36]);
        tfZmienionaKolejnosc37.setText("" + order2[36]);
        tfZmienionaKolejnosc37.setBounds(940, 250, 25, 30);
        tfZmienionaKolejnosc37.setEnabled(false);
        add(tfZmienionaKolejnosc37);

        // ----------------------------------------------------------------------------------------


        tlo = new ImageIcon(this.getClass().getResource("/OrderFrame.png"));
        lTlo = new JLabel(tlo);
        lTlo.setSize(980,380);
        lTlo.setFocusable(false);
        add(lTlo);

        try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch(Exception e)
        {

        }
    }

    public void SetOrder(){
        tfZmienionaKolejnosc1.setText("" + order2[0]);
        tfZmienionaKolejnosc2.setText("" + order2[1]);
        tfZmienionaKolejnosc3.setText("" + order2[2]);
        tfZmienionaKolejnosc4.setText("" + order2[3]);
        tfZmienionaKolejnosc5.setText("" + order2[4]);
        tfZmienionaKolejnosc6.setText("" + order2[5]);
        tfZmienionaKolejnosc7.setText("" + order2[6]);
        tfZmienionaKolejnosc8.setText("" + order2[7]);
        tfZmienionaKolejnosc9.setText("" + order2[8]);
        tfZmienionaKolejnosc10.setText("" + order2[9]);
        tfZmienionaKolejnosc11.setText("" + order2[10]);
        tfZmienionaKolejnosc12.setText("" + order2[11]);
        tfZmienionaKolejnosc13.setText("" + order2[12]);
        tfZmienionaKolejnosc14.setText("" + order2[13]);
        tfZmienionaKolejnosc15.setText("" + order2[14]);
        tfZmienionaKolejnosc16.setText("" + order2[15]);
        tfZmienionaKolejnosc17.setText("" + order2[16]);
        tfZmienionaKolejnosc18.setText("" + order2[17]);
        tfZmienionaKolejnosc19.setText("" + order2[18]);
        tfZmienionaKolejnosc20.setText("" + order2[19]);
        tfZmienionaKolejnosc21.setText("" + order2[20]);
        tfZmienionaKolejnosc22.setText("" + order2[21]);
        tfZmienionaKolejnosc23.setText("" + order2[22]);
        tfZmienionaKolejnosc24.setText("" + order2[23]);
        tfZmienionaKolejnosc25.setText("" + order2[24]);
        tfZmienionaKolejnosc26.setText("" + order2[25]);
        tfZmienionaKolejnosc27.setText("" + order2[26]);
        tfZmienionaKolejnosc28.setText("" + order2[27]);
        tfZmienionaKolejnosc29.setText("" + order2[28]);
        tfZmienionaKolejnosc30.setText("" + order2[29]);
        tfZmienionaKolejnosc31.setText("" + order2[30]);
        tfZmienionaKolejnosc32.setText("" + order2[31]);
        tfZmienionaKolejnosc33.setText("" + order2[32]);
        tfZmienionaKolejnosc34.setText("" + order2[33]);
        tfZmienionaKolejnosc35.setText("" + order2[34]);
        tfZmienionaKolejnosc36.setText("" + order2[35]);
        tfZmienionaKolejnosc37.setText("" + order2[36]);

    }


    public void actionPerformed(ActionEvent e) {
        Object z = e.getSource();
        if (z == bZatwierdzNowaKolenosc){
            for (int i = 0; i < order2.length; i++) {
                KrzyzowkaRysowanie.mainOrderFindingTheWords[i] = order2[i];
                KrzyzowkaRysowanie.setOrderLabel();
            }
        } else if (z == bWyjście) {
            this.dispose();
        }else if(z == bWprowadzZmiany){
            try{
                order2[Integer.parseInt(tfZmiana1.getText())-1] = Integer.parseInt(tfZmiana2.getText());
                order2[Integer.parseInt(tfZmiana2.getText())-1] = Integer.parseInt(tfZmiana1.getText());
                tfZmiana1.setText("");
                tfZmiana2.setText("");
                SetOrder();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Podano bledna wartosc do zamiany!", "Blad!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}

