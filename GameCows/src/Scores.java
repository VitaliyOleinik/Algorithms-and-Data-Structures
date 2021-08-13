import javax.swing.*;
import java.awt.*;

public class Scores extends JFrame {
    public Scores(Object[][] table_data) {
        super("Scores");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel tablePanel = new JPanel();

        JTable table = new JTable(table_data,
                new String[] {"Позиция", "Попыток", "Имя"});
        table.setAutoResizeMode(
                JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablePanel.setLayout(new BorderLayout());
        JScrollPane scrollPane= new  JScrollPane(table);
        tablePanel.add(scrollPane);

        add(tablePanel);

        table.setEnabled(false);
    }
}