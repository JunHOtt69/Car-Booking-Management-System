package oopassignment;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class PaymentTableModel extends AbstractTableModel implements SelectableTableModel {
    private final String[] columns = {"Payment ID", "Booking ID", "Customer ID", "Deposit", "Payment Method", "Bank Account", "Payable Amount", "Down Payment", "Down Payment Rate (%)", "Loan Amount", "Loan Term", "Interest Per Year (%)", "Payment Date"};
    private final Class[] columnTypes = {String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};

    private ArrayList<Object[]> data;

    public PaymentTableModel(ArrayList<payment> payments) {
        data = new ArrayList<>();
        for (payment p : payments) {
            data.add(new Object[]{p.getPaymentID(), p.getBookingID(), p.getCustomerID(), p.getDeposit(), p.getPaymentMethod(), p.getBankAccount(), p.getPayableAmount(), p.getDownPayment(), p.getDownPaymentRate(), p.getLoanAmount(), p.getLoanTerm(), p.getInterestPerYear(), p.getPaymentDate()});
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
