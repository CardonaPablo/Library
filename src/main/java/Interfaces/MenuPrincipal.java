/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Pilas.Alumnos;
import Pilas.Libros;
import Pilas.Prestamos;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author cardonapablo
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    Font buttonFont = new Font("Helvetica", Font.PLAIN, 30);
    Font menuFont = new Font("Helvetica", Font.PLAIN, 27);
    Font menuItemFont = new Font("Helvetica", Font.PLAIN, 24);
    
    private Alumnos alumnos;
    private Libros libros;
    private Prestamos prestamos;
    MenuPrincipal menu = this;
        
    ActionListener menuItemActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch(e.getActionCommand()) {
                case "Nuevo alumno":
                    new RegistrarAlumno(alumnos, menu);
                    break;
                case "Mostrar alumno":
                    new MostrarAlumnos(alumnos, menu);
                    break;
                case "Nuevo libro":
                    new RegistrarLibro(libros, menu);
                    break;
                case "Mostrar libro":
                    new MostrarLibros(libros, menu);
                    break;
                case "Nuevo prestamo":
                    new RegistrarPrestamo(prestamos, menu);
                    break;
                case "Mostrar prestamo":
                    new MostrarPrestamos(prestamos, menu);
                    break;
                case "logout":
                    new Login(menu);
                    break;
            }
            menu.setVisible(false);
        }
    };

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        this.alumnos = new Alumnos();
        this.libros = new Libros();
        this.prestamos = new Prestamos();
        drawMenu();
    }
    
    public MenuPrincipal(Alumnos alumnos) {  
        this.alumnos = alumnos;
        drawMenu();
    }
    
    public MenuPrincipal(Libros libros) {  
        this.libros = libros;
        drawMenu();
    }
    
    public MenuPrincipal(Prestamos prestamos) {  
        this.prestamos = prestamos;
        drawMenu();
    }
    
    private void drawMenu() {
        setTitle("Menu");
        setSize(800, 550);
        setLocation(1500, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel titleLabel = new JLabel("Biblioteca");
        titleLabel.setSize(800, 50);
        titleLabel.setFont(new Font("Helvetica", Font.PLAIN, 35));
        titleLabel.setLocation(0, 50);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setVisible(true);
        this.add(titleLabel);
        
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menuA = new JMenu("Alumnos");
        JMenu menuL = new JMenu("Libros");
        JMenu menuP = new JMenu("Préstamos");
        menuA.setFont(menuFont);
        menuL.setFont(menuFont);
        menuP.setFont(menuFont);
        
        JMenuItem newMenuItemA = new JMenuItem("Nuevo");
        newMenuItemA.setFont(menuItemFont);
        newMenuItemA.setActionCommand("Nuevo alumno");
		
        JMenuItem showMenuItemA = new JMenuItem("Mostrar");
        showMenuItemA.setFont(menuItemFont);
        showMenuItemA.setActionCommand("Mostrar alumno");
		
        JMenuItem newMenuItemL = new JMenuItem("Nuevo");
        newMenuItemL.setFont(menuItemFont);
        newMenuItemL.setActionCommand("Nuevo libro");
		
        JMenuItem showMenuItemL = new JMenuItem("Mostrar");
        showMenuItemL.setFont(menuItemFont);
        showMenuItemL.setActionCommand("Mostrar libro");
		
        JMenuItem newMenuItemP = new JMenuItem("Nuevo");
        newMenuItemP.setFont(menuItemFont);
        newMenuItemP.setActionCommand("Nuevo prestamo");
		
        JMenuItem showMenuItemP = new JMenuItem("Mostrar");
        showMenuItemP.setFont(menuItemFont);
        showMenuItemP.setActionCommand("Mostrar prestamo");
        
        newMenuItemA.addActionListener(menuItemActionListener);
	showMenuItemA.addActionListener(menuItemActionListener);
	newMenuItemL.addActionListener(menuItemActionListener);
	showMenuItemL.addActionListener(menuItemActionListener);
	newMenuItemP.addActionListener(menuItemActionListener);
	showMenuItemP.addActionListener(menuItemActionListener);
        
        menuA.add(newMenuItemA);
        menuA.add(showMenuItemA);
        menuL.add(newMenuItemL);
        menuL.add(showMenuItemL);
        menuP.add(newMenuItemP);
        menuP.add(showMenuItemP);
        
        menuBar.add(menuA);
        menuBar.add(menuL);
        menuBar.add(menuP);
        this.setJMenuBar(menuBar);
        drawActions();
    }
    
    private void drawActions() {
        
        JPanel actionsPanel = new JPanel();
        BoxLayout layout = new BoxLayout(actionsPanel, BoxLayout.Y_AXIS);
        actionsPanel.setLayout(layout);
        actionsPanel.setLocation(200, 100);
        actionsPanel.setSize(400, 600);
        
        JButton button = new JButton();
        
        button.setText("Nuevo alumno");
        button.setFont(buttonFont);
        button.setSize(200, 50);
        button.setActionCommand("Nuevo alumno");
        button.addActionListener(menuItemActionListener);
        button.setVisible(true); 
        actionsPanel.add(button);
        
        button = new JButton();
        button.setText("Mostrar alumnos");
        button.setFont(buttonFont);
        button.setActionCommand("Mostrar alumno");
        button.addActionListener(menuItemActionListener);
        actionsPanel.add(button);   
        
        button = new JButton();
        button.setText("Nuevo libro");
        button.setFont(buttonFont);
        button.setActionCommand("Nuevo libro");
        button.addActionListener(menuItemActionListener);
        actionsPanel.add(button);   
        
        button = new JButton();
        button.setText("Mostrar libros");
        button.setFont(buttonFont);
        button.setActionCommand("Mostrar libro");
        button.addActionListener(menuItemActionListener);
        actionsPanel.add(button);   
        
        button = new JButton();
        button.setText("Nuevo préstamo");
        button.setFont(buttonFont);
        button.setActionCommand("Nuevo prestamo");
        button.addActionListener(menuItemActionListener);
        actionsPanel.add(button);   
        
        button = new JButton();
        button.setText("Mostrar prestamos");
        button.setFont(buttonFont);
        button.setActionCommand("Mostrar prestamo");
        button.addActionListener(menuItemActionListener);
        actionsPanel.add(button);
        
        button = new JButton();
        button.setText("Cerrar sesión");
        button.setFont(buttonFont);
        button.setActionCommand("logout");
        button.addActionListener(menuItemActionListener);
        actionsPanel.add(button);  
        
        actionsPanel.setVisible(true);
        this.add(actionsPanel);
        
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
