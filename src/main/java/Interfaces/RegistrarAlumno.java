/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import Library.Alumno;
import Pilas.Alumnos;
import javax.swing.*;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Byte.parseByte;
import static java.lang.Integer.parseInt;

/**
 *
 * @author cardonapablo
 */
public class RegistrarAlumno extends JFrame {
    
    private JLabel titleLabel = new JLabel();
    private JPanel formPanel = new JPanel();
    private JPanel actionsPanel = new JPanel();
    private Alumnos alumnos;
    
    private JButton addButton = new JButton();
    
    Font titleFont = new Font("Helvetica", Font.PLAIN, 25);
    Font labelFont = new Font("Helvetica", Font.BOLD, 25);
    Font inputFont = new Font("Helvetica", Font.PLAIN, 24);
    
    private JTextField nombreInput = new JTextField();
    private JTextField apellidoInput = new JTextField();
    private JTextField edadInput = new JTextField();
    private JTextField registroInput = new JTextField();
    
    MenuPrincipal menu;

    /**
     * Creates new form RegistrarAlumno
     */
    public RegistrarAlumno(Alumnos alumnos, MenuPrincipal menu) {
        this.alumnos = alumnos;
        this.menu = menu;
        setTitle("Registrar Alumno");
        setSize(700, 800);
        setLocation(1500, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        titleLabel.setText("Registrar alumno");
        addButton.setText("Guardar");
        
        titleLabel.setSize(400, 50);
        titleLabel.setFont(titleFont);
        titleLabel.setLocation(150, 50);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setVisible(true);
        this.add(titleLabel);
        
        this.drawForm();
    }
    
    public RegistrarAlumno() {}
    
    private void drawForm() {
        
        formPanel.setLocation(150, 100);
        formPanel.setSize(400, 500);
        formPanel.setVisible(true);
        
        formPanel.setLayout(new GridLayout(10, 1));
        
        nombreInput.setFont(inputFont);
        apellidoInput.setFont(inputFont);
        edadInput.setFont(inputFont);
        registroInput.setFont(inputFont);
        
        JLabel formLabel = new JLabel("Registro");
        formLabel.setFont(labelFont);
        formPanel.add(formLabel);
        formPanel.add(registroInput);
        
        formLabel = new JLabel("Nombre");
        formLabel.setFont(labelFont);
        formPanel.add(formLabel);
        formPanel.add(nombreInput);
        
        formLabel = new JLabel("Apellido");
        formLabel.setFont(labelFont);
        formPanel.add(formLabel);
        formPanel.add(apellidoInput);
        
        formLabel = new JLabel("Edad");
        formLabel.setFont(labelFont);
        formPanel.add(formLabel);
        formPanel.add(edadInput);
        
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
        String nombre = nombreInput.getText();
        String apellido = apellidoInput.getText();
        byte edad = parseByte(edadInput.getText());
        int registro = parseInt(registroInput.getText());
        
        Alumno a = new Alumno(nombre, apellido, registro, edad);
        alumnos.push(a);
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
            java.util.logging.Logger.getLogger(RegistrarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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