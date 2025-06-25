
package statistika;
import javax.swing.JOptionPane;

public class gui extends javax.swing.JFrame {
    public gui() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTotUnit = new javax.swing.JTextField();
        txtCacatSampel = new javax.swing.JTextField();
        txtJumCacat = new javax.swing.JTextField();
        txtUkuranSampel = new javax.swing.JTextField();
        btnhitung = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPeluang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("KALKULATOR DISTRIBUSI");
        jLabel1.setAlignmentY(0.0F);

        jLabel2.setText("Total Unit :");

        jLabel3.setText("Jumlah Cacat : ");

        jLabel4.setText("Ukuran Sampel :");

        jLabel5.setText("Cacat pada Sampel : ");

        txtTotUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotUnitActionPerformed(evt);
            }
        });

        txtCacatSampel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCacatSampelActionPerformed(evt);
            }
        });

        txtJumCacat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumCacatActionPerformed(evt);
            }
        });//a[appadoadaojdsajdahd
        txtUkuranSampel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUkuranSampelActionPerformed(evt);
            }
        });

        btnhitung.setText("Hitung Peluang");
        btnhitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhitungMouseClicked(evt);
            }
        });
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });

        jLabel6.setText("Peluang :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("HIPERGEOMETRIK");
        jLabel7.setAlignmentY(0.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUkuranSampel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtJumCacat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTotUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                                .addComponent(txtCacatSampel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnhitung, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtPeluang, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTotUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtJumCacat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUkuranSampel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtCacatSampel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnhitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPeluang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotUnitActionPerformed

    private void txtCacatSampelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCacatSampelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCacatSampelActionPerformed

    private void txtJumCacatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumCacatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumCacatActionPerformed

    private void txtUkuranSampelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUkuranSampelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUkuranSampelActionPerformed

    private void btnhitungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhitungMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhitungMouseClicked

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        // membuat variabel dari inputan user pada text field di Jframenya
        int N = Integer.parseInt(txtTotUnit.getText()); // N = Total unit pada batch
        int K = Integer.parseInt(txtJumCacat.getText()); // K = Jumlah Cacat pada batch
        int n = Integer.parseInt(txtUkuranSampel.getText()); // n = Ukuran sampel pada batch
        int k = Integer.parseInt(txtCacatSampel.getText()); // k = Jumlah cacat pada sampel
        double peluang = distribusiHipergeometrik(N, K, n, k); // Total peluang diambil dari method distribusiHipergeometrik dengan parameter N,K,n,k
        txtPeluang.setText(String.format("Peluang: %.6f", peluang)); // menampilkan hasil perhitungan peluang ke pengguna di tampilan GUI
        
        //menambahkan kategori rendah, sedang atau tinggi dari hasil peluang
        String Kategori;
        if (peluang < 0.10){
            Kategori = "Rendah";
        }else if (peluang >= 0.10 && peluang < 0.30){
            Kategori = "Sedang";
        }else{
            Kategori = "Tinggi";
        }
        
        int messageType;
        if (Kategori.equals("Rendah")) {
            messageType = JOptionPane.INFORMATION_MESSAGE;
        } else if (Kategori.equals("Sedang")) {
            messageType = JOptionPane.WARNING_MESSAGE;
        } else {
            messageType = JOptionPane.ERROR_MESSAGE;
}
        // menampilkan notifikasi kategori
        JOptionPane.showMessageDialog(null,
        String.format("Kategori Risiko: %s\nPeluang: %.6f", Kategori, peluang),
        "Hasil Analisis",
        messageType);
    
    }//GEN-LAST:event_btnhitungActionPerformed
    // method untuk mencari hasil n, menggunakan method karna n itu dirumusnya faktorial
    private static double faktorial(int n) {
        double hasil = 1;
        for (int i = 2; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
    // method untuk mencari nilai kombinasi dari n dan r
    private static double kombinasi(int n, int r) {
        return faktorial(n) / (faktorial(r) * faktorial(n - r));
    }
    // method untuk mencari hasil peluang
    private static double distribusiHipergeometrik(int N, int K, int n, int k) {
        double atas = kombinasi(K, k) * kombinasi(N - K, n - k);
        double bawah = kombinasi(N, n);
        return atas / bawah;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCacatSampel;
    private javax.swing.JTextField txtJumCacat;
    private javax.swing.JTextField txtPeluang;
    private javax.swing.JTextField txtTotUnit;
    private javax.swing.JTextField txtUkuranSampel;
    // End of variables declaration//GEN-END:variables
}
