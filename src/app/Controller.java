package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Controller {

    //private Model model;
    private NewJFrame view;

    public Controller(NewJFrame view) {
        this.view = view;

        //view vezerlők elérése
        JButton btn = view.getBtn();

        //2.
        //JLabel lbl = view.getLbl();
        //vivew vezérlők eseményeinek összekötése
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //1.
                //System.out.println("Klikkeltél!");

                //2. csak egy olyan view.val tud dolgozni amiben van label/JLabel lbl = view.getLbl(); itt lenne minden kattintásnál lefogjuk kérdezni/végrehajtódik
                //lbl.setText("Klikkeltél!");
                //view.megjelenit("Klikkeltél!\r\n"); //ez windows-ra van
                view.megjelenit("Klikkeltél!"+System.lineSeparator());
            }
        });
    }

}
