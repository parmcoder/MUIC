package l_ano_swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonFrame extends JFrame {

    private JPanel buttonPanel;

    //  constructor
    public ButtonFrame(){
        setTitle("ButtonFrame");
        setSize(300,400);

        buttonPanel = new JPanel();

        makeButton("Green", Color.YELLOW);
        makeButton("Blue", Color.BLUE);
        makeButton("RED", Color.RED);

        //Add panel to the frame
        this.add(buttonPanel);
    }

    private void makeButton(String name, final Color backgroundColor) {
        JButton button = new JButton(name);
        buttonPanel.add(button);

        // Notice anonymous class here
        button.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event){
                        buttonPanel.setBackground(backgroundColor);
                    }
                }
        );
    }
}
