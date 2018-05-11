/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorJuego;
import controlador.InterfaceJuego;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Participante;

/**
 *
 * @author sartre
 */
public class VistaJuego extends javax.swing.JFrame implements InterfaceJuego{

    /**
     * Creates new form VistaJuego
     */
    protected Participante participante;
    private ControladorJuego controlador;
    
    
    public VistaJuego(){}
    
    public VistaJuego(Participante p) {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.participante = p;
        this.lblNombre.setText(p.getJugador().getNombre());
        this.lblEspera.setVisible(true);
        this.lblSaldo.setVisible(false);
        this.lblSaldoValor.setVisible(false);
        this.lblPozo.setVisible(false);
        this.lblPozoValor.setVisible(false);
        this.lblCarta1.setVisible(false);
        this.lblCarta2.setVisible(false);
        this.lblCarta3.setVisible(false);
        this.lblCarta4.setVisible(false);
        this.lblCarta5.setVisible(false);
        this.btnApostar.setVisible(false);
        this.btnPasar.setVisible(false);
        this.controlador = new ControladorJuego(this, participante);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMinimize = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblBarra = new javax.swing.JLabel();
        lblParticipantes = new javax.swing.JLabel();
        lblEspera = new javax.swing.JLabel();
        lblCarta1 = new javax.swing.JLabel();
        lblCarta2 = new javax.swing.JLabel();
        lblCarta3 = new javax.swing.JLabel();
        lblCarta4 = new javax.swing.JLabel();
        lblCarta5 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblSaldoValor = new javax.swing.JLabel();
        btnApostar = new javax.swing.JButton();
        btnPasar = new javax.swing.JButton();
        contenedorParticipantes = new javax.swing.JScrollPane();
        lstParticipantes = new javax.swing.JList();
        lblPozo = new javax.swing.JLabel();
        lblPozoValor = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/utilidades/iconos/minimize.png"))); // NOI18N
        lblMinimize.setToolTipText("Minimizar");
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMinimizeMousePressed(evt);
            }
        });
        getContentPane().add(lblMinimize);
        lblMinimize.setBounds(30, 0, 14, 20);

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/utilidades/iconos/close.png"))); // NOI18N
        lblClose.setToolTipText("Cerrar");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCloseMousePressed(evt);
            }
        });
        getContentPane().add(lblClose);
        lblClose.setBounds(10, 0, 20, 20);

        lblNombre.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblNombre);
        lblNombre.setBounds(60, 0, 280, 30);

        lblBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblBarraMouseDragged(evt);
            }
        });
        lblBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBarraMousePressed(evt);
            }
        });
        getContentPane().add(lblBarra);
        lblBarra.setBounds(0, 0, 340, 40);

        lblParticipantes.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        lblParticipantes.setForeground(new java.awt.Color(255, 255, 204));
        lblParticipantes.setText("~ Participantes ~");
        lblParticipantes.setToolTipText("");
        getContentPane().add(lblParticipantes);
        lblParticipantes.setBounds(210, 30, 120, 40);

        lblEspera.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lblEspera.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblEspera);
        lblEspera.setBounds(10, 80, 180, 170);

        lblCarta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/utilidades/cards/10_of_diamonds.png"))); // NOI18N
        getContentPane().add(lblCarta1);
        lblCarta1.setBounds(10, 80, 55, 80);

        lblCarta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/utilidades/cards/6_of_clubs.png"))); // NOI18N
        getContentPane().add(lblCarta2);
        lblCarta2.setBounds(70, 80, 55, 80);

        lblCarta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/utilidades/cards/jack_of_diamonds.png"))); // NOI18N
        getContentPane().add(lblCarta3);
        lblCarta3.setBounds(130, 80, 55, 80);

        lblCarta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/utilidades/cards/3_of_hearts.png"))); // NOI18N
        getContentPane().add(lblCarta4);
        lblCarta4.setBounds(100, 170, 55, 80);

        lblCarta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/utilidades/cards/king_of_clubs.png"))); // NOI18N
        getContentPane().add(lblCarta5);
        lblCarta5.setBounds(40, 170, 55, 80);

        lblSaldo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldo.setText("Saldo: ");
        getContentPane().add(lblSaldo);
        lblSaldo.setBounds(10, 50, 50, 20);

        lblSaldoValor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSaldoValor.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldoValor.setText("$$$$$");
        getContentPane().add(lblSaldoValor);
        lblSaldoValor.setBounds(70, 50, 120, 20);

        btnApostar.setBackground(new java.awt.Color(71, 128, 51));
        btnApostar.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        btnApostar.setForeground(new java.awt.Color(255, 255, 255));
        btnApostar.setText("Apostar");
        btnApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApostarActionPerformed(evt);
            }
        });
        getContentPane().add(btnApostar);
        btnApostar.setBounds(10, 290, 90, 30);

        btnPasar.setBackground(new java.awt.Color(158, 158, 15));
        btnPasar.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        btnPasar.setForeground(new java.awt.Color(255, 255, 255));
        btnPasar.setText("Pasar");
        btnPasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPasar);
        btnPasar.setBounds(120, 290, 90, 30);

        contenedorParticipantes.setBackground(new java.awt.Color(51, 51, 51));

        lstParticipantes.setBackground(new java.awt.Color(89, 89, 104));
        lstParticipantes.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lstParticipantes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstParticipantes.setSelectionBackground(new java.awt.Color(215, 215, 89));
        lstParticipantes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        contenedorParticipantes.setViewportView(lstParticipantes);

        getContentPane().add(contenedorParticipantes);
        contenedorParticipantes.setBounds(200, 80, 130, 170);

        lblPozo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPozo.setForeground(new java.awt.Color(255, 255, 255));
        lblPozo.setText("Pozo: ");
        getContentPane().add(lblPozo);
        lblPozo.setBounds(200, 260, 50, 20);

        lblPozoValor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPozoValor.setForeground(new java.awt.Color(255, 255, 255));
        lblPozoValor.setText("$$$$$");
        getContentPane().add(lblPozoValor);
        lblPozoValor.setBounds(250, 260, 110, 20);

        btnSalir.setBackground(new java.awt.Color(162, 43, 34));
        btnSalir.setFont(new java.awt.Font("Menlo", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(230, 290, 90, 30);

        lblBackground.setBackground(new java.awt.Color(0, 51, 255));
        lblBackground.setForeground(new java.awt.Color(255, 255, 255));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/utilidades/background/background_table.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(-570, -140, 1400, 660);

        setBounds(0, 0, 336, 333);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMousePressed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMousePressed

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMousePressed
        // TODO add your handling code here:
        confirmarSalida();
    }//GEN-LAST:event_lblCloseMousePressed

    private void lblBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-x1, y-y1);
    }//GEN-LAST:event_lblBarraMouseDragged
    int x1;
    int y1;
    private void lblBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraMousePressed
        x1 = evt.getX();
        y1 = evt.getY();
    }//GEN-LAST:event_lblBarraMousePressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        confirmarSalida();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnPasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasarActionPerformed
        // TODO add your handling code here:
        pasar();
    }//GEN-LAST:event_btnPasarActionPerformed

    private void btnApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApostarActionPerformed
        // TODO add your handling code here:
        apostar();
    }//GEN-LAST:event_btnApostarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApostar;
    private javax.swing.JButton btnPasar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane contenedorParticipantes;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBarra;
    private javax.swing.JLabel lblCarta1;
    private javax.swing.JLabel lblCarta2;
    private javax.swing.JLabel lblCarta3;
    private javax.swing.JLabel lblCarta4;
    private javax.swing.JLabel lblCarta5;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblEspera;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblParticipantes;
    private javax.swing.JLabel lblPozo;
    private javax.swing.JLabel lblPozoValor;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSaldoValor;
    private javax.swing.JList lstParticipantes;
    // End of variables declaration//GEN-END:variables
    public void apostar(){
        try{
            int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese valor para apostar", "Apostar", JOptionPane.QUESTION_MESSAGE));
            System.out.println("APOSTAR:  " + valor);
            controlador.apostar(valor);
        }catch(Exception ex){
            mostrarError(ex.getMessage());
        }
    }
    
    private void pasar() {
        controlador.pasar();
    }

    private void confirmarSalida(){
        int valor = JOptionPane.showConfirmDialog(this, "Está seguro que desea salir?", "Advertencia!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(valor == JOptionPane.YES_OPTION){
            // Como se tiene implementado, que cada mano obtiene la lista de
            // participantes activos, podemos hacer que el participante se 
            // cambia el estado y en la proxima mano ya no estará.
            controlador.salirDelJuego();
            dispose();
        }
    }
    
    @Override
    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }
    

    @Override
    public void mostrarEspera(int faltantes) {
        if(faltantes > 1) lblEspera.setText("Juego en espera. Aún faltan " + faltantes + " participantes");
        else lblEspera.setText("Juego en espera. Aún falta " + faltantes + " participante");
        lblEspera.setVisible(true);
    }

    @Override
    public void iniciarJuego() {
        this.lblEspera.setVisible(false);
        this.lblCarta1.setVisible(true);
        this.lblCarta2.setVisible(true);
        this.lblCarta3.setVisible(true);
        this.lblCarta4.setVisible(true);
        this.lblCarta5.setVisible(true);
        this.lblSaldo.setVisible(true);
        this.lblSaldoValor.setVisible(true);
        this.lblPozo.setVisible(true);
        this.lblPozoValor.setVisible(true);
        lblEspera.setVisible(false);
        btnApostar.setVisible(true);
        btnPasar.setVisible(true);
    }
    

    @Override
    public void actualizarListaParticipantes(ArrayList<Participante> participantes) {
        ArrayList<Participante> participantesActualizada = new ArrayList<>();
        for(Participante p: participantes){
            if( this.participante != p && this.participante!=null){
                participantesActualizada.add(p);
            }
        }
        this.lstParticipantes.setListData(participantesActualizada.toArray());
    }

    @Override
    public void actualizarPozo(int pozo) {
        this.lblPozoValor.setText("$ " + pozo);
    }

    @Override
    public void pasaronTodos() {
        int valor = JOptionPane.showConfirmDialog(this, "Pasaron todos los participantes. La mano finaliza sin ganador. Jugar la siguiente mano con pozo acumulado?", "Advertencia!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(valor == JOptionPane.NO_OPTION){
            controlador.salirDelJuego();
            dispose();
        }
    }

    @Override
    public void actualizarSaldo(int saldo) {
        this.lblSaldoValor.setText("$ " + saldo);
    }

    @Override
    public void salir() {
        dispose();
    }
}
