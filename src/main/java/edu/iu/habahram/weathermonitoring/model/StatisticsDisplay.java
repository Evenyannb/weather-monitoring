package edu.iu.habahram.weathermonitoring.model;
import javax.swing.*;
import java.awt.*;

public class StatisticsDisplay {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // Create the main frame
        JFrame frame = new JFrame("Weather Stats");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 200);
        frame.setLayout(new BorderLayout());

        // Create a panel to hold all components
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create labels for the weather stats
        JLabel title = new JLabel("Weather Stats");
        title.setFont(new Font("Arial", Font.BOLD, 16));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel avgTemp = new JLabel("Avg. temp: 62°");
        avgTemp.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel minTemp = new JLabel("Min. temp: 50°");
        minTemp.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel maxTemp = new JLabel("Max. temp: 78°");
        maxTemp.setAlignmentX(Component.CENTER_ALIGNMENT);

        
        panel.add(title);
        panel.add(Box.createRigidArea(new Dimension(0, 5))); // spacer
        panel.add(avgTemp);
        panel.add(minTemp);
        panel.add(maxTemp);

        
        frame.add(panel, BorderLayout.CENTER);

        
        frame.setVisible(true);
    }
}
