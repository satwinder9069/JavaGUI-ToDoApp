package task6_JavaGUI_TodoApp;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel {
    private JLabel taskLabel;
    private JButton deleteButton;
    private JCheckBox doneTask;
    private String originalText;

    public Task( String taskText , Runnable onDelete) {
        originalText = taskText;
        setLayout(new BorderLayout());

        setMaximumSize(new Dimension(380 , 45));
        setBorder(BorderFactory.createEtchedBorder()); // Subtle border
        setBackground(Color.WHITE);

        // Left: Checkbox
        doneTask = new JCheckBox(" ");
        doneTask.addActionListener(e -> toggleCompletion());

        // Center: Task label
        taskLabel = new JLabel(" " + taskText);
        taskLabel.setFont(new Font("Arial", Font.PLAIN, 12));

        // Right: Delete button
        deleteButton = new JButton("❌");
        deleteButton.setPreferredSize(new Dimension(60, 25));

        if (onDelete != null) {
            deleteButton.addActionListener(e -> onDelete.run());
        }

        // Add to panel
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        leftPanel.add(doneTask);
        leftPanel.add(taskLabel);

        add(leftPanel, BorderLayout.CENTER);  //center
        add(deleteButton, BorderLayout.EAST); // east side

        //initial padding
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

    }
    public void setDeleteAction(Runnable onDelete) {
        // Remove old listeners first
        for (var listener : deleteButton.getActionListeners()) {
            deleteButton.removeActionListener(listener);
        }
        // Add new listener
        deleteButton.addActionListener(e -> onDelete.run());
    }

    private void toggleCompletion() {

        if (doneTask.isSelected()){
            taskLabel.setText("<html><strike>  " + originalText + "</strike></html>");
            taskLabel.setForeground(Color.GRAY);
            setBackground(new Color(248, 248, 255));// Light blue-gray bg
        } else {
            // Reset: Normal text + black
            taskLabel.setText("  " + originalText);
            taskLabel.setForeground(Color.BLACK);
            setBackground(Color.WHITE);
        }
    }

}
