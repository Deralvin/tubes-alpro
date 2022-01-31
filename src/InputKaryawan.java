/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GODCODEX
 */
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class InputKaryawan extends javax.swing.JFrame {

    /**
     * Creates new form InputKaryawan
     */
    public InputKaryawan() {
        initComponents();
//        try {
//            initData();
//        } catch (IOException ex) {
//            System.out.println("error exdass"
//                    + "" + ex.getMessage());
//            Logger.getLogger(InputKaryawan.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    void searchNik()throws IOException{
        try {
            BufferedReader br = new BufferedReader(new FileReader("employee.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("employee.txt", true));
            JSONArray ja = new JSONArray();
            if (br.readLine() == null) {
                System.out.println("No errors, and file empty");
                bw.write(ja.toJSONString());
                bw.flush();
                bw.newLine();
                bw.close();
            } else {
                Reader reader;
                reader = new FileReader("employee.txt");
                Gson gson = new Gson();
                Employee[] features = gson.fromJson(reader, Employee[].class);
                for (int i = 0; i < features.length; i++) {
                    if (features[i].nik.equalsIgnoreCase(nik_txt.getText())) {
                        v_nik.setText(features[i].nik);
                        v_nama.setText(features[i].nama);
                        v_email.setText(features[i].email);
                        v_divisi.setText(features[i].divisi);
                        v_gaji.setText(""+features[i].gaji);
                        v_potongan.setText(""+features[i].potongan);
                        v_total.setText(""+features[i].totalgaji);
                        System.out.println("data ditemukan dengan data " + features[i].nik);
                        break;
                    }
                    System.out.println(features[i].nik);
                }
                System.out.println(features.length);
                System.out.println("");
                System.out.println("");
            }

            // work with features
        } catch (FileNotFoundException ex) {
            System.out.println("error ex" + ex.getMessage());

            Logger.getLogger(InputKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void initData() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("naldrix_db.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("naldrix_db.txt", true));
            JSONArray ja = new JSONArray();
            if (br.readLine() == null) {
                System.out.println("No errors, and file empty");
                bw.write(ja.toJSONString());
                bw.flush();
                bw.newLine();
                bw.close();
            } else {
                Reader reader;
                reader = new FileReader("naldrix_db.txt");
                Gson gson = new Gson();
                Node[] features = gson.fromJson(reader, Node[].class);
                for (int i = 0; i < features.length; i++) {
                    if (features[i].id.equalsIgnoreCase("8005612")) {
                        System.out.println("data ditemukan dengan data " + features[i].id);
                        break;
                    }
                    System.out.println(features[i].id);
                }
                System.out.println(features.length);
            }

            // work with features
        } catch (FileNotFoundException ex) {
            System.out.println("error ex" + ex.getMessage());

            Logger.getLogger(InputKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AddRecord() throws IOException {
        try {
            JSONObject jsonObject = new JSONObject();
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("naldrix_db.txt", true));
            jsonObject.put("Nome", "Antonio Luis");
            jsonObject.put("Idade", "24");

            JSONArray jsonArray = new JSONArray();
            jsonArray.add("Rua: Graça");
            jsonArray.add("Cidade: Lisbon");
            jsonArray.add("Codigo Postal: 2222 333");

            jsonObject.put("Morada", jsonArray);

            fileWriter.write(jsonObject.toString());
            fileWriter.close();

            System.out.println("JSON Object sucessfully written to the file!!");

        } catch (Exception e) {
            e.printStackTrace();
        }
//        
//        Employee emp = new Employee();
//        Reader reader;
//        reader = new FileReader("naldrix_db.txt");
//        Gson gson = new Gson();
//        Employee[] features = gson.fromJson(reader, Employee[].class);
//        emp.nama = "test";
//        emp.nik = "1019923";
//        emp.email="ramadhan";
//        emp.potongan =5000;
//        emp.divisi="programmer";
//        emp.gaji = 6000;
//        emp.totalgaji = 5000+6000;
//     
//         JSONArray jas = new JSONArray();
//         jas.add(emp);
//        System.out.println("" + nik.getText());
//        BufferedWriter bw = new BufferedWriter(new FileWriter("naldrix_db.txt", true));
//        Scanner strInput = new Scanner(System.in);
//
//        String ID, name, age, addr;
//        JSONObject jo = new JSONObject();
//        jo.put("nik", nik.getText().toString());
//        jo.put("nama", nama.getText().toString());
//
//        JSONArray ja = new JSONArray();
//        ja.add(jo);
//
//        JSONObject mainObj = new JSONObject();
//        mainObj.put("employees", ja);
//        ID = nik.getText().toString();
//
//        name = nama.getText().toString();
////    		System.out.print("Enter the Employee Age: ");
////    		age = strInput.nextLine();
////    		System.out.print("Enter the Employee Address: ");
////    		addr = strInput.nextLine();    		
//
//        bw.write(jas.toJSONString());
//        bw.flush();
//        bw.newLine();
//        bw.close();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        nik_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        v_nik = new javax.swing.JLabel();
        v_nama = new javax.swing.JLabel();
        v_email = new javax.swing.JLabel();
        v_divisi = new javax.swing.JLabel();
        v_gaji = new javax.swing.JLabel();
        v_potongan = new javax.swing.JLabel();
        v_total = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("NIK");

        jLabel2.setText("Nama");

        jLabel3.setText("Email");

        jLabel4.setText("Divisi");

        jLabel5.setText("Gaji");

        jLabel6.setText("Potongan");

        jLabel7.setText("Total Gaji");

        jLabel8.setText("Nik");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(nik_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(v_total)
                            .addComponent(v_potongan)
                            .addComponent(v_gaji)
                            .addComponent(v_divisi)
                            .addComponent(v_email)
                            .addComponent(v_nama)
                            .addComponent(v_nik))))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nik_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(v_nik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(v_nama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(v_email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(v_divisi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(v_gaji))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(v_potongan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(v_total))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            searchNik();
        } catch (IOException ex) {
            Logger.getLogger(InputKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(InputKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nik_txt;
    private javax.swing.JLabel v_divisi;
    private javax.swing.JLabel v_email;
    private javax.swing.JLabel v_gaji;
    private javax.swing.JLabel v_nama;
    private javax.swing.JLabel v_nik;
    private javax.swing.JLabel v_potongan;
    private javax.swing.JLabel v_total;
    // End of variables declaration//GEN-END:variables
}
