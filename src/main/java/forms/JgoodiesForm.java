package forms;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.*;
import java.awt.*;

public class JgoodiesForm {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new JgoodiesForm());
    }

    private JFrame frame;
    private JPanel panel;

    public JgoodiesForm() {
        initialize();
        frame.pack();
        frame.setSize(new Dimension(600, 400));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void initialize() {
        this.frame = new JFrame();
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setTitle("JGoodies Test Form");

        this.panel = new JPanel();
        this.panel.setLayout(new FormLayout(new ColumnSpec[]{
                FormSpecs.RELATED_GAP_COLSPEC,
                ColumnSpec.decode("45dlu")},
                new RowSpec[]{
                        FormSpecs.RELATED_GAP_ROWSPEC,
                        FormSpecs.DEFAULT_ROWSPEC}));
        frame.getContentPane().add(panel);
    }
}
