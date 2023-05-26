package Interfaz;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Menu() {
        initComponents();
        setIconImage(getIconImage()); //Remplazando el icono por defecto de Java.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Salida = new javax.swing.JButton();
        Minimizar = new javax.swing.JButton();
        SalirBoton = new javax.swing.JButton();
        JugarBoton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ComoJugar = new javax.swing.JButton();
        Creditos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salida.setBackground(new java.awt.Color(255, 255, 255));
        Salida.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Salida.setForeground(new java.awt.Color(0, 0, 0));
        Salida.setText("X");
        Salida.setBorder(null);
        Salida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });
        jPanel2.add(Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        Minimizar.setBackground(new java.awt.Color(255, 255, 255));
        Minimizar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Minimizar.setForeground(new java.awt.Color(0, 0, 0));
        Minimizar.setText("_");
        Minimizar.setBorder(null);
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizarActionPerformed(evt);
            }
        });
        jPanel2.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 30));

        SalirBoton.setBackground(new java.awt.Color(255, 255, 255));
        SalirBoton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SalirBoton.setForeground(new java.awt.Color(0, 0, 0));
        SalirBoton.setText("Salir");
        SalirBoton.setBorder(null);
        SalirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBotonActionPerformed(evt);
            }
        });
        jPanel1.add(SalirBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 210, 50));

        JugarBoton.setBackground(new java.awt.Color(255, 255, 255));
        JugarBoton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        JugarBoton.setForeground(new java.awt.Color(0, 0, 0));
        JugarBoton.setText("¡Jugar!");
        JugarBoton.setBorder(null);
        JugarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarBotonActionPerformed(evt);
            }
        });
        jPanel1.add(JugarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 210, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("¡Juego del Ahorcado!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ERROR5.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        ComoJugar.setBackground(new java.awt.Color(255, 255, 255));
        ComoJugar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ComoJugar.setForeground(new java.awt.Color(0, 0, 0));
        ComoJugar.setText("¿Como jugar?");
        ComoJugar.setBorder(null);
        ComoJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComoJugarActionPerformed(evt);
            }
        });
        jPanel1.add(ComoJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 210, 50));

        Creditos.setBackground(new java.awt.Color(255, 255, 255));
        Creditos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Creditos.setForeground(new java.awt.Color(0, 0, 0));
        Creditos.setText("Creditos");
        Creditos.setBorder(null);
        Creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditosActionPerformed(evt);
            }
        });
        jPanel1.add(Creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public Image getIconImage() {
        //Remplazamos la imagen del icono por la nuestra
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
        return retValue;
    }

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
        //comando para salir del programa
        System.exit(0);
    }//GEN-LAST:event_SalidaActionPerformed

    private void MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarActionPerformed
        //comando para minimizar la interfaz
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizarActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        //localizamos la posición del mouse en X y Y
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        //capturamos la posición final del mouse para restarlo con la posición inicial
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void SalirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBotonActionPerformed
        //comando para salir del programa
        System.exit(0);
    }//GEN-LAST:event_SalirBotonActionPerformed

    private void JugarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarBotonActionPerformed
        //volvemos invisible esta interfaz y volvemos visible la interfaz del juego
        this.setVisible(false);
        Juego ju = new Juego();
        ju.setLocationRelativeTo(null);
        ju.setVisible(true);
    }//GEN-LAST:event_JugarBotonActionPerformed

    private void ComoJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComoJugarActionPerformed
        //Un Joption para explicar al usuario como se juega al juego del ahorcado
        //Ademas creamos un icono para ponerlo en el JOption
        Icon Ehh = new ImageIcon(getClass().getResource("/Imagenes/Interrogante.png"));
        JOptionPane.showMessageDialog(null, """
                                            \u00bfComo jugar al juego del Ahorcado?
                                            
                                            El objetivo del juego es poder adivinar una palabra seleccionada
                                            aleatoriamente usando palabras unicas ingresadas por el usuario.
                                            
                                            \u00bfComo pierdes y/o ganas el juego?
                                            Para ganar en el juego del ahorcado tiene que adivinar todas las letras
                                            de la palabra creada aleatoriamente antes de llegar a lo 5 errores,
                                            si se llega a los 5 errores el usuario perdera el juego""", "¿Como jugar?", JOptionPane.INFORMATION_MESSAGE, Ehh);
    }//GEN-LAST:event_ComoJugarActionPerformed

    private void CreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditosActionPerformed
        //Un Joption para dar los creditos del juego        
        //Ademas creamos un icono para ponerlo en el JOption
        Icon UCC = new ImageIcon(getClass().getResource("/Imagenes/UCC.png"));
        JOptionPane.showMessageDialog(null, """
                                            Este es un trabajo realizado para la materia de Dise\u00f1o de datos
                                            de la universidad Cooperativa de Colombia
                                            
                                            Entregado al profesor:
                                            José Martín Delgado García
                                            
                                            El juego fue realizado por:
                                            Oscar Cuadros
                                            Andres Ramos
                                            Stiven Jimenez""", "Creditos", JOptionPane.INFORMATION_MESSAGE, UCC);
    }//GEN-LAST:event_CreditosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComoJugar;
    private javax.swing.JButton Creditos;
    private javax.swing.JButton JugarBoton;
    private javax.swing.JButton Minimizar;
    private javax.swing.JButton Salida;
    private javax.swing.JButton SalirBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
