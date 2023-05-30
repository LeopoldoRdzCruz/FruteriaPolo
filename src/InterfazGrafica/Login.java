
package InterfazGrafica;

import javax.swing.JOptionPane;

import Clases.LoginObj;
import ManipulacionObjetos.LoginManObj;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    
    private LoginManObj loginman = new LoginManObj();
    

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        letreroPrincipal = new javax.swing.JLabel();
        letreroUsuario = new javax.swing.JLabel();
        letreroContra = new javax.swing.JLabel();
        botonIniciaSes = new javax.swing.JButton();
        campoContra = new javax.swing.JPasswordField();
        campoUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letreroPrincipal.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        letreroPrincipal.setText("Iniciar Sesion");
        getContentPane().add(letreroPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 240, 40));

        letreroUsuario.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        letreroUsuario.setText("Nombre:");
        getContentPane().add(letreroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 240, 40));

        letreroContra.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        letreroContra.setText("Contraseña:");
        getContentPane().add(letreroContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 240, 40));

        botonIniciaSes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonIniciaSes.setText("Iniciar sesion");
        botonIniciaSes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciaSesActionPerformed(evt);
            }
        });
        getContentPane().add(botonIniciaSes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 190, 40));

        campoContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContraActionPerformed(evt);
            }
        });
        getContentPane().add(campoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 350, 40));

        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 350, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 210, 180));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1920x1080-Fondo-de-pantalla-verde-simple.jpg"))); // NOI18N
        Fondo.setText("jLabel1");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 490));
        Fondo.getAccessibleContext().setAccessibleName("Fondo");
        Fondo.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void campoContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoContraActionPerformed

    private void botonIniciaSesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciaSesActionPerformed
        // TODO add your handling code here:
        
        LoginObj loginObj = new LoginObj();
        
        loginObj.setNombreEmpleado(campoUsuario.getText());
        loginObj.setContraseña(campoContra.getText());
        
        if(loginman.buscarUsuarioi(loginObj)==true){
            
            loginman.logUsuarioUso(loginObj);
            JOptionPane.showMessageDialog(null, "Conectado de forma exitosa");
            
            if(loginman.buscartipoUser(loginObj) == 1){
                MenuFrutAdmin  menu= new MenuFrutAdmin();
                menu.setVisible(true);
                this.setVisible(false);
            }
            
            if(loginman.buscartipoUser(loginObj) == 2){
                MenuFrut  menu= new MenuFrut();
                menu.setVisible(true);
                this.setVisible(false);
            }
        
        }else{
               JOptionPane.showMessageDialog(null, "Usuario o Contraseña INVALIDOS");
        }
        
        
    }//GEN-LAST:event_botonIniciaSesActionPerformed


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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton botonIniciaSes;
    private javax.swing.JPasswordField campoContra;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel letreroContra;
    private javax.swing.JLabel letreroPrincipal;
    private javax.swing.JLabel letreroUsuario;
    // End of variables declaration//GEN-END:variables
}
