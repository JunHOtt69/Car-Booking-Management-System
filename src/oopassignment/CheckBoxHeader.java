package oopassignment;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

public class CheckBoxHeader extends JCheckBox implements TableCellRenderer, MouseListener {
    private JTable table;
    private SelectableTableModel model;

    public CheckBoxHeader(JTable table, SelectableTableModel model) {
        this.table = table;
        this.model = model;
        setHorizontalAlignment(SwingConstants.CENTER);
        table.getTableHeader().addMouseListener(this);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        return this;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int col = table.columnAtPoint(e.getPoint());
        if (col == 0) {
            boolean selectAll = !this.isSelected();
            this.setSelected(selectAll);
            model.selectAll(selectAll);
            table.getTableHeader().repaint();
        }
    }

    // Unused methods
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}