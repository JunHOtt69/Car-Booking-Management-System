package oopassignment;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class FeedbackSalesmanTableModel extends AbstractTableModel implements SelectableTableModel {
    private final String[] columns = {"SalesmanID", "Full Name", "Email", "Number of Ratings Received", "Average Salesman Rating"};
    private final Class[] columnTypes = {String.class, String.class, String.class, String.class, String.class};

    private ArrayList<Object[]> data;

    public FeedbackSalesmanTableModel(ArrayList<booking> bookings) {
        data = new ArrayList<>();
        ArrayList<SalesmanSummary> summaries = new ArrayList<>();
                
        for(salesman s : DataIO.salesmen){
            ArrayList<Double> ratings = new ArrayList<>();
            double totalRating = 0 ;
            double averageRating = 0;
            for (booking B : bookings) {
                if (B.getRating().equalsIgnoreCase("empty")) {
                    continue;
                }
                
                if(B.getSalesmanID().equals(s.getSalesmanID())){
                    try {
                        double rating = Double.parseDouble(B.getRating());
                        ratings.add(rating);
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid rating format: " + B.getRating());
                    }
                }
            }
            if(!ratings.isEmpty()){
                for(double rating : ratings){
                    totalRating += rating;
                }
                averageRating = totalRating / ratings.size();
            }
            summaries.add(new SalesmanSummary(s, ratings.size(), averageRating));
        }
        for (int i = 0; i < Math.min(5, summaries.size()); i++) {
            SalesmanSummary ss = summaries.get(i);

            data.add(new Object[]{
                ss.Salesman.getSalesmanID(),
                ss.Salesman.getSalesmanFullName(),
                ss.Salesman.getSalesmanEmail(),
                ss.ratingNumber,
                ss.averageRating
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
