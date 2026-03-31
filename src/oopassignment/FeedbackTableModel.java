package oopassignment;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class FeedbackTableModel extends AbstractTableModel implements SelectableTableModel {
    private final String[] columns = {"BookingID", "SalesmanID", "CustomerID", "Username", "Booking Date", "Rating", "Comments", "Status"};
    private final Class[] columnTypes = {String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};

    private ArrayList<Object[]> data;

    public FeedbackTableModel(ArrayList<booking> bookings) {
        data = new ArrayList<>();
        for (booking B : bookings) {
            for(Customer c : DataIO.customers){
                if(B.getCustomerID().equals(c.getCustomerID())){
                    data.add(new Object[]{B.getBookingID(), B.getSalesmanID(), B.getCustomerID(), c.getCustomerUsername(), B.getBookingDate(), B.getRating(), B.getComments(), B.getBookingStatus()});
                }
            }
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
        return false; 
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnTypes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    public ArrayList<Object[]> getBookingData(){
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
