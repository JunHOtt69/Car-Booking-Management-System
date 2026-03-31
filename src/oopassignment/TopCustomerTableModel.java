package oopassignment;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TopCustomerTableModel extends AbstractTableModel implements SelectableTableModel {
    private final String[] columns = {"Customer ID", "Username", "Email", "Phone Number", "Purchased Car Number", "Total Spent"};
    private final Class[] columnTypes = {String.class, String.class, String.class, String.class, String.class, String.class};

    private ArrayList<Object[]> data;

    public TopCustomerTableModel(ArrayList<payment> payments, ArrayList<Customer> customers) {
        data = new ArrayList<>();
        ArrayList<CustomerSummary> summaries = new ArrayList<>();
        
        for (Customer customer : customers){
            int purchasedNumber = 0;
            double totalSpent = 0;
            for (payment p : payments) {
                if(p.getCustomerID().equals(customer.getCustomerID())){
                    purchasedNumber++;
                    try {
                        double payableAmount = Double.parseDouble(p.getPayableAmount());
                        double deposit = Double.parseDouble(p.getDeposit().split(" ")[0]);
                        totalSpent += (payableAmount + deposit);
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid price format: " + p.getDeposit());
                        System.err.println("Invalid price format: " + p.getPayableAmount());
                    }
                }
            }
            if (purchasedNumber > 0) {
                summaries.add(new CustomerSummary(customer, purchasedNumber, totalSpent));
            }
        }
        summaries.sort((a, b) -> Double.compare(b.totalSpent, a.totalSpent));
        for (int i = 0; i < Math.min(5, summaries.size()); i++) {
            CustomerSummary cs = summaries.get(i);
            String totalSpentStr = String.format("RM %.2f", cs.totalSpent);

            data.add(new Object[]{
                cs.customer.getCustomerID(),
                cs.customer.getCustomerUsername(),
                cs.customer.getCustomerEmail(),
                cs.customer.getCustomerPhoneNumber(),
                Integer.toString(cs.purchasedNumber),
                totalSpentStr
            });
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
