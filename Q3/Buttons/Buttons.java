// Design an applet which uses Card
// layout with 3 Buttons. When the user
// clicks on any button, the background
// layout color must change.

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Buttons extends Applet {
    String msg;
    Button redButton, greenButton, blueButton;
    Panel myPanel;
    CardLayout card1;
    Label myLabel;

    public void init() {
        myLabel = new Label("Click the button to change background colour");
        redButton = new Button("Red");
        greenButton = new Button("Green");
        blueButton = new Button("Blue");

        card1 = new CardLayout();
        myPanel = new Panel();
        myPanel.setLayout(card1);

        Panel myPanel1 = new Panel();
        myPanel1.add(redButton);
        myPanel1.add(greenButton);
        myPanel1.add(blueButton);

        myPanel.add(myPanel1, "panel");
        add(myPanel);

        redButton.addActionListener((e)->{
            showStatus("You pressed red, Background changed to Red");
            setBackground(Color.red);
        });
        greenButton.addActionListener((e)->{
            showStatus("You pressed Green, Background changed to Green");
            setBackground(Color.green);
        });
        blueButton.addActionListener((e)->{
            showStatus("You pressed Blue, Background changed to Blue");
            setBackground(Color.blue);
        });
    }

   
}
