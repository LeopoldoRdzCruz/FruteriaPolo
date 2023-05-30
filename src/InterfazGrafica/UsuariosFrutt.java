
package InterfazGrafica;

import ManipulacionObjetos.UsuariosFrutManObj;
import Clases.UsuariosFrutObj;


import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class UsuariosFrutt extends javax.swing.JFrame {
    
    private UsuariosFrutManObj usuariosManObj = new UsuariosFrutManObj();
    
    private DefaultListModel listaUsuarios = new DefaultListModel(); 

    
    public UsuariosFrutt() {
        
        initComponents();
        jListUsuarioNombre.setModel(listaUsuarios);
        jListUsuarioCorreo.setModel(listaUsuarios);
        jListUsuarioTipoUser.setModel(listaUsuarios);
        jListUsuarioEstatuss.setModel(listaUsuarios);
        
        usuariosManObj.listarUsuariosNomm(jListUsuarioNombre);
        usuariosManObj.listarUsuariosCorrreo(jListUsuarioCorreo);
        usuariosManObj.listarUsuariosTipoUser(jListUsuarioTipoUser);
        usuariosManObj.listarUsuariosEstatuss(jListUsuarioEstatuss);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPasteles = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tablaTamPas = new javax.swing.JScrollPane();
        jListUsuarioNombre = new javax.swing.JList<>();
        tablaTamPas1 = new javax.swing.JScrollPane();
        jListUsuarioTipoUser = new javax.swing.JList<>();
        tablaTamPas2 = new javax.swing.JScrollPane();
        jListUsuarioEstatuss = new javax.swing.JList<>();
        tablaTamPas3 = new javax.swing.JScrollPane();
        jListUsuarioCorreo = new javax.swing.JList<>();
        fieldEliminar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldCorreo = new javax.swing.JTextField();
        fieldNombre = new javax.swing.JTextField();
        jComboTipoUsuario = new javax.swing.JComboBox<>();
        btnEliminarUser = new javax.swing.JButton();
        btnAgregarUser = new javax.swing.JButton();
        jPassConfContra = new javax.swing.JPasswordField();
        jPassContra = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnQuitaSelec = new javax.swing.JButton();
        btnVaciaCampos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jCheckBoxNombre = new javax.swing.JCheckBox();
        jCheckBoxCorreo = new javax.swing.JCheckBox();
        jCheckBoxContrasena = new javax.swing.JCheckBox();
        jCheckBoxTipoUs = new javax.swing.JCheckBox();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPasteles.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblPasteles.setText("Usuarios");
        getContentPane().add(lblPasteles, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 750, 150, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, -20, -1, -1));

        tablaTamPas.setToolTipText("");
        tablaTamPas.setVerifyInputWhenFocusTarget(false);

        jListUsuarioNombre.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListUsuarioNombreValueChanged(evt);
            }
        });
        tablaTamPas.setViewportView(jListUsuarioNombre);

        getContentPane().add(tablaTamPas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 160, 270));

        tablaTamPas1.setToolTipText("");
        tablaTamPas1.setVerifyInputWhenFocusTarget(false);

        jListUsuarioTipoUser.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListUsuarioTipoUserValueChanged(evt);
            }
        });
        tablaTamPas1.setViewportView(jListUsuarioTipoUser);

        getContentPane().add(tablaTamPas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 160, 270));

        tablaTamPas2.setToolTipText("");
        tablaTamPas2.setVerifyInputWhenFocusTarget(false);

        jListUsuarioEstatuss.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListUsuarioEstatussValueChanged(evt);
            }
        });
        tablaTamPas2.setViewportView(jListUsuarioEstatuss);

        getContentPane().add(tablaTamPas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 150, 270));

        tablaTamPas3.setToolTipText("");
        tablaTamPas3.setVerifyInputWhenFocusTarget(false);

        jListUsuarioCorreo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListUsuarioCorreoValueChanged(evt);
            }
        });
        tablaTamPas3.setViewportView(jListUsuarioCorreo);

        getContentPane().add(tablaTamPas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 240, 270));

        fieldEliminar.setEditable(false);
        getContentPane().add(fieldEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 200, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("CORREO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 80, 30));

        fieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(fieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 190, 30));
        getContentPane().add(fieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 180, 30));

        jComboTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "EMPLEADO" }));
        jComboTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTipoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jComboTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 190, 30));

        btnEliminarUser.setText("ELIMINAR");
        btnEliminarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, -1, -1));

        btnAgregarUser.setText("AGREGAR");
        btnAgregarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUserActionPerformed(evt);
            }
        });
        btnAgregarUser.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                btnAgregarUserVetoableChange(evt);
            }
        });
        getContentPane().add(btnAgregarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, 140, 40));
        getContentPane().add(jPassConfContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 180, 30));
        getContentPane().add(jPassContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 180, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setText("NOMBRE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 80, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setText("CONTRASEÑA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 120, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setText("TIPO DE USUARIO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 150, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setText("CONFIRMAR CONTRASEÑA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 220, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setText("NOMBRE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 80, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setText("CORREO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 80, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel11.setText("TIPO USUARIO");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 130, 30));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel12.setText("ESTATUS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 80, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel14.setText("Eliminar");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 80, 30));

        btnQuitaSelec.setText("QUITAR SELECCION");
        btnQuitaSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitaSelecActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuitaSelec, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 150, 30));

        btnVaciaCampos.setText("VACIAR CAMPOS");
        btnVaciaCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciaCamposActionPerformed(evt);
            }
        });
        getContentPane().add(btnVaciaCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 140, 50));

        jButton1.setText("ACTUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 670, 130, 30));

        jCheckBoxNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBoxNombre.setText("Nombre");
        jCheckBoxNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 650, 140, -1));

        jCheckBoxCorreo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBoxCorreo.setText("Correo");
        jCheckBoxCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 690, 150, -1));

        jCheckBoxContrasena.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBoxContrasena.setText("Contraseña");
        jCheckBoxContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxContrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 690, 140, -1));

        jCheckBoxTipoUs.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBoxTipoUs.setText("Tipo de Empleado");
        jCheckBoxTipoUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTipoUsActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxTipoUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 650, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1920x1080-Fondo-de-pantalla-verde-simple.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        
        MenuFrutAdmin  menu= new MenuFrutAdmin();
        menu.setVisible(true);
        
        this.setVisible(false);       
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void fieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCorreoActionPerformed

    private void btnAgregarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUserActionPerformed
        // TODO add your handling code here:
        
        if(fieldCorreo.getText().isEmpty() || fieldNombre.getText().isEmpty() || jPassContra.getText().isEmpty()
            && (jPassContra.getText().equals(jPassConfContra.getText()))){
           
            JOptionPane.showMessageDialog(null, "Error al llenar los campos");
        }else{
            
            try {
                UsuariosFrutObj usuarioObj= new UsuariosFrutObj();
                
                usuarioObj.setCorreoUsuario(fieldCorreo.getText());
                
                if(jComboTipoUsuario.getSelectedItem().equals("ADMINISTRADOR")){
                    usuarioObj.setTipoUsuario(1);
                }
                
                if(jComboTipoUsuario.getSelectedItem().equals("EMPLEADO")){
                    usuarioObj.setTipoUsuario(2);
                }
                
                usuarioObj.setContrasena(jPassContra.getText());
                usuarioObj.setNombreEmpleado(fieldNombre.getText());
                String mensaje = usuariosManObj.agregarUsuarios(usuarioObj);
                
                JOptionPane.showMessageDialog(null, mensaje);         
                
                usuariosManObj.listarUsuariosNomm(jListUsuarioNombre);
                usuariosManObj.listarUsuariosCorrreo(jListUsuarioCorreo);
                usuariosManObj.listarUsuariosTipoUser(jListUsuarioTipoUser);
                usuariosManObj.listarUsuariosEstatuss(jListUsuarioEstatuss);
                
                
                fieldCorreo.setText("");
                fieldNombre.setText("");
                jPassContra.setText("");
                jPassConfContra.setText("");
                jComboTipoUsuario.setSelectedIndex(-1);
                
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo completar el registro \n"+ e.getMessage() );

            }
        }

        
    }//GEN-LAST:event_btnAgregarUserActionPerformed

    private void btnEliminarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUserActionPerformed
        // TODO add your handling code here:
        
        try {
                UsuariosFrutObj usuarioObj= new UsuariosFrutObj();
                
                
                usuarioObj.setNombreEmpleado(jListUsuarioNombre.getSelectedValue());
                String  mensaje = usuariosManObj.eliminarUsuarios(usuarioObj);
                JOptionPane.showMessageDialog(null, mensaje);
                
                usuariosManObj.listarUsuariosNomm(jListUsuarioNombre);
                usuariosManObj.listarUsuariosCorrreo(jListUsuarioCorreo);
                usuariosManObj.listarUsuariosTipoUser(jListUsuarioTipoUser);
                usuariosManObj.listarUsuariosEstatuss(jListUsuarioEstatuss);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro \n" + e.getMessage());
            }

        
    }//GEN-LAST:event_btnEliminarUserActionPerformed

    private void jListUsuarioNombreValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListUsuarioNombreValueChanged
        // TODO add your handling code here:
        
        if(jListUsuarioNombre.getSelectedIndex()>-1){
            int indx = jListUsuarioNombre.getSelectedIndex();
            
            jListUsuarioCorreo.setSelectedIndex(indx);
            jListUsuarioTipoUser.setSelectedIndex(indx);
            jListUsuarioEstatuss.setSelectedIndex(indx);
            
            fieldNombre.setText(jListUsuarioNombre.getSelectedValue());
            
        }
        
    }//GEN-LAST:event_jListUsuarioNombreValueChanged

    private void jListUsuarioCorreoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListUsuarioCorreoValueChanged
        // TODO add your handling code here:
        
        fieldEliminar.setText(jListUsuarioNombre.getSelectedValue());
        
        if(jListUsuarioCorreo.getSelectedIndex()>-1){
            int indx = jListUsuarioCorreo.getSelectedIndex();
            
            jListUsuarioNombre.setSelectedIndex(indx);
            jListUsuarioTipoUser.setSelectedIndex(indx);
            jListUsuarioEstatuss.setSelectedIndex(indx);
            
            fieldCorreo.setText(jListUsuarioCorreo.getSelectedValue());
            
        }
        
    }//GEN-LAST:event_jListUsuarioCorreoValueChanged

    private void jListUsuarioTipoUserValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListUsuarioTipoUserValueChanged
        // TODO add your handling code here:
        
        if(jListUsuarioTipoUser.getSelectedIndex()>-1){
            int indx = jListUsuarioTipoUser.getSelectedIndex();
            
            jListUsuarioCorreo.setSelectedIndex(indx);
            jListUsuarioNombre.setSelectedIndex(indx);
            jListUsuarioEstatuss.setSelectedIndex(indx);
            
            if(jListUsuarioTipoUser.getSelectedValue().contains("Administrador"))
                jComboTipoUsuario.setSelectedIndex(0);
            
            if(jListUsuarioTipoUser.getSelectedValue().contains("Empleado"))
                jComboTipoUsuario.setSelectedIndex(1);
            
            
        }
    }//GEN-LAST:event_jListUsuarioTipoUserValueChanged

    private void jListUsuarioEstatussValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListUsuarioEstatussValueChanged
        // TODO add your handling code here:
        
        if(jListUsuarioEstatuss.getSelectedIndex()>-1){
            int indx = jListUsuarioEstatuss.getSelectedIndex();
            
            jListUsuarioCorreo.setSelectedIndex(indx);
            jListUsuarioTipoUser.setSelectedIndex(indx);
            jListUsuarioNombre.setSelectedIndex(indx);
            
        }
    }//GEN-LAST:event_jListUsuarioEstatussValueChanged

    private void btnQuitaSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitaSelecActionPerformed
        // TODO add your handling code here:
        
        usuariosManObj.listarUsuariosNomm(jListUsuarioNombre);
        usuariosManObj.listarUsuariosCorrreo(jListUsuarioCorreo);
        usuariosManObj.listarUsuariosTipoUser(jListUsuarioTipoUser);
        usuariosManObj.listarUsuariosEstatuss(jListUsuarioEstatuss);
        
        

        
    }//GEN-LAST:event_btnQuitaSelecActionPerformed

    private void btnAgregarUserVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_btnAgregarUserVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarUserVetoableChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
            try {
                UsuariosFrutObj usuarioObj= new UsuariosFrutObj();
                
                int seleccion = -1;
                
                if(jCheckBoxTipoUs.isSelected())
                    seleccion=1;
                
                if(jCheckBoxContrasena.isSelected())
                    seleccion=2;
                                
                if(jCheckBoxNombre.isSelected())
                    seleccion=3;
                               
                if(jCheckBoxCorreo.isSelected())
                    seleccion=4;
                
                
                switch(seleccion){
                
                    case 1:
                        if(jComboTipoUsuario.getSelectedIndex()!=-1){
                            
                            if(jComboTipoUsuario.getSelectedIndex()==0){
                                usuarioObj.setTipoUsuario(1);
                            }
                
                            if(jComboTipoUsuario.getSelectedIndex()==1){
                                usuarioObj.setTipoUsuario(2);
                            }
                        
                            usuarioObj.setCorreoUsuario(jListUsuarioCorreo.getSelectedValue());
                            
                            usuariosManObj.cambiarTipoUs(usuarioObj);
                            
                        }
                        break;
                        
                    case 2:
                        if(!jPassConfContra.getText().isEmpty()){
                            usuarioObj.setContrasena(jPassConfContra.getText());
                            usuarioObj.setCorreoUsuario(jListUsuarioCorreo.getSelectedValue());
                            
                            usuariosManObj.cambiarContra(usuarioObj);
                        }
                        break;
                        
                    case 3:
                        if(!jListUsuarioNombre.getSelectedValue().isEmpty()){
                            usuarioObj.setNombreEmpleado(fieldNombre.getText());
                            usuarioObj.setCorreoUsuario(jListUsuarioCorreo.getSelectedValue());
                            
                            usuariosManObj.cambiarUsuarioNombre(usuarioObj);
                        }
                        break;
                        
                    case 4:
                        if(!jListUsuarioCorreo.getSelectedValue().isEmpty()){
                            String correoAntes = jListUsuarioCorreo.getSelectedValue();
                            
                            usuarioObj.setCorreoUsuario(fieldCorreo.getText());
                            
                            
                            usuariosManObj.cambiarCorreo(usuarioObj, correoAntes);
                        }
                        break;
                        
                
                }
                
                String mensaje = usuariosManObj.cambiarContra(usuarioObj);
                
                JOptionPane.showMessageDialog(null, mensaje);         
                
                usuariosManObj.listarUsuariosNomm(jListUsuarioNombre);
                usuariosManObj.listarUsuariosCorrreo(jListUsuarioCorreo);
                usuariosManObj.listarUsuariosTipoUser(jListUsuarioTipoUser);
                usuariosManObj.listarUsuariosEstatuss(jListUsuarioEstatuss);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo completar la accion \n"+ e.getMessage() );

            
            }
        

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTipoUsuarioActionPerformed

    private void jCheckBoxTipoUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTipoUsActionPerformed
        // TODO add your handling code here:
        
        if(jCheckBoxTipoUs.isSelected()){
            
            jCheckBoxCorreo.setVisible(false);
            jCheckBoxNombre.setVisible(false);
            jCheckBoxContrasena.setVisible(false);
        }
        
        if(!jCheckBoxTipoUs.isSelected()){
            jCheckBoxCorreo.setVisible(true);
            jCheckBoxNombre.setVisible(true);
            jCheckBoxContrasena.setVisible(true);
        }

        
    }//GEN-LAST:event_jCheckBoxTipoUsActionPerformed

    private void jCheckBoxNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNombreActionPerformed
        // TODO add your handling code here:
        
        if(jCheckBoxNombre.isSelected()){
            
            jCheckBoxCorreo.setVisible(false);
            jCheckBoxTipoUs.setVisible(false);
            jCheckBoxContrasena.setVisible(false);
        }
        
        if(!jCheckBoxNombre.isSelected()){
            jCheckBoxCorreo.setVisible(true);
            jCheckBoxTipoUs.setVisible(true);
            jCheckBoxContrasena.setVisible(true);
        }
        
    }//GEN-LAST:event_jCheckBoxNombreActionPerformed

    private void jCheckBoxCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCorreoActionPerformed
        // TODO add your handling code here:
        
        if(jCheckBoxCorreo.isSelected()){
            
            jCheckBoxTipoUs.setVisible(false);
            jCheckBoxNombre.setVisible(false);
            jCheckBoxContrasena.setVisible(false);
        }
        
        if(!jCheckBoxCorreo.isSelected()){
            jCheckBoxTipoUs.setVisible(true);
            jCheckBoxNombre.setVisible(true);
            jCheckBoxContrasena.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBoxCorreoActionPerformed

    private void jCheckBoxContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxContrasenaActionPerformed
        // TODO add your handling code here:
        
        if(jCheckBoxContrasena.isSelected()){
            
            jCheckBoxCorreo.setVisible(false);
            jCheckBoxNombre.setVisible(false);
            jCheckBoxTipoUs.setVisible(false);
        }
        
        if(!jCheckBoxContrasena.isSelected()){
            jCheckBoxCorreo.setVisible(true);
            jCheckBoxNombre.setVisible(true);
            jCheckBoxTipoUs.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBoxContrasenaActionPerformed

    private void btnVaciaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciaCamposActionPerformed
        // TODO add your handling code here:
        
        fieldCorreo.setText("");
        fieldNombre.setText("");
        
        jPassConfContra.setText("");
        jPassContra.setText("");
        
        jComboTipoUsuario.setSelectedIndex(-1);
        
    }//GEN-LAST:event_btnVaciaCamposActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuariosFrutt().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAgregarUser;
    private javax.swing.JButton btnEliminarUser;
    private javax.swing.JButton btnQuitaSelec;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVaciaCampos;
    private javax.swing.JTextField fieldCorreo;
    private javax.swing.JTextField fieldEliminar;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxContrasena;
    private javax.swing.JCheckBox jCheckBoxCorreo;
    private javax.swing.JCheckBox jCheckBoxNombre;
    private javax.swing.JCheckBox jCheckBoxTipoUs;
    private javax.swing.JComboBox<String> jComboTipoUsuario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListUsuarioCorreo;
    private javax.swing.JList<String> jListUsuarioEstatuss;
    private javax.swing.JList<String> jListUsuarioNombre;
    private javax.swing.JList<String> jListUsuarioTipoUser;
    private javax.swing.JPasswordField jPassConfContra;
    private javax.swing.JPasswordField jPassContra;
    private javax.swing.JLabel lblPasteles;
    private javax.swing.JScrollPane tablaTamPas;
    private javax.swing.JScrollPane tablaTamPas1;
    private javax.swing.JScrollPane tablaTamPas2;
    private javax.swing.JScrollPane tablaTamPas3;
    // End of variables declaration//GEN-END:variables
}
