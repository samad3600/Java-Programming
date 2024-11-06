import java.awt.*;
import java.awt.event.*;

public class SimpleAWT {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("Simple AWT Example");

        // Create a button
        Button button = new Button("Click Me");

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button was clicked!");
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Make the frame visible
        frame.setVisible(true);

        // Add a window listener to close the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
