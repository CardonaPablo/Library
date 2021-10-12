/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import Library.Libro;
import Pilas.Libros;
import javax.swing.*;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Short.parseShort;

/**
 *
 * @author cardonapablo
 */
public class RegistrarLibro extends javax.swing.JFrame {

    private JLabel titleLabel = new JLabel();
    private JPanel formPanel = new JPanel();
    private JPanel actionsPanel = new JPanel();
    
    private Libros libros;
    MenuPrincipal menu;
    private JButton addButton = new JButton();
    
    Font titleFont = new Font("Helvetica", Font.PLAIN, 25);
    Font labelFont = new Font("Helvetica", Font.BOLD, 25);
    Font inputFont = new Font("Helvetica", Font.PLAIN, 24);
    
    private JTextField tituloInput = new JTextField();
    private JTextField autorInput = new JTextField();
    private JTextField paginasInput = new JTextField();
    private JCheckBox disponibleInput = new JCheckBox();

    /**
     * Creates new form RegistrarLibro
     */
    public RegistrarLibro(Libros libros, MenuPrincipal menu) {
          
        setTitle("Libros");
        setSize(700, 800);
        setLocation(1500, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        titleLabel.setText("Agregar libro");
        addButton.setText("Guardar");
        
        this.libros = libros;
        this.menu = menu;
        
        titleLabel.setSize(400, 50);
        titleLabel.setFont(titleFont);
        titleLabel.setLocation(150, 50);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setVisible(true);
        this.add(titleLabel);
        
        this.drawForm();
    }
    
    private void drawForm() {
        
        formPanel.setLocation(150, 100);
        formPanel.setSize(400, 500);
        formPanel.setVisible(true);
        
        formPanel.setLayout(new GridLayout(10, 1));
        
        tituloInput.setFont(inputFont);
        autorInput.setFont(inputFont);
        paginasInput.setFont(inputFont);
        disponibleInput.setFont(inputFont);
        
        JLabel formLabel = new JLabel("Título");
        formLabel.setFont(labelFont);
        formPanel.add(formLabel);
        formPanel.add(tituloInput);
        
        formLabel = new JLabel("Autor");
        formLabel.setFont(labelFont);
        formPanel.add(formLabel);
        formPanel.add(autorInput);
        
        formLabel = new JLabel("Páginas");
        formLabel.setFont(labelFont);
        formPanel.add(formLabel);
        formPanel.add(paginasInput);
        
        formLabel = new JLabel("Disponible");
        formLabel.setFont(labelFont);
        formPanel.add(formLabel);
        formPanel.add(disponibleInput);
        
        formPanel.add(new JSeparator());
        
        this.add(formPanel);
        this.drawActions();
    }
    
    private void drawActions() {
                
        actionsPanel.setLayout(new BoxLayout(actionsPanel, BoxLayout.X_AXIS));
        actionsPanel.setLocation(150, 600);
        actionsPanel.setSize(400, 60);
        
        addButton.setFont(inputFont);
        addButton.setSize(200, 50);
        addButton.setVisible(true);
        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitFields();
            }
        });
        actionsPanel.add(addButton);
        
        JButton cancelButton = new JButton("Cancelar");
        cancelButton.setFont(inputFont);
        cancelButton.setSize(200, 50);
        cancelButton.setVisible(true);
        
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                menu.setVisible(true);
            }
        });
        actionsPanel.add(cancelButton);
        
        actionsPanel.setVisible(true);
        this.add(actionsPanel);
        
    }
    
    private void submitFields() {
        String titulo = tituloInput.getText();
        String autor = autorInput.getText();
        boolean disponible = disponibleInput.isSelected();
        short paginas = parseShort(paginasInput.getText());
        
        Libro l = new Libro(titulo, autor, disponible, paginas);
        libros.push(l);
        dispose();
        this.menu.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RegistrarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
