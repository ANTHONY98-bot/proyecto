package Formularios;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pack_clases.productos;

public class frmPedido extends javax.swing.JInternalFrame {

    private String Nombre;

    DefaultTableModel modelo = new DefaultTableModel();

    private void listarCategoria_HAMBURGUESA() {
        cboHamburguesas.addItem("Seleccione");
        cboHamburguesas.addItem("Bic Mac");
        cboHamburguesas.addItem("Doble queso");
        cboHamburguesas.addItem("Royal");
        cboHamburguesas.addItem("Parrillera");
        cboHamburguesas.addItem("A lo Pobre");
        cboHamburguesas.addItem("Doble Carne");
    }

    private void listarCategoria_POLLOBROSTHER() {
        cboPolloBrosther.addItem("Seleccione");
        cboPolloBrosther.addItem("Pecho Brosther");
        cboPolloBrosther.addItem("Muslo Brosther");
        cboPolloBrosther.addItem("Alita Brosther");

    }

    private void listarCategoria_PAPAS() {
        cboPapas.addItem("Seleccione");
        cboPapas.addItem("Papa Regular");
        cboPapas.addItem("Papa Mediana");
        cboPapas.addItem("Papa Familiar");
        cboPapas.addItem("Nuggets");
    }

    private void listarCategoria_POSTRES() {
        cboPostres.addItem("Seleccione");
        cboPostres.addItem("Torta Selva Negra");
        cboPostres.addItem("Torta Tres Leches");
        cboPostres.addItem("Gelatina Copa");
        cboPostres.addItem("Flan Copa");
        cboPostres.addItem("Cono");
        cboPostres.addItem("Super cono");
    }

    private void listarCategoria_BEBIDAS() {

        cboBebidas.addItem("Seleccione");
        cboBebidas.addItem("Coca cola Personal");
        cboBebidas.addItem("Inca Cola Personal ");
        cboBebidas.addItem("Gordita");
        cboBebidas.addItem("Agua");
        cboBebidas.addItem("Coca cola 3L");
        cboBebidas.addItem("Inca Cola 3L");
        cboBebidas.addItem("Chicha 1L");
        cboBebidas.addItem("Maracuya 1L");

    }

    private void listarCategoria_ENSALADAS() {
        cboEnsaladas.addItem("Seleccione");
        cboEnsaladas.addItem("Ensalada mixta");
        cboEnsaladas.addItem("Ensalada Caprese");
        cboEnsaladas.addItem("Ensalada de Manzanas");
        cboEnsaladas.addItem("Ensalada de Frutas");
    }

    private void enviarFichero() {
        /*atrapar posibles errores*/
        try {
            FileWriter fw;
            PrintWriter pw;

            //crear el archivo
            fw = new FileWriter("src/files/Producto.txt", true);
            //escribir el archivo
            pw = new PrintWriter(fw);
            //enviar datos al archivo
            productos obj = new productos();

            obj.setNombre(txtNombre.getText());
            obj.setHamburguesas(cboHamburguesas.getSelectedItem().toString());
            obj.setCantidad_hamburguea(cbocan1.getSelectedIndex());

            obj.setPollo_crujiente(cboPolloBrosther.getSelectedItem().toString());
            obj.setCant_pollo(cbocan2.getSelectedIndex());

            obj.setPapas_complementos(cboPapas.getSelectedItem().toString());
            obj.setCantidad_papas(cbocan3.getSelectedIndex());

            obj.setPostres(cboPostres.getSelectedItem().toString());
            obj.setCantidad_postres(cbocan4.getSelectedIndex());

            obj.setBebidas(cboBebidas.getSelectedItem().toString());
            obj.setCant_bebidas(cbocan5.getSelectedIndex());

            obj.setEnaladas(cboEnsaladas.getSelectedItem().toString());
            obj.setCant_ensaladas(cbocan6.getSelectedIndex());

            pw.println(
                    obj.getNombre() + ";"
                    + obj.getHamburguesas() + ";"
                    + obj.getCantidad_hamburguea() + ";"
                    + obj.getPollo_crujiente() + ";"
                    + obj.getCant_pollo() + ";"
                    + obj.getPapas_complementos() + ";"
                    + obj.getCantidad_papas() + ";"
                    + obj.getPostres() + ";"
                    + obj.getCantidad_postres() + ";"
                    + obj.getBebidas() + ";"
                    + obj.getCant_bebidas() + ";"
                    + obj.getEnaladas() + ";"
                    + obj.getCant_ensaladas() + ";"+
         
                      obj.Importe_Total()       );
            
            //liberar buffer
            pw.close();
            //envia mensaje de exito
            JOptionPane.showMessageDialog(null, "Producto Registrado");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Fichero:\n"
                    + ex.getMessage());
        }

    }

    public frmPedido() {
        initComponents();
        listarCategoria_BEBIDAS();
        listarCategoria_ENSALADAS();
        listarCategoria_HAMBURGUESA();
        listarCategoria_PAPAS();
        listarCategoria_POLLOBROSTHER();

        listarCategoria_POSTRES();
        
     
      

        
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_procesar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JToggleButton();
        btn_eliminar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        rbchica = new javax.swing.JRadioButton();
        rbmediana = new javax.swing.JRadioButton();
        rblarga = new javax.swing.JRadioButton();
        jToolBar1 = new javax.swing.JToolBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboHamburguesas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cboPolloBrosther = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboPapas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cboPostres = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cboBebidas = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cboEnsaladas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtOrden = new javax.swing.JTextArea();
        cbocan1 = new javax.swing.JComboBox<>();
        cbocan2 = new javax.swing.JComboBox<>();
        cbocan3 = new javax.swing.JComboBox<>();
        cbocan4 = new javax.swing.JComboBox<>();
        cbocan5 = new javax.swing.JComboBox<>();
        cbocan6 = new javax.swing.JComboBox<>();
        btnboleta = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNumeroMesa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        btn_procesar.setText("GUARDAR ORDEN");

        btn_limpiar.setText("LIMPIAR ORDEN");

        btn_eliminar.setText("ELIMINAR ORDEN");

        tbl_tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_tabla);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tamaño"));

        rbchica.setText("CHICA");

        rbmediana.setText("MEDIANA");

        rblarga.setText("LARGA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rblarga)
                    .addComponent(rbmediana)
                    .addComponent(rbchica))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbchica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbmediana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rblarga)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jToolBar1.setRollover(true);

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("DON PEPON");
        setVisible(true);

        jPanel2.setBackground(new java.awt.Color(234, 249, 255));
        jPanel2.setFocusCycleRoot(true);
        jPanel2.setFocusTraversalPolicyProvider(true);
        jPanel2.setInheritsPopupMenu(true);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre Cliente :");

        txtNombre.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack_imagenes/hambur.png"))); // NOI18N
        jLabel2.setText(" Hamburguesas :");

        cboHamburguesas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack_imagenes/pollo.png"))); // NOI18N
        jLabel3.setText(" Pollo Brosther :");

        cboPolloBrosther.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack_imagenes/PapasCaja.png"))); // NOI18N
        jLabel4.setText(" Papas :");

        cboPapas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack_imagenes/Postres.png"))); // NOI18N
        jLabel5.setText("Postres :");

        cboPostres.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack_imagenes/bebidas.png"))); // NOI18N
        jLabel6.setText(" Bebidas :");

        cboBebidas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnAgregar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack_imagenes/Guardar.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnRefrescar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack_imagenes/borrar.png"))); // NOI18N
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack_imagenes/Ensaladas.png"))); // NOI18N
        jLabel7.setText("Ensaladas :");

        cboEnsaladas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Cantidad:");

        txtOrden.setColumns(20);
        txtOrden.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtOrden.setForeground(new java.awt.Color(102, 102, 102));
        txtOrden.setRows(5);
        jScrollPane3.setViewportView(txtOrden);

        cbocan1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        cbocan2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        cbocan3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        cbocan4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        cbocan5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        cbocan6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        btnboleta.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 13)); // NOI18N
        btnboleta.setText("BOLETA");
        btnboleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnboletaActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("N° Mesa:");

        txtNumeroMesa.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        txtNumeroMesa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroMesaKeyTyped(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack_imagenes/Don_2.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("_______________________________________________________");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboPapas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboPolloBrosther, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(146, 146, 146)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboPostres, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboEnsaladas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(103, 103, 103)
                                .addComponent(cboHamburguesas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 507, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(42, 42, 42)
                .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbocan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbocan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(138, 138, 138)
                        .addComponent(jLabel8))
                    .addComponent(cbocan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbocan4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbocan5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbocan6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnboleta, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(cboHamburguesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cboPolloBrosther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbocan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel3)))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cboPapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbocan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cbocan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(cboPostres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel5)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(cboBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel6)))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(cboEnsaladas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbocan6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(cbocan4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(cbocan5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar)
                            .addComponent(btnRefrescar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGap(25, 25, 25)
                .addComponent(btnboleta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        cbocan1.setSelectedIndex(0);
        cbocan2.setSelectedIndex(0);
        cbocan3.setSelectedIndex(0);
        cbocan4.setSelectedIndex(0);
        cbocan5.setSelectedIndex(0);
        cbocan6.setSelectedIndex(0);
        txtNombre.setText(null);
        txtOrden.setText(null);
        txtNumeroMesa.setText(null);

        cboHamburguesas.setSelectedIndex(0);
        cboPapas.setSelectedIndex(0);
        cboPolloBrosther.setSelectedIndex(0);
        cboEnsaladas.setSelectedIndex(0);
        cboBebidas.setSelectedIndex(0);
        cboPostres.setSelectedIndex(0);

        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }

        txtNombre.requestFocus();

    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String contenido = "";
        productos obj = new productos();
     

        if (cbocan1.getSelectedIndex() != 0) {
            obj.setHamburguesas(cboHamburguesas.getSelectedItem().toString());
            obj.setCantidad_hamburguea(Integer.parseInt(cbocan1.getSelectedItem().toString()));
            contenido += "Hamburguesa : " + obj.getHamburguesas() + "\n Cantidad    : " + obj.getCantidad_hamburguea();
            contenido += "\n";
        } else {
            obj.setHamburguesas("");
            obj.setCantidad_hamburguea(0);
        }

        if (cbocan2.getSelectedIndex() != 0) {
            obj.setPollo_crujiente(cboPolloBrosther.getSelectedItem().toString());
            obj.setCant_pollo(Integer.parseInt(cbocan2.getSelectedItem().toString()));
            contenido += "Pollo : " + obj.getPollo_crujiente() + "\n Cantidad    : " + obj.getCant_pollo();
            contenido += "\n";
        } else {
            obj.setPollo_crujiente("");
            obj.setCant_pollo(0);
        }

        if (cbocan3.getSelectedIndex() != 0) {
            obj.setPapas_complementos(cboPapas.getSelectedItem().toString());
            obj.setCantidad_papas(cbocan3.getSelectedIndex());
            contenido += " Papas : " + obj.getPapas_complementos() + "\n Cantidad    : " + obj.getCantidad_papas();
            contenido += "\n";
        } else {
            obj.setPapas_complementos("");
            obj.setCantidad_papas(0);
        }

        if (cbocan4.getSelectedIndex() != 0) {
            obj.setPostres(cboPostres.getSelectedItem().toString());
            obj.setCantidad_postres(cbocan4.getSelectedIndex());
            contenido += " Postres : " + obj.getPostres() + "\n Cantidad    : " + obj.getCantidad_postres();
            contenido += "\n";
        } else {
            obj.setPostres("");
            obj.setCantidad_postres(0);
        }

        if (cbocan5.getSelectedIndex() != 0) {
            obj.setBebidas(cboBebidas.getSelectedItem().toString());
            obj.setCant_bebidas(cbocan5.getSelectedIndex());
            contenido += " Bebidas : " + obj.getBebidas() + "\n Cantidad    : " + obj.getCant_bebidas();
            contenido += "\n";
        } else {
            obj.setBebidas("");
            obj.setCant_bebidas(0);
        }

        if (cbocan6.getSelectedIndex() != 0) {
            obj.setEnaladas(cboEnsaladas.getSelectedItem().toString());
            obj.setCant_ensaladas(cbocan6.getSelectedIndex());
            contenido += " Ensaladas : " + obj.getEnaladas() + "\n Cantidad    : " + obj.getCant_ensaladas();
            contenido += "\n";
        } else {
            obj.setEnaladas(cboEnsaladas.getSelectedItem().toString());
            obj.setCant_ensaladas(0);
        }

        contenido += "\n\n IMPORTE A PAGAR : S/ " + obj.Importe_Total();
        
        txtOrden.setText(contenido);

        enviarFichero();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnboletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnboletaActionPerformed

        Boleta_DonPepon btnboleta = new Boleta_DonPepon();
                frmPrincipal.contenedor.add(btnboleta);
        btnboleta.setVisible(true);
        Boleta_DonPepon.txtRecibirCliente.setText(txtNombre.getText());
        Boleta_DonPepon.txtRecibirOrden.setText(txtOrden.getText());
        Boleta_DonPepon.txtRecibirNumero.setText(txtNumeroMesa.getText());



        // TODO add your handling code here:
    }//GEN-LAST:event_btnboletaActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
          char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"INGRESAR SOLO LETRAS");
    }                                  
    
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNumeroMesaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroMesaKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"INGRESAR SOLO NUMEROS");
    }//GEN-LAST:event_txtNumeroMesaKeyTyped
    }
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
            java.util.logging.Logger.getLogger(frmPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JToggleButton btn_eliminar;
    private javax.swing.JToggleButton btn_limpiar;
    private javax.swing.JButton btn_procesar;
    private javax.swing.JButton btnboleta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboBebidas;
    private javax.swing.JComboBox<String> cboEnsaladas;
    private javax.swing.JComboBox<String> cboHamburguesas;
    private javax.swing.JComboBox<String> cboPapas;
    private javax.swing.JComboBox<String> cboPolloBrosther;
    private javax.swing.JComboBox<String> cboPostres;
    private javax.swing.JComboBox<String> cbocan1;
    private javax.swing.JComboBox<String> cbocan2;
    private javax.swing.JComboBox<String> cbocan3;
    private javax.swing.JComboBox<String> cbocan4;
    private javax.swing.JComboBox<String> cbocan5;
    private javax.swing.JComboBox<String> cbocan6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButton rbchica;
    private javax.swing.JRadioButton rblarga;
    private javax.swing.JRadioButton rbmediana;
    private javax.swing.JTable tbl_tabla;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtNumeroMesa;
    public static javax.swing.JTextArea txtOrden;
    // End of variables declaration//GEN-END:variables
}
