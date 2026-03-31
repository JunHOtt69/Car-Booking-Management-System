package oopassignment;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class CarTableModelViewOnly extends AbstractTableModel implements SelectableTableModel {
    private final String[] columns = {"Select", "ID", "Car Name", "Car Type", "Car Brand", "Car Color", "Price", "Condition", "Mileage", "Transmisssion", "Fuel Type", "Status"};
    private final Class[] columnTypes = {Boolean.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};

    private ArrayList<Object[]> data;

    public CarTableModelViewOnly(ArrayList<car> cars) {
        data = new ArrayList<>();
        for (car v : cars) {
            if(v.getCarStatus().equals("Available")){
                data.add(new Object[]{false, v.getCarID(), v.getCarname(), v.getCarType(), v.getCarBrand(), v.getCarColor(), v.getPrice(), v.getCondition(), v.getMileage(), v.getTransmission(), v.getFuelType(), v.getCarStatus()});
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
        return col == 0; 
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnTypes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    public ArrayList<Object[]> getCarData(){
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
