/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.view;

import Proyecto.Util.Crud;
import Proyecto.Util.Memoria;
import Proyecto.domain.Usuario;
import javax.swing.JInternalFrame;



/**
 *
 * @author Josué Moreno
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        establecerTitulo();
        verificandoTipo();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    public void establecerTitulo() {
        String titulo = "PROYECTO APP ";
        Usuario emp = (Usuario) Memoria.get("usuario");
        titulo += "[Usuario:  " + emp.getUsuario() + " ]   ";
        this.setTitle(titulo);
    }

    public void verificandoTipo() {
        Usuario usuario = (Usuario) Memoria.get("usuario");
        if (Integer.parseInt(usuario.getTipo()) != 1) {
            menuUsuarios.setVisible(false);
        }else{
            menuDatos.setVisible(false);
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuArchivoSalir = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenu();
        menuDatos = new javax.swing.JMenu();
        menuReportes = new javax.swing.JMenu();
        menuReportesUsuarios = new javax.swing.JMenuItem();
        menuVentas = new javax.swing.JMenu();
        menuCambiarUsuario = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArchivo.setText("Archivo");

        menuArchivoSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuArchivoSalir.setText("Salir");
        menuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoSalir);

        menuBar.add(menuArchivo);

        menuUsuarios.setText("Usuarios");
        menuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUsuariosMouseClicked(evt);
            }
        });
        menuBar.add(menuUsuarios);

        menuDatos.setText("Datos");
        menuDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDatosMouseClicked(evt);
            }
        });
        menuBar.add(menuDatos);

        menuReportes.setText("Reportes");

        menuReportesUsuarios.setText("Usuarios");
        menuReportesUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuReportesUsuariosMouseClicked(evt);
            }
        });
        menuReportes.add(menuReportesUsuarios);

        menuBar.add(menuReportes);

        menuVentas.setText("Ventas");
        menuBar.add(menuVentas);

        menuCambiarUsuario.setText("Cambiar Usuario");
        menuCambiarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCambiarUsuarioMouseClicked(evt);
            }
        });
        menuCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCambiarUsuarioActionPerformed(evt);
            }
        });
        menuBar.add(menuCambiarUsuario);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuArchivoSalirActionPerformed

    private void menuCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCambiarUsuarioActionPerformed


    }//GEN-LAST:event_menuCambiarUsuarioActionPerformed

    private void menuCambiarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCambiarUsuarioMouseClicked
        this.dispose();
        AccesoView.main(null);
    }//GEN-LAST:event_menuCambiarUsuarioMouseClicked

    private void menuUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsuariosMouseClicked
        cargarFormulario(MantUsuarioView.class);
    }//GEN-LAST:event_menuUsuariosMouseClicked

    private void menuDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDatosMouseClicked
        Usuario usuario = (Usuario) Memoria.get("usuario");
        ModificarUsuarioView view = new ModificarUsuarioView(null,true);
        view.setBean(usuario);
        view.accion(Crud.CRUD_EDITAR);
        view.setVisible(true);
        if (Memoria.get("bean") != null) {
            usuario = (Usuario) Memoria.get("bean");
        }
    }//GEN-LAST:event_menuDatosMouseClicked

    private void menuReportesUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuReportesUsuariosMouseClicked
        try {
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_menuReportesUsuariosMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCambiarUsuario;
    private javax.swing.JMenu menuDatos;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenuItem menuReportesUsuarios;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JMenu menuVentas;
    // End of variables declaration//GEN-END:variables
 private void cargarFormulario(Class<?> aClass) {
        try {
            // Variable
            JInternalFrame view;
            // Buscar instancia
            view = buscarInstancia(aClass);
            // Crear instancia
            if (view == null) {
                view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
                desktopPane.add(view);
            }
            // Mostrar formulario
            view.setVisible(true);
            view.setSelected(true);
        } catch (Exception e) {
        }
    }

    private JInternalFrame buscarInstancia(Class<?> aClass) {
        JInternalFrame view = null;
        for (JInternalFrame form : desktopPane.getAllFrames()) {
            if (aClass.isInstance(form)) {
                view = form;
                break;
            }
        }
        return view;
    }
}