package expo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

/**
 * FRAME "COMPRAR" LISTA DE SEGUIMIENTO: 1.2
 * @ArissaLuna
 */
public class Comprar extends javax.swing.JFrame {
    
    private javax.swing.JPanel carritoPanel;
    private java.util.HashMap<String, JSpinner> productosEnCarrito;
    
    public Comprar() {
        
        initComponents();
        
        carritoPanel = new javax.swing.JPanel();
        carritoPanel.setLayout(new javax.swing.BoxLayout(carritoPanel, javax.swing.BoxLayout.Y_AXIS)); // Para alinear los productos hacia abajo
        scrollPaneCarrito.setViewportView(carritoPanel); // Asignar el carritoPanel al JScrollPane

        // Configurar el JScrollPane para que solo tenga scroll vertical y se muestre solo cuando sea necesario
        scrollPaneCarrito.getViewport().setBackground(Color.WHITE);
        scrollPaneCarrito.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneCarrito.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        productosEnCarrito = new java.util.HashMap<>(); // Inicializar el HashMap
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelComprar = new expo.PanelRound();
        btnComprar = new javax.swing.JButton();
        labelComprar = new javax.swing.JLabel();
        panelInfo = new expo.PanelRound();
        btnInfo = new javax.swing.JButton();
        labelInfo = new javax.swing.JLabel();
        panelCerrar = new expo.PanelRound();
        btnCerrar = new javax.swing.JButton();
        labelCerrar = new javax.swing.JLabel();
        panelRound1 = new expo.PanelRound();
        scrollPaneCarrito = new javax.swing.JScrollPane();
        jLabel25 = new javax.swing.JLabel();
        panelRound14 = new expo.PanelRound();
        jLabel27 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        labelDescuento = new javax.swing.JLabel();
        labelSubtotal = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        btnVaciar = new javax.swing.JButton();
        panelProducto4 = new expo.PanelRound();
        imagen4 = new javax.swing.JButton();
        nombrePro4 = new javax.swing.JLabel();
        precioPro4 = new javax.swing.JLabel();
        btnAgregar4 = new javax.swing.JButton();
        panelProducto1 = new expo.PanelRound();
        imagen1 = new javax.swing.JButton();
        nombrePro1 = new javax.swing.JLabel();
        precioPro1 = new javax.swing.JLabel();
        btnAgregar1 = new javax.swing.JButton();
        panelProducto2 = new expo.PanelRound();
        imagen2 = new javax.swing.JButton();
        nombrePro2 = new javax.swing.JLabel();
        precioPro2 = new javax.swing.JLabel();
        btnAgregar2 = new javax.swing.JButton();
        panelProducto3 = new expo.PanelRound();
        imagen3 = new javax.swing.JButton();
        nombrePro3 = new javax.swing.JLabel();
        precioPro3 = new javax.swing.JLabel();
        btnAgregar3 = new javax.swing.JButton();
        panelProducto5 = new expo.PanelRound();
        imagen5 = new javax.swing.JButton();
        nombrePro5 = new javax.swing.JLabel();
        precioPro5 = new javax.swing.JLabel();
        btnAgregar5 = new javax.swing.JButton();
        panelProducto6 = new expo.PanelRound();
        imagen6 = new javax.swing.JButton();
        nombrePro6 = new javax.swing.JLabel();
        precioPro6 = new javax.swing.JLabel();
        btnAgregar6 = new javax.swing.JButton();
        panelProducto7 = new expo.PanelRound();
        imagen7 = new javax.swing.JButton();
        nombrePro7 = new javax.swing.JLabel();
        precioPro7 = new javax.swing.JLabel();
        btnAgregar7 = new javax.swing.JButton();
        panelProducto8 = new expo.PanelRound();
        imagen8 = new javax.swing.JButton();
        nombrePro8 = new javax.swing.JLabel();
        precioPro8 = new javax.swing.JLabel();
        btnAgregar8 = new javax.swing.JButton();
        panelProducto9 = new expo.PanelRound();
        imagen9 = new javax.swing.JButton();
        nombrePro9 = new javax.swing.JLabel();
        precioPro9 = new javax.swing.JLabel();
        btnAgregar9 = new javax.swing.JButton();
        panelProducto10 = new expo.PanelRound();
        imagen10 = new javax.swing.JButton();
        nombrePro10 = new javax.swing.JLabel();
        precioPro10 = new javax.swing.JLabel();
        btnAgregar10 = new javax.swing.JButton();
        panelProducto11 = new expo.PanelRound();
        imagen11 = new javax.swing.JButton();
        nombrePro11 = new javax.swing.JLabel();
        precioPro11 = new javax.swing.JLabel();
        btnAgregar11 = new javax.swing.JButton();
        panelProducto12 = new expo.PanelRound();
        imagen12 = new javax.swing.JButton();
        nombrePro12 = new javax.swing.JLabel();
        precioPro12 = new javax.swing.JLabel();
        btnAgregar12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(220, 225, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(130, 700));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MercadoSmart.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setPreferredSize(new java.awt.Dimension(109, 20));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo Sol Carrito.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusable(false);

        panelComprar.setBackground(new java.awt.Color(254, 192, 5));
        panelComprar.setPreferredSize(new java.awt.Dimension(110, 110));
        panelComprar.setRoundBottomLeft(10);
        panelComprar.setRoundBottomRight(10);
        panelComprar.setRoundTopLeft(10);
        panelComprar.setRoundTopRight(10);
        panelComprar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basket.png"))); // NOI18N
        btnComprar.setBorder(null);
        btnComprar.setBorderPainted(false);
        btnComprar.setContentAreaFilled(false);
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnComprar.setFocusable(false);
        panelComprar.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 110, -1));

        labelComprar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        labelComprar.setForeground(new java.awt.Color(53, 126, 195));
        labelComprar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelComprar.setText("Comprar");
        panelComprar.add(labelComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 110, -1));

        panelInfo.setBackground(new java.awt.Color(255, 255, 255));
        panelInfo.setPreferredSize(new java.awt.Dimension(110, 110));
        panelInfo.setRoundBottomLeft(10);
        panelInfo.setRoundBottomRight(10);
        panelInfo.setRoundTopLeft(10);
        panelInfo.setRoundTopRight(10);
        panelInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/members.png"))); // NOI18N
        btnInfo.setBorder(null);
        btnInfo.setBorderPainted(false);
        btnInfo.setContentAreaFilled(false);
        btnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfo.setFocusable(false);
        btnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInfoMouseClicked(evt);
            }
        });
        panelInfo.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 110, -1));

        labelInfo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        labelInfo.setForeground(new java.awt.Color(53, 126, 195));
        labelInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInfo.setText("Información");
        labelInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelInfoMouseClicked(evt);
            }
        });
        panelInfo.add(labelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 110, 30));

        panelCerrar.setBackground(new java.awt.Color(255, 255, 255));
        panelCerrar.setPreferredSize(new java.awt.Dimension(110, 110));
        panelCerrar.setRoundBottomLeft(10);
        panelCerrar.setRoundBottomRight(10);
        panelCerrar.setRoundTopLeft(10);
        panelCerrar.setRoundTopRight(10);
        panelCerrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signout.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setFocusable(false);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        panelCerrar.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 110, -1));

        labelCerrar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        labelCerrar.setForeground(new java.awt.Color(53, 126, 195));
        labelCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCerrar.setText("Cerrar sesión");
        labelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCerrarMouseClicked(evt);
            }
        });
        panelCerrar.add(labelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 110, 20));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(599, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 710));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setPreferredSize(new java.awt.Dimension(300, 660));
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);

        scrollPaneCarrito.setBackground(new java.awt.Color(255, 255, 255));
        scrollPaneCarrito.setBorder(null);
        scrollPaneCarrito.setForeground(new java.awt.Color(0, 0, 0));
        scrollPaneCarrito.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneCarrito.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jLabel25.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(53, 126, 195));
        jLabel25.setText("Mi carrito");

        panelRound14.setBackground(new java.awt.Color(53, 126, 195));
        panelRound14.setForeground(new java.awt.Color(255, 255, 255));
        panelRound14.setPreferredSize(new java.awt.Dimension(260, 35));
        panelRound14.setRoundBottomLeft(10);
        panelRound14.setRoundBottomRight(10);
        panelRound14.setRoundTopLeft(10);
        panelRound14.setRoundTopRight(10);

        jLabel27.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Continuar con la compra");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelRound14Layout = new javax.swing.GroupLayout(panelRound14);
        panelRound14.setLayout(panelRound14Layout);
        panelRound14Layout.setHorizontalGroup(
            panelRound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        panelRound14Layout.setVerticalGroup(
            panelRound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carritoSolo.png"))); // NOI18N
        jButton15.setBorder(null);
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setFocusable(false);

        jLabel28.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(53, 126, 195));
        jLabel28.setText("Subtotal");

        jLabel29.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(53, 126, 195));
        jLabel29.setText("Total");

        jLabel30.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(53, 126, 195));
        jLabel30.setText("Descuento");

        labelDescuento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelDescuento.setForeground(new java.awt.Color(0, 0, 0));
        labelDescuento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDescuento.setText("- $0.00");

        labelSubtotal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        labelSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelSubtotal.setText("$0.00");

        labelTotal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(0, 0, 0));
        labelTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTotal.setText("$0.00");

        btnVaciar.setBackground(new java.awt.Color(255, 255, 255));
        btnVaciar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnVaciar.setForeground(new java.awt.Color(254, 192, 5));
        btnVaciar.setText("Vaciar");
        btnVaciar.setBorder(null);
        btnVaciar.setContentAreaFilled(false);
        btnVaciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addComponent(scrollPaneCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVaciar)
                .addGap(20, 20, 20))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTotal))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelDescuento))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelSubtotal))
                    .addComponent(panelRound14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(btnVaciar))))
                .addGap(1, 1, 1)
                .addComponent(scrollPaneCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(labelSubtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(labelDescuento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(labelTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(panelRound14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, 650));

        panelProducto4.setBackground(new java.awt.Color(255, 255, 255));
        panelProducto4.setPreferredSize(new java.awt.Dimension(140, 210));
        panelProducto4.setRoundBottomLeft(10);
        panelProducto4.setRoundBottomRight(10);
        panelProducto4.setRoundTopLeft(10);
        panelProducto4.setRoundTopRight(10);

        imagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/100x100png.png"))); // NOI18N
        imagen4.setBorder(null);
        imagen4.setBorderPainted(false);
        imagen4.setContentAreaFilled(false);
        imagen4.setFocusable(false);

        nombrePro4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombrePro4.setForeground(new java.awt.Color(0, 0, 0));
        nombrePro4.setText("<html>Nombre de producto largo4<html>");

        precioPro4.setBackground(new java.awt.Color(255, 255, 255));
        precioPro4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precioPro4.setForeground(new java.awt.Color(0, 0, 0));
        precioPro4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precioPro4.setText("$0.00");

        btnAgregar4.setBackground(new java.awt.Color(53, 126, 195));
        btnAgregar4.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAgregar4.setForeground(new java.awt.Color(254, 192, 5));
        btnAgregar4.setText("+");
        btnAgregar4.setBorder(null);
        btnAgregar4.setBorderPainted(false);
        btnAgregar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar4.setFocusable(false);
        btnAgregar4.setPreferredSize(new java.awt.Dimension(20, 20));
        btnAgregar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProducto4Layout = new javax.swing.GroupLayout(panelProducto4);
        panelProducto4.setLayout(panelProducto4Layout);
        panelProducto4Layout.setHorizontalGroup(
            panelProducto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen4, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProducto4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelProducto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombrePro4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProducto4Layout.createSequentialGroup()
                        .addComponent(precioPro4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        panelProducto4Layout.setVerticalGroup(
            panelProducto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imagen4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePro4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProducto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioPro4)
                    .addComponent(btnAgregar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(panelProducto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        panelProducto1.setBackground(new java.awt.Color(255, 255, 255));
        panelProducto1.setPreferredSize(new java.awt.Dimension(140, 210));
        panelProducto1.setRoundBottomLeft(10);
        panelProducto1.setRoundBottomRight(10);
        panelProducto1.setRoundTopLeft(10);
        panelProducto1.setRoundTopRight(10);

        imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/100x100png.png"))); // NOI18N
        imagen1.setBorder(null);
        imagen1.setBorderPainted(false);
        imagen1.setContentAreaFilled(false);
        imagen1.setFocusable(false);

        nombrePro1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombrePro1.setForeground(new java.awt.Color(0, 0, 0));
        nombrePro1.setText("<html>Nombre de producto largo1<html>");

        precioPro1.setBackground(new java.awt.Color(255, 255, 255));
        precioPro1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precioPro1.setForeground(new java.awt.Color(0, 0, 0));
        precioPro1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precioPro1.setText("$0.00");

        btnAgregar1.setBackground(new java.awt.Color(53, 126, 195));
        btnAgregar1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAgregar1.setForeground(new java.awt.Color(254, 192, 5));
        btnAgregar1.setText("+");
        btnAgregar1.setBorder(null);
        btnAgregar1.setBorderPainted(false);
        btnAgregar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar1.setFocusable(false);
        btnAgregar1.setPreferredSize(new java.awt.Dimension(20, 20));
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProducto1Layout = new javax.swing.GroupLayout(panelProducto1);
        panelProducto1.setLayout(panelProducto1Layout);
        panelProducto1Layout.setHorizontalGroup(
            panelProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelProducto1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProducto1Layout.createSequentialGroup()
                        .addComponent(precioPro1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nombrePro1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelProducto1Layout.setVerticalGroup(
            panelProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imagen1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePro1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioPro1)
                    .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(panelProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        panelProducto2.setBackground(new java.awt.Color(255, 255, 255));
        panelProducto2.setPreferredSize(new java.awt.Dimension(140, 210));
        panelProducto2.setRoundBottomLeft(10);
        panelProducto2.setRoundBottomRight(10);
        panelProducto2.setRoundTopLeft(10);
        panelProducto2.setRoundTopRight(10);

        imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/100x100png.png"))); // NOI18N
        imagen2.setBorder(null);
        imagen2.setBorderPainted(false);
        imagen2.setContentAreaFilled(false);
        imagen2.setFocusable(false);

        nombrePro2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombrePro2.setForeground(new java.awt.Color(0, 0, 0));
        nombrePro2.setText("<html>Nombre de producto largo2<html>");

        precioPro2.setBackground(new java.awt.Color(255, 255, 255));
        precioPro2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precioPro2.setForeground(new java.awt.Color(0, 0, 0));
        precioPro2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precioPro2.setText("$0.00");

        btnAgregar2.setBackground(new java.awt.Color(53, 126, 195));
        btnAgregar2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAgregar2.setForeground(new java.awt.Color(254, 192, 5));
        btnAgregar2.setText("+");
        btnAgregar2.setBorder(null);
        btnAgregar2.setBorderPainted(false);
        btnAgregar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar2.setFocusable(false);
        btnAgregar2.setPreferredSize(new java.awt.Dimension(20, 20));
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProducto2Layout = new javax.swing.GroupLayout(panelProducto2);
        panelProducto2.setLayout(panelProducto2Layout);
        panelProducto2Layout.setHorizontalGroup(
            panelProducto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProducto2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelProducto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombrePro2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProducto2Layout.createSequentialGroup()
                        .addComponent(precioPro2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        panelProducto2Layout.setVerticalGroup(
            panelProducto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imagen2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePro2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProducto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioPro2)
                    .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(panelProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        panelProducto3.setBackground(new java.awt.Color(255, 255, 255));
        panelProducto3.setPreferredSize(new java.awt.Dimension(140, 210));
        panelProducto3.setRoundBottomLeft(10);
        panelProducto3.setRoundBottomRight(10);
        panelProducto3.setRoundTopLeft(10);
        panelProducto3.setRoundTopRight(10);

        imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/100x100png.png"))); // NOI18N
        imagen3.setBorder(null);
        imagen3.setBorderPainted(false);
        imagen3.setContentAreaFilled(false);
        imagen3.setFocusable(false);

        nombrePro3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombrePro3.setForeground(new java.awt.Color(0, 0, 0));
        nombrePro3.setText("<html>Nombre de producto largo3<html>");

        precioPro3.setBackground(new java.awt.Color(255, 255, 255));
        precioPro3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precioPro3.setForeground(new java.awt.Color(0, 0, 0));
        precioPro3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precioPro3.setText("$0.00");

        btnAgregar3.setBackground(new java.awt.Color(53, 126, 195));
        btnAgregar3.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAgregar3.setForeground(new java.awt.Color(254, 192, 5));
        btnAgregar3.setText("+");
        btnAgregar3.setBorder(null);
        btnAgregar3.setBorderPainted(false);
        btnAgregar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar3.setFocusable(false);
        btnAgregar3.setPreferredSize(new java.awt.Dimension(20, 20));
        btnAgregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProducto3Layout = new javax.swing.GroupLayout(panelProducto3);
        panelProducto3.setLayout(panelProducto3Layout);
        panelProducto3Layout.setHorizontalGroup(
            panelProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
            .addGroup(panelProducto3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombrePro3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProducto3Layout.createSequentialGroup()
                        .addComponent(precioPro3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProducto3Layout.setVerticalGroup(
            panelProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imagen3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePro3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProducto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioPro3)
                    .addComponent(btnAgregar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(panelProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        panelProducto5.setBackground(new java.awt.Color(255, 255, 255));
        panelProducto5.setPreferredSize(new java.awt.Dimension(140, 210));
        panelProducto5.setRoundBottomLeft(10);
        panelProducto5.setRoundBottomRight(10);
        panelProducto5.setRoundTopLeft(10);
        panelProducto5.setRoundTopRight(10);

        imagen5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/100x100png.png"))); // NOI18N
        imagen5.setBorder(null);
        imagen5.setBorderPainted(false);
        imagen5.setContentAreaFilled(false);
        imagen5.setFocusable(false);

        nombrePro5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombrePro5.setForeground(new java.awt.Color(0, 0, 0));
        nombrePro5.setText("<html>Nombre de producto largo5<html>");

        precioPro5.setBackground(new java.awt.Color(255, 255, 255));
        precioPro5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precioPro5.setForeground(new java.awt.Color(0, 0, 0));
        precioPro5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precioPro5.setText("$0.00");

        btnAgregar5.setBackground(new java.awt.Color(53, 126, 195));
        btnAgregar5.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAgregar5.setForeground(new java.awt.Color(254, 192, 5));
        btnAgregar5.setText("+");
        btnAgregar5.setBorder(null);
        btnAgregar5.setBorderPainted(false);
        btnAgregar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar5.setFocusable(false);
        btnAgregar5.setPreferredSize(new java.awt.Dimension(20, 20));
        btnAgregar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProducto5Layout = new javax.swing.GroupLayout(panelProducto5);
        panelProducto5.setLayout(panelProducto5Layout);
        panelProducto5Layout.setHorizontalGroup(
            panelProducto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen5, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProducto5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelProducto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombrePro5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProducto5Layout.createSequentialGroup()
                        .addComponent(precioPro5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        panelProducto5Layout.setVerticalGroup(
            panelProducto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imagen5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePro5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProducto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioPro5)
                    .addComponent(btnAgregar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(panelProducto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        panelProducto6.setBackground(new java.awt.Color(255, 255, 255));
        panelProducto6.setPreferredSize(new java.awt.Dimension(140, 210));
        panelProducto6.setRoundBottomLeft(10);
        panelProducto6.setRoundBottomRight(10);
        panelProducto6.setRoundTopLeft(10);
        panelProducto6.setRoundTopRight(10);

        imagen6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/100x100png.png"))); // NOI18N
        imagen6.setBorder(null);
        imagen6.setBorderPainted(false);
        imagen6.setContentAreaFilled(false);
        imagen6.setFocusable(false);

        nombrePro6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombrePro6.setForeground(new java.awt.Color(0, 0, 0));
        nombrePro6.setText("<html>Nombre de producto largo6<html>");

        precioPro6.setBackground(new java.awt.Color(255, 255, 255));
        precioPro6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precioPro6.setForeground(new java.awt.Color(0, 0, 0));
        precioPro6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precioPro6.setText("$0.00");

        btnAgregar6.setBackground(new java.awt.Color(53, 126, 195));
        btnAgregar6.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAgregar6.setForeground(new java.awt.Color(254, 192, 5));
        btnAgregar6.setText("+");
        btnAgregar6.setBorder(null);
        btnAgregar6.setBorderPainted(false);
        btnAgregar6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar6.setFocusable(false);
        btnAgregar6.setPreferredSize(new java.awt.Dimension(20, 20));
        btnAgregar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProducto6Layout = new javax.swing.GroupLayout(panelProducto6);
        panelProducto6.setLayout(panelProducto6Layout);
        panelProducto6Layout.setHorizontalGroup(
            panelProducto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen6, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelProducto6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelProducto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombrePro6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProducto6Layout.createSequentialGroup()
                        .addComponent(precioPro6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProducto6Layout.setVerticalGroup(
            panelProducto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imagen6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePro6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProducto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioPro6)
                    .addComponent(btnAgregar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(panelProducto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        panelProducto7.setBackground(new java.awt.Color(255, 255, 255));
        panelProducto7.setPreferredSize(new java.awt.Dimension(140, 210));
        panelProducto7.setRoundBottomLeft(10);
        panelProducto7.setRoundBottomRight(10);
        panelProducto7.setRoundTopLeft(10);
        panelProducto7.setRoundTopRight(10);

        imagen7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/100x100png.png"))); // NOI18N
        imagen7.setBorder(null);
        imagen7.setBorderPainted(false);
        imagen7.setContentAreaFilled(false);
        imagen7.setFocusable(false);

        nombrePro7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombrePro7.setForeground(new java.awt.Color(0, 0, 0));
        nombrePro7.setText("<html>Nombre de producto largo7<html>");

        precioPro7.setBackground(new java.awt.Color(255, 255, 255));
        precioPro7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precioPro7.setForeground(new java.awt.Color(0, 0, 0));
        precioPro7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precioPro7.setText("$0.00");

        btnAgregar7.setBackground(new java.awt.Color(53, 126, 195));
        btnAgregar7.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAgregar7.setForeground(new java.awt.Color(254, 192, 5));
        btnAgregar7.setText("+");
        btnAgregar7.setBorder(null);
        btnAgregar7.setBorderPainted(false);
        btnAgregar7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar7.setFocusable(false);
        btnAgregar7.setPreferredSize(new java.awt.Dimension(20, 20));
        btnAgregar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProducto7Layout = new javax.swing.GroupLayout(panelProducto7);
        panelProducto7.setLayout(panelProducto7Layout);
        panelProducto7Layout.setHorizontalGroup(
            panelProducto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen7, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelProducto7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelProducto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombrePro7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProducto7Layout.createSequentialGroup()
                        .addComponent(precioPro7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProducto7Layout.setVerticalGroup(
            panelProducto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imagen7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePro7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProducto7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioPro7)
                    .addComponent(btnAgregar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(panelProducto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        panelProducto8.setBackground(new java.awt.Color(255, 255, 255));
        panelProducto8.setPreferredSize(new java.awt.Dimension(140, 210));
        panelProducto8.setRoundBottomLeft(10);
        panelProducto8.setRoundBottomRight(10);
        panelProducto8.setRoundTopLeft(10);
        panelProducto8.setRoundTopRight(10);

        imagen8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/100x100png.png"))); // NOI18N
        imagen8.setBorder(null);
        imagen8.setBorderPainted(false);
        imagen8.setContentAreaFilled(false);
        imagen8.setFocusable(false);

        nombrePro8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombrePro8.setForeground(new java.awt.Color(0, 0, 0));
        nombrePro8.setText("<html>Nombre de producto largo8<html>");

        precioPro8.setBackground(new java.awt.Color(255, 255, 255));
        precioPro8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precioPro8.setForeground(new java.awt.Color(0, 0, 0));
        precioPro8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precioPro8.setText("$0.00");

        btnAgregar8.setBackground(new java.awt.Color(53, 126, 195));
        btnAgregar8.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAgregar8.setForeground(new java.awt.Color(254, 192, 5));
        btnAgregar8.setText("+");
        btnAgregar8.setBorder(null);
        btnAgregar8.setBorderPainted(false);
        btnAgregar8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar8.setFocusable(false);
        btnAgregar8.setPreferredSize(new java.awt.Dimension(20, 20));
        btnAgregar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProducto8Layout = new javax.swing.GroupLayout(panelProducto8);
        panelProducto8.setLayout(panelProducto8Layout);
        panelProducto8Layout.setHorizontalGroup(
            panelProducto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen8, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelProducto8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelProducto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombrePro8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProducto8Layout.createSequentialGroup()
                        .addComponent(precioPro8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProducto8Layout.setVerticalGroup(
            panelProducto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imagen8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePro8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProducto8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioPro8)
                    .addComponent(btnAgregar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(panelProducto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, -1));

        panelProducto9.setBackground(new java.awt.Color(255, 255, 255));
        panelProducto9.setPreferredSize(new java.awt.Dimension(140, 210));
        panelProducto9.setRoundBottomLeft(10);
        panelProducto9.setRoundBottomRight(10);
        panelProducto9.setRoundTopLeft(10);
        panelProducto9.setRoundTopRight(10);

        imagen9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/100x100png.png"))); // NOI18N
        imagen9.setBorder(null);
        imagen9.setBorderPainted(false);
        imagen9.setContentAreaFilled(false);
        imagen9.setFocusable(false);

        nombrePro9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombrePro9.setForeground(new java.awt.Color(0, 0, 0));
        nombrePro9.setText("<html>Nombre de producto largo9<html>");

        precioPro9.setBackground(new java.awt.Color(255, 255, 255));
        precioPro9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precioPro9.setForeground(new java.awt.Color(0, 0, 0));
        precioPro9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precioPro9.setText("$0.00");

        btnAgregar9.setBackground(new java.awt.Color(53, 126, 195));
        btnAgregar9.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAgregar9.setForeground(new java.awt.Color(254, 192, 5));
        btnAgregar9.setText("+");
        btnAgregar9.setBorder(null);
        btnAgregar9.setBorderPainted(false);
        btnAgregar9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar9.setFocusable(false);
        btnAgregar9.setPreferredSize(new java.awt.Dimension(20, 20));
        btnAgregar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProducto9Layout = new javax.swing.GroupLayout(panelProducto9);
        panelProducto9.setLayout(panelProducto9Layout);
        panelProducto9Layout.setHorizontalGroup(
            panelProducto9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen9, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelProducto9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelProducto9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombrePro9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProducto9Layout.createSequentialGroup()
                        .addComponent(precioPro9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProducto9Layout.setVerticalGroup(
            panelProducto9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imagen9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePro9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProducto9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioPro9)
                    .addComponent(btnAgregar9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(panelProducto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        panelProducto10.setBackground(new java.awt.Color(255, 255, 255));
        panelProducto10.setPreferredSize(new java.awt.Dimension(140, 210));
        panelProducto10.setRoundBottomLeft(10);
        panelProducto10.setRoundBottomRight(10);
        panelProducto10.setRoundTopLeft(10);
        panelProducto10.setRoundTopRight(10);

        imagen10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/100x100png.png"))); // NOI18N
        imagen10.setBorder(null);
        imagen10.setBorderPainted(false);
        imagen10.setContentAreaFilled(false);
        imagen10.setFocusable(false);

        nombrePro10.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombrePro10.setForeground(new java.awt.Color(0, 0, 0));
        nombrePro10.setText("<html>Nombre de producto largo10<html>");

        precioPro10.setBackground(new java.awt.Color(255, 255, 255));
        precioPro10.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precioPro10.setForeground(new java.awt.Color(0, 0, 0));
        precioPro10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precioPro10.setText("$0.00");

        btnAgregar10.setBackground(new java.awt.Color(53, 126, 195));
        btnAgregar10.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAgregar10.setForeground(new java.awt.Color(254, 192, 5));
        btnAgregar10.setText("+");
        btnAgregar10.setBorder(null);
        btnAgregar10.setBorderPainted(false);
        btnAgregar10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar10.setFocusable(false);
        btnAgregar10.setPreferredSize(new java.awt.Dimension(20, 20));
        btnAgregar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProducto10Layout = new javax.swing.GroupLayout(panelProducto10);
        panelProducto10.setLayout(panelProducto10Layout);
        panelProducto10Layout.setHorizontalGroup(
            panelProducto10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen10, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelProducto10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelProducto10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombrePro10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProducto10Layout.createSequentialGroup()
                        .addComponent(precioPro10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProducto10Layout.setVerticalGroup(
            panelProducto10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imagen10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePro10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProducto10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioPro10)
                    .addComponent(btnAgregar10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(panelProducto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, -1));

        panelProducto11.setBackground(new java.awt.Color(255, 255, 255));
        panelProducto11.setPreferredSize(new java.awt.Dimension(140, 210));
        panelProducto11.setRoundBottomLeft(10);
        panelProducto11.setRoundBottomRight(10);
        panelProducto11.setRoundTopLeft(10);
        panelProducto11.setRoundTopRight(10);

        imagen11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/100x100png.png"))); // NOI18N
        imagen11.setBorder(null);
        imagen11.setBorderPainted(false);
        imagen11.setContentAreaFilled(false);
        imagen11.setFocusable(false);

        nombrePro11.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombrePro11.setForeground(new java.awt.Color(0, 0, 0));
        nombrePro11.setText("<html>Nombre de producto largo11<html>");

        precioPro11.setBackground(new java.awt.Color(255, 255, 255));
        precioPro11.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precioPro11.setForeground(new java.awt.Color(0, 0, 0));
        precioPro11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precioPro11.setText("$0.00");

        btnAgregar11.setBackground(new java.awt.Color(53, 126, 195));
        btnAgregar11.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAgregar11.setForeground(new java.awt.Color(254, 192, 5));
        btnAgregar11.setText("+");
        btnAgregar11.setBorder(null);
        btnAgregar11.setBorderPainted(false);
        btnAgregar11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar11.setFocusable(false);
        btnAgregar11.setPreferredSize(new java.awt.Dimension(20, 20));
        btnAgregar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProducto11Layout = new javax.swing.GroupLayout(panelProducto11);
        panelProducto11.setLayout(panelProducto11Layout);
        panelProducto11Layout.setHorizontalGroup(
            panelProducto11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen11, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelProducto11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelProducto11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombrePro11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProducto11Layout.createSequentialGroup()
                        .addComponent(precioPro11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProducto11Layout.setVerticalGroup(
            panelProducto11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imagen11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePro11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProducto11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioPro11)
                    .addComponent(btnAgregar11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(panelProducto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, -1));

        panelProducto12.setBackground(new java.awt.Color(255, 255, 255));
        panelProducto12.setPreferredSize(new java.awt.Dimension(140, 210));
        panelProducto12.setRoundBottomLeft(10);
        panelProducto12.setRoundBottomRight(10);
        panelProducto12.setRoundTopLeft(10);
        panelProducto12.setRoundTopRight(10);

        imagen12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/100x100png.png"))); // NOI18N
        imagen12.setBorder(null);
        imagen12.setBorderPainted(false);
        imagen12.setContentAreaFilled(false);
        imagen12.setFocusable(false);

        nombrePro12.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombrePro12.setForeground(new java.awt.Color(0, 0, 0));
        nombrePro12.setText("<html>Nombre de producto largo12<html>");

        precioPro12.setBackground(new java.awt.Color(255, 255, 255));
        precioPro12.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precioPro12.setForeground(new java.awt.Color(0, 0, 0));
        precioPro12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precioPro12.setText("$0.00");

        btnAgregar12.setBackground(new java.awt.Color(53, 126, 195));
        btnAgregar12.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAgregar12.setForeground(new java.awt.Color(254, 192, 5));
        btnAgregar12.setText("+");
        btnAgregar12.setBorder(null);
        btnAgregar12.setBorderPainted(false);
        btnAgregar12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar12.setFocusable(false);
        btnAgregar12.setPreferredSize(new java.awt.Dimension(20, 20));
        btnAgregar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProducto12Layout = new javax.swing.GroupLayout(panelProducto12);
        panelProducto12.setLayout(panelProducto12Layout);
        panelProducto12Layout.setHorizontalGroup(
            panelProducto12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen12, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelProducto12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelProducto12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombrePro12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProducto12Layout.createSequentialGroup()
                        .addComponent(precioPro12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProducto12Layout.setVerticalGroup(
            panelProducto12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProducto12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imagen12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePro12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProducto12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioPro12)
                    .addComponent(btnAgregar12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(panelProducto12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //BOTONES BARRA LATERAL//
    
    private void btnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseClicked
        
    }//GEN-LAST:event_btnInfoMouseClicked

    private void labelInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInfoMouseClicked
        
    }//GEN-LAST:event_labelInfoMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void labelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseClicked
        
    }//GEN-LAST:event_labelCerrarMouseClicked

    //BOTONES AGREGAR AL CARRITO
    
    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        String nombre = nombrePro1.getText();
        String pre=precioPro1.getText().substring(1, precioPro1.getText().length());
        float precio = Float.parseFloat(pre);
        
        agregarProductoAlCarrito(nombre, precio);
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        String nombre = nombrePro2.getText();
        String pre=precioPro2.getText().substring(1, precioPro2.getText().length());
        float precio = Float.parseFloat(pre);
        
        agregarProductoAlCarrito(nombre, precio);
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void btnAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar3ActionPerformed
        String nombre = nombrePro3.getText();
        String pre=precioPro3.getText().substring(1, precioPro3.getText().length());
        float precio = Float.parseFloat(pre);
        
        agregarProductoAlCarrito(nombre, precio);
    }//GEN-LAST:event_btnAgregar3ActionPerformed

    private void btnAgregar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar4ActionPerformed
        String nombre = nombrePro4.getText();
        String pre=precioPro4.getText().substring(1, precioPro4.getText().length());
        float precio = Float.parseFloat(pre);
        
        agregarProductoAlCarrito(nombre, precio);
    }//GEN-LAST:event_btnAgregar4ActionPerformed

    private void btnAgregar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar5ActionPerformed
        String nombre = nombrePro5.getText();
        String pre=precioPro5.getText().substring(1, precioPro5.getText().length());
        float precio = Float.parseFloat(pre);
        
        agregarProductoAlCarrito(nombre, precio);
    }//GEN-LAST:event_btnAgregar5ActionPerformed

    private void btnAgregar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar6ActionPerformed
        String nombre = nombrePro6.getText();
        String pre=precioPro6.getText().substring(1, precioPro6.getText().length());
        float precio = Float.parseFloat(pre);
        
        agregarProductoAlCarrito(nombre, precio);
    }//GEN-LAST:event_btnAgregar6ActionPerformed

    private void btnAgregar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar7ActionPerformed
        String nombre = nombrePro7.getText();
        String pre=precioPro7.getText().substring(1, precioPro7.getText().length());
        float precio = Float.parseFloat(pre);
        
        agregarProductoAlCarrito(nombre, precio);
    }//GEN-LAST:event_btnAgregar7ActionPerformed

    private void btnAgregar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar8ActionPerformed
        String nombre = nombrePro8.getText();
        String pre=precioPro8.getText().substring(1, precioPro8.getText().length());
        float precio = Float.parseFloat(pre);
        
        agregarProductoAlCarrito(nombre, precio);
    }//GEN-LAST:event_btnAgregar8ActionPerformed

    private void btnAgregar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar9ActionPerformed
        String nombre = nombrePro9.getText();
        String pre=precioPro9.getText().substring(1, precioPro9.getText().length());
        float precio = Float.parseFloat(pre);
        
        agregarProductoAlCarrito(nombre, precio);
    }//GEN-LAST:event_btnAgregar9ActionPerformed

    private void btnAgregar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar10ActionPerformed
        String nombre = nombrePro10.getText();
        String pre=precioPro10.getText().substring(1, precioPro10.getText().length());
        float precio = Float.parseFloat(pre);
        
        agregarProductoAlCarrito(nombre, precio);
    }//GEN-LAST:event_btnAgregar10ActionPerformed

    private void btnAgregar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar11ActionPerformed
        String nombre = nombrePro11.getText();
        String pre=precioPro11.getText().substring(1, precioPro11.getText().length());
        float precio = Float.parseFloat(pre);
        
        agregarProductoAlCarrito(nombre, precio);
    }//GEN-LAST:event_btnAgregar11ActionPerformed

    private void btnAgregar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar12ActionPerformed
        String nombre = nombrePro12.getText();
        String pre=precioPro12.getText().substring(1, precioPro12.getText().length());
        float precio = Float.parseFloat(pre);
        
        agregarProductoAlCarrito(nombre, precio);
    }//GEN-LAST:event_btnAgregar12ActionPerformed
    
public void agregarProductoAlCarrito(String nombre, float precio) {
    
// Verificar si el producto ya está en el carrito
    if (productosEnCarrito.containsKey(nombre)) {
        // Si ya está en el carrito, incrementar la cantidad del spinner
        JSpinner spinner = productosEnCarrito.get(nombre);
        spinner.setValue((int) spinner.getValue() + 1); // Incrementar en 1
    } else {
        // Si no está en el carrito, crear un nuevo panel de producto
        JPanel productoPanel = new JPanel();
        productoPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // Ajustar el layout para mantener alineación

        // Establecer el tamaño preferido del panel del producto
        productoPanel.setPreferredSize(new java.awt.Dimension(300, 65)); // Ancho: 280, Alto: 65
        productoPanel.setMaximumSize(new java.awt.Dimension(300, 65)); // Evitar que cambie de tamaño
        productoPanel.setBackground(Color.WHITE);

        // Crear los componentes del producto
        JLabel paddin = new JLabel("");
        paddin.setPreferredSize(new java.awt.Dimension(15, 47)); // Ancho: 100, Alto: 47
        JLabel nombreProducto = new JLabel(nombre);
        nombreProducto.setPreferredSize(new java.awt.Dimension(100, 47)); // Ancho: 100, Alto: 47
        nombreProducto.setMaximumSize(new java.awt.Dimension(100, 47)); // Evitar que cambie de tamaño
        JSpinner cantidadSpinner = new JSpinner(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        DecimalFormat dosDecimales = new DecimalFormat("#.##");
        dosDecimales.format(precio);
        String precioFloat = Float.toString(precio);
        JLabel precioLabel = new JLabel("$" + precioFloat);
        precioLabel.setPreferredSize(new java.awt.Dimension(50, 47)); // Ancho: 100, Alto: 47
        JButton eliminarButton = new JButton();
        eliminarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarButton.setPreferredSize(new java.awt.Dimension(20, 20));
        eliminarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash.png")));
        eliminarButton.setBorder(null);
        eliminarButton.setBorderPainted(false);
        eliminarButton.setContentAreaFilled(false);
        eliminarButton.setFocusable(false);

        // Listener para actualizar el precio al cambiar la cantidad
        cantidadSpinner.addChangeListener(e -> {
            int cantidad = (int) cantidadSpinner.getValue();
            Float precioTotal = cantidad * precio;
            precioLabel.setText("$" + dosDecimales.format(precioTotal));
        });

        // Añadir los componentes al panel del producto
        productoPanel.add(paddin);
        productoPanel.add(nombreProducto);
        productoPanel.add(cantidadSpinner);
        productoPanel.add(precioLabel);
        productoPanel.add(eliminarButton);

        // Agregar el panel del producto al panel del carrito
        carritoPanel.add(productoPanel);

        // Actualizar la interfaz gráfica
        carritoPanel.revalidate();
        carritoPanel.repaint();

        // Guardar el producto y su spinner en el HashMap
        productosEnCarrito.put(nombre, cantidadSpinner);

        // Acción para eliminar el producto del carrito
        eliminarButton.addActionListener(e -> {
            carritoPanel.remove(productoPanel);
            productosEnCarrito.remove(nombre); // Eliminar del HashMap
            carritoPanel.revalidate();
            carritoPanel.repaint();
        });
    }
}
    
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
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comprar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar10;
    private javax.swing.JButton btnAgregar11;
    private javax.swing.JButton btnAgregar12;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btnAgregar4;
    private javax.swing.JButton btnAgregar5;
    private javax.swing.JButton btnAgregar6;
    private javax.swing.JButton btnAgregar7;
    private javax.swing.JButton btnAgregar8;
    private javax.swing.JButton btnAgregar9;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JButton imagen1;
    private javax.swing.JButton imagen10;
    private javax.swing.JButton imagen11;
    private javax.swing.JButton imagen12;
    private javax.swing.JButton imagen2;
    private javax.swing.JButton imagen3;
    private javax.swing.JButton imagen4;
    private javax.swing.JButton imagen5;
    private javax.swing.JButton imagen6;
    private javax.swing.JButton imagen7;
    private javax.swing.JButton imagen8;
    private javax.swing.JButton imagen9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelCerrar;
    private javax.swing.JLabel labelComprar;
    private javax.swing.JLabel labelDescuento;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel nombrePro1;
    private javax.swing.JLabel nombrePro10;
    private javax.swing.JLabel nombrePro11;
    private javax.swing.JLabel nombrePro12;
    private javax.swing.JLabel nombrePro2;
    private javax.swing.JLabel nombrePro3;
    private javax.swing.JLabel nombrePro4;
    private javax.swing.JLabel nombrePro5;
    private javax.swing.JLabel nombrePro6;
    private javax.swing.JLabel nombrePro7;
    private javax.swing.JLabel nombrePro8;
    private javax.swing.JLabel nombrePro9;
    private expo.PanelRound panelCerrar;
    private expo.PanelRound panelComprar;
    private expo.PanelRound panelInfo;
    private expo.PanelRound panelProducto1;
    private expo.PanelRound panelProducto10;
    private expo.PanelRound panelProducto11;
    private expo.PanelRound panelProducto12;
    private expo.PanelRound panelProducto2;
    private expo.PanelRound panelProducto3;
    private expo.PanelRound panelProducto4;
    private expo.PanelRound panelProducto5;
    private expo.PanelRound panelProducto6;
    private expo.PanelRound panelProducto7;
    private expo.PanelRound panelProducto8;
    private expo.PanelRound panelProducto9;
    private expo.PanelRound panelRound1;
    private expo.PanelRound panelRound14;
    private javax.swing.JLabel precioPro1;
    private javax.swing.JLabel precioPro10;
    private javax.swing.JLabel precioPro11;
    private javax.swing.JLabel precioPro12;
    private javax.swing.JLabel precioPro2;
    private javax.swing.JLabel precioPro3;
    private javax.swing.JLabel precioPro4;
    private javax.swing.JLabel precioPro5;
    private javax.swing.JLabel precioPro6;
    private javax.swing.JLabel precioPro7;
    private javax.swing.JLabel precioPro8;
    private javax.swing.JLabel precioPro9;
    private javax.swing.JScrollPane scrollPaneCarrito;
    // End of variables declaration//GEN-END:variables
}
