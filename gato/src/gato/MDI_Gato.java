/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

import javax.swing.ImageIcon;

/**
 *
 * @author Cristiam
 */
public class MDI_Gato extends javax.swing.JFrame {
 Gato_Metodos Metodos = new Gato_Metodos();
  
 
    /**
     * Creates new form MDI_Gato
     */
    public MDI_Gato() {
        initComponents();
       
        
       /* Panel_Juego.setVisible(false);*/
        
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
        Panel_Juego = new javax.swing.JPanel();
        Panel_jugador1 = new javax.swing.JPanel();
        lblJugador1 = new javax.swing.JLabel();
        lblGanados1 = new javax.swing.JLabel();
        lblEmpatados1 = new javax.swing.JLabel();
        lblPerdidos1 = new javax.swing.JLabel();
        Lb_ganados = new javax.swing.JLabel();
        Lb_empatados = new javax.swing.JLabel();
        Lb_perdidos = new javax.swing.JLabel();
        Lb_FichaJ1 = new javax.swing.JLabel();
        Lb_FichaJ2 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        A3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Panel_jugador2 = new javax.swing.JPanel();
        lblJugador2 = new javax.swing.JLabel();
        lblGanados2 = new javax.swing.JLabel();
        lblEmpatados2 = new javax.swing.JLabel();
        lblPerdidos2 = new javax.swing.JLabel();
        Lb_ganados2 = new javax.swing.JLabel();
        Lb_empatados2 = new javax.swing.JLabel();
        Lb_perdidos3 = new javax.swing.JLabel();
        Lb_Mensaje = new javax.swing.JLabel();
        Btn_SalirJuego = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        Btn_NuevoJuego = new javax.swing.JMenu();
        Btn_ListasJugadores = new javax.swing.JMenu();
        Btn_Estadistica = new javax.swing.JMenu();
        Btn_Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Juego.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Juego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_jugador1.setBackground(new java.awt.Color(255, 255, 255));
        Panel_jugador1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 3), "Jugador 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MS Reference Sans Serif", 0, 14), new java.awt.Color(0, 51, 153))); // NOI18N
        Panel_jugador1.setForeground(new java.awt.Color(0, 0, 102));

        lblJugador1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        lblJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblGanados1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblGanados1.setForeground(new java.awt.Color(0, 0, 102));
        lblGanados1.setText("Ganados:");

        lblEmpatados1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblEmpatados1.setForeground(new java.awt.Color(0, 0, 102));
        lblEmpatados1.setText("Empatados:");

        lblPerdidos1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblPerdidos1.setForeground(new java.awt.Color(0, 0, 102));
        lblPerdidos1.setText("Perdidos:");

        Lb_ganados.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        Lb_ganados.setForeground(new java.awt.Color(0, 0, 102));

        Lb_empatados.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        Lb_empatados.setForeground(new java.awt.Color(0, 0, 102));

        Lb_perdidos.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        Lb_perdidos.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout Panel_jugador1Layout = new javax.swing.GroupLayout(Panel_jugador1);
        Panel_jugador1.setLayout(Panel_jugador1Layout);
        Panel_jugador1Layout.setHorizontalGroup(
            Panel_jugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_jugador1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_jugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Panel_jugador1Layout.createSequentialGroup()
                        .addGroup(Panel_jugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_jugador1Layout.createSequentialGroup()
                                .addComponent(lblPerdidos1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lb_perdidos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_jugador1Layout.createSequentialGroup()
                                .addComponent(lblGanados1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lb_ganados, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_jugador1Layout.createSequentialGroup()
                                .addComponent(lblEmpatados1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lb_empatados, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel_jugador1Layout.setVerticalGroup(
            Panel_jugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_jugador1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_jugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGanados1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lb_ganados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(Panel_jugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmpatados1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lb_empatados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(Panel_jugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerdidos1)
                    .addComponent(Lb_perdidos, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Panel_Juego.add(Panel_jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, 170));

        Lb_FichaJ1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cristiam\\Desktop\\Ogato.png")); // NOI18N
        Panel_Juego.add(Lb_FichaJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        Lb_FichaJ2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cristiam\\Desktop\\x gato.png")); // NOI18N
        Panel_Juego.add(Lb_FichaJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, -1, -1));

        A1.setBackground(new java.awt.Color(255, 255, 255));
        A1.setForeground(new java.awt.Color(153, 0, 0));
        A1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        A1.setName("p1"); // NOI18N
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });
        Panel_Juego.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 70, 60));

        B1.setBackground(new java.awt.Color(255, 255, 255));
        B1.setForeground(new java.awt.Color(153, 0, 0));
        B1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B1.setName("p2"); // NOI18N
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });
        Panel_Juego.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 70, 60));

        C2.setBackground(new java.awt.Color(255, 255, 255));
        C2.setForeground(new java.awt.Color(153, 0, 0));
        C2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        C2.setName("p3"); // NOI18N
        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C2MouseClicked(evt);
            }
        });
        Panel_Juego.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 70, 60));

        A2.setBackground(new java.awt.Color(255, 255, 255));
        A2.setForeground(new java.awt.Color(153, 0, 0));
        A2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        A2.setName("p4"); // NOI18N
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A2MouseClicked(evt);
            }
        });
        Panel_Juego.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 60, 60));

        B2.setBackground(new java.awt.Color(255, 255, 255));
        B2.setForeground(new java.awt.Color(153, 0, 0));
        B2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B2.setName("p5"); // NOI18N
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
        });
        Panel_Juego.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 60, 60));

        C1.setBackground(new java.awt.Color(102, 0, 255));
        C1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        C1.setName("p6"); // NOI18N
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C1MouseClicked(evt);
            }
        });
        Panel_Juego.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 60, 60));

        C3.setBackground(new java.awt.Color(255, 255, 255));
        C3.setForeground(new java.awt.Color(153, 0, 0));
        C3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        C3.setName("p9"); // NOI18N
        C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C3MouseClicked(evt);
            }
        });
        Panel_Juego.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 70, 60));

        B3.setBackground(new java.awt.Color(255, 255, 255));
        B3.setForeground(new java.awt.Color(153, 0, 0));
        B3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B3.setName("p8"); // NOI18N
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3MouseClicked(evt);
            }
        });
        Panel_Juego.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 80, 60));

        A3.setBackground(new java.awt.Color(255, 255, 255));
        A3.setForeground(new java.awt.Color(153, 0, 0));
        A3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        A3.setName("p7"); // NOI18N
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A3MouseClicked(evt);
            }
        });
        Panel_Juego.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/tablero gato.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        Panel_Juego.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 270, 260));

        Panel_jugador2.setBackground(new java.awt.Color(255, 255, 255));
        Panel_jugador2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 3), "Jugador 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MS Reference Sans Serif", 0, 14), new java.awt.Color(0, 51, 153))); // NOI18N
        Panel_jugador2.setForeground(new java.awt.Color(0, 0, 102));

        lblJugador2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        lblJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblGanados2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblGanados2.setForeground(new java.awt.Color(0, 0, 102));
        lblGanados2.setText("Ganados:");

        lblEmpatados2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblEmpatados2.setForeground(new java.awt.Color(0, 0, 102));
        lblEmpatados2.setText("Empatados:");

        lblPerdidos2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        lblPerdidos2.setForeground(new java.awt.Color(0, 0, 102));
        lblPerdidos2.setText("Perdidos:");

        Lb_ganados2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        Lb_ganados2.setForeground(new java.awt.Color(0, 0, 102));

        Lb_empatados2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        Lb_empatados2.setForeground(new java.awt.Color(0, 0, 102));

        Lb_perdidos3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        Lb_perdidos3.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout Panel_jugador2Layout = new javax.swing.GroupLayout(Panel_jugador2);
        Panel_jugador2.setLayout(Panel_jugador2Layout);
        Panel_jugador2Layout.setHorizontalGroup(
            Panel_jugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_jugador2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_jugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Panel_jugador2Layout.createSequentialGroup()
                        .addGroup(Panel_jugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_jugador2Layout.createSequentialGroup()
                                .addComponent(lblPerdidos2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lb_perdidos3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_jugador2Layout.createSequentialGroup()
                                .addComponent(lblGanados2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lb_ganados2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_jugador2Layout.createSequentialGroup()
                                .addComponent(lblEmpatados2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lb_empatados2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel_jugador2Layout.setVerticalGroup(
            Panel_jugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_jugador2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(Panel_jugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGanados2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lb_ganados2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(Panel_jugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmpatados2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lb_empatados2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(Panel_jugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerdidos2)
                    .addComponent(Lb_perdidos3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Panel_Juego.add(Panel_jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, 170));

        Lb_Mensaje.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        Lb_Mensaje.setForeground(new java.awt.Color(0, 0, 153));
        Lb_Mensaje.setText("TUrno de :");
        Panel_Juego.add(Lb_Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 210, 20));

        Btn_SalirJuego.setBackground(new java.awt.Color(255, 255, 255));
        Btn_SalirJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BotonSalirSinTexto.png"))); // NOI18N
        Btn_SalirJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_SalirJuegoMouseClicked(evt);
            }
        });
        Panel_Juego.add(Btn_SalirJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 30, 30));

        desktopPane.add(Panel_Juego);
        Panel_Juego.setBounds(0, 0, 790, 350);

        menuBar.setMaximumSize(new java.awt.Dimension(316, 21));

        Btn_NuevoJuego.setText("Nuevo Juego");
        Btn_NuevoJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_NuevoJuegoMouseClicked(evt);
            }
        });
        menuBar.add(Btn_NuevoJuego);

        Btn_ListasJugadores.setText("Lista Jugadores");
        Btn_ListasJugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_ListasJugadoresMouseClicked(evt);
            }
        });
        menuBar.add(Btn_ListasJugadores);

        Btn_Estadistica.setText("Estadistica Jugadores");
        Btn_Estadistica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_EstadisticaMouseClicked(evt);
            }
        });
        menuBar.add(Btn_Estadistica);

        Btn_Salir.setText("Salir");
        Btn_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_SalirMouseClicked(evt);
            }
        });
        menuBar.add(Btn_Salir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_SalirMouseClicked
      this.dispose();
    }//GEN-LAST:event_Btn_SalirMouseClicked

    private void Btn_NuevoJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_NuevoJuegoMouseClicked
        Frm_NuevoJuego frmPerfil = new Frm_NuevoJuego();
        desktopPane.add(frmPerfil);
        frmPerfil.toFront();
        frmPerfil.setVisible(true);
        Btn_NuevoJuego.setEnabled(false);
        
    }//GEN-LAST:event_Btn_NuevoJuegoMouseClicked

    private void A3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseClicked

