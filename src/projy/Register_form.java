/*
Codice per la registrazione di un nuovo utente, professore o studente
 */
package projy;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Register_form extends javax.swing.JFrame {

    public Register_form() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Parent_panel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Stud = new javax.swing.JPanel();
        Nome_Ev = new javax.swing.JLabel();
        Cognome_Ev = new javax.swing.JLabel();
        Indirizzo_Ev = new javax.swing.JLabel();
        Codicefis_Ev = new javax.swing.JLabel();
        Tdc_Ev = new javax.swing.JLabel();
        Email_Ev = new javax.swing.JLabel();
        Tele_Ev = new javax.swing.JLabel();
        Tds_Ev = new javax.swing.JLabel();
        Pass_Ev = new javax.swing.JLabel();
        TNome_Ev = new javax.swing.JTextField();
        TCognome_Ev = new javax.swing.JTextField();
        TIndirizzo_Ev = new javax.swing.JTextField();
        TCodicefis_Ev = new javax.swing.JTextField();
        TEmail_Ev = new javax.swing.JTextField();
        TTele_Ev = new javax.swing.JTextField();
        TTds_Ev = new javax.swing.JTextField();
        TPass_Ev = new javax.swing.JTextField();
        Registrati_Ev = new javax.swing.JButton();
        Ttdc_EV = new javax.swing.JComboBox<>();
        Cds_Ev = new javax.swing.JLabel();
        Ac_Ev = new javax.swing.JLabel();
        TCds_Ev = new javax.swing.JTextField();
        TAc_Ev = new javax.swing.JComboBox<>();
        Professore = new javax.swing.JPanel();
        Nome_Pr = new javax.swing.JLabel();
        Cognome_Pr = new javax.swing.JLabel();
        Indirizzo_Pr = new javax.swing.JLabel();
        Codicefis_Pr = new javax.swing.JLabel();
        Dip_Pr = new javax.swing.JLabel();
        Profilo_Pr = new javax.swing.JLabel();
        Email_Pr = new javax.swing.JLabel();
        Tele_Pr = new javax.swing.JLabel();
        Tds_Pr = new javax.swing.JLabel();
        Pass_Pr = new javax.swing.JLabel();
        TNome_Pr = new javax.swing.JTextField();
        TCognome_Pr = new javax.swing.JTextField();
        TIndirizzo_Pr = new javax.swing.JTextField();
        TCodicefis_Pr = new javax.swing.JTextField();
        TTdc_Pr = new javax.swing.JTextField();
        TAc_Pr = new javax.swing.JTextField();
        TEmail_Pr = new javax.swing.JTextField();
        TTele_Pr = new javax.swing.JTextField();
        TTds_Pr = new javax.swing.JTextField();
        TPass_Pr = new javax.swing.JTextField();
        Registrati_Pr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrazione");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(389, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("REGISTRAZIONE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        Parent_panel.setBackground(new java.awt.Color(0, 102, 102));

        jTabbedPane1.setBackground(new java.awt.Color(0, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        Stud.setBackground(new java.awt.Color(0, 102, 102));

        Nome_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nome_Ev.setText("Nome :");

        Cognome_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cognome_Ev.setText("Cognome :");

        Indirizzo_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Indirizzo_Ev.setText("Indirizzo :");

        Codicefis_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Codicefis_Ev.setText("Codice Fiscale :");

        Tdc_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tdc_Ev.setText("Tipo di corso :");

        Email_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Email_Ev.setText("Email");

        Tele_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tele_Ev.setText("Telefono");

        Tds_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tds_Ev.setText("Titolo di studio");

        Pass_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pass_Ev.setText("Password");

        Registrati_Ev.setText("Registrati");
        Registrati_Ev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrati_EvActionPerformed(evt);
            }
        });

        Ttdc_EV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Triennale", "Quinquennale" }));
        Ttdc_EV.setSelectedIndex(-1);

        Cds_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cds_Ev.setText("Corso di studio");

        Ac_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Ac_Ev.setText("Anno di corso");

        TAc_Ev.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primo", "Secondo", "Terzo", "Quarto", "Quinto", "Sesto", "Settimo", "Ottavo", "Nono", "Decimo", "Più di dieci" }));
        TAc_Ev.setSelectedIndex(-1);

        javax.swing.GroupLayout StudLayout = new javax.swing.GroupLayout(Stud);
        Stud.setLayout(StudLayout);
        StudLayout.setHorizontalGroup(
            StudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(StudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudLayout.createSequentialGroup()
                        .addComponent(Nome_Ev)
                        .addGap(157, 157, 157)
                        .addComponent(Cognome_Ev))
                    .addGroup(StudLayout.createSequentialGroup()
                        .addComponent(TNome_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(TCognome_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(StudLayout.createSequentialGroup()
                        .addComponent(Indirizzo_Ev)
                        .addGap(139, 139, 139)
                        .addComponent(Codicefis_Ev))
                    .addGroup(StudLayout.createSequentialGroup()
                        .addGroup(StudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TIndirizzo_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tdc_Ev)
                            .addComponent(Email_Ev)
                            .addGroup(StudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Ttdc_EV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TEmail_Ev, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                            .addComponent(Tds_Ev)
                            .addComponent(TTds_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(StudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tele_Ev)
                            .addComponent(TTele_Ev, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(TCodicefis_Ev, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(Cds_Ev)
                            .addComponent(Ac_Ev)
                            .addComponent(TCds_Ev)
                            .addComponent(TAc_Ev, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(StudLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(Registrati_Ev))
            .addGroup(StudLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TPass_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pass_Ev)))
        );
        StudLayout.setVerticalGroup(
            StudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(StudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nome_Ev)
                    .addComponent(Cognome_Ev))
                .addGap(6, 6, 6)
                .addGroup(StudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TNome_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCognome_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(StudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Indirizzo_Ev)
                    .addComponent(Codicefis_Ev))
                .addGap(6, 6, 6)
                .addGroup(StudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TIndirizzo_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCodicefis_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(StudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudLayout.createSequentialGroup()
                        .addComponent(Tdc_Ev)
                        .addGap(6, 6, 6)
                        .addComponent(Ttdc_EV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(Email_Ev)
                        .addGap(6, 6, 6)
                        .addGroup(StudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TEmail_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TCds_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(StudLayout.createSequentialGroup()
                        .addComponent(Tele_Ev)
                        .addGap(6, 6, 6)
                        .addComponent(TTele_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cds_Ev)))
                .addGap(11, 11, 11)
                .addGroup(StudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tds_Ev)
                    .addComponent(Ac_Ev))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TTds_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TAc_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pass_Ev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TPass_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(Registrati_Ev)
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("Studente", Stud);

        Professore.setBackground(new java.awt.Color(0, 102, 102));

        Nome_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nome_Pr.setText("Nome :");

        Cognome_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cognome_Pr.setText("Cognome :");

        Indirizzo_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Indirizzo_Pr.setText("Indirizzo :");

        Codicefis_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Codicefis_Pr.setText("Codice Fiscale :");

        Dip_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dip_Pr.setText("Dipartimento :");

        Profilo_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Profilo_Pr.setText("Profilo :");

        Email_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Email_Pr.setText("Email");

        Tele_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tele_Pr.setText("Telefono");

        Tds_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tds_Pr.setText("Titolo di studio");

        Pass_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pass_Pr.setText("Password");

        TCodicefis_Pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCodicefis_PrActionPerformed(evt);
            }
        });

        Registrati_Pr.setText("Registrati");
        Registrati_Pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrati_PrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProfessoreLayout = new javax.swing.GroupLayout(Professore);
        Professore.setLayout(ProfessoreLayout);
        ProfessoreLayout.setHorizontalGroup(
            ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfessoreLayout.createSequentialGroup()
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfessoreLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ProfessoreLayout.createSequentialGroup()
                                .addComponent(Nome_Pr)
                                .addGap(157, 157, 157)
                                .addComponent(Cognome_Pr))
                            .addGroup(ProfessoreLayout.createSequentialGroup()
                                .addComponent(TNome_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(TCognome_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProfessoreLayout.createSequentialGroup()
                                .addComponent(Indirizzo_Pr)
                                .addGap(139, 139, 139)
                                .addComponent(Codicefis_Pr))
                            .addGroup(ProfessoreLayout.createSequentialGroup()
                                .addComponent(TIndirizzo_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(TCodicefis_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProfessoreLayout.createSequentialGroup()
                                .addComponent(Dip_Pr)
                                .addGap(113, 113, 113)
                                .addComponent(Profilo_Pr))
                            .addGroup(ProfessoreLayout.createSequentialGroup()
                                .addComponent(TTdc_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(TAc_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProfessoreLayout.createSequentialGroup()
                                .addComponent(Email_Pr)
                                .addGap(168, 168, 168)
                                .addComponent(Tele_Pr))
                            .addGroup(ProfessoreLayout.createSequentialGroup()
                                .addComponent(TEmail_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(TTele_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProfessoreLayout.createSequentialGroup()
                                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TTds_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tds_Pr))
                                .addGap(79, 79, 79)
                                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pass_Pr)
                                    .addComponent(TPass_Pr)))))
                    .addGroup(ProfessoreLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(Registrati_Pr)))
                .addGap(55, 55, 55))
        );
        ProfessoreLayout.setVerticalGroup(
            ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfessoreLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nome_Pr)
                    .addComponent(Cognome_Pr))
                .addGap(6, 6, 6)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TNome_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCognome_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Indirizzo_Pr)
                    .addComponent(Codicefis_Pr))
                .addGap(6, 6, 6)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TIndirizzo_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCodicefis_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dip_Pr)
                    .addComponent(Profilo_Pr))
                .addGap(6, 6, 6)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TTdc_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TAc_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Email_Pr)
                    .addComponent(Tele_Pr))
                .addGap(6, 6, 6)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TEmail_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TTele_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tds_Pr)
                    .addComponent(Pass_Pr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TTds_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TPass_Pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(Registrati_Pr)
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("Professore", Professore);

        javax.swing.GroupLayout Parent_panelLayout = new javax.swing.GroupLayout(Parent_panel);
        Parent_panel.setLayout(Parent_panelLayout);
        Parent_panelLayout.setHorizontalGroup(
            Parent_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        Parent_panelLayout.setVerticalGroup(
            Parent_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        getContentPane().add(Parent_panel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TCodicefis_PrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCodicefis_PrActionPerformed
        
    }//GEN-LAST:event_TCodicefis_PrActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void Registrati_EvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrati_EvActionPerformed
        
        db_conn conn = new db_conn();
        
        String Nome = TNome_Ev.getText();
        String Cognome = TCognome_Ev.getText();
        String Indirizzo = TIndirizzo_Ev.getText();
        String Codice_Fiscale = TCodicefis_Ev.getText();
        String Tipo_di_corso="";
        int Tdc = Ttdc_EV.getSelectedIndex();
        if (Tdc==0){
             Tipo_di_corso = "Triennale";
        }else if(Tdc==1){
             Tipo_di_corso = "Quinquennale";            
        }     
        String Email = TEmail_Ev.getText();
        String Telefono = TTele_Ev.getText();
        String Titolo_di_studio = TTds_Ev.getText();
        String Password = TPass_Ev.getText();
        String Corso = TCds_Ev.getText();
        int Ac = TAc_Ev.getSelectedIndex();
        String An_Corso="";
        if (Ac==0){
             An_Corso = "Primo";
        }else if(Ac==1){
             An_Corso = "Secondo";            
        }else if(Ac==2){
             An_Corso = "Terzo"; 
        }else if(Ac==3){
             An_Corso = "Quarto"; 
        }else if(Ac==4){
             An_Corso = "Quinto"; 
        }else if(Ac==5){
             An_Corso = "Sesto"; 
        }else if(Ac==6){
             An_Corso = "Settimo"; 
        }else if(Ac==7){
             An_Corso = "Ottavo";
        }else if(Ac==8){
             An_Corso = "Nono"; 
        }else if(Ac==9){
             An_Corso = "Decimo";
        }else if(Ac==10){
             An_Corso = "Più di dieci"; 
        }             
        String[] Utente= new String [12];
        
        Utente[0]=Nome; Utente[1]=Cognome; Utente[2]=Indirizzo; Utente[3]=Telefono; Utente[4]=Email; Utente[5]=Titolo_di_studio; 
        Utente[6]=Codice_Fiscale; Utente[7]="studente";Utente[8]=Password;
        Utente[9]=Tipo_di_corso; Utente[10]=Corso;Utente[11]=An_Corso;
        
        if((Nome.isEmpty())|| (Cognome.isEmpty())|| (Indirizzo.isEmpty()) || (Telefono.isEmpty()) || (Email.isEmpty()) || (Codice_Fiscale.isEmpty()) || (Password.isEmpty())){
        
            JOptionPane.showMessageDialog(this,"Campo/i vuoti");
            
        }else{
    
            if (Tdc==0){
                
                if(Ac<=10 && Ac>=0){
                    
                    conn.register_stud(Utente);
                    JOptionPane.showMessageDialog(this,"Registrazione avvenuta con successo");
                    new Login_form().setVisible(true);
                    this.dispose();
                    
                }else {      
                    JOptionPane.showMessageDialog(this,"Erroe, seleziona Anno di corso");
                }
                
            }else if(Tdc==1){
                
                if(Ac<=10 && Ac>=0){
                    
                    conn.register_stud(Utente);
                    JOptionPane.showMessageDialog(this,"Registrazione avvenuta con successo");
                    new Login_form().setVisible(true);
                    this.dispose();
                    
                }else {
                    JOptionPane.showMessageDialog(this,"Erroe, seleziona Anno di corso");
                }

            }else {
                JOptionPane.showMessageDialog(this,"Erroe, Tipo di corso");
            }
        }
    }//GEN-LAST:event_Registrati_EvActionPerformed

    private void Registrati_PrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrati_PrActionPerformed
        
        db_conn conn = new db_conn();
        
        String Nome = TNome_Pr.getText();
        String Cognome = TCognome_Pr.getText();
        String Indirizzo = TIndirizzo_Pr.getText();
        String Codice_Fiscale = TCodicefis_Pr.getText();
        String Dipartimento = TTdc_Pr.getText();
        String Email = TEmail_Pr.getText();
        String Telefono = TTele_Pr.getText();
        String Titolo_di_studio = TTds_Pr.getText();
        String Profilo = TAc_Pr.getText();
        String Password = TPass_Pr.getText();
        String[] Utente= new String [11];
        
        Utente[0]=Nome;Utente[1]=Cognome;Utente[2]=Indirizzo;Utente[3]=Telefono;Utente[4]=Email;Utente[5]=Titolo_di_studio;
        Utente[6]=Codice_Fiscale;Utente[7]="professore";Utente[8]=Password;
        Utente[9]=Profilo; Utente[10]=Dipartimento;
        
        if((Nome.isEmpty())|| (Cognome.isEmpty())|| (Indirizzo.isEmpty()) || (Telefono.isEmpty()) || (Email.isEmpty()) || (Codice_Fiscale.isEmpty()) || (Password.isEmpty()) || (Dipartimento.isEmpty())||(Titolo_di_studio.isEmpty())||(Profilo.isEmpty())){
            JOptionPane.showMessageDialog(this,"Campo/i vuoti");
        }else{
            conn.register_prof(Utente);
            JOptionPane.showMessageDialog(this,"Registrazione avvenuta con successo");
            new Login_form().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_Registrati_PrActionPerformed
    }
 
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
            java.util.logging.Logger.getLogger(Register_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ac_Ev;
    private javax.swing.JLabel Cds_Ev;
    private javax.swing.JLabel Codicefis_Ev;
    private javax.swing.JLabel Codicefis_Pr;
    private javax.swing.JLabel Cognome_Ev;
    private javax.swing.JLabel Cognome_Pr;
    private javax.swing.JLabel Dip_Pr;
    private javax.swing.JLabel Email_Ev;
    private javax.swing.JLabel Email_Pr;
    private javax.swing.JLabel Indirizzo_Ev;
    private javax.swing.JLabel Indirizzo_Pr;
    private javax.swing.JLabel Nome_Ev;
    private javax.swing.JLabel Nome_Pr;
    private javax.swing.JPanel Parent_panel;
    private javax.swing.JLabel Pass_Ev;
    private javax.swing.JLabel Pass_Pr;
    private javax.swing.JPanel Professore;
    private javax.swing.JLabel Profilo_Pr;
    private javax.swing.JButton Registrati_Ev;
    private javax.swing.JButton Registrati_Pr;
    private javax.swing.JPanel Stud;
    private javax.swing.JComboBox<String> TAc_Ev;
    private javax.swing.JTextField TAc_Pr;
    private javax.swing.JTextField TCds_Ev;
    private javax.swing.JTextField TCodicefis_Ev;
    private javax.swing.JTextField TCodicefis_Pr;
    private javax.swing.JTextField TCognome_Ev;
    private javax.swing.JTextField TCognome_Pr;
    private javax.swing.JTextField TEmail_Ev;
    private javax.swing.JTextField TEmail_Pr;
    private javax.swing.JTextField TIndirizzo_Ev;
    private javax.swing.JTextField TIndirizzo_Pr;
    private javax.swing.JTextField TNome_Ev;
    private javax.swing.JTextField TNome_Pr;
    private javax.swing.JTextField TPass_Ev;
    private javax.swing.JTextField TPass_Pr;
    private javax.swing.JTextField TTdc_Pr;
    private javax.swing.JTextField TTds_Ev;
    private javax.swing.JTextField TTds_Pr;
    private javax.swing.JTextField TTele_Ev;
    private javax.swing.JTextField TTele_Pr;
    private javax.swing.JLabel Tdc_Ev;
    private javax.swing.JLabel Tds_Ev;
    private javax.swing.JLabel Tds_Pr;
    private javax.swing.JLabel Tele_Ev;
    private javax.swing.JLabel Tele_Pr;
    private javax.swing.JComboBox<String> Ttdc_EV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
