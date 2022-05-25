/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.phoenix.screens;

import com.phoenix.classes.conSQL;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Lucifer
 */
public class HomeScreen extends javax.swing.JFrame {

    /**
     * Creates new form HomeScreen
     */
    public HomeScreen() {
        initComponents();
        times();
        dt();
        setRowCount();
        ComboBoxChanged();
       
        
        Image i;
        try {
            i = ImageIO.read(getClass().getResource("../assets/logo.png"));
             setIconImage(i);
        } catch (IOException ex) {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
        Timer t;
        SimpleDateFormat st;
       public void times(){             
     t = new Timer(0, new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
            // throw new UnsupportedOperationException("Not supported yet");
            
            Date dt = new Date();
            st = new SimpleDateFormat("hh:mm:ss a");
            
            String tt = st.format(dt);
            currentTimeLabel.setText(tt);
             
         }
     });  
     t.start();
    }
       
        public void dt(){             
            Date d = new Date();
            SimpleDateFormat sdt = new SimpleDateFormat("MMM dd, yyyy");
            String dd = sdt.format(d);
            CurrentDateLabel.setText(dd);
            
            
    }
        
        public void setRowCount(){
            int c = DataTable.getRowCount();
            RowCountLabel.setText(c + " transactions are available");
        }
        
        
        public String[] cd = {"Cr_account", "Dr_account"};
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        newAccBtn = new javax.swing.JButton();
        addDataBtn = new javax.swing.JButton();
        trialBlnceBtn = new javax.swing.JButton();
        FilterPanel = new javax.swing.JPanel();
        MonthComboBox = new javax.swing.JComboBox<>();
        MonthFilterLabel = new javax.swing.JLabel();
        YearComboBox = new javax.swing.JComboBox<>();
        YearFilterLabel = new javax.swing.JLabel();
        leftSidePanel = new javax.swing.JPanel();
        LedgerTitlePanel = new javax.swing.JPanel();
        LedgerTitleLabel = new javax.swing.JLabel();
        LedgerListPanel = new javax.swing.JScrollPane();
        LedgerList = new javax.swing.JList<>();
        BottomLeftPanel = new javax.swing.JPanel();
        refreshBtn = new javax.swing.JButton();
        LedegerViewPanel = new javax.swing.JPanel();
        SelectedLedgerTitlePanel = new javax.swing.JPanel();
        SelectedLedgerTitleLabel = new javax.swing.JLabel();
        SelectedLedgerDis = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BasePanel = new javax.swing.JScrollPane();
        DataTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        currentTimeLabel = new javax.swing.JLabel();
        RowCountLabel = new javax.swing.JLabel();
        lastTrcDateLabel = new javax.swing.JLabel();
        CurrentDateLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        backPanel.setBackground(new java.awt.Color(255, 255, 255));
        backPanel.setPreferredSize(new java.awt.Dimension(900, 550));

        menuPanel.setBackground(new java.awt.Color(204, 204, 204));

