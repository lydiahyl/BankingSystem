
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lydia
 */
public class CreateAccount extends javax.swing.JFrame {
   
  

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
        initComponents();
    }
    // generate 8 random numbers
    public void random(){
        Random ranNum = new Random();
        int num = ranNum.nextInt(89999999) + 10000000;
        String AccountNum = String.valueOf(num);
        TxtAccountNum.setText(AccountNum);    
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CboGender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        TxtIC = new javax.swing.JTextField();
        TxtAccBal = new javax.swing.JTextField();
        TxtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CboAccount = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        CboRace = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        TxtContact = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtFullName = new javax.swing.JTextField();
        jBtnSave = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        TxtAccountNum = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jBtnClear = new javax.swing.JButton();
        Generatebtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ValidateAccBal = new javax.swing.JLabel();
        ValidateIC = new javax.swing.JLabel();
        ValidateContactNum = new javax.swing.JLabel();
        ValidateFullName = new javax.swing.JLabel();
        BtnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create New Account");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel2.setText("Full Name");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel3.setText("Account Balance");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel5.setText("Gender");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        CboGender.setBackground(new java.awt.Color(204, 204, 255));
        CboGender.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        CboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        CboGender.setSelectedIndex(-1);
        jPanel5.add(CboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 110, 27));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel6.setText("Address");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        TxtIC.setBackground(new java.awt.Color(204, 204, 255));
        TxtIC.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtIC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TxtIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtICActionPerformed(evt);
            }
        });
        TxtIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtICKeyPressed(evt);
            }
        });
        jPanel5.add(TxtIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 170, 27));

        TxtAccBal.setBackground(new java.awt.Color(204, 204, 255));
        TxtAccBal.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtAccBal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TxtAccBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAccBalActionPerformed(evt);
            }
        });
        TxtAccBal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtAccBalKeyPressed(evt);
            }
        });
        jPanel5.add(TxtAccBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 150, 27));

        TxtAddress.setBackground(new java.awt.Color(204, 204, 255));
        TxtAddress.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtAddress.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(TxtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 174, 27));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel7.setText("Account Type");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        CboAccount.setBackground(new java.awt.Color(204, 204, 255));
        CboAccount.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        CboAccount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Savings Account", "Current Account" }));
        CboAccount.setSelectedIndex(-1);
        CboAccount.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CboAccountItemStateChanged(evt);
            }
        });
        CboAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboAccountActionPerformed(evt);
            }
        });
        jPanel5.add(CboAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 170, 27));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel8.setText("Race");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        CboRace.setBackground(new java.awt.Color(204, 204, 255));
        CboRace.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        CboRace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Malay", "Chinese", "Indian" }));
        CboRace.setSelectedIndex(-1);
        jPanel5.add(CboRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 125, 27));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel9.setText("Contact Number");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        TxtContact.setBackground(new java.awt.Color(204, 204, 255));
        TxtContact.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtContact.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TxtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtContactKeyPressed(evt);
            }
        });
        jPanel5.add(TxtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 183, 27));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel12.setText("IC NO/Passport");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        TxtFullName.setBackground(new java.awt.Color(204, 204, 255));
        TxtFullName.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtFullName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TxtFullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtFullNameKeyPressed(evt);
            }
        });
        jPanel5.add(TxtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 174, 27));

        jBtnSave.setBackground(new java.awt.Color(153, 153, 255));
        jBtnSave.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jBtnSave.setText("SAVE");
        jBtnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnSave.setContentAreaFilled(false);
        jBtnSave.setOpaque(true);
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });
        jPanel5.add(jBtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 110, 40));

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel13.setText("Account Number");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        TxtAccountNum.setEditable(false);
        TxtAccountNum.setBackground(new java.awt.Color(204, 204, 255));
        TxtAccountNum.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtAccountNum.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TxtAccountNum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtAccountNumMouseClicked(evt);
            }
        });
        TxtAccountNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAccountNumActionPerformed(evt);
            }
        });
        jPanel5.add(TxtAccountNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 174, 27));

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel14.setText("RM");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 20, -1));

        jBtnClear.setBackground(new java.awt.Color(153, 153, 255));
        jBtnClear.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jBtnClear.setText("CLEAR ALL");
        jBtnClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnClear.setContentAreaFilled(false);
        jBtnClear.setOpaque(true);
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });
        jPanel5.add(jBtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 110, 40));

        Generatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/natural_user_interface_2_24px.png"))); // NOI18N
        Generatebtn.setBorderPainted(false);
        Generatebtn.setContentAreaFilled(false);
        Generatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneratebtnActionPerformed(evt);
            }
        });
        jPanel5.add(Generatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 40, 20));
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        ValidateAccBal.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        ValidateAccBal.setForeground(new java.awt.Color(255, 0, 0));
        ValidateAccBal.setText("*");
        jPanel5.add(ValidateAccBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        ValidateIC.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        ValidateIC.setForeground(new java.awt.Color(255, 0, 0));
        ValidateIC.setText("*");
        ValidateIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ValidateICKeyPressed(evt);
            }
        });
        jPanel5.add(ValidateIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 170, 20));

        ValidateContactNum.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        ValidateContactNum.setForeground(new java.awt.Color(255, 0, 0));
        ValidateContactNum.setText("*");
        jPanel5.add(ValidateContactNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 180, 20));

        ValidateFullName.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        ValidateFullName.setForeground(new java.awt.Color(255, 0, 0));
        ValidateFullName.setText("*");
        jPanel5.add(ValidateFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, 750, 350));

        BtnBack.setBackground(new java.awt.Color(0, 0, 153));
        BtnBack.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        BtnBack.setForeground(new java.awt.Color(255, 255, 255));
        BtnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/go_back.png"))); // NOI18N
        BtnBack.setBorder(null);
        BtnBack.setBorderPainted(false);
        BtnBack.setContentAreaFilled(false);
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });
        jPanel2.add(BtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 43));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtICActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        // back to dashboard
        dispose();
        Dashboard dash = new Dashboard();
        dash.setVisible(true);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClearActionPerformed
        // TODO add your handling code here:
        // clear text fields
        TxtAccountNum.setText(null);
        TxtFullName.setText(null);
        CboAccount.setSelectedIndex(-1);
        TxtAccBal.setText(null);
        TxtIC.setText(null);   
        CboGender.setSelectedIndex(-1);
        TxtAddress.setText(null);
        CboRace.setSelectedIndex(-1);
        TxtContact.setText(null);
    }//GEN-LAST:event_jBtnClearActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
            // TODO add your handling code here:
           int value = Integer.valueOf(TxtAccBal.getText());

      if(CboAccount.getSelectedItem().toString().equals("Savings Account") && value < 100 ){
            TxtAccBal.setText("100.0");
            JOptionPane.showMessageDialog(this, "Please note that minimum balance required for Savings Account is RM100!");
          
      }else if(CboAccount.getSelectedItem().toString().equals("Current Account") && value < 500 ){
           TxtAccBal.setText("500.0");
           JOptionPane.showMessageDialog(this, "Please note that minimum Balance required for Current Account is RM500!");
      } else{
           
        try {

            if(!"".equals(TxtAccountNum.getText()) && !"".equals(TxtFullName.getText()) && !"".equals(TxtAccBal.getText()) && !"".equals(TxtIC.getText()) 
                    && !"".equals(TxtAddress.getText()) && !"".equals(TxtContact.getText())){
            setData();
            JOptionPane.showMessageDialog(this, "User Registered Successfully!");
        }
            else{
                JOptionPane.showMessageDialog(this, "Please enter all the details.","Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(CreateAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
      }                                
    }//GEN-LAST:event_jBtnSaveActionPerformed
    
    private void TxtAccountNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAccountNumActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TxtAccountNumActionPerformed

    private void GeneratebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneratebtnActionPerformed
        // TODO add your handling code here:
        random();
    }//GEN-LAST:event_GeneratebtnActionPerformed

    private void TxtAccountNumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtAccountNumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAccountNumMouseClicked

    private void TxtContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtContactKeyPressed
        // TODO add your handling code here:
        String contactNum = TxtContact.getText();
        int length = contactNum.length();
        
        char c = evt.getKeyChar();
        
        //check for number 0 to 10
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
        //check length not more than 10 digits
        if(length<11){
            TxtContact.setEditable(true);
        } else{
            TxtContact.setEditable(false);
             ValidateContactNum.setText("* Enter 10 Digits Numbers only!");
        }
        }else {
            if(evt.getExtendedKeyCode() ==KeyEvent.VK_BACK_SPACE ||evt.getExtendedKeyCode() ==KeyEvent.VK_DELETE){
                TxtContact.setEditable(true);
                ValidateContactNum.setText(null);
            } else{
                TxtContact.setEditable(false);
            }
        }
    }//GEN-LAST:event_TxtContactKeyPressed

    private void TxtAccBalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAccBalKeyPressed
        // TODO add your handling code here:
        char a = evt.getKeyChar();
       
        if(Character.isAlphabetic(a)){
            TxtAccBal.setEditable(false);
            //label
            ValidateAccBal.setText("* Enter Numeric Values Only!");
        } else{
            TxtAccBal.setEditable(true);
            ValidateAccBal.setText(null);
        }
        
    }//GEN-LAST:event_TxtAccBalKeyPressed

    private void ValidateICKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValidateICKeyPressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_ValidateICKeyPressed

    private void TxtICKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtICKeyPressed
        // TODO add your handling code here:
        char a = evt.getKeyChar();
        if(Character.isAlphabetic(a)){
            TxtIC.setEditable(false);
            //label
            ValidateIC.setText("* Enter Numeric Values Only!");
        } else{
            TxtIC.setEditable(true);
            ValidateIC.setText(null);
        }
    }//GEN-LAST:event_TxtICKeyPressed

    private void TxtFullNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFullNameKeyPressed
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)){
            TxtFullName.setEditable(true);
            ValidateFullName.setText(null);
        } else
        {
            TxtFullName.setEditable(false);
            ValidateFullName.setText("* Enter Letters only!");
        }
    }//GEN-LAST:event_TxtFullNameKeyPressed

    private void CboAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CboAccountActionPerformed

    private void CboAccountItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CboAccountItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CboAccountItemStateChanged

    private void TxtAccBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAccBalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAccBalActionPerformed

    public void setData() throws IOException{
        File f = new File("Customer.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        BufferedReader br = new BufferedReader(new FileReader(f));
        Object[] Lines = br.lines().toArray();
        int i=0;
        int id = 0;
        for(i=0; i<Lines.length; i++){
            String Line = Lines[i].toString().trim();
            String[] Row = Line.split("<>");
            id = Integer.parseInt(Row[0]); 
        } 
        int customerId = id + 1;
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println(customerId + "<>" + TxtAccountNum.getText() + "<>" + TxtFullName.getText() + "<>"+ CboAccount.getSelectedItem() + "<>" + TxtAccBal.getText() + "<>" + TxtIC.getText() 
                + "<>" + CboGender.getSelectedItem() + "<>" + TxtAddress.getText() + "<>"
                +CboRace.getSelectedItem() + "<>" + TxtContact.getText());
        
        pw.flush();
        pw.close();
        bw.close();
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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    public javax.swing.JComboBox<String> CboAccount;
    private javax.swing.JComboBox<String> CboGender;
    private javax.swing.JComboBox<String> CboRace;
    private javax.swing.JButton Generatebtn;
    private javax.swing.JTextField TxtAccBal;
    private javax.swing.JTextField TxtAccountNum;
    private javax.swing.JTextField TxtAddress;
    private javax.swing.JTextField TxtContact;
    private javax.swing.JTextField TxtFullName;
    private javax.swing.JTextField TxtIC;
    private javax.swing.JLabel ValidateAccBal;
    private javax.swing.JLabel ValidateContactNum;
    private javax.swing.JLabel ValidateFullName;
    private javax.swing.JLabel ValidateIC;
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables


   

//    private static class ran {
//
//        public ran() {
//        }
//    }
}
