package oopassignment;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.JTableHeader;

public class TableStyler {
    public static void styleAdminTable(JTable adminTable, JScrollPane scrollPane){
        CheckBoxHeader checkBoxHeader = new CheckBoxHeader(adminTable, (SelectableTableModel)adminTable.getModel());
        adminTable.getColumnModel().getColumn(0).setHeaderRenderer(checkBoxHeader);
        adminTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        adminTable.setRowHeight(30);
        for (int i = 0; i < adminTable.getColumnCount(); i++) {
            javax.swing.table.TableColumn column = adminTable.getColumnModel().getColumn(i);


            int minWidth = 100;
            if (i == 0) { 
                minWidth = 30;
            }
            column.setMinWidth(minWidth);

            int preferredWidth = 0;
            switch (i) {
                case 0: // Select column 
                    preferredWidth = 50;  
                    break;
                case 1: // Admin ID
                    preferredWidth = 100;
                    break;
                case 2: // Username
                    preferredWidth = 250;
                    break;
                case 3: // Full name
                    preferredWidth = 250;
                    break;
                case 4: // Email
                    preferredWidth = 350;
                    break;
                case 5: // Phone Number
                    preferredWidth = 250;
                    break;
                case 6: // Status
                    preferredWidth = 100;
                    break;
            }
            column.setPreferredWidth(preferredWidth);
        }

        
        Font tableFont = new Font("Arial", Font.PLAIN, 14);
        adminTable.setFont(tableFont);

        // Set font for the table header
        JTableHeader header = adminTable.getTableHeader();
        Font headerFont = new Font("Arial", Font.BOLD, 16);
        header.setFont(headerFont);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
    
    public static void styleCustomerTable(JTable CusTable, JScrollPane scrollPane){
        CheckBoxHeader checkBoxHeader = new CheckBoxHeader(CusTable, (SelectableTableModel)CusTable.getModel());
        CusTable.getColumnModel().getColumn(0).setHeaderRenderer(checkBoxHeader);
        CusTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        CusTable.setRowHeight(30);
        for (int i = 0; i < CusTable.getColumnCount(); i++) {
            javax.swing.table.TableColumn column = CusTable.getColumnModel().getColumn(i);


            int minWidth = 100;
            if (i == 0) { 
                minWidth = 30;
            }
            column.setMinWidth(minWidth);

            int preferredWidth = 0;
            switch (i) {
                case 0: // Select column 
                    preferredWidth = 50;  
                    break;
                case 1: // Admin ID
                    preferredWidth = 100;
                    break;
                case 2: // Username
                    preferredWidth = 200;
                    break;
                case 3: // Full name
                    preferredWidth = 200;
                    break;
                case 4: // Email
                    preferredWidth = 250;
                    break;
                case 5: // Phone Number
                    preferredWidth = 200;
                    break;
                case 6: // IC Number
                    preferredWidth = 200;
                    break;
                case 7: // License Number
                    preferredWidth = 200;
                    break;
                case 8: // Status
                    preferredWidth = 100;
                    break;
            }
            column.setPreferredWidth(preferredWidth);
        }
        
        Font tableFont = new Font("Arial", Font.PLAIN, 14);
        CusTable.setFont(tableFont);

        // Set font for the table header
        JTableHeader header = CusTable.getTableHeader();
        Font headerFont = new Font("Arial", Font.BOLD, 16);
        header.setFont(headerFont);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
    
    public static void styleSalesmanTable(JTable salesmanTable, JScrollPane scrollPane){
        CheckBoxHeader checkBoxHeader = new CheckBoxHeader(salesmanTable, (SelectableTableModel)salesmanTable.getModel());
        salesmanTable.getColumnModel().getColumn(0).setHeaderRenderer(checkBoxHeader);
        salesmanTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        salesmanTable.setRowHeight(30);
        for (int i = 0; i < salesmanTable.getColumnCount(); i++) {
            javax.swing.table.TableColumn column = salesmanTable.getColumnModel().getColumn(i);


            int minWidth = 100;
            if (i == 0) { 
                minWidth = 30;
            }
            column.setMinWidth(minWidth);

            int preferredWidth = 0;
            switch (i) {
                case 0: // Select column 
                    preferredWidth = 50;  
                    break;
                case 1: // Admin ID
                    preferredWidth = 100;
                    break;
                case 2: // Username
                    preferredWidth = 200;
                    break;
                case 3: // Full name
                    preferredWidth = 200;
                    break;
                case 4: // Email
                    preferredWidth = 250;
                    break;
                case 5: // Phone Number
                    preferredWidth = 200;
                    break;
                case 6: // monthly sales
                    preferredWidth = 150;
                    break;
                case 7: // total sales
                    preferredWidth = 100;
                    break;
                case 8: // monthly commissions
                    preferredWidth = 200;
                    break;
                case 9: // total commissions
                    preferredWidth = 200;
                    break;
                case 10: // Status
                    preferredWidth = 100;
                    break;
            }
            column.setPreferredWidth(preferredWidth);
        }
        
        Font tableFont = new Font("Arial", Font.PLAIN, 14);
        salesmanTable.setFont(tableFont);

        // Set font for the table header
        JTableHeader header = salesmanTable.getTableHeader();
        Font headerFont = new Font("Arial", Font.BOLD, 16);
        header.setFont(headerFont);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
    
    //car
    public static void styleCarTable(JTable carTable, JScrollPane scrollPane){
        CheckBoxHeader checkBoxHeader = new CheckBoxHeader(carTable, (SelectableTableModel)carTable.getModel());
        carTable.getColumnModel().getColumn(0).setHeaderRenderer(checkBoxHeader);
        carTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        carTable.setRowHeight(30);
        for (int i = 0; i < carTable.getColumnCount(); i++) {
            javax.swing.table.TableColumn column = carTable.getColumnModel().getColumn(i);


            int minWidth = 100;
            if (i == 0) { 
                minWidth = 30;
            }
            column.setMinWidth(minWidth);

            int preferredWidth = 0;
            switch (i) {
                case 0: // Select column 
                    preferredWidth = 50;  
                    break;
                case 1: // Car ID
                    preferredWidth = 100;
                    break;
                case 2: // carName
                    preferredWidth = 350;
                    break;
                case 3: // carType
                    preferredWidth = 150;
                    break;
                case 4: // carBrand
                    preferredWidth = 150;
                    break;
                case 5: // carColor
                    preferredWidth = 150;
                    break;
                case 6: // price
                    preferredWidth = 150;
                    break;
                case 7: // condition
                    preferredWidth = 100;
                    break;
                case 8: // mileage
                    preferredWidth = 100;
                    break;
                case 9: // transmission
                    preferredWidth = 150;
                    break;
                case 10: // fueltype
                    preferredWidth = 100;
                    break;
                case 11: // status
                    preferredWidth = 100;
                    break;

            }
            column.setPreferredWidth(preferredWidth);
        }

        
        Font tableFont = new Font("Arial", Font.PLAIN, 14);
        carTable.setFont(tableFont);

        // Set font for the table header
        JTableHeader header = carTable.getTableHeader();
        Font headerFont = new Font("Arial", Font.BOLD, 16);
        header.setFont(headerFont);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
    
    //booking
    public static void styleBookingTable(JTable bookingTable, JScrollPane scrollPane) {
        bookingTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        bookingTable.setRowHeight(30);

        for (int i = 0; i < bookingTable.getColumnCount(); i++) {
            javax.swing.table.TableColumn column = bookingTable.getColumnModel().getColumn(i);

            int minWidth = 100;
            if (i == 0) {
                minWidth = 30;
            }
            column.setMinWidth(minWidth);

            int preferredWidth = 0;
            switch (i) {
                case 0: // Booking ID
                    preferredWidth = 100;
                    break;
                case 1: // Customer ID
                    preferredWidth = 100;
                    break;
                case 2: // Salesman ID
                    preferredWidth = 100;
                    break;
                case 3: // Car ID
                    preferredWidth = 100;
                    break;
                case 4: // Price
                    preferredWidth = 100;
                    break;
                case 5: // Commission
                    preferredWidth = 120;
                    break;
                case 6: // Booking Date
                    preferredWidth = 150;
                    break;
                case 7: // Rating
                    preferredWidth = 80;
                    break;
                case 8: // Comment
                    preferredWidth = 200;
                    break;
                case 9: // Payment ID
                    preferredWidth = 120;
                    break;    
                case 10: // Status
                    preferredWidth = 150;
                    break;
            }

            column.setPreferredWidth(preferredWidth);
        }

        Font tableFont = new Font("Arial", Font.PLAIN, 14);
        bookingTable.setFont(tableFont);

        JTableHeader header = bookingTable.getTableHeader();
        Font headerFont = new Font("Arial", Font.BOLD, 16);
        header.setFont(headerFont);

        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
    
    public static void styleBookingTableSalesman(JTable bookingTable, JScrollPane scrollPane) {
        CheckBoxHeader checkBoxHeader = new CheckBoxHeader(bookingTable, (SelectableTableModel) bookingTable.getModel());
        bookingTable.getColumnModel().getColumn(0).setHeaderRenderer(checkBoxHeader);
        bookingTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        bookingTable.setRowHeight(30);

        for (int i = 0; i < bookingTable.getColumnCount(); i++) {
            javax.swing.table.TableColumn column = bookingTable.getColumnModel().getColumn(i);

            int minWidth = 100;
            if (i == 0) {
                minWidth = 30;
            }
            column.setMinWidth(minWidth);

            int preferredWidth = 0;
            switch (i) {
                case 0: // Select column
                    preferredWidth = 50;
                    break;
                case 1: // Booking ID
                    preferredWidth = 100;
                    break;
                case 2: // Customer ID
                    preferredWidth = 100;
                    break;
                case 3: // Car ID
                    preferredWidth = 100;
                    break;
                case 4: // Price
                    preferredWidth = 100;
                    break;
                case 5: // Commission
                    preferredWidth = 100;
                    break;
                case 6: // Booking Date
                    preferredWidth = 150;
                    break;
                case 7: // Rating
                    preferredWidth = 80;
                    break;
                case 8: // Comment
                    preferredWidth = 200;
                    break;
                case 9: // Payment ID
                    preferredWidth = 120;
                    break;    
                case 10: // Status
                    preferredWidth = 150;
                    break;
            }

            column.setPreferredWidth(preferredWidth);
        }

        Font tableFont = new Font("Arial", Font.PLAIN, 14);
        bookingTable.setFont(tableFont);

        JTableHeader header = bookingTable.getTableHeader();
        Font headerFont = new Font("Arial", Font.BOLD, 16);
        header.setFont(headerFont);

        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
    
    public static void styleBookingTableCustomer(JTable bookingTable, JScrollPane scrollPane) {
        CheckBoxHeader checkBoxHeader = new CheckBoxHeader(bookingTable, (SelectableTableModel) bookingTable.getModel());
        bookingTable.getColumnModel().getColumn(0).setHeaderRenderer(checkBoxHeader);
        bookingTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        bookingTable.setRowHeight(30);

        
        Font tableFont = new Font("Arial", Font.PLAIN, 14);
        bookingTable.setFont(tableFont);

        JTableHeader header = bookingTable.getTableHeader();
        Font headerFont = new Font("Arial", Font.BOLD, 16);
        header.setFont(headerFont);

        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
    
    public static void styleCanceledBookingTable(JTable bookingTable, JScrollPane scrollPane) {
        bookingTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        bookingTable.setRowHeight(30);

        for (int i = 0; i < bookingTable.getColumnCount(); i++) {
            javax.swing.table.TableColumn column = bookingTable.getColumnModel().getColumn(i);

            int minWidth = 100;
            if (i == 0) {
                minWidth = 30;
            }
            column.setMinWidth(minWidth);

            int preferredWidth = 0;
            switch (i) {
                case 0: // Booking ID
                    preferredWidth = 100;
                    break;
                case 1: // Customer ID
                    preferredWidth = 100;
                    break;
                case 2: // Salesman ID
                    preferredWidth = 100;
                    break;
                case 3: // Car ID
                    preferredWidth = 100;
                    break;
                case 4: // Price
                    preferredWidth = 100;
                    break;
                case 5: // Commission
                    preferredWidth = 120;
                    break;
                case 6: // Booking Date
                    preferredWidth = 150;
                    break;
                case 7: // Rating
                    preferredWidth = 80;
                    break;
                case 8: // Comment
                    preferredWidth = 200;
                    break;
                case 9: // Payment ID
                    preferredWidth = 120;
                    break;    
                case 10: // Status
                    preferredWidth = 150;
                    break;
            }

            column.setPreferredWidth(preferredWidth);
        }

        Font tableFont = new Font("Arial", Font.PLAIN, 14);
        bookingTable.setFont(tableFont);

        JTableHeader header = bookingTable.getTableHeader();
        Font headerFont = new Font("Arial", Font.BOLD, 16);
        header.setFont(headerFont);

        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
    
    //payment
    public static void stylePaymentTable(JTable bookingTable, JScrollPane scrollPane) {
        bookingTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        bookingTable.setRowHeight(30);

        for (int i = 0; i < bookingTable.getColumnCount(); i++) {
            javax.swing.table.TableColumn column = bookingTable.getColumnModel().getColumn(i);

            int minWidth = 100;
            if (i == 0) {
                minWidth = 30;
            }
            column.setMinWidth(minWidth);

            int preferredWidth = 0;
            switch (i) {
                case 0: // Payment ID
                    preferredWidth = 100;
                    break;
                case 1: // Booking ID
                    preferredWidth = 100;
                    break;
                case 2: // Customer ID
                    preferredWidth = 120;
                    break;
                case 3: // Deposit
                    preferredWidth = 120;
                    break;
                case 4: // Payment Method
                    preferredWidth = 150;
                    break;
                case 5: // Bank Account
                    preferredWidth = 140;
                    break;
                case 6: // Payable Amount
                    preferredWidth = 150;
                    break;
                case 7: // Down Payment
                    preferredWidth = 150;
                    break;
                case 8: // Down Payment Rate
                    preferredWidth = 200;
                    break;
                case 9: // Loan Amount
                    preferredWidth = 120;
                    break;    
                case 10: // Loan Term  
                    preferredWidth = 50;
                    break;
                case 11: // Interest Per Year
                    preferredWidth = 200;
                    break;  
                case 12: // Payment Date
                    preferredWidth = 150;
                    break;  
            }

            column.setPreferredWidth(preferredWidth);
        }

        Font tableFont = new Font("Arial", Font.PLAIN, 14);
        bookingTable.setFont(tableFont);

        JTableHeader header = bookingTable.getTableHeader();
        Font headerFont = new Font("Arial", Font.BOLD, 16);
        header.setFont(headerFont);

        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
    
    public static void styleTopCustomerTable(JTable bookingTable, JScrollPane scrollPane) {
        bookingTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        bookingTable.setRowHeight(30);

        Font tableFont = new Font("Arial", Font.PLAIN, 14);
        bookingTable.setFont(tableFont);

        JTableHeader header = bookingTable.getTableHeader();
        Font headerFont = new Font("Arial", Font.BOLD, 16);
        header.setFont(headerFont);

    }
    
    public static void stylePaymentCustomerTable(JTable bookingTable, JScrollPane scrollPane) {
        bookingTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        bookingTable.setRowHeight(30);

        for (int i = 0; i < bookingTable.getColumnCount(); i++) {
            javax.swing.table.TableColumn column = bookingTable.getColumnModel().getColumn(i);

            int minWidth = 100;
            if (i == 0) {
                minWidth = 30;
            }
            column.setMinWidth(minWidth);

            int preferredWidth = 0;
            switch (i) {
                case 0: // Payment ID
                    preferredWidth = 100;
                    break;
                case 1: // Booking ID
                    preferredWidth = 100;
                    break;
                case 2: // Deposit
                    preferredWidth = 120;
                    break;
                case 3: // Payment Method
                    preferredWidth = 150;
                    break;
                case 4: // Bank Account
                    preferredWidth = 140;
                    break;
                case 5: // Payable Amount
                    preferredWidth = 150;
                    break;
                case 6: // Down Payment
                    preferredWidth = 150;
                    break;
                case 7: // Down Payment Rate
                    preferredWidth = 200;
                    break;
                case 8: // Loan Amount
                    preferredWidth = 120;
                    break;    
                case 9: // Loan Term  
                    preferredWidth = 50;
                    break;
                case 10: // Interest Per Year
                    preferredWidth = 200;
                    break;  
                case 11: // Payment Date
                    preferredWidth = 150;
                    break;  
            }

            column.setPreferredWidth(preferredWidth);
        }

        Font tableFont = new Font("Arial", Font.PLAIN, 14);
        bookingTable.setFont(tableFont);

        JTableHeader header = bookingTable.getTableHeader();
        Font headerFont = new Font("Arial", Font.BOLD, 16);
        header.setFont(headerFont);

        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
    
    public static void styleFeedbackTable(JTable bookingTable, JScrollPane scrollPane) {
        bookingTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        bookingTable.setRowHeight(30);

        Font tableFont = new Font("Arial", Font.PLAIN, 14);
        bookingTable.setFont(tableFont);

        JTableHeader header = bookingTable.getTableHeader();
        Font headerFont = new Font("Arial", Font.BOLD, 16);
        header.setFont(headerFont);

        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
    
    public static void styleFeedbackSalesmanTable(JTable bookingTable, JScrollPane scrollPane) {
        bookingTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        bookingTable.setRowHeight(30);


        Font tableFont = new Font("Arial", Font.PLAIN, 14);
        bookingTable.setFont(tableFont);

        JTableHeader header = bookingTable.getTableHeader();
        Font headerFont = new Font("Arial", Font.BOLD, 16);
        header.setFont(headerFont);

        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
    
}
