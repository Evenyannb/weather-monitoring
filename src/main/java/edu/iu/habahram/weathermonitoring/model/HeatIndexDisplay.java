package edu.iu.habahram.weathermonitoring.model;
import javax.swing.*;
import java.awt.*;

public class HeatIndexDisplay {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI(50, 23)); //temperture and humidity
    }

    private static void createAndShowGUI(float t, float rh) {
        JFrame frame = new JFrame("Heat Index Stats");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 200);
        frame.setLayout(new BorderLayout());

        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        
        JLabel title = new JLabel("Heat Index Stats");
        title.setFont(new Font("Arial", Font.BOLD, 16));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        float heatindex = computeHeatIndex(t, rh);
        JLabel heat = new JLabel("Heat Index. temp: " + heatindex);
        heat.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        panel.add(title);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));  
        panel.add(heat);
        
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
    private static float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
            (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
            (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
            (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *  
            (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
            (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +     
            0.000000000843296 * (t * t * rh * rh * rh)) -
            (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }

}
