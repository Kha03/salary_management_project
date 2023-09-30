package gui;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.JFrame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

import java.awt.event.FocusAdapter;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login_GUI {

    private JFrame frame;
    private static JPanel panelForgotPass;
    private static Login_GUI _this;
    private static JTextField txtDaTe;
    private static JLabel lblBackground;
    private static CardLayout cardLayout;
    private static JPanel cardPanel;
    private static JPanel panelChangePass;
    private static JPanel panelLogin;
    static Border originalBorder;
    static Border focuBofocusBorder;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        Login_GUI window = new Login_GUI();
        window.frame.setVisible(true);

    }

    /**
     * Create the application.
     */
    public Login_GUI() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        _this = this;
        frame = new JFrame();
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Login_GUI.class.getResource("/image/system-database-icon.png")));
        frame.setTitle("Product Salary Management");
        // change border when focus jtext
        originalBorder = BorderFactory.createLineBorder(Color.white, 1);
        focuBofocusBorder = BorderFactory.createLineBorder(Color.CYAN, 2);

        txtDaTe = new JTextField();
        txtDaTe.setEditable(false);
        txtDaTe.setForeground(Color.GREEN);
        txtDaTe.setOpaque(false);
        txtDaTe.setBorder(BorderFactory.createEmptyBorder());
        txtDaTe.setBackground(new Color(0, 0, 0, 0));
        txtDaTe.setFont(new Font("Arial", Font.PLAIN, 14));
        txtDaTe.setColumns(10);
        txtDaTe.setBounds(449, 354, 148, 29);

        lblBackground = new JLabel();
        lblBackground.setIcon(new ImageIcon(Login_GUI.class.getResource("/image/login_background.jpg")));
        lblBackground.setBounds(0, 0, 607, 393);

        // set jframe
        frame.setBounds(100, 100, 621, 430);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        panelLogin = createLoginPanel();
        panelForgotPass = createForgotPasswordPanel();
        panelChangePass = createChangePasswordPanel();

        cardPanel.add(panelLogin, "login");
        cardPanel.add(panelForgotPass, "forgotPassword");
        cardPanel.add(panelChangePass, "ChangePass");
        frame.getContentPane().add(cardPanel);
        // Real-time updates for the system
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateDateTimeField(txtDaTe);
            }
        });
        timer.start();
    }

    private void updateDateTimeField(JTextField textField) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        textField.setText(formattedDateTime);
    }

    private static JPanel createLoginPanel() {
        // create panel login
        JPanel panelLogin = new JPanel();

        JLabel lblNewLabel = new JLabel("Sign in");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        lblNewLabel.setForeground(new Color(255, 69, 0));
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 32));
        lblNewLabel.setBounds(10, 44, 597, 46);

        // create jtextAccount
        JTextField txtAccount = new JTextField();
        txtAccount.setFont(new Font("Arial", Font.PLAIN, 14));
        txtAccount.setBounds(261, 137, 187, 29);
        txtAccount.setColumns(10);

        // create jtextPass
        JPasswordField txtPass = new JPasswordField();
        txtPass.setColumns(10);
        txtPass.setBounds(261, 199, 187, 29);

        txtAccount.addFocusListener(new FocusListener() {

            @Override
            public void focusLost(FocusEvent e) {
                txtAccount.setBorder(originalBorder);
            }

            @Override
            public void focusGained(FocusEvent e) {
                txtAccount.setBorder(focuBofocusBorder);

            }
        });
        txtPass.addFocusListener(new FocusListener() {

            @Override
            public void focusLost(FocusEvent e) {
                txtPass.setBorder(originalBorder);
            }

            @Override
            public void focusGained(FocusEvent e) {
                txtPass.setBorder(focuBofocusBorder);

            }
        });

        // create jlable Account and password
        JLabel lblAccount = new JLabel("Account:");
        lblAccount.setIcon(new ImageIcon(Login_GUI.class.getResource("/image/user-1-icon.png")));
        lblAccount.setForeground(new Color(255, 69, 0));
        lblAccount.setFont(new Font("Arial", Font.BOLD, 20));
        lblAccount.setBounds(96, 124, 206, 48);

        JLabel lblMtKhu = new JLabel("Password:");
        lblMtKhu.setIcon(new ImageIcon(Login_GUI.class.getResource("/image/password-icon.png")));
        lblMtKhu.setForeground(new Color(255, 69, 0));
        lblMtKhu.setFont(new Font("Arial", Font.BOLD, 20));
        lblMtKhu.setBounds(96, 187, 206, 46);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBackground(new Color(0, 64, 128));
        btnLogin.setForeground(new Color(0, 255, 0));
        btnLogin.setFont(new Font("Arial", Font.BOLD, 20));
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				if (txtAccount.getText().matches("123") && txtPass.getText().matches("TMK")) {
//					homePage_UI = new HomePage_UI();
//					homePage_UI.setVisible(true);
//					_this.frame.setVisible(false);
//				}
                panelChangePass.add(txtDaTe);
                panelChangePass.add(lblBackground);
                cardLayout.show(cardPanel, "ChangePass");
            }
        });
        btnLogin.setBounds(300, 268, 148, 29);

        // jbtn add listener exit the program when click
        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(null, "Do you really want to quit?", "Quit",
                        JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        btnCancel.setBackground(new Color(64, 0, 0));
        btnCancel.setForeground(new Color(255, 0, 0));
        btnCancel.setFont(new Font("Arial", Font.BOLD, 20));
        btnCancel.setBounds(142, 268, 148, 29);

        JButton btnChangePass = new JButton("Forgot Password");
        btnChangePass.setOpaque(true);
        btnChangePass.setForeground(new Color(255, 255, 0));
        btnChangePass.setHorizontalAlignment(SwingConstants.LEFT);

        btnChangePass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelForgotPass.add(txtDaTe);
                panelForgotPass.add(lblBackground);
                cardLayout.show(cardPanel, "forgotPassword");
            }
        });
        btnChangePass.setForeground(Color.YELLOW);
        btnChangePass.setFont(new Font("Arial", Font.PLAIN, 16));
        btnChangePass.setOpaque(false);
        btnChangePass.setBorder(null);
        btnChangePass.setBackground(new Color(0, 0, 0, 0));
        btnChangePass.setBounds(10, 354, 134, 29);

        panelLogin.setLayout(null);
        panelLogin.add(lblNewLabel);
        panelLogin.add(txtAccount);
        panelLogin.add(txtPass);
        panelLogin.add(txtDaTe);
        panelLogin.add(lblAccount);
        panelLogin.add(lblMtKhu);
        panelLogin.add(btnCancel);
        panelLogin.add(btnLogin);
        panelLogin.add(btnChangePass);
        panelLogin.add(lblBackground);
        return panelLogin;
    }

    private static JPanel createForgotPasswordPanel() {
        // create panel change pass
        JPanel panelForgotPass = new JPanel();

        JLabel lblAccount_1 = new JLabel("Account:");
        lblAccount_1.setForeground(new Color(255, 69, 0));
        lblAccount_1.setFont(new Font("Arial", Font.BOLD, 20));
        lblAccount_1.setBounds(155, 86, 206, 48);

        JLabel lblForgotPassword = new JLabel("Forgot Password");
        lblForgotPassword.setHorizontalTextPosition(SwingConstants.CENTER);
        lblForgotPassword.setHorizontalAlignment(SwingConstants.CENTER);
        lblForgotPassword.setForeground(new Color(255, 69, 0));
        lblForgotPassword.setFont(new Font("Arial", Font.BOLD, 32));
        lblForgotPassword.setBounds(0, 30, 607, 46);

        JTextField txtAccMail = new JTextField();
        txtAccMail.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                txtAccMail.setBorder(originalBorder);
            }

            @Override
            public void focusGained(FocusEvent e) {
                txtAccMail.setBorder(focuBofocusBorder);

            }
        });
        txtAccMail.setFont(new Font("Arial", Font.PLAIN, 14));
        txtAccMail.setColumns(10);
        txtAccMail.setBounds(256, 98, 187, 29);

        JLabel lblMail = new JLabel("Email:");
        lblMail.setForeground(new Color(255, 69, 0));
        lblMail.setFont(new Font("Arial", Font.BOLD, 20));
        lblMail.setBounds(155, 144, 206, 46);

        JPasswordField txtMail = new JPasswordField();
        txtMail.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                txtMail.setBorder(originalBorder);
            }

            @Override
            public void focusGained(FocusEvent e) {
                txtMail.setBorder(focuBofocusBorder);

            }
        });
        txtMail.setFont(new Font("Arial", Font.PLAIN, 14));
        txtMail.setColumns(10);
        txtMail.setBounds(256, 155, 187, 29);

        JTextField txtVerify = new JTextField();
        txtVerify.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                txtVerify.setBorder(originalBorder);
            }

            @Override
            public void focusGained(FocusEvent e) {
                txtVerify.setBorder(focuBofocusBorder);

            }
        });
        txtVerify.setFont(new Font("Arial", Font.PLAIN, 14));
        txtVerify.setColumns(10);
        txtVerify.setBounds(256, 211, 187, 29);

        JLabel lblVeri = new JLabel("Verifi:");
        lblVeri.setForeground(new Color(255, 69, 0));
        lblVeri.setFont(new Font("Arial", Font.BOLD, 20));
        lblVeri.setBounds(155, 200, 206, 46);

        JTextField txtMess = new JTextField();
        txtMess.setForeground(new Color(255, 0, 0));
        txtMess.setBackground(new Color(0, 0, 0, 0));
        txtMess.setOpaque(false);
        txtMess.setText("*Mã xác nhận sẽ được gửi qua mail!!");
        txtMess.setBorder(null);
        txtMess.setEditable(false);
        txtMess.setFont(new Font("Arial", Font.ITALIC, 16));
        txtMess.setColumns(10);
        txtMess.setBounds(173, 256, 374, 29);

        JButton btnAgree = new JButton("Agree");
        btnAgree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnAgree.setForeground(Color.GREEN);
        btnAgree.setFont(new Font("Arial", Font.BOLD, 20));
        btnAgree.setBackground(new Color(0, 64, 128));
        btnAgree.setBounds(339, 310, 148, 29);

        // button send
        JButton btnSend = new JButton("Send");
        btnSend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (btnSend.getText().equalsIgnoreCase("Send")) {
                    btnSend.setText("Send Again");
                }
            }
        });
        btnSend.setForeground(Color.GREEN);
        btnSend.setFont(new Font("Arial", Font.BOLD, 14));
        btnSend.setBackground(new Color(0, 64, 128));
        btnSend.setBounds(445, 155, 118, 29);
        // listener Cancel
        JButton btnCancel_1 = new JButton("Cancel");
        btnCancel_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelLogin.add(txtDaTe);
                panelLogin.add(lblBackground);
                btnSend.setText("Send");
                cardLayout.show(cardPanel, "login");
            }
        });
        btnCancel_1.setForeground(Color.RED);
        btnCancel_1.setFont(new Font("Arial", Font.BOLD, 20));
        btnCancel_1.setBackground(new Color(64, 0, 0));
        btnCancel_1.setBounds(122, 310, 148, 29);
        panelForgotPass.setLayout(null);
        panelForgotPass.add(lblAccount_1);
        panelForgotPass.add(lblForgotPassword);
        panelForgotPass.add(txtAccMail);
        panelForgotPass.add(lblMail);
        panelForgotPass.add(txtMail);
        panelForgotPass.add(lblVeri);
        panelForgotPass.add(txtVerify);
        panelForgotPass.add(txtMess);
        panelForgotPass.add(btnCancel_1);
        panelForgotPass.add(btnAgree);
        panelForgotPass.add(btnSend);
        return panelForgotPass;
    }

    private static JPanel createChangePasswordPanel() {
        // create panel change pass
        JPanel panelChangePass = new JPanel();

        JLabel lblChangePassword = new JLabel("Change Password");
        lblChangePassword.setHorizontalTextPosition(SwingConstants.CENTER);
        lblChangePassword.setHorizontalAlignment(SwingConstants.CENTER);
        lblChangePassword.setForeground(new Color(255, 69, 0));
        lblChangePassword.setFont(new Font("Arial", Font.BOLD, 32));
        lblChangePassword.setBounds(0, 30, 607, 46);

        JPasswordField txtNewPass = new JPasswordField();
        txtNewPass.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                txtNewPass.setBorder(originalBorder);
            }

            @Override
            public void focusGained(FocusEvent e) {
                txtNewPass.setBorder(focuBofocusBorder);

            }
        });
        txtNewPass.setFont(new Font("Arial", Font.PLAIN, 14));
        txtNewPass.setColumns(10);
        txtNewPass.setBounds(308, 148, 187, 29);

        JLabel lblNewPass = new JLabel("New Password:");
        lblNewPass.setForeground(new Color(255, 69, 0));
        lblNewPass.setFont(new Font("Arial", Font.BOLD, 20));
        lblNewPass.setBounds(121, 137, 206, 46);

        JLabel lblConPass = new JLabel("Confirm Password:");
        lblConPass.setForeground(new Color(255, 69, 0));
        lblConPass.setFont(new Font("Arial", Font.BOLD, 20));
        lblConPass.setBounds(121, 187, 206, 46);

        JPasswordField txtConfirm = new JPasswordField();
        txtConfirm.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                txtConfirm.setBorder(originalBorder);
            }

            @Override
            public void focusGained(FocusEvent e) {
                txtConfirm.setBorder(focuBofocusBorder);

            }
        });
        txtConfirm.setFont(new Font("Arial", Font.PLAIN, 14));
        txtConfirm.setColumns(10);
        txtConfirm.setBounds(308, 198, 187, 29);

        JButton btnAgree = new JButton("Agree");
        btnAgree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnAgree.setForeground(Color.GREEN);
        btnAgree.setFont(new Font("Arial", Font.BOLD, 20));
        btnAgree.setBackground(new Color(0, 64, 128));
        btnAgree.setBounds(347, 247, 148, 29);
        // listener Cancel
        JButton btnCancel_1 = new JButton("Cancel");
        btnCancel_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelLogin.add(txtDaTe);
                panelLogin.add(lblBackground);
                cardLayout.show(cardPanel, "login");
            }
        });
        btnCancel_1.setForeground(Color.RED);
        btnCancel_1.setFont(new Font("Arial", Font.BOLD, 20));
        btnCancel_1.setBackground(new Color(64, 0, 0));
        btnCancel_1.setBounds(121, 247, 148, 29);
        panelChangePass.setLayout(null);
        panelChangePass.add(lblChangePassword);
        panelChangePass.add(lblNewPass);
        panelChangePass.add(txtNewPass);
        panelChangePass.add(lblConPass);
        panelChangePass.add(txtConfirm);
        panelChangePass.add(btnCancel_1);
        panelChangePass.add(btnAgree);
        return panelChangePass;
    }
}
