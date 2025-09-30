package task6_JavaGUI_TodoApp;

import javax.swing.*;
import java.awt.*;

public class TodoApp {
    private JFrame frame;
    private JTextField taskField;
    private JButton addButton;
    private JButton clearAllButton;
    private JPanel taskPanel;
    private int taskCounter = 0;

    public TodoApp() {
        //Initialize frame
        frame = new JFrame("Todo App");
        frame.setSize(500, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        //Input panel (top)
        JPanel inputPanel = new JPanel();
        taskField = new JTextField(20);
        addButton = new JButton("Add Task");
        clearAllButton = new JButton("🗑️ Clear All");

        inputPanel.add(new JLabel("New Task: "));
        inputPanel.add(taskField);
        inputPanel.add(addButton);
        inputPanel.add(clearAllButton);

        // Task panel (center) - scrollable
        taskPanel = new JPanel();
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));
        taskPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JScrollPane scrollPane = new JScrollPane(taskPanel);
        scrollPane.setPreferredSize(new Dimension(420, 450));

        // Add action listener
        addButton.addActionListener(e -> {
            addTask();
        });

        // Add Enter key support
        taskField.addActionListener(e-> {
            addTask();
        });

        clearAllButton.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(
                    frame, "Clear all tasks? ", "Confirm", JOptionPane.YES_NO_OPTION
            );
            if(confirm == JOptionPane.YES_OPTION) {
                taskPanel.removeAll();
                taskCounter = 0;
                taskPanel.revalidate();
                taskPanel.repaint();
                updateTitle();
                JOptionPane.showMessageDialog(frame, "All tasks cleared!");
            }
        });
        //Add component to frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);

        updateTitle();

    }

    private void addTask() {
        String taskText = taskField.getText().trim();

        if(taskText.isEmpty()) {
            JOptionPane.showMessageDialog(frame,"Task cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        taskCounter++;
        Task task = new Task(taskText, null);
        task.setDeleteAction(() -> {
            taskPanel.remove(task);
            taskPanel.revalidate();
            taskPanel.repaint();
            taskCounter--;
            updateTitle();
        });

        taskPanel.add(task);
        taskPanel.revalidate();
        taskPanel.repaint();

        taskField.setText("");
        updateTitle();

    }
    private void updateTitle() {
        frame.setTitle("ToDo App - Total Tasks: " + taskCounter);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TodoApp()); // Fixed: Correct class name
    }

}

