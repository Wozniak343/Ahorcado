package Interfaz;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Juego extends javax.swing.JFrame {

    int xMouse, yMouse;
    public char Letra;
    public int err, err2, ran;
    public ImageIcon imgs[];
    public String msgs[], res[];

    public Juego() {
        initComponents();
        setIconImage(getIconImage()); //Remplazando el icono por defecto de Java.
        msgs = new String[20];
        imgs = new ImageIcon[6];

        //ingresamos la imagen por partes del ahorcado
        imgs[0] = new ImageIcon(getClass().getResource("/imagenes/ERROR0.jpg"));
        imgs[1] = new ImageIcon(getClass().getResource("/imagenes/ERROR1.jpg"));
        imgs[2] = new ImageIcon(getClass().getResource("/imagenes/ERROR2.jpg"));
        imgs[3] = new ImageIcon(getClass().getResource("/imagenes/ERROR3.jpg"));
        imgs[4] = new ImageIcon(getClass().getResource("/imagenes/ERROR4.jpg"));
        imgs[5] = new ImageIcon(getClass().getResource("/imagenes/ERROR5.jpg"));

        //Todas las palabras a adiviniar
        msgs[0] = "internet";
        msgs[1] = "barcelona";
        msgs[2] = "neiva";
        msgs[3] = "criptomoneda";
        msgs[4] = "colombia";
        msgs[5] = "programacion";
        msgs[6] = "informatica";
        msgs[7] = "clase";
        msgs[8] = "ahorcado";
        msgs[9] = "ciberseguridad";
        msgs[10] = "automovil";
        msgs[11] = "alumno";
        msgs[12] = "telefono";
        msgs[13] = "futbol";
        msgs[14] = "algoritmo";
        msgs[15] = "transformacion";
        msgs[16] = "bus";
        msgs[17] = "motocicleta";
        msgs[18] = "computadora";
        msgs[19] = "supletorios";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barraSuperior = new javax.swing.JPanel();
        Minimizar = new javax.swing.JButton();
        Salida = new javax.swing.JButton();
        Ahorcado = new javax.swing.JLabel();
        Texto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TXTpalabra = new javax.swing.JTextField();
        Boton = new javax.swing.JButton();
        Entrada = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        BotonIniciar = new javax.swing.JButton();
        BotonMenu = new javax.swing.JButton();
        ComoJugar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraSuperior.setBackground(new java.awt.Color(255, 255, 255));
        barraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraSuperiorMouseDragged(evt);
            }
        });
        barraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraSuperiorMousePressed(evt);
            }
        });
        barraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        barraSuperior.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 30, 30));

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
        barraSuperior.add(Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 30));

        Ahorcado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ERROR0.jpg"))); // NOI18N
        jPanel1.add(Ahorcado, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        Texto.setBackground(new java.awt.Color(255, 255, 255));
        Texto.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        Texto.setForeground(new java.awt.Color(0, 0, 0));
        Texto.setText("¡Juego del  Ahorcado!");
        jPanel1.add(Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 390, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 270, 20));

        TXTpalabra.setBackground(new java.awt.Color(255, 255, 255));
        TXTpalabra.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        TXTpalabra.setForeground(new java.awt.Color(0, 0, 0));
        TXTpalabra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXTpalabra.setBorder(null);
        jPanel1.add(TXTpalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 270, 40));

        Boton.setBackground(new java.awt.Color(255, 255, 255));
        Boton.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        Boton.setForeground(new java.awt.Color(0, 0, 0));
        Boton.setText("Probar");
        Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActionPerformed(evt);
            }
        });
        jPanel1.add(Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 130, 50));

        Entrada.setBackground(new java.awt.Color(255, 255, 255));
        Entrada.setFont(new java.awt.Font("Kristen ITC", 1, 36)); // NOI18N
        Entrada.setForeground(new java.awt.Color(0, 0, 0));
        Entrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Entrada.setBorder(null);
        Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaActionPerformed(evt);
            }
        });
        Entrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EntradaKeyTyped(evt);
            }
        });
        jPanel1.add(Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 70, 60));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 110, 10));

        BotonIniciar.setBackground(new java.awt.Color(255, 255, 255));
        BotonIniciar.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        BotonIniciar.setForeground(new java.awt.Color(0, 0, 0));
        BotonIniciar.setText("Iniciar");
        BotonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 130, 50));

        BotonMenu.setBackground(new java.awt.Color(255, 255, 255));
        BotonMenu.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        BotonMenu.setForeground(new java.awt.Color(0, 0, 0));
        BotonMenu.setText("Menú");
        BotonMenu.setBorder(null);
        BotonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenuActionPerformed(evt);
            }
        });
        jPanel1.add(BotonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 70, 30));

        ComoJugar.setBackground(new java.awt.Color(255, 255, 255));
        ComoJugar.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        ComoJugar.setForeground(new java.awt.Color(0, 0, 0));
        ComoJugar.setText("¿Como Jugar?");
        ComoJugar.setBorder(null);
        ComoJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComoJugarActionPerformed(evt);
            }
        });
        jPanel1.add(ComoJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 100, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Palabra Secreta");
        jLabel1.setAutoscrolls(true);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public Image getIconImage() {
        //Remplazamos la imagen del icono por la nuestra
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
        return retValue;
    }

    private void MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarActionPerformed
        //comando para minimizar la interfaz
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizarActionPerformed

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
        //comando para salir del programa
        System.exit(0);
    }//GEN-LAST:event_SalidaActionPerformed

    private void barraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMouseDragged
        //localizamos la posición del mouse en X y Y
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraSuperiorMouseDragged

    private void barraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMousePressed
        //capturamos la posición final del mouse para restarlo con la posición inicial
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraSuperiorMousePressed

    private void BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActionPerformed
        try {
            //verificamos si hay algo en el Text panel de la palabra a adivinar
            String nulo = TXTpalabra.getText();
            String nulo2 = Entrada.getText();
            if (nulo.equals("") || nulo2.equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR!\nInicie la palabra o inserte una letra para poder jugar", "Advertencia", 2);
            } else {
                //Capturamos la letra ingresada por el usuario y solo tomamos la primera letra
                Letra = (char) (Entrada.getText()).charAt(0);
                Entrada.setText("");

                boolean Probar = false;
                //Verificamos si la letra esta en la palabra
                for (int p = 0; p < msgs[ran].length(); p++) {
                    if (Letra == msgs[ran].charAt(p)) {
                        res[p] = Letra + "";
                        Probar = true;
                    }
                }

                //Si la letra existe en la palabra la mostramos en el Text panel
                if (Probar) {
                    TXTpalabra.setText(" ");

                    for (String re : res) {
                        if (" ".equals(re)) {
                            TXTpalabra.setText(TXTpalabra.getText() + "\n");
                        } else {
                            TXTpalabra.setText(TXTpalabra.getText() + re + " ");
                        }
                    }

                    //Comprobamos las letras restantes, si no hay el usuario habra ganado
                    boolean ganar = true;
                    for (String re : res) {
                        if (re.equals("_")) {
                            ganar = false;
                            break;
                        }
                    }
                    //Si la letra es correcta mostramos un mensaje de ganador
                    if (ganar) {
                        Icon trofeo = new ImageIcon(getClass().getResource("/Imagenes/Trofeo.png"));
                        JOptionPane.showMessageDialog(null, "GANASTE!\nRecuerda volver a iniciar la palabra para volver a jugar", "Ahorcado", JOptionPane.INFORMATION_MESSAGE, trofeo);
                    }
                } else {
                    Ahorcado.setIcon(imgs[++err]);
                    //Si el contador de errores llega a 5 se habra perdido el juego
                    if (err == 5) {
                        Icon Carita = new ImageIcon(getClass().getResource("/Imagenes/Derrota.png"));
                        JOptionPane.showMessageDialog(null, "HAS PERDIDO!\nLa palabra era: " + msgs[ran], "Ahorcado", JOptionPane.INFORMATION_MESSAGE, Carita);
                    }
                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error!\nAsegurese de haber insertado una palabra correcta", "Advertencia", 2);
        }

    }//GEN-LAST:event_BotonActionPerformed

    private void BotonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarActionPerformed
        //Iniciamos los errores en 0
        err = 0;
        //Error maximo
        err2 = 5;
        //Ponemos la imagen del error 0
        Ahorcado.setIcon(imgs[0]);
        //Borramos lo que haya en TXTpalabra
        TXTpalabra.setText("");

        //Generamos una palabra de manera aleatoria
        ran = (int) 0 + (int) (Math.random() * ((msgs.length - 1) + 1));

        //Separamos la palabra en letras unicas
        String pal[] = msgs[ran].split(" ");
        res = new String[msgs[ran].length() + 1]; 
        int j = 0;

        //Generamos los guiones en el Text panel para mostrar visualmente la palabra 
        for (String pal1 : pal) {
            for (int i = 0; i < pal1.length(); i++) {
                TXTpalabra.setText(TXTpalabra.getText() + "_ ");
                res[j++] = "_";
            }
            TXTpalabra.setText(TXTpalabra.getText() + "\n");
            res[j++] = " ";
        }
    }//GEN-LAST:event_BotonIniciarActionPerformed

    private void BotonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenuActionPerformed
        //volvemos invisible esta interfaz y volvemos visible la interfaz de menu
        this.setVisible(false);
        Menu me = new Menu();
        me.setLocationRelativeTo(null);
        me.setVisible(true);
    }//GEN-LAST:event_BotonMenuActionPerformed

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

    private void EntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaKeyTyped
        if (Entrada.getText().length() >= 1) {
            evt.consume();
        }
    }//GEN-LAST:event_EntradaKeyTyped

    private void EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ahorcado;
    private javax.swing.JButton Boton;
    private javax.swing.JButton BotonIniciar;
    private javax.swing.JButton BotonMenu;
    private javax.swing.JButton ComoJugar;
    private javax.swing.JTextField Entrada;
    private javax.swing.JButton Minimizar;
    private javax.swing.JButton Salida;
    private javax.swing.JTextField TXTpalabra;
    private javax.swing.JLabel Texto;
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
