import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AddingWord extends JFrame implements ActionListener {

    protected SessionFactory sessionFactory = new HibernateFactory().getSessionFactory();

    public static KrzyzowkaRysowanie okienko = null;
    public JButton bWyjście, bWprowadzNoweSlowo, bZatwierdz;
    public JLabel lWiadomosc, lWiadomosc2, lWiadomosc3;

    public JComboBox cbIleLiter;
    public JTextField tfIleLiter;

    public JTextField tfLitera1, tfLitera2, tfLitera3, tfLitera4, tfLitera5, tfLitera6, tfLitera7, tfLitera8, tfLitera9,
            tfLitera10, tfLitera11,tfLitera12,tfLitera13;

    private ImageIcon tlo;
    private JLabel lTlo;

    public AddingWord() {
        setSize(480, 370);
        setTitle("Wprowadzanie nowych słów");
        setLayout(null);

        lWiadomosc = new JLabel("Podaj ilu literowe słowo chcesz wprowadzić:");
        lWiadomosc.setBounds(60, 70, 550, 20);
        add(lWiadomosc);



//        tfIleLiter = new JTextField();
//        tfIleLiter.setBounds(400, 125, 25, 25);
//        add(tfIleLiter);

        cbIleLiter = new JComboBox();
        cbIleLiter.setBounds(90, 110, 80, 20);
        cbIleLiter.addItem("3");
        cbIleLiter.addItem("4");
        cbIleLiter.addItem("5");
        cbIleLiter.addItem("6");
        cbIleLiter.addItem("7");
        cbIleLiter.addItem("13");
        add(cbIleLiter);
        cbIleLiter.addActionListener(this);

        bZatwierdz = new JButton("Zatweirdz");
        bZatwierdz.setBounds(200, 110, 100, 20);
        add(bZatwierdz);
        bZatwierdz.addActionListener(this);

        lWiadomosc2 = new JLabel("Podaj kolejne litery");
        lWiadomosc2.setBounds(60, 160, 200, 20);
        add(lWiadomosc2);

        //---------------------------------------------------------------------------------------

        tfLitera1 = new JTextField();
        tfLitera1.setBounds(60, 200, 35, 35);
        add(tfLitera1);
        tfLitera1.setEnabled(false);

        tfLitera2 = new JTextField();
        tfLitera2.setBounds(100, 200, 35, 35);
        add(tfLitera2);
        tfLitera2.setEnabled(false);

        tfLitera3 = new JTextField();
        tfLitera3.setBounds(140, 200, 35, 35);
        add(tfLitera3);
        tfLitera3.setEnabled(false);

        tfLitera4 = new JTextField();
        tfLitera4.setBounds(180, 200, 35, 35);
        add(tfLitera4);
        tfLitera4.setEnabled(false);

        tfLitera5 = new JTextField();
        tfLitera5.setBounds(220, 200, 35, 35);
        add(tfLitera5);
        tfLitera5.setEnabled(false);

        tfLitera6 = new JTextField();
        tfLitera6.setBounds(260, 200, 35, 35);
        add(tfLitera6);
        tfLitera6.setEnabled(false);

        tfLitera7 = new JTextField();
        tfLitera7.setBounds(300, 200, 35, 35);
        add(tfLitera7);
        tfLitera7.setEnabled(false);

        tfLitera8 = new JTextField();
        tfLitera8.setBounds(340, 200, 35, 35);
        add(tfLitera8);
        tfLitera8.setEnabled(false);

        tfLitera9 = new JTextField();
        tfLitera9.setBounds(380, 200, 35, 35);
        add(tfLitera9);
        tfLitera9.setEnabled(false);

        tfLitera10 = new JTextField();
        tfLitera10.setBounds(420, 200, 35, 35);
        add(tfLitera10);
        tfLitera10.setEnabled(false);

        tfLitera11 = new JTextField();
        tfLitera11.setBounds(60, 240, 35, 35);
        add(tfLitera11);
        tfLitera11.setEnabled(false);

        tfLitera12 = new JTextField();
        tfLitera12.setBounds(100, 240, 35, 35);
        add(tfLitera12);
        tfLitera12.setEnabled(false);

        tfLitera13 = new JTextField();
        tfLitera13.setBounds(140, 240, 35, 35);
        add(tfLitera13);
        tfLitera13.setEnabled(false);

        //---------------------------------------------------------------------------------------

        bWprowadzNoweSlowo = new JButton("Wprowadź nowe słowo");
        bWprowadzNoweSlowo.setBounds(100, 290, 100, 20);
        add(bWprowadzNoweSlowo);
        bWprowadzNoweSlowo.addActionListener(this);

        bWyjście = new JButton("Powrót");
        bWyjście.setBounds(280, 290, 100, 20);
        add(bWyjście);
        bWyjście.addActionListener(this);

        tlo = new ImageIcon(this.getClass().getResource("/fame.png"));
        lTlo = new JLabel(tlo);
        lTlo.setSize(490,370);
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

    public void actionPerformed(ActionEvent e) {
        Object z = e.getSource();
        if (z == bWyjście) {
            this.dispose();
        }else if(z == bZatwierdz){
            int ileLiter = Integer.parseInt(cbIleLiter.getSelectedItem().toString());

            tfLitera1.setEnabled(false);
            setAllEnabled();

            if(ileLiter == 3){
                tfLitera1.setEnabled(true);
                tfLitera2.setEnabled(true);
                tfLitera3.setEnabled(true);
            }
            else if(ileLiter == 4){
                tfLitera1.setEnabled(true);
                tfLitera2.setEnabled(true);
                tfLitera3.setEnabled(true);
                tfLitera4.setEnabled(true);
            }
            else if(ileLiter == 5){
                tfLitera1.setEnabled(true);
                tfLitera2.setEnabled(true);
                tfLitera3.setEnabled(true);
                tfLitera4.setEnabled(true);
                tfLitera5.setEnabled(true);
            }
            else if(ileLiter == 6){
                tfLitera1.setEnabled(true);
                tfLitera2.setEnabled(true);
                tfLitera3.setEnabled(true);
                tfLitera4.setEnabled(true);
                tfLitera5.setEnabled(true);
                tfLitera6.setEnabled(true);
            }
            else if(ileLiter == 7){
                tfLitera1.setEnabled(true);
                tfLitera2.setEnabled(true);
                tfLitera3.setEnabled(true);
                tfLitera4.setEnabled(true);
                tfLitera5.setEnabled(true);
                tfLitera6.setEnabled(true);
                tfLitera7.setEnabled(true);
            }
            else if(ileLiter == 13){
                tfLitera1.setEnabled(true);
                tfLitera2.setEnabled(true);
                tfLitera3.setEnabled(true);
                tfLitera4.setEnabled(true);
                tfLitera5.setEnabled(true);
                tfLitera6.setEnabled(true);
                tfLitera7.setEnabled(true);
                tfLitera8.setEnabled(true);
                tfLitera9.setEnabled(true);
                tfLitera10.setEnabled(true);
                tfLitera11.setEnabled(true);
                tfLitera12.setEnabled(true);
                tfLitera13.setEnabled(true);
            }
        }else if(z == bWprowadzNoweSlowo){
            int intOdpowiedz = JOptionPane.showConfirmDialog(null, "Czy chcesz dodać  do słownika następujące słowo "
                    + tfLitera1.getText() + tfLitera2.getText() + tfLitera3.getText() + tfLitera4.getText() + tfLitera5.getText() + tfLitera6.getText() +
                    tfLitera7.getText() + tfLitera8.getText() + tfLitera9.getText() + tfLitera10.getText() + tfLitera11.getText() +
                    tfLitera12.getText() + tfLitera13.getText(), "Pytanie", JOptionPane.YES_NO_OPTION);
            if(intOdpowiedz == JOptionPane.YES_OPTION){

                StringBuilder stringSB = new StringBuilder();
                stringSB.append(tfLitera1.getText());
                stringSB.append(tfLitera2.getText());
                stringSB.append(tfLitera3.getText());
                stringSB.append(tfLitera4.getText());
                stringSB.append(tfLitera5.getText());
                stringSB.append(tfLitera6.getText());
                stringSB.append(tfLitera7.getText());
                stringSB.append(tfLitera8.getText());
                stringSB.append(tfLitera9.getText());
                stringSB.append(tfLitera10.getText());
                stringSB.append(tfLitera11.getText());
                stringSB.append(tfLitera12.getText());
                stringSB.append(tfLitera13.getText());

                WordDao movieDao = new WordDao(sessionFactory);
                Words word = new Words();
//                word.setId(500L);
                word.setName(stringSB.toString().toUpperCase());
                movieDao.save(word);
//                SessionFactory sessionFactory = new HibernateFactory().getSessionFactory();
//                Session session = sessionFactory.openSession();
//                Transaction transaction = session.beginTransaction();
//                String word = (String)session.save(stringSB.toString().toUpperCase());

//                transaction.commit();
//                session.close();
            }else{
                setAllEnabled();
            }
        }
    }

    private void setAllEnabled() {
        tfLitera2.setEnabled(false);
        tfLitera3.setEnabled(false);
        tfLitera4.setEnabled(false);
        tfLitera5.setEnabled(false);
        tfLitera6.setEnabled(false);
        tfLitera7.setEnabled(false);
        tfLitera8.setEnabled(false);
        tfLitera9.setEnabled(false);
        tfLitera10.setEnabled(false);
        tfLitera11.setEnabled(false);
        tfLitera12.setEnabled(false);
        tfLitera13.setEnabled(false);
    }
}


