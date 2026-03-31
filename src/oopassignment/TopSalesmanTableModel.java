package oopassignment;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TopSalesmanTableModel extends AbstractTableModel implements SelectableTableModel {
    private final String[] columns = {"Salesman ID", "Username", "Email", "Phone Number", "Total Sales", "Total Commissions"};
    private final Class[] columnTypes = {String.class, String.class, String.class, String.class, String.class, String.class};

    private ArrayList<Object[]> data;

    public TopSalesmanTableModel(ArrayList<salesman> salesmen) {
        data = new ArrayList<>();
        ArrayList<salesman> sortedSalesmen = new ArrayList<>();
        for (salesman s : salesmen){
            try {
                int totalSales = Integer.parseInt(s.getSalesmanTotalSales());
                if (totalSales > 0){
                    sortedSalesmen.add(s);
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid totalSales format: " + s.getSalesmanTotalSales());
            }
        }
        
        sortedSalesmen.sort((a, b) -> 
                Integer.compare(
                        Integer.parseInt(b.getSalesmanTotalSales()), 
                        Integer.parseInt(a.getSalesmanTotalSales())
                )
            );
        for (int i = 0; i < Math.min(5, sortedSalesmen.size()); i++) {
            data.add(new Object[]{
                sortedSalesmen.get(i).getSalesmanID(),
                sortedSalesmen.get(i).getSalesmanUsername(),
                sortedSalesmen.get(i).getSalesmanEmail(),
                sortedSalesmen.get(i).getSalesmanPhoneNumber(),
                sortedSalesmen.get(i).getSalesmanTotalSales(),
                sortedSalesmen.get(i).getSalesmanTotalCommissions()
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
