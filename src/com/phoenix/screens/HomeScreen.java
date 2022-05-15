/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.phoenix.screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

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
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        leftSidePanel = new javax.swing.JPanel();
        LedgerTitlePanel = new javax.swing.JPanel();
        LedgerTitleLabel = new javax.swing.JLabel();
        SearchBarTxtField = new java.awt.TextField();
        searchBtn = new javax.swing.JButton();
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
        Table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        currentTimeLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CurrentDateLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jButton2.setText("Select Date");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(2, 2, 2)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FilterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newAccBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trialBlnceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(FilterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        LedgerTitlePanel.setBackground(new java.awt.Color(50, 53, 55));

        LedgerTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        LedgerTitleLabel.setText("Accounts");

        SearchBarTxtField.setBackground(new java.awt.Color(60, 63, 65));

        searchBtn.setBackground(new java.awt.Color(50, 53, 55));
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/phoenix/assets/search.png"))); // NOI18N

        javax.swing.GroupLayout LedgerTitlePanelLayout = new javax.swing.GroupLayout(LedgerTitlePanel);
        LedgerTitlePanel.setLayout(LedgerTitlePanelLayout);
        LedgerTitlePanelLayout.setHorizontalGroup(
            LedgerTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LedgerTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LedgerTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(SearchBarTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LedgerTitlePanelLayout.setVerticalGroup(
            LedgerTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LedgerTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LedgerTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(SearchBarTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LedgerTitleLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        LedgerList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 12", "Item 22", "Item 32", "Item 42", "Item 52", "Item 13", "Item 23", "Item 33", "Item 43", "Item 53" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        LedgerList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
            .addGroup(leftSidePanelLayout.createSequentialGroup()
                .addComponent(LedegerViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        leftSidePanelLayout.setVerticalGroup(
            leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSidePanelLayout.createSequentialGroup()
                .addComponent(LedgerTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LedgerListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(LedegerViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BottomLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Transaction ID", "Amount", "Debit/Credit", "Date", "Time", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BasePanel.setViewportView(Table);

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 45));

        currentTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentTimeLabel.setText("current time");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("99 transactions");

        jLabel3.setText("last transaction : 01/01/2022");

        CurrentDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentDateLabel.setText("current Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
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
                    .addGroup(backPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                        .addGap(0, 0, 0))))
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
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JPanel FilterPanel;
    private javax.swing.JPanel LedegerViewPanel;
    private javax.swing.JList<String> LedgerList;
    private javax.swing.JScrollPane LedgerListPanel;
    private javax.swing.JLabel LedgerTitleLabel;
    private javax.swing.JPanel LedgerTitlePanel;
    private javax.swing.JComboBox<String> MonthComboBox;
    private javax.swing.JLabel MonthFilterLabel;
    private java.awt.TextField SearchBarTxtField;
    private javax.swing.JLabel SelectedLedgerDis;
    private javax.swing.JLabel SelectedLedgerTitleLabel;
    private javax.swing.JPanel SelectedLedgerTitlePanel;
    private javax.swing.JTable Table;
    private javax.swing.JComboBox<String> YearComboBox;
    private javax.swing.JLabel YearFilterLabel;
    private javax.swing.JButton addDataBtn;
    private javax.swing.JPanel backPanel;
    private javax.swing.JLabel currentTimeLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel leftSidePanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton newAccBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton trialBlnceBtn;
    // End of variables declaration//GEN-END:variables
}
