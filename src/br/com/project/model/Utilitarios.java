package br.com.project.model;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author contabilidade
 */
public class Utilitarios {

    public void limpaTela(JPanel container) {
        Component comp[] = container.getComponents();
        for (Component component : comp) {
            if (component instanceof JTextField) {
                ((JTextField)component).setText(null);
            }
        }
    }
}
