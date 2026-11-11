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
        JLabel lbl = view.getLbl();
        JButton btn = view.getBtn();
        
        //vezérlők eseményeinek összekötése
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Klikkeltél!");
                lbl.setText("Klikkeltél!");
            }
        });
    }

}
