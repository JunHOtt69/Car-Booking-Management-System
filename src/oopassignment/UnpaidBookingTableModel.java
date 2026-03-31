package oopassignment;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class UnpaidBookingTableModel extends AbstractTableModel implements SelectableTableModel {
    private final String[] columns = {"BookingID", "SalesmanID", "CustomerID", "CarID", "Price", "Commission", "Booking Date", "Rating", "Comments", "Payment ID ", "Status"};
    private final Class[] columnTypes = {String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};

    private ArrayList<Object[]> data;

    public UnpaidBookingTableModel(ArrayList<booking> bookings) {
        data = new ArrayList<>();
        for (booking B : bookings) {
            if(B.getBookingStatus().equals("Booked")){
                data.add(new Object[]{B.getBookingID(), B.getSalesmanID(), B.getCustomerID(), B.getCarID(), B.getPrice(), B.getCommission(), B.getBookingDate(), B.getRating(), B.getComments(), B.getPaymentID(), B.getBookingStatus()});
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