if( Metodos.tablero[3]!=0){
} else {
    Metodos.tablero[3]=4;
    
    A3.setIcon(new ImageIcon(this.getClass().getResource( "/Recursos/x gato.png")));  
     }
    }//GEN-LAST:event_A3MouseClicked

    private void B3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseClicked
Metodos.ganador();
    }//GEN-LAST:event_B3MouseClicked

    private void C3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C3MouseClicked

    }//GEN-LAST:event_C3MouseClicked

    private void C1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseClicked

    }//GEN-LAST:event_C1MouseClicked

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseClicked

    }//GEN-LAST:event_B2MouseClicked

    private void A2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseClicked

    }//GEN-LAST:event_A2MouseClicked

    private void C2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C2MouseClicked

    }//GEN-LAST:event_C2MouseClicked

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked

    }//GEN-LAST:event_B1MouseClicked

    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked

    }//GEN-LAST:event_A1MouseClicked

    private void Btn_EstadisticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_EstadisticaMouseClicked
           NewJInternalFrame frmEstadistica = new NewJInternalFrame();
        desktopPane.add(frmEstadistica);
        frmEstadistica.toFront();
        frmEstadistica.setVisible(true);
     
    }//GEN-LAST:event_Btn_EstadisticaMouseClicked

    private void Btn_ListasJugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ListasJugadoresMouseClicked
         frm_ListaJugadores frmListaJugad = new frm_ListaJugadores();
        desktopPane.add(frmListaJugad);
        frmListaJugad.toFront();
        frmListaJugad.setVisible(true);
    }//GEN-LAST:event_Btn_ListasJugadoresMouseClicked

    private void Btn_SalirJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_SalirJuegoMouseClicked
       Panel_Juego.setVisible(false);
    }//GEN-LAST:event_Btn_SalirJuegoMouseClicked

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
            java.util.logging.Logger.getLogger(MDI_Gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI_Gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI_Gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI_Gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI_Gato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel A3;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JMenu Btn_Estadistica;
    private javax.swing.JMenu Btn_ListasJugadores;
    private javax.swing.JMenu Btn_NuevoJuego;
    private javax.swing.JMenu Btn_Salir;
    private javax.swing.JButton Btn_SalirJuego;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel Lb_FichaJ1;
    private javax.swing.JLabel Lb_FichaJ2;
    public javax.swing.JLabel Lb_Mensaje;
    private javax.swing.JLabel Lb_empatados;
    private javax.swing.JLabel Lb_empatados2;
    private javax.swing.JLabel Lb_ganados;
    private javax.swing.JLabel Lb_ganados2;
    private javax.swing.JLabel Lb_perdidos;
    private javax.swing.JLabel Lb_perdidos3;
    private javax.swing.JPanel Panel_Juego;
    private javax.swing.JPanel Panel_jugador1;
    private javax.swing.JPanel Panel_jugador2;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEmpatados1;
    private javax.swing.JLabel lblEmpatados2;
    private javax.swing.JLabel lblGanados1;
    private javax.swing.JLabel lblGanados2;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblPerdidos1;
    private javax.swing.JLabel lblPerdidos2;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
