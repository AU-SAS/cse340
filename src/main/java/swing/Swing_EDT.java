package swing;

import javax.swing.*;
import java.awt.*;

public class Swing_EDT {

  private Swing_EDT() {
  }

  public static void main(String[] args) {
    // Schedule the GUI creation and display on the Event Dispatch Thread
    SwingUtilities.invokeLater(Swing_EDT::createAndShowGUI);
  }

  private static void createAndShowGUI() {

    // Ensure we are on the EDT (for verification, not strictly necessary for safety here)
    assert EventQueue.isDispatchThread();

    JFrame frame = new JFrame("My Swing Application");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);
    frame.setLocationRelativeTo(null); // Center the frame

    JLabel label = new JLabel("Hello, Swing!");
    label.setHorizontalAlignment(SwingConstants.CENTER);

    JPanel panel = new JPanel(new GridBagLayout());
    panel.add(label);

    frame.add(panel, BorderLayout.CENTER);

    frame.setVisible(true);
  }
}