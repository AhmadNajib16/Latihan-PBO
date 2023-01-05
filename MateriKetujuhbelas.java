import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class MateriKetujuhbelas extends JFrame{
    private JButton plainJButton;
    private JButton fancyJButton;

    // ButtonFrame adds JButtons to JFrame
    public MateriKetujuhbelas()
    {
        super("Testing Buttons");
        setLayout(new FlowLayout () );

        plainJButton = new JButton("Plain Button");
        add(plainJButton);

        Icon bug1 = new ImageIcon( getClass().getResource("Bug1.gif"));
        Icon bug2 = new ImageIcon( getClass().getResource("Bug2.gif"));
        fancyJButton = new JButton( "Fancy Button", bug1);
        fancyJButton.setRolloverIcon(bug2);
        add (fancyJButton);

        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);
    }
        private class ButtonHandler implements ActionListener{
            //handle button event
            public void actionPerformed(ActionEvent event)
            {
                JOptionPane.showMessageDialog(MateriKetujuhbelas.this, String.format("You Pressed: %s", event.getActionCommand()));
            }
        }
}
