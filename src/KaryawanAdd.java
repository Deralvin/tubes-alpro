
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GODCODEX
 */
public class KaryawanAdd extends javax.swing.JFrame {
  String data;
    /**
     * Creates new form KaryawanAdd
     */
    public KaryawanAdd() {
        initComponents();
//        try {
//            initread();
//        } catch (IOException ex) {
//            Logger.getLogger(KaryawanAdd.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
//    void initread() throws IOException{
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("employee.txt"));            
//            BufferedWriter bw = new BufferedWriter(new FileWriter("employee.txt", true));
//            JSONArray ja = new JSONArray();
//             if (br.readLine() == null) {
//                System.out.println("No errors, and file empty");
//                bw.write(ja./*toJSONString*/());
//                bw.flush();
//                bw.newLine();
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(KaryawanAdd.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name_txt = new javax.swing.JTextField();
        nik_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        divisi_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        potongan_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        gaji_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        total_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nik_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nik_txtActionPerformed(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("NIK");

        jLabel2.setText("Nama");

        jLabel3.setText("Divisi");

        jLabel4.setText("Email");

        email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_txtActionPerformed(evt);
            }
        });

        divisi_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisi_txtActionPerformed(evt);
            }
        });

        jLabel5.setText("Gaji");

        potongan_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potongan_txtActionPerformed(evt);
            }
        });
        potongan_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                potongan_txtKeyPressed(evt);
            }
        });

        jLabel6.setText("Potongan");

        gaji_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaji_txtActionPerformed(evt);
            }
        });

        jLabel7.setText("Total Gaji");

        total_txt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        total_txt.setText("Total Gaji");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(total_txt)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nik_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(divisi_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5)
                                .addComponent(gaji_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(potongan_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nik_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(potongan_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gaji_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String stringArray = new String();
        BufferedReader br;
        BufferedWriter bw;
        JSONObject obj = new JSONObject();
      try {
          br = new BufferedReader(new FileReader("employee.txt"));
            Scanner scn = new Scanner(br);
//            kontol +=  " {\"data\": ";
            while(scn.hasNext()){ 
                stringArray += scn.next();
            }
            JSONArray jsonArray = new JSONArray(stringArray);
            obj.put("nik", nik_txt.getText());
            obj.put("nama", name_txt.getText());
            obj.put("email",email_txt.getText());
            obj.put("divisi",divisi_txt.getText());
            obj.put("gaji",Integer.parseInt(gaji_txt.getText()));
            obj.put("potongan",Integer.parseInt(potongan_txt.getText()));
            obj.put("totalgaji",Integer.parseInt(total_txt.getText()));
            jsonArray.put(obj);
            System.out.println(""+jsonArray);
            bw = new BufferedWriter(new FileWriter("employee.txt", false));
            bw.write(jsonArray.toString());
            bw.flush();
            bw.close();
      } catch (FileNotFoundException ex) {
          Logger.getLogger(KaryawanAdd.class.getName()).log(Level.SEVERE, null, ex);
      } catch (JSONException ex) {
          Logger.getLogger(KaryawanAdd.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(KaryawanAdd.class.getName()).log(Level.SEVERE, null, ex);
      }

//            kontol += '}';
//            System.out.print(kontol);
//            JSONParser jp = new JSONParser();
//            JSONObject jo = (JSONObject) jp.parse(kontol);
//            System.out.println(jo.get("data"));
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nik_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nik_txtActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_nik_txtActionPerformed

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_txtActionPerformed

    private void divisi_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisi_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_divisi_txtActionPerformed

    private void potongan_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potongan_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_potongan_txtActionPerformed

    private void gaji_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaji_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gaji_txtActionPerformed

    private void potongan_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_potongan_txtKeyPressed
        // TODO add your handling code here:
        if(potongan_txt==null){
            potongan_txt.setText("0");
        }
        int gaji = Integer.parseInt(gaji_txt.getText());
        int total = gaji - Integer.parseInt(potongan_txt.getText());
        total_txt.setText(""+total);
    }//GEN-LAST:event_potongan_txtKeyPressed

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
            java.util.logging.Logger.getLogger(KaryawanAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KaryawanAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KaryawanAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KaryawanAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KaryawanAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField divisi_txt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField gaji_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextField nik_txt;
    private javax.swing.JTextField potongan_txt;
    private javax.swing.JLabel total_txt;
    // End of variables declaration//GEN-END:variables
}
