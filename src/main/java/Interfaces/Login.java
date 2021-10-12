/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import Library.Usuario;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author cardonapablo
 */
public class Login extends javax.swing.JFrame {

    private JLabel usuarioLabel = new JLabel();
    private JLabel claveLabel = new JLabel();
    private JTextField usuarioInput = new JTextField();
    private JPasswordField claveInput = new JPasswordField();
    private JButton playButton = new JButton("Ingresar");
    
    Font titleFont = new Font("Helvetica", Font.PLAIN, 30);
    Font inputFont = new Font("Helvetica", Font.PLAIN, 24);
    
    MenuPrincipal menu = null;

    Usuario[] usuarios = {
        new Usuario("usuario1", "contraseña"),
        new Usuario("admin", "admin"),
        new Usuario("directora", "12345678"),
        new Usuario("seguridad", "donas22343"),
        new Usuario("mantenimiento", "12$sj349342")
    };
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        drawLogin();
    }
    
    public Login(MenuPrincipal menu) {
        this.menu = menu;
        drawLogin();
    }
    
    public void drawLogin() {
        setTitle("Libreria");
        setSize(700, 500);
        setLocation(1500, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        usuarioLabel.setText("Usuario");
        usuarioLabel.setFont(titleFont);
        usuarioLabel.setSize(150, 50);
        usuarioLabel.setLocation(150, 50);
        usuarioLabel.setVisible(true);
        add(usuarioLabel);
        
        usuarioInput.setFont(inputFont);
        usuarioInput.setLocation(150, 100);
        usuarioInput.setSize(400, 50);
        add(usuarioInput);
        
        claveLabel.setText("Contraseña");
        claveLabel.setFont(titleFont);
        claveLabel.setSize(200, 50);
        claveLabel.setLocation(150, 150);
        claveLabel.setVisible(true);
        add(claveLabel);
        
        claveInput.setFont(inputFont);
        claveInput.setLocation(150, 200);
        claveInput.setSize(400, 50);
        add(claveInput);
        
        playButton.setFont(titleFont);
        playButton.setLocation(150, 270);
        playButton.setSize(400, 50);
        playButton.setVisible(true);
        add(playButton);
        
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                String usuario = usuarioInput.getText();
                String clave = new String(claveInput.getPassword());
                for (int i = 0; i < usuarios.length; i++) {
                    if(usuarios[i].usuario.equals(usuario) && usuarios[i].compararClave(clave)) {
                        dispose();
                        if(menu != null)
                            menu.setVisible(true);
                        else
                            new MenuPrincipal();
                    }
                }
            }
        });
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
