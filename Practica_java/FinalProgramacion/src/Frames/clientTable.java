/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Clases.Conectar;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author marcelo
 */
public class clientTable extends javax.swing.JFrame {
    
    int xMouse,yMouse;

    /**
     * Creates new form clientTable
     */
    public clientTable() {
        limpiar();
        mostrartabla("");
        initComponents();
        
    }
    
    void limpiar(){
        idClienteTxt.setText("");
        apellidoClienteTxt.setText("");
        nombreClienteTxt.setText("");
        telefonoClienteTxt.setText("");
        correoClienteTxt.setText("");
        dniClienteTxt.setText("");
        System.out.println("funco");
    }

    void mostrartabla(String valor){
        
        DefaultTableModel modelo=new DefaultTableModel();
        
        modelo.addColumn("id_cliente");
        modelo.addColumn("nombre_cliente");
        modelo.addColumn("apellido_cliente");
        modelo.addColumn("dni_cliente");
        modelo.addColumn("telefono_cliente");
        modelo.addColumn("correo_cliente");
        table.setModel(modelo);
        
        String sql="SELECT * FROM cliente WHERE concat(nombre_cliente, '',apellido_cliente) LIKE '%"+valor+"%'";
        
        String datos[]=new String[6];
        
        Statement st;
        
        try {
            st= cn.createStatement();
            
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                
                modelo.addRow(datos);
            }
            
           table.setModel(modelo);
            
        } catch (SQLException e) {
            
            System.err.println("Error en el llamado de la tabla... "+e);
            
            JOptionPane.showMessageDialog(null,"Error en el llamado de la tabla");
            
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        backButton = new javax.swing.JPanel();
        backText = new javax.swing.JLabel();
        barra = new javax.swing.JPanel();
        entry = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        entriWhite = new javax.swing.JPanel();
        lidCliente = new javax.swing.JLabel();
        idClienteTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lNombreCliente = new javax.swing.JLabel();
        nombreClienteTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lApellidoCliente = new javax.swing.JLabel();
        apellidoClienteTxt = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lDniCliente = new javax.swing.JLabel();
        dniClienteTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lTelefonoCliente = new javax.swing.JLabel();
        telefonoClienteTxt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lCorreoCliente = new javax.swing.JLabel();
        correoClienteTxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        cleanTxt = new javax.swing.JButton();
        updateTxt = new javax.swing.JButton();
        deleteTxt = new javax.swing.JButton();
        closeButton = new javax.swing.JPanel();
        closeText = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        table1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });

        backText.setFont(new java.awt.Font("Noto Mono", 3, 14)); // NOI18N
        backText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backText.setText("<--");
        backText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backButtonLayout = new javax.swing.GroupLayout(backButton);
        backButton.setLayout(backButtonLayout);
        backButtonLayout.setHorizontalGroup(
            backButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(backButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );
        backButtonLayout.setVerticalGroup(
            backButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(backButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backText, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        );

        background.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 30));

        barra.setBackground(new java.awt.Color(255, 255, 255));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        background.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 720, 30));

        entry.setBackground(new java.awt.Color(0, 134, 190));

        title.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Registro de clientes");

        entriWhite.setBackground(new java.awt.Color(255, 255, 255));

        lidCliente.setText("id_cliente:");

        idClienteTxt.setBorder(null);

        lNombreCliente.setText("nombre_cliente:");

        nombreClienteTxt.setBorder(null);

        lApellidoCliente.setText("apellido_cliente:");

        apellidoClienteTxt.setBorder(null);

        lDniCliente.setText("dni_cliente:");

        dniClienteTxt.setBorder(null);

        lTelefonoCliente.setText("telefono_cliente:");

        telefonoClienteTxt.setBorder(null);

        lCorreoCliente.setText("correo_cliente:");

        correoClienteTxt.setBorder(null);

        cleanTxt.setBackground(new java.awt.Color(0, 134, 190));
        cleanTxt.setForeground(new java.awt.Color(255, 255, 255));
        cleanTxt.setText("Limpiar");

        updateTxt.setBackground(new java.awt.Color(0, 134, 190));
        updateTxt.setForeground(new java.awt.Color(255, 255, 255));
        updateTxt.setText("Actualizar");

        deleteTxt.setBackground(new java.awt.Color(0, 134, 190));
        deleteTxt.setForeground(new java.awt.Color(255, 255, 255));
        deleteTxt.setText("Eliminar");

        javax.swing.GroupLayout entriWhiteLayout = new javax.swing.GroupLayout(entriWhite);
        entriWhite.setLayout(entriWhiteLayout);
        entriWhiteLayout.setHorizontalGroup(
            entriWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entriWhiteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(entriWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entriWhiteLayout.createSequentialGroup()
                        .addComponent(lidCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idClienteTxt))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entriWhiteLayout.createSequentialGroup()
                        .addComponent(lNombreCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreClienteTxt))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entriWhiteLayout.createSequentialGroup()
                        .addComponent(lApellidoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellidoClienteTxt))
                    .addGroup(entriWhiteLayout.createSequentialGroup()
                        .addComponent(lDniCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dniClienteTxt))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entriWhiteLayout.createSequentialGroup()
                        .addComponent(lTelefonoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefonoClienteTxt))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entriWhiteLayout.createSequentialGroup()
                        .addComponent(lCorreoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(correoClienteTxt))
                    .addComponent(jSeparator6)
                    .addGroup(entriWhiteLayout.createSequentialGroup()
                        .addComponent(cleanTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteTxt)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        entriWhiteLayout.setVerticalGroup(
            entriWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entriWhiteLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(entriWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lidCliente)
                    .addComponent(idClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entriWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombreCliente)
                    .addComponent(nombreClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entriWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lApellidoCliente)
                    .addComponent(apellidoClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entriWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDniCliente)
                    .addComponent(dniClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entriWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTelefonoCliente)
                    .addComponent(telefonoClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entriWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCorreoCliente)
                    .addComponent(correoClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(entriWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cleanTxt)
                    .addComponent(updateTxt)
                    .addComponent(deleteTxt))
                .addContainerGap())
        );

        javax.swing.GroupLayout entryLayout = new javax.swing.GroupLayout(entry);
        entry.setLayout(entryLayout);
        entryLayout.setHorizontalGroup(
            entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(entryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entriWhite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        entryLayout.setVerticalGroup(
            entryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entriWhite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        background.add(entry, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 280, 330));

        closeButton.setBackground(new java.awt.Color(255, 255, 255));
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButtonMouseExited(evt);
            }
        });

        closeText.setFont(new java.awt.Font("Noto Mono", 3, 24)); // NOI18N
        closeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeText.setText("x");
        closeText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout closeButtonLayout = new javax.swing.GroupLayout(closeButton);
        closeButton.setLayout(closeButtonLayout);
        closeButtonLayout.setHorizontalGroup(
            closeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closeButtonLayout.createSequentialGroup()
                .addComponent(closeText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        closeButtonLayout.setVerticalGroup(
            closeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        tablePanel.setBackground(new java.awt.Color(0, 134, 190));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table1.setViewportView(table);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addComponent(table1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(tablePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 510, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void closeTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeTextMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeTextMouseClicked

    private void closeTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeTextMouseEntered
        // TODO add your handling code here:
        closeButton.setBackground(Color.red);
        closeText.setForeground(Color.white);
    }//GEN-LAST:event_closeTextMouseEntered

    private void closeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_closeButtonMouseEntered

    private void closeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_closeButtonMouseExited

    private void closeTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeTextMouseExited
        // TODO add your handling code here:
        closeButton.setBackground(Color.white);
        closeText.setForeground(Color.black);
    }//GEN-LAST:event_closeTextMouseExited

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonMouseClicked

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraMouseDragged

    private void backTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTextMouseEntered
        // TODO add your handling code here:
        backButton.setBackground(Color.red);
        backText.setForeground(Color.white);
    }//GEN-LAST:event_backTextMouseEntered

    private void backTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTextMouseExited
        // TODO add your handling code here:
        backButton.setBackground(Color.white);
        backText.setForeground(Color.black);
    }//GEN-LAST:event_backTextMouseExited

    private void backTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTextMouseClicked
        // TODO add your handling code here:
        Principal principal=new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backTextMouseClicked

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
            java.util.logging.Logger.getLogger(clientTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoClienteTxt;
    private javax.swing.JPanel backButton;
    private javax.swing.JLabel backText;
    private javax.swing.JPanel background;
    private javax.swing.JPanel barra;
    private javax.swing.JButton cleanTxt;
    private javax.swing.JPanel closeButton;
    private javax.swing.JLabel closeText;
    private javax.swing.JTextField correoClienteTxt;
    private javax.swing.JButton deleteTxt;
    private javax.swing.JTextField dniClienteTxt;
    private javax.swing.JPanel entriWhite;
    private javax.swing.JPanel entry;
    private javax.swing.JTextField idClienteTxt;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lApellidoCliente;
    private javax.swing.JLabel lCorreoCliente;
    private javax.swing.JLabel lDniCliente;
    private javax.swing.JLabel lNombreCliente;
    private javax.swing.JLabel lTelefonoCliente;
    private javax.swing.JLabel lidCliente;
    private javax.swing.JTextField nombreClienteTxt;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane table1;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JTextField telefonoClienteTxt;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateTxt;
    // End of variables declaration//GEN-END:variables
    Conectar con=new Conectar();
    Connection cn=con.conexion();


}