/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_delmerizaguirre_progra2;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Owner
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        this.soldados = new ArrayList();
        initComponents();
    }

    private ArrayList soldados;

    public void Cargar() {

        DefaultTreeModel m = (DefaultTreeModel) jt_arbol.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
        raiz.removeAllChildren();
        DefaultMutableTreeNode rusos = new DefaultMutableTreeNode("Soldados Rusos");
        DefaultMutableTreeNode alemanes = new DefaultMutableTreeNode("Soldados Alemanes");
        DefaultMutableTreeNode alumno = new DefaultMutableTreeNode("Alumnos de programacion II");
        for (Object sld : soldados) {
            if (sld instanceof Ruso) {
                DefaultMutableTreeNode nombre = new DefaultMutableTreeNode("Nombre");
                DefaultMutableTreeNode id = new DefaultMutableTreeNode("ID");
                DefaultMutableTreeNode rango = new DefaultMutableTreeNode("Rango");
                DefaultMutableTreeNode edad = new DefaultMutableTreeNode("Edad");
                DefaultMutableTreeNode resistencia = new DefaultMutableTreeNode("Resistencia");
                DefaultMutableTreeNode arma = new DefaultMutableTreeNode("Arma");

                nombre.add(new DefaultMutableTreeNode(((Ruso) sld).getNombre()));
                id.add(new DefaultMutableTreeNode(((Ruso) sld).getID()));
                rango.add(new DefaultMutableTreeNode(((Ruso) sld).getRango()));
                edad.add(new DefaultMutableTreeNode(((Ruso) sld).getEdad()));
                resistencia.add(new DefaultMutableTreeNode(((Ruso) sld).getResistencia()));
                arma.add(new DefaultMutableTreeNode(((Ruso) sld).getArma()));

                DefaultMutableTreeNode soldado = new DefaultMutableTreeNode(sld);

                soldado.add(nombre);
                soldado.add(id);
                soldado.add(rango);
                soldado.add(edad);
                soldado.add(resistencia);
                soldado.add(arma);

                rusos.add(soldado);

            } else if (sld instanceof Aleman) {
                DefaultMutableTreeNode alias = new DefaultMutableTreeNode("Alias");
                DefaultMutableTreeNode casta = new DefaultMutableTreeNode("Casta");
                DefaultMutableTreeNode edad = new DefaultMutableTreeNode("Edad");
                DefaultMutableTreeNode resistencia = new DefaultMutableTreeNode("Resistencia");
                DefaultMutableTreeNode arma = new DefaultMutableTreeNode("Arma");

                alias.add(new DefaultMutableTreeNode(((Aleman) sld).getAlias()));
                casta.add(new DefaultMutableTreeNode(((Aleman) sld).getCasta()));
                edad.add(new DefaultMutableTreeNode(((Aleman) sld).getEdad()));
                resistencia.add(new DefaultMutableTreeNode(((Aleman) sld).getResistencia()));
                arma.add(new DefaultMutableTreeNode(((Aleman) sld).getArma()));

                DefaultMutableTreeNode soldado = new DefaultMutableTreeNode(sld);

                soldado.add(alias);
                soldado.add(casta);
                soldado.add(edad);
                soldado.add(resistencia);
                soldado.add(arma);

                alemanes.add(soldado);

            } else {
                DefaultMutableTreeNode apodo = new DefaultMutableTreeNode("Apodo");
                DefaultMutableTreeNode numerocuenta = new DefaultMutableTreeNode("Numero de Cuenta");
                DefaultMutableTreeNode GradoA = new DefaultMutableTreeNode("Grado Academico");
                DefaultMutableTreeNode edad = new DefaultMutableTreeNode("Edad");
                DefaultMutableTreeNode resistencia = new DefaultMutableTreeNode("Resistencia");
                DefaultMutableTreeNode arma = new DefaultMutableTreeNode("Arma");

                apodo.add(new DefaultMutableTreeNode(((AlumnoProgra2) sld).getApodo()));
                numerocuenta.add(new DefaultMutableTreeNode(((AlumnoProgra2) sld).getNumeroCuenta()));
                GradoA.add(new DefaultMutableTreeNode(((AlumnoProgra2) sld).getResistencia()));
                edad.add(new DefaultMutableTreeNode(((AlumnoProgra2) sld).getEdad()));
                resistencia.add(new DefaultMutableTreeNode(((AlumnoProgra2) sld).getResistencia()));
                arma.add(new DefaultMutableTreeNode(((AlumnoProgra2) sld).getArma()));

                DefaultMutableTreeNode soldado = new DefaultMutableTreeNode(sld);

                soldado.add(apodo);
                soldado.add(numerocuenta);
                soldado.add(GradoA);
                soldado.add(edad);
                soldado.add(resistencia);
                soldado.add(arma);

                alumno.add(soldado);

            }

        }
        raiz.add(rusos);
        raiz.add(alumno);
        raiz.add(alemanes);

        m.reload();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_popup = new javax.swing.JPopupMenu();
        agregar = new javax.swing.JMenuItem();
        modificar = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();
        jd_agregar = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        cb_soldado = new javax.swing.JComboBox<>();
        lb_nombre = new javax.swing.JLabel();
        lb_id = new javax.swing.JLabel();
        lb_rango = new javax.swing.JLabel();
        lb_arma = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_id = new javax.swing.JTextField();
        tf_rango = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        cb_arma = new javax.swing.JComboBox<>();
        lb_edad = new javax.swing.JLabel();
        tf_edad = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_arbol = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        cargar = new javax.swing.JButton();
        guardar_archivo = new javax.swing.JButton();

        agregar.setText("Agregar soldado");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        menu_popup.add(agregar);

        modificar.setText("Editar soldado");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        menu_popup.add(modificar);

        eliminar.setText("Dar de alta este soldado");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        menu_popup.add(eliminar);

        jd_agregar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Equipo");
        jd_agregar.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 91, -1, -1));

        cb_soldado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ruso", "Aleman", "Alumno de progra 2" }));
        cb_soldado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_soldadoItemStateChanged(evt);
            }
        });
        jd_agregar.getContentPane().add(cb_soldado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 91, 179, -1));

        lb_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_nombre.setText("Nombre");
        jd_agregar.getContentPane().add(lb_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 160, -1, -1));

        lb_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_id.setText("ID");
        jd_agregar.getContentPane().add(lb_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 198, -1, 27));

        lb_rango.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_rango.setText("Rango");
        jd_agregar.getContentPane().add(lb_rango, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 243, -1, 27));

        lb_arma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_arma.setText("Tipo de arma");
        jd_agregar.getContentPane().add(lb_arma, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 381, -1, 27));
        jd_agregar.getContentPane().add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 179, -1));
        jd_agregar.getContentPane().add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 203, 179, -1));
        jd_agregar.getContentPane().add(tf_rango, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 248, 179, -1));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jd_agregar.getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 91, 36));

        cb_arma.setModel(new DefaultComboBoxModel());
        jd_agregar.getContentPane().add(cb_arma, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 386, 179, -1));

        lb_edad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_edad.setText("Edad");
        jd_agregar.getContentPane().add(lb_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 288, -1, 27));
        jd_agregar.getContentPane().add(tf_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 293, 179, -1));

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jd_agregar.getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 91, 36));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Ejercito");
        jt_arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_arbolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_arbol);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Soldados");

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Simular batalla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cargar.setText("Cargar");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        guardar_archivo.setText("Guardar");
        guardar_archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_archivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(guardar_archivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cargar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:

        ComprobarArmas();

        jd_agregar.setModal(true);
        jd_agregar.pack();
        jd_agregar.setLocationRelativeTo(this);
        jd_agregar.setVisible(true);


    }//GEN-LAST:event_agregarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        try {
            if ((cb_soldado.getSelectedItem().toString()).equals("Ruso")) {
                String nombre = tf_nombre.getText();
                String rango = tf_rango.getText();
                String ID = tf_id.getText();

                int edad = Integer.parseInt(tf_edad.getText());
                int resistencia = edad * 8;

                Arma arma = (Arma) cb_arma.getSelectedItem();

                Ruso ruso = new Ruso(nombre, ID, edad, resistencia, rango, arma);
                soldados.add(ruso);

            } else if ((cb_soldado.getSelectedItem().toString()).equals("Alumno de progra 2")) {
                String apodo = tf_nombre.getText();
                String GradoAcademico = tf_rango.getText();
                int numeroCuenta = Integer.parseInt(tf_id.getText());

                int edad = Integer.parseInt(tf_edad.getText());
                int resistencia = edad * 8;

                Arma arma = (Arma) cb_arma.getSelectedItem();

                AlumnoProgra2 Alumno = new AlumnoProgra2(apodo, GradoAcademico, edad, numeroCuenta, resistencia, arma);
                soldados.add(Alumno);
            } else {
                String alias = tf_nombre.getText();
                String casta = tf_rango.getText();

                int edad = Integer.parseInt(tf_edad.getText());
                int resistencia = edad * 8;

                Arma arma = (Arma) cb_arma.getSelectedItem();

                Aleman aleman = new Aleman(alias, casta, edad, resistencia, arma);
                soldados.add(aleman);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_agregar, "Ha ocurrido un problema");
            System.out.println(e.getClass());
        }

        Cargar();

    }//GEN-LAST:event_guardarActionPerformed

    private void cb_soldadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_soldadoItemStateChanged
        ComprobarArmas();

    }//GEN-LAST:event_cb_soldadoItemStateChanged

    private void ComprobarArmas() {
        try {
            if ((cb_soldado.getSelectedItem().toString()).equals("Ruso")) {
                Arma AK47 = new Arma("AK-47", 27);
                Arma revolver = new Arma("Revolver Navant", 27);
                Arma rpg7 = new Arma("RPG-7", 57);
                DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_arma.getModel();
                modelo.removeAllElements();
                modelo.addElement(AK47);
                modelo.addElement(revolver);
                modelo.addElement(rpg7);

                tf_id.setVisible(true);
                lb_id.setVisible(true);
                lb_nombre.setText("Nombre");
                lb_id.setText("ID");
                lb_rango.setText("Rango");

            } else if ((cb_soldado.getSelectedItem().toString()).equals("Aleman")) {
                Arma MG42 = new Arma("MG42", 32);
                Arma pistola = new Arma("Pistolas Walther P38", 11);
                Arma ametralladora = new Arma("Ametralladora MG42", 32);
                DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_arma.getModel();
                modelo.removeAllElements();
                modelo.addElement(MG42);
                modelo.addElement(pistola);
                modelo.addElement(ametralladora);

                lb_nombre.setText("Alias");
                lb_id.setVisible(false);
                tf_id.setVisible(false);
                lb_rango.setText("Casta");

            } else {
                Arma disco = new Arma("Discos duros", 23);
                Arma wii = new Arma("Controles de Wii ", 47);
                Arma pc = new Arma(" Laptops", 76);
                DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_arma.getModel();
                modelo.removeAllElements();
                modelo.addElement(disco);
                modelo.addElement(wii);
                modelo.addElement(pc);

                lb_id.setVisible(true);
                tf_id.setVisible(true);
                lb_nombre.setText("Apodo");
                lb_id.setText("Numero de cuenta");
                lb_rango.setText("Grado academico");

            }
        } catch (Exception e) {
        }
    }


    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

        DefaultMutableTreeNode nodo_seleccionado = (DefaultMutableTreeNode) jt_arbol.getSelectionPath().getLastPathComponent();
        Object Soldado = nodo_seleccionado.getUserObject();
        if (Soldado instanceof Ruso || Soldado instanceof Aleman || Soldado instanceof AlumnoProgra2) {
            JOptionPane.showMessageDialog(this, "Soldado dado de alta");
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado un soldado");
        }
        soldados.remove(Soldado);
        Cargar();
    }//GEN-LAST:event_eliminarActionPerformed

    private void jt_arbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_arbolMouseClicked
        // TODO add your handling code here:
        try {
            if (evt.isMetaDown()) {
                menu_popup.show(evt.getComponent(), evt.getX(), evt.getY());

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se puede modificar ni eliminar aqui");
        }


    }//GEN-LAST:event_jt_arbolMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ArrayList<Ruso> rusos = new ArrayList();
        ArrayList<Aleman> alemanes = new ArrayList();
        ArrayList<AlumnoProgra2> alumnos = new ArrayList();
        for (Object soldado : soldados) {
            if (soldado instanceof Ruso) {
                if (((Ruso) soldado).getResistencia() > 0) {
                    rusos.add((Ruso) soldado);
                }

            } else if (soldado instanceof Aleman) {
                if (((Aleman) soldado).getResistencia() > 0) {
                    alemanes.add((Aleman) soldado);
                }

            } else {
                if (((AlumnoProgra2) soldado).getResistencia() > 0) {
                    alumnos.add((AlumnoProgra2) soldado);
                }

            }

        }

        while (!(alemanes.isEmpty() && alumnos.isEmpty()) && !(rusos.isEmpty() && alumnos.isEmpty()) && !(alemanes.isEmpty() && rusos.isEmpty())) {

            //Ataque de los rusos
            for (int i = 0; i < rusos.size(); i++) {
                if (!alemanes.isEmpty()) {
                    try {
                        alemanes.get(i).setResistencia(alemanes.get(i).getResistencia() - rusos.get(i).getArma().getPoderFuego());
                        if (alemanes.get(i).getResistencia() <= 0) {
                            alemanes.remove(i);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        alemanes.get(alemanes.size() - 1).setResistencia(alemanes.get(alemanes.size() - 1).getResistencia() - rusos.get(i).getArma().getPoderFuego());
                        if (alemanes.get(alemanes.size() - 1).getResistencia() <= 0) {
                            alemanes.remove(alemanes.size() - 1);
                        }
                    }
                }
                if (!alumnos.isEmpty()) {
                    try {
                        alumnos.get(i).setResistencia(alumnos.get(i).getResistencia() - rusos.get(i).getArma().getPoderFuego());
                        if (alumnos.get(i).getResistencia() <= 0) {
                            alumnos.remove(i);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        alumnos.get(alumnos.size() - 1).setResistencia(alumnos.get(alumnos.size() - 1).getResistencia() - rusos.get(i).getArma().getPoderFuego());
                        if (alumnos.get(alumnos.size() - 1).getResistencia() <= 0) {
                            alumnos.remove(alumnos.size() - 1);
                        }
                    }
                }

            }
            //turno de los alemanes
            for (int i = 0; i < alemanes.size(); i++) {
                if (!rusos.isEmpty()) {
                    try {
                        rusos.get(i).setResistencia(rusos.get(i).getResistencia() - alemanes.get(i).getArma().getPoderFuego());
                        if (rusos.get(i).getResistencia() <= 0) {
                            rusos.remove(i);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        rusos.get(rusos.size() - 1).setResistencia(rusos.get(rusos.size() - 1).getResistencia() - alemanes.get(i).getArma().getPoderFuego());
                        if (rusos.get(rusos.size() - 1).getResistencia() <= 0) {
                            rusos.remove(rusos.size() - 1);
                        }
                    }
                }
                if (!alumnos.isEmpty()) {
                    try {
                        alumnos.get(i).setResistencia(alumnos.get(i).getResistencia() - alemanes.get(i).getArma().getPoderFuego());
                        if (alumnos.get(i).getResistencia() <= 0) {
                            alumnos.remove(i);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        alumnos.get(alumnos.size() - 1).setResistencia(alumnos.get(alumnos.size() - 1).getResistencia() - alemanes.get(i).getArma().getPoderFuego());
                        if (alumnos.get(alumnos.size() - 1).getResistencia() <= 0) {
                            alumnos.remove(alumnos.size() - 1);
                        }
                    }
                }

            }
            //Turno de los Alumnos
            for (int i = 0; i < alumnos.size(); i++) {
                if (!rusos.isEmpty()) {
                    try {
                        rusos.get(i).setResistencia(rusos.get(i).getResistencia() - alumnos.get(i).getArma().getPoderFuego());
                        if (rusos.get(i).getResistencia() <= 0) {
                            rusos.remove(i);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        rusos.get(rusos.size() - 1).setResistencia(rusos.get(rusos.size() - 1).getResistencia() - alumnos.get(i).getArma().getPoderFuego());
                        if (rusos.get(rusos.size() - 1).getResistencia() <= 0) {
                            rusos.remove(rusos.size() - 1);
                        }
                    }
                }
                if (!alemanes.isEmpty()) {
                    try {
                        alemanes.get(i).setResistencia(alemanes.get(i).getResistencia() - alumnos.get(i).getArma().getPoderFuego());
                        if (alemanes.get(i).getResistencia() <= 0) {
                            alemanes.remove(i);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        alemanes.get(alemanes.size() - 1).setResistencia(alemanes.get(alemanes.size() - 1).getResistencia() - alumnos.get(i).getArma().getPoderFuego());
                        if (alemanes.get(alemanes.size() - 1).getResistencia() <= 0) {
                            alemanes.remove(alemanes.size() - 1);
                        }
                    }
                }

            }
            //System.out.println(alumnos.size() + "alumnos");
            //System.out.println(alemanes.size() + "alemanes");
            //System.out.println(rusos.size() + "rusos");

        }
        if (!alumnos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los alumnos ganaron! \n Alumnos restantes: " + alumnos.size());
        }
        if (!rusos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los rusos ganaron! \n Soldados restantes: " + rusos.size());
        }
        if (!alemanes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los alemanes ganaron! \n Soldados restantes: " + alemanes.size());
        }
        Cargar();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        tf_nombre.setText("");
        tf_id.setText("");
        tf_rango.setText("");
        tf_edad.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        AdministrarSoldados as = new AdministrarSoldados(".\\SoldadosRemake.rmk");
        as.CargarArchivo();
        soldados = as.getListaSoldados();

        Cargar();
    }//GEN-LAST:event_cargarActionPerformed

    private void guardar_archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_archivoActionPerformed
        AdministrarSoldados as = new AdministrarSoldados(".\\SoldadosRemake.rmk");
        as.setListaSoldados(soldados);
        as.escribirArchivo();


    }//GEN-LAST:event_guardar_archivoActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        DefaultMutableTreeNode nodo_seleccionado = (DefaultMutableTreeNode) jt_arbol.getSelectionPath().getLastPathComponent();
        Object Seleccion = nodo_seleccionado.getUserObject();
        if (Seleccion instanceof Ruso) {
            String mod = (String) JOptionPane.showInputDialog(null, "Que desea editar?",
                    "MODIFICAR", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Nombre", "ID", "Edad", "Rango"}, "Nombre");
            switch (mod) {
                case "Nombre":
                    for (Object sld : soldados) {
                        if (sld.equals(Seleccion)) {
                            ((Ruso) sld).setNombre(JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre"));
                        }
                    }
                    break;
                case "ID":
                   
                    for (Object sld : soldados) {
                        if (sld.equals(Seleccion)) {
                            ((Ruso) sld).setID(JOptionPane.showInputDialog(this, "Ingrese el nuevo ID"));
                        }
                    }
                    break;
                case "Edad":
                    for (Object sld : soldados) {
                        if (sld.equals(Seleccion)) {
                            ((Ruso) sld).setEdad(Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la nueva edad")));
                        }
                    }
                    break;
                case "Rango":
                    for (Object sld : soldados) {
                        if (sld.equals(Seleccion)) {
                            ((Ruso) sld).setRango(JOptionPane.showInputDialog(this, "Ingrese la nueva rango"));
                        }
                    }
                    break;
            }
            Cargar();
        } else if (Seleccion instanceof Aleman) {
            String mod = (String) JOptionPane.showInputDialog(null, "Que desea editar?",
                    "MODIFICAR", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Alias", "Casta", "Edad"}, "Nombre");
            switch (mod) {
                case "Alias":
                    for (Object sld : soldados) {
                        if (sld.equals(Seleccion)) {
                            ((Aleman) sld).setAlias(JOptionPane.showInputDialog(this, "Ingrese el nuevo alias"));
                        }
                    }
                    break;
                case "Casta":
                    for (Object sld : soldados) {
                        if (sld.equals(Seleccion)) {
                            ((Aleman) sld).setCasta(JOptionPane.showInputDialog(this, "Ingrese la nueva casta"));
                        }
                    }
                    break;
                case "Edad":
                    for (Object sld : soldados) {
                        if (sld.equals(Seleccion)) {
                            ((Aleman) sld).setEdad(Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la nueva edad")));
                        }
                    }
                    break;

            }
            Cargar();
        } else if (Seleccion instanceof AlumnoProgra2) {
            String mod = (String) JOptionPane.showInputDialog(null, "Que desea editar?",
                    "MODIFICAR", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Apodo", "Numero de cuenta", "Edad", "Grado academico"}, "Nombre");
            switch (mod) {
                case "Apodo":
                    for (Object sld : soldados) {
                        if (sld.equals(Seleccion)) {
                            ((AlumnoProgra2) sld).setApodo(JOptionPane.showInputDialog(this, "Ingrese el nuevo apodo"));
                        }
                    }
                    break;
                case "Numero de cuenta":
                    for (Object sld : soldados) {
                        if (sld.equals(Seleccion)) {
                            ((AlumnoProgra2) sld).setNumeroCuenta(Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el nuevo numero de cuenta")));
                        }
                    }
                    break;
                case "Edad":
                    for (Object sld : soldados) {
                        if (sld.equals(Seleccion)) {
                            ((AlumnoProgra2) sld).setEdad(Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la nueva edad")));
                        }
                    }
                    break;
                case "Grado academico":
                    for (Object sld : soldados) {
                        if (sld.equals(Seleccion)) {
                            ((AlumnoProgra2) sld).setGradoAcademico(JOptionPane.showInputDialog(this, "Ingrese el nuevo grado academico"));
                        }
                    }
                    break;
            }

            Cargar();
        } else {
            JOptionPane.showMessageDialog(this, "Solo se pueden modificar los soldados y alumnos");
        }


    }//GEN-LAST:event_modificarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agregar;
    private javax.swing.JButton cargar;
    private javax.swing.JComboBox<String> cb_arma;
    private javax.swing.JComboBox<String> cb_soldado;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JButton guardar_archivo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jd_agregar;
    private javax.swing.JTree jt_arbol;
    private javax.swing.JLabel lb_arma;
    private javax.swing.JLabel lb_edad;
    private javax.swing.JLabel lb_id;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_rango;
    private javax.swing.JButton limpiar;
    private javax.swing.JPopupMenu menu_popup;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_rango;
    // End of variables declaration//GEN-END:variables
}
