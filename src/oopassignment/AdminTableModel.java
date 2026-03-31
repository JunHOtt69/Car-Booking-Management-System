package oopassignment;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class AdminTableModel extends AbstractTableModel implements SelectableTableModel {
    private final String[] columns = {"Select", "ID", "Username", "Full Name", "Email", "Phone", "Status"};
    private final Class[] columnTypes = {Boolean.class, String.class, String.class, String.class, String.class, String.class, String.class};

    private ArrayList<Object[]> data;

    public AdminTableModel(ArrayList<admin> admins) {
        data = new ArrayList<>();
        for (admin a : admins) {
            data.add(new Object[]{false, a.getAdminID(), a.getAdminUsername(), a.getAdminFullName(), a.getAdminEmail(), a.getAdminPhoneNumber(), a.getAdminStatus()});
        }
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        return data.get(row)[col];
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        data.get(row)[col] = value;
        fireTableCellUpdated(row, col);
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return col != 1 && col != getColumnCount() -1; 
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnTypes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    public ArrayList<Object[]> getAdminData(){
        return data;
    }
    
    @Override
    public void selectAll(boolean selected) {
        for (Object[] row : data) {
            row[0] = selected;
        }
        fireTableDataChanged();
    }
}