        newAccBtn.setText("New Account");
        newAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAccBtnActionPerformed(evt);
            }
        });

        addDataBtn.setText("Input Data");
        addDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDataBtnActionPerformed(evt);
            }
        });

        trialBlnceBtn.setText("Trial balance");
        trialBlnceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trialBlnceBtnActionPerformed(evt);
            }
        });

        FilterPanel.setBackground(new java.awt.Color(204, 204, 204));

        MonthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "January ", "February", "March", "April", "May ", "June ", "July ", "August", "September ", "October ", "November ", "December" }));

        MonthFilterLabel.setForeground(new java.awt.Color(0, 0, 0));
        MonthFilterLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MonthFilterLabel.setText("Month");

        YearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));

        YearFilterLabel.setForeground(new java.awt.Color(0, 0, 0));
        YearFilterLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        YearFilterLabel.setText("Year");

        javax.swing.GroupLayout FilterPanelLayout = new javax.swing.GroupLayout(FilterPanel);
        FilterPanel.setLayout(FilterPanelLayout);
        FilterPanelLayout.setHorizontalGroup(
            FilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FilterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(YearFilterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(YearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MonthFilterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FilterPanelLayout.setVerticalGroup(
            FilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FilterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MonthFilterLabel)
                    .addComponent(YearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YearFilterLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newAccBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trialBlnceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FilterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newAccBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trialBlnceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(FilterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        LedgerTitlePanel.setBackground(new java.awt.Color(50, 53, 55));

        LedgerTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LedgerTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        LedgerTitleLabel.setText("Accounts");

        javax.swing.GroupLayout LedgerTitlePanelLayout = new javax.swing.GroupLayout(LedgerTitlePanel);
        LedgerTitlePanel.setLayout(LedgerTitlePanelLayout);
        LedgerTitlePanelLayout.setHorizontalGroup(
            LedgerTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LedgerTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LedgerTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        LedgerTitlePanelLayout.setVerticalGroup(
            LedgerTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LedgerTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LedgerTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        LedgerList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 12", "Item 22", "Item 32", "Item 42", "Item 52", "Item 13", "Item 23", "Item 33", "Item 43", "Item 53" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        LedgerList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        LedgerList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LedgerListMouseClicked(evt);
            }
        });
        LedgerListPanel.setViewportView(LedgerList);

        BottomLeftPanel.setBackground(new java.awt.Color(50, 53, 55));

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BottomLeftPanelLayout = new javax.swing.GroupLayout(BottomLeftPanel);
        BottomLeftPanel.setLayout(BottomLeftPanelLayout);
        BottomLeftPanelLayout.setHorizontalGroup(
            BottomLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BottomLeftPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshBtn)
                .addContainerGap())
        );
        BottomLeftPanelLayout.setVerticalGroup(
            BottomLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BottomLeftPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        LedegerViewPanel.setBackground(new java.awt.Color(78, 80, 82));

        SelectedLedgerTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SelectedLedgerTitleLabel.setText("Selected Ledger Name");

        javax.swing.GroupLayout SelectedLedgerTitlePanelLayout = new javax.swing.GroupLayout(SelectedLedgerTitlePanel);
        SelectedLedgerTitlePanel.setLayout(SelectedLedgerTitlePanelLayout);
        SelectedLedgerTitlePanelLayout.setHorizontalGroup(
            SelectedLedgerTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SelectedLedgerTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SelectedLedgerTitlePanelLayout.setVerticalGroup(
            SelectedLedgerTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectedLedgerTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SelectedLedgerTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        SelectedLedgerDis.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        SelectedLedgerDis.setForeground(new java.awt.Color(255, 255, 255));
        SelectedLedgerDis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SelectedLedgerDis.setText("This discription is about a ledger that selected");
        SelectedLedgerDis.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Discription");

        javax.swing.GroupLayout LedegerViewPanelLayout = new javax.swing.GroupLayout(LedegerViewPanel);
        LedegerViewPanel.setLayout(LedegerViewPanelLayout);
        LedegerViewPanelLayout.setHorizontalGroup(
            LedegerViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SelectedLedgerTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LedegerViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LedegerViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LedegerViewPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(SelectedLedgerDis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LedegerViewPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(205, Short.MAX_VALUE))))
        );
        LedegerViewPanelLayout.setVerticalGroup(
            LedegerViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LedegerViewPanelLayout.createSequentialGroup()
                .addComponent(SelectedLedgerTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelectedLedgerDis, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout leftSidePanelLayout = new javax.swing.GroupLayout(leftSidePanel);
        leftSidePanel.setLayout(leftSidePanelLayout);
        leftSidePanelLayout.setHorizontalGroup(
            leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LedgerTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LedgerListPanel)
            .addComponent(BottomLeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LedegerViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftSidePanelLayout.setVerticalGroup(
            leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSidePanelLayout.createSequentialGroup()
                .addComponent(LedgerTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LedgerListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(LedegerViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BottomLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Account ID", "Account Name", "Description", "VN", "PR", "Amount", "Dr/Cr"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BasePanel.setViewportView(DataTable);
        if (DataTable.getColumnModel().getColumnCount() > 0) {
            DataTable.getColumnModel().getColumn(1).setResizable(false);
            DataTable.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 45));

        currentTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentTimeLabel.setText("current time");

        RowCountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RowCountLabel.setText("00 transactions are available");

        lastTrcDateLabel.setText("last transaction : 01/01/2022");

        CurrentDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentDateLabel.setText("current Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lastTrcDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RowCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(currentTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CurrentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(currentTimeLabel)
                        .addGap(0, 0, 0)
                        .addComponent(CurrentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RowCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lastTrcDateLabel)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addComponent(leftSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BasePanel)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)))
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leftSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backPanelLayout.createSequentialGroup()
                        .addComponent(BasePanel)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
 
    private void newAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAccBtnActionPerformed
        // TODO add your handling code here:
        newAccScreen accScreen = new newAccScreen();
        accScreen.setVisible(true);
    }//GEN-LAST:event_newAccBtnActionPerformed

    private void trialBlnceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trialBlnceBtnActionPerformed
        // TODO add your handling code here:
        TrialBScreen trialB = new TrialBScreen();
        trialB.setVisible(true);
    }//GEN-LAST:event_trialBlnceBtnActionPerformed

    private void addDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDataBtnActionPerformed
        // TODO add your handling code here:
        newTransactionScreen trans = new newTransactionScreen();
        trans.setVisible(true);
    }//GEN-LAST:event_addDataBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        
        HomeScreen hs = new HomeScreen();
        this.setVisible(false);
        hs.setVisible(true);
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conSQL sqlConn = new conSQL();
        sqlConn.startDBConnection();
        DefaultListModel m = new DefaultListModel();
        for(int i=0; i<sqlConn.rowCount("main");i++){
         m.addElement(sqlConn.accNames(i,"ledger_name"));
          
        }
        
        LedgerList.setModel(m);
        LedgerList.setSelectedIndex(0);
        getDataToTable(0);
    }//GEN-LAST:event_formWindowOpened

    private void LedgerListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LedgerListMouseClicked
        // TODO add your handling code here:
        conSQL sqlConn = new conSQL();
        sqlConn.startDBConnection();
        int selectedIndex = LedgerList.getSelectedIndex();
        SelectedLedgerTitleLabel.setText(sqlConn.accNames(selectedIndex,"ledger_name"));
        SelectedLedgerDis.setText(sqlConn.accDiscription(selectedIndex));
        
        getDataToTable(selectedIndex);
        
    }//GEN-LAST:event_LedgerListMouseClicked

    private void ComboBoxChanged(){

        YearComboBox.addItemListener(new ItemListener(){
            public void itemStateChanged (ItemEvent arg0){
                getDataToTable(LedgerList.getSelectedIndex());
               
            }
        });
        
        MonthComboBox.addItemListener(new ItemListener(){
            public void itemStateChanged (ItemEvent arg0){
                getDataToTable(LedgerList.getSelectedIndex());
              
            }
        });
    }
    
   
    private void getDataToTable(int index){
        
        conSQL sqlConn = new conSQL();
        sqlConn.startDBConnection();
        DefaultTableModel model = (DefaultTableModel)DataTable.getModel();
        model.setRowCount(0);
        String ledegerId = sqlConn.retrieveAccId(LedgerList.getSelectedValue());
        System.out.println(ledegerId);
        
        int year =  YearComboBox.getSelectedIndex();
        int month = MonthComboBox.getSelectedIndex();
        
       String extendedQuery = "";
       String strMonth = "";
       if(month<10){
           strMonth = "0"+month;
       }
       
       if(year !=0 && month == 0){
           extendedQuery = " AND t_date LIKE '"+YearComboBox.getSelectedItem()+"-%'";
       }
       else if(year ==0 && month != 0){
           extendedQuery = " AND  t_date LIKE '%-"+strMonth+"-%'";
       }else if(year !=0 && month != 0){
           extendedQuery = " AND t_date LIKE '"+YearComboBox.getSelectedItem()+"-"+strMonth+"%'";
       }
        System.out.println(extendedQuery);
        
        String fdate ="";
        String[] CrDr = {"Credit", "Debit"};
        for(int cdCount = 0; cdCount<2;cdCount++){
            List<String> dateList =  sqlConn.retrieveAccData(ledegerId,"t_date", cd[cdCount],extendedQuery);
            List<String> AccIdList =  sqlConn.retrieveAccData(ledegerId,cdCount==0?cd[1]:cd[0], cd[cdCount],extendedQuery);
            List<String> desList =  sqlConn.retrieveAccData(ledegerId,"transaction_description", cd[cdCount],extendedQuery);
            List<String> AmountList =  sqlConn.retrieveAccData(ledegerId,"amount", cd[cdCount],extendedQuery);
            List<String> vnList =  sqlConn.retrieveAccData(ledegerId,"vn", cd[cdCount],extendedQuery);
            List<String> prList =  sqlConn.retrieveAccData(ledegerId,"pr", cd[cdCount],extendedQuery);
            
            if(dateList!=null)
            
        for (int i = 0; i< dateList.size();i++){
            
           // System.out.println(dateList.get(i));
            Object[] row = new Object[8];
            row[0] = dateList.get(i);
            row[1] = AccIdList.get(i);
            row[2] = sqlConn.retrieveAccNameByID(AccIdList.get(i));
            row[3] = desList.get(i);
            row[4] = vnList.get(i);
            row[5] = prList.get(i);
            row[6] = AmountList.get(i);
            row[7] = CrDr[cdCount];
            
            fdate = dateList.get(i);
            
            model.addRow(row);
           model.fireTableDataChanged();
            
        }
        }
        lastTrcDateLabel.setText("last transaction "+ fdate);
        
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(DataTable.getModel());
        DataTable.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
 
        int columnIndexToSort = 1;       
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.DESCENDING));
 
        sorter.setSortKeys(sortKeys);
        sorter.sort();
        
        
        

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane BasePanel;
    private javax.swing.JPanel BottomLeftPanel;
    private javax.swing.JLabel CurrentDateLabel;
    private javax.swing.JTable DataTable;
    private javax.swing.JPanel FilterPanel;
    private javax.swing.JPanel LedegerViewPanel;
    private javax.swing.JList<String> LedgerList;
    private javax.swing.JScrollPane LedgerListPanel;
    private javax.swing.JLabel LedgerTitleLabel;
    private javax.swing.JPanel LedgerTitlePanel;
    private javax.swing.JComboBox<String> MonthComboBox;
    private javax.swing.JLabel MonthFilterLabel;
    private javax.swing.JLabel RowCountLabel;
    private javax.swing.JLabel SelectedLedgerDis;
    private javax.swing.JLabel SelectedLedgerTitleLabel;
    private javax.swing.JPanel SelectedLedgerTitlePanel;
    private javax.swing.JComboBox<String> YearComboBox;
    private javax.swing.JLabel YearFilterLabel;
    private javax.swing.JButton addDataBtn;
    private javax.swing.JPanel backPanel;
    private javax.swing.JLabel currentTimeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastTrcDateLabel;
    private javax.swing.JPanel leftSidePanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton newAccBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton trialBlnceBtn;
    // End of variables declaration//GEN-END:variables

    
}
