package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Controller {

    //private Model model;
    private NewJFrame view;

    public Controller(NewJFrame view) {
        this.view = view;

        JButton btn = view.getBtn();
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Klikkeltél!");
            }
        });
    }

}
