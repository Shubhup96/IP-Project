import java.sql.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * project.java
 *
 * Created on Jul 4, 2013, 8:02:48 PM
 */
/**
 *
 * @author shaggy
 */
public class project extends javax.swing.JFrame {

    int mp = 20;
    int count = 0;
    int r, v, k = 0;
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    ImageIcon a = new ImageIcon("C:\\java\\2.jpg ");
    ImageIcon b = new ImageIcon("C:\\java\\3.jpg ");
    ImageIcon c = new ImageIcon("C:\\java\\4.jpg ");
    ImageIcon d = new ImageIcon("C:\\java\\5.jpg ");
    ImageIcon j = new ImageIcon("C:\\java\\6.jpg ");
    ImageIcon f = new ImageIcon("C:\\java\\7.jpg ");
    ImageIcon i = new ImageIcon("C:\\java\\8.jpg ");
    Timer g;
    Timer o;
    Timer p;
    

    int h = 80;
    int h0 = 161;

    ImageIcon pg1 = new ImageIcon("C:\\java\\pg1.jpg ");
    ImageIcon pg2 = new ImageIcon("C:\\java\\pg2.jpg ");
    ImageIcon pg3 = new ImageIcon("C:\\java\\pg3.jpg ");
    ImageIcon pg4 = new ImageIcon("C:\\java\\pg4.jpg ");
    ImageIcon pg5 = new ImageIcon("C:\\java\\pg5.jpg ");
    ImageIcon pg6 = new ImageIcon("C:\\java\\pg6.jpg ");
    ImageIcon pg7 = new ImageIcon("C:\\java\\pg7.jpg ");
    ImageIcon pg8 = new ImageIcon("C:\\java\\pg8.jpg ");
    ImageIcon pg9 = new ImageIcon("C:\\java\\pg9.jpg ");
    ImageIcon pg10 = new ImageIcon("C:\\java\\pg10.jpg ");
    ImageIcon pg11 = new ImageIcon("C:\\java\\pg11.jpg ");
    ImageIcon pg12 = new ImageIcon("C:\\java\\pg12.jpg ");
    ImageIcon pg13 = new ImageIcon("C:\\java\\pg13.jpg ");
    ImageIcon pg14 = new ImageIcon("C:\\java\\pg14.jpg ");
    ImageIcon pg15 = new ImageIcon("C:\\java\\pg15.jpg ");
    ImageIcon pg16 = new ImageIcon("C:\\java\\pg16.jpg ");
    ////////////////////////////////////////////////////////
    ImageIcon a1 = new ImageIcon("C:\\java\\a\\a1.jpg ");
    ImageIcon a3 = new ImageIcon("C:\\java\\a\\a3.jpg ");
    ////////////////////////////////////////////////////////
    ImageIcon b2 = new ImageIcon("C:\\java\\b\\b2.jpg ");
    ImageIcon b3 = new ImageIcon("C:\\java\\b\\b3.jpg ");
    ////////////////////////////////////////////////////////
    ImageIcon f2 = new ImageIcon("C:\\java\\f\\f2.jpg ");
    ImageIcon f3 = new ImageIcon("C:\\java\\f\\f3.jpg ");
    /////////////////////////////////////////////////////////
    ImageIcon l1 = new ImageIcon("C:\\java\\l\\l1.jpg ");
    ImageIcon l3 = new ImageIcon("C:\\java\\l\\l3.jpg ");

    /////////////////////////////////////////////////////////
    ImageIcon bmw1 = new ImageIcon("C:\\java\\o\\bmw1.jpg ");
    ImageIcon h2 = new ImageIcon("C:\\java\\o\\h2.jpg ");

    public project() {
        initComponents();
        
        jTextField13.setEditable(false);
        jTextField16.setEditable(false);
        jTextField20.setEditable(false);

        g = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                h--;
                if (h == 80) {
                    jLabel13.setIcon(a);
                    jLabel12.setText("^^ beauties ^^");
                }
                if (h == 70) {
                    jLabel13.setIcon(b);
                    jLabel12.setText("$& Hot &$");
                }
                if (h == 60) {
                    jLabel13.setIcon(c);
                    jLabel12.setText("~~ Smoking ~~");
                }
                if (h == 50) {
                    jLabel13.setIcon(d);
                    jLabel12.setText("%%% Sports %%%");
                }
                if (h == 40) {
                    jLabel13.setIcon(j);
                    jLabel12.setText(" @# luxury #@");
                }
                if (h == 30) {
                    jLabel13.setIcon(f);
                    jLabel12.setText("!~!~Road runners ~!~!");
                }
                if (h == 20) {
                    jLabel13.setIcon(i);
                    jLabel12.setText("{@ leapord walker @}");
                }
                if (h == 10) {
                    h = 80;
                }
            }
        });
        g.start();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        aboutus = new javax.swing.JFrame();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        photogallery = new javax.swing.JFrame();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel34 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        review = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        showroom = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        login = new javax.swing.JFrame();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel68 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        database = new javax.swing.JFrame();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jButton17 = new javax.swing.JButton();
        jTextField30 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        buy = new javax.swing.JFrame();
        jButton8 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel78 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        ccp = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel91 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        cheq = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        codp = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        bill = new javax.swing.JFrame();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();

        Home.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        Home.setTitle("HOME");
        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setBounds(new java.awt.Rectangle(1, 6, 612, 663));
        Home.setMinimumSize(new java.awt.Dimension(1345, 645));
        Home.setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Home");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 160, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Enter showroom");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Photo gallery");
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 170, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("About us");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 240, 30));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FeedBack and reviews");
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 280, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Close");
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 110, 30));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Log Out");
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 110, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Virtual DJ", 0, 11));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("<html><center><h3>Feed Back of Some<br> of our happy customers");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 80));

        jTextArea1.setColumns(10);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 500));

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Andalus", 1, 36));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("WE HAVE");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1110, 40));

        jLabel12.setFont(new java.awt.Font("Gabriola", 0, 24));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1110, 40));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1090, 490));

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home.getContentPane());
        Home.getContentPane().setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        aboutus.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        aboutus.setBounds(new java.awt.Rectangle(1, 6, 612, 663));
        aboutus.setMinimumSize(new java.awt.Dimension(1345, 645));
        aboutus.setResizable(false);
        aboutus.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Andalus", 1, 14));
        jLabel17.setText("<html> <body> <h1>Our Contacts</h1> Zip Code:50122<br><br> Country:India<br><br> City:Pune<br><br> Telephone 1:+3545635600<br><br> Fax:+3545635620<br><br> Email:Dealsonwheels@mail.com<br><br><br> .</body> </html> ");
        aboutus.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Home");
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 160, 30));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Enter showroom");
        jLabel18.setOpaque(true);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 30));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Photo gallery");
        jLabel19.setOpaque(true);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 170, 30));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("About us");
        jLabel20.setOpaque(true);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
        });
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 240, 30));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("FeedBack and reviews");
        jLabel21.setOpaque(true);
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 280, 30));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Close");
        jLabel22.setOpaque(true);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 110, 30));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Log Out");
        jLabel23.setOpaque(true);
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 110, 30));

        aboutus.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("<html> <h2>CEO</h2><br>Shubham Bhosale and Shubham Pandey<br><br>  <h2>Credits</h2><br> Abhishek Kumar<br>Lokesh Bhagat <br> Manikandan <br> Ankit Garai<br><br> <h2>Started in </h2><br>2000<br><br> <h2>Now </h2><br>a $15 Million Enterprise<br>");
        aboutus.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 120, -1, -1));

        jLabel101.setText("<html><h2>Miscellaneous info:</h2> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  <h3>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Our Company has been the Winner of <br>\"The ShowRoom Of The Year\" Contest from 2007-2009, .</body> </html> ");
        aboutus.getContentPane().add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/au.JPG"))); // NOI18N
        aboutus.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1330, 600));

        photogallery.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        photogallery.setBounds(new java.awt.Rectangle(1, 6, 612, 663));
        photogallery.setMinimumSize(new java.awt.Dimension(1345, 645));
        photogallery.setResizable(false);

        jLabel31.setFont(new java.awt.Font("Segoe Script", 0, 24));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("The Most Beautiful And Exotic");

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jList2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jList2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Lamborghini Nera", "Audi r8 RCG", "Ferrari California", "Lotus Elise", "Audi r9", "Pagani Zonda", "Lamborghini Nera II", "lamborghini Reventon", "Lamborghini Avantador", "Mercedes SLS", "BMW cd6000", "Ferrari Italia 599", "BMW M8", "Lamborghini Indomalbe" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jList2);

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("<html><h3><center>Select the car's Photo <br>You want to see :-)");

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Home");
        jLabel24.setOpaque(true);
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 160, 30));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Enter showroom");
        jLabel25.setOpaque(true);
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel25MouseExited(evt);
            }
        });
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 30));

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Photo gallery");
        jLabel26.setOpaque(true);
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel26MouseExited(evt);
            }
        });
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 170, 30));

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("About us");
        jLabel27.setOpaque(true);
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel27MouseExited(evt);
            }
        });
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 240, 30));

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("FeedBack and reviews");
        jLabel28.setOpaque(true);
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel28MouseExited(evt);
            }
        });
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 280, 30));

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Close");
        jLabel29.setOpaque(true);
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel29MouseExited(evt);
            }
        });
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 110, 30));

        jLabel30.setBackground(new java.awt.Color(0, 0, 0));
        jLabel30.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Log Out");
        jLabel30.setOpaque(true);
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel30MouseExited(evt);
            }
        });
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 110, 30));

        javax.swing.GroupLayout photogalleryLayout = new javax.swing.GroupLayout(photogallery.getContentPane());
        photogallery.getContentPane().setLayout(photogalleryLayout);
        photogalleryLayout.setHorizontalGroup(
            photogalleryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 1340, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(photogalleryLayout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 1130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(photogalleryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        photogalleryLayout.setVerticalGroup(
            photogalleryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(photogalleryLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(photogalleryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(photogalleryLayout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
                .addContainerGap())
        );

        review.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        review.setBounds(new java.awt.Rectangle(1, 6, 612, 663));
        review.setMinimumSize(new java.awt.Dimension(1345, 645));
        review.setResizable(false);
        review.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Home");
        jLabel33.setOpaque(true);
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel33MouseExited(evt);
            }
        });
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 160, 30));

        jLabel35.setBackground(new java.awt.Color(0, 0, 0));
        jLabel35.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Enter showroom");
        jLabel35.setOpaque(true);
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel35MouseExited(evt);
            }
        });
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 30));

        jLabel36.setBackground(new java.awt.Color(0, 0, 0));
        jLabel36.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Photo gallery");
        jLabel36.setOpaque(true);
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel36MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel36MouseExited(evt);
            }
        });
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 170, 30));

        jLabel37.setBackground(new java.awt.Color(0, 0, 0));
        jLabel37.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("About us");
        jLabel37.setOpaque(true);
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel37MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel37MouseExited(evt);
            }
        });
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 240, 30));

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("FeedBack and reviews");
        jLabel38.setOpaque(true);
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel38MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel38MouseExited(evt);
            }
        });
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 280, 30));

        jLabel39.setBackground(new java.awt.Color(0, 0, 0));
        jLabel39.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Close");
        jLabel39.setOpaque(true);
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel39MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel39MouseExited(evt);
            }
        });
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 110, 30));

        jLabel40.setBackground(new java.awt.Color(0, 0, 0));
        jLabel40.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Log Out");
        jLabel40.setOpaque(true);
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel40MouseExited(evt);
            }
        });
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 110, 30));

        review.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Reviews And FeedBack");
        review.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1340, 60));

        jTextArea2.setColumns(20);
        jTextArea2.setEditable(false);
        jTextArea2.setFont(new java.awt.Font("Andalus", 0, 24));
        jTextArea2.setRows(5);
        jTextArea2.setOpaque(false);
        jScrollPane2.setViewportView(jTextArea2);

        review.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 560, 530));

        jLabel42.setFont(new java.awt.Font("Sakkal Majalla", 0, 24));
        jLabel42.setText("Good Name");
        review.getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, 40));

        jLabel43.setFont(new java.awt.Font("Sakkal Majalla", 0, 24));
        jLabel43.setText("Email");
        review.getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 130, 40));

        jLabel44.setFont(new java.awt.Font("Sakkal Majalla", 0, 24));
        jLabel44.setText("Phone No");
        review.getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 130, 40));

        jLabel45.setFont(new java.awt.Font("Sakkal Majalla", 0, 24));
        jLabel45.setText("Rating");
        review.getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 130, 40));

        jLabel46.setFont(new java.awt.Font("Sakkal Majalla", 0, 24));
        jLabel46.setText("Heading");
        review.getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 130, 40));

        jLabel47.setFont(new java.awt.Font("Sakkal Majalla", 0, 24));
        jLabel47.setText("FeedBack");
        review.getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 130, 40));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        review.getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 240, 40));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        review.getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 240, 40));

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        review.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 240, 40));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        review.getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 240, 40));

        jComboBox1.setFont(new java.awt.Font("Lucida Sans", 0, 18));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "*", "**", "***", "****", "*****" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        review.getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 240, 30));

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        review.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, 190, 40));

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("<html><h3>Cars Coming Soon in<br> Deals On wheels");
        review.getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 90, 230, 50));

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs1.JPG"))); // NOI18N
        review.getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 150, 230, 140));

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2.JPG"))); // NOI18N
        review.getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 290, 230, 170));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs3.JPG"))); // NOI18N
        review.getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 460, 230, 170));

        jTextArea3.setColumns(10);
        jTextArea3.setFont(new java.awt.Font("Andalus", 0, 18));
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        review.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 240, 170));

        showroom.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        showroom.setBounds(new java.awt.Rectangle(1, 6, 612, 663));
        showroom.setMinimumSize(new java.awt.Dimension(1345, 645));
        showroom.setResizable(false);
        showroom.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setBackground(new java.awt.Color(0, 0, 0));
        jLabel52.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Home");
        jLabel52.setOpaque(true);
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel52MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel52MouseExited(evt);
            }
        });
        jPanel7.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 160, 30));

        jLabel53.setBackground(new java.awt.Color(0, 0, 0));
        jLabel53.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Enter showroom");
        jLabel53.setOpaque(true);
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel53MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel53MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel53MouseExited(evt);
            }
        });
        jPanel7.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 30));

        jLabel54.setBackground(new java.awt.Color(0, 0, 0));
        jLabel54.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Photo gallery");
        jLabel54.setOpaque(true);
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel54MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel54MouseExited(evt);
            }
        });
        jPanel7.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 170, 30));

        jLabel55.setBackground(new java.awt.Color(0, 0, 0));
        jLabel55.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("About us");
        jLabel55.setOpaque(true);
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel55MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel55MouseExited(evt);
            }
        });
        jPanel7.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 240, 30));

        jLabel56.setBackground(new java.awt.Color(0, 0, 0));
        jLabel56.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("FeedBack and reviews");
        jLabel56.setOpaque(true);
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel56MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel56MouseExited(evt);
            }
        });
        jPanel7.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 280, 30));

        jLabel57.setBackground(new java.awt.Color(0, 0, 0));
        jLabel57.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Close");
        jLabel57.setOpaque(true);
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel57MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel57MouseExited(evt);
            }
        });
        jPanel7.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 110, 30));

        jLabel58.setBackground(new java.awt.Color(0, 0, 0));
        jLabel58.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Log Out");
        jLabel58.setOpaque(true);
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel58MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel58MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel58MouseExited(evt);
            }
        });
        jPanel7.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 110, 30));

        showroom.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel59.setBackground(new java.awt.Color(255, 153, 0));
        jLabel59.setFont(new java.awt.Font("Andalus", 1, 36));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Deals On Wheels");
        jLabel59.setOpaque(true);
        showroom.getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1340, 50));

        jList1.setBackground(new java.awt.Color(153, 255, 255));
        jList1.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Lamborghini", "Ferrari", "Audi", "Etori Bugatti", "Miscelleneous" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(jList1);

        showroom.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 130, 180, 130));

        jList3.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jList3.setModel(new DefaultListModel());
        jList3.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList3ValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(jList3);

        showroom.getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 310, 180, 130));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("<html><h2>Select Company");
        jLabel60.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        showroom.getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 80, 180, 50));

        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("<html><h2>Select Model");
        jLabel61.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        showroom.getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 260, 180, 50));

        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        showroom.getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1120, 380));

        jLabel63.setBackground(new java.awt.Color(0, 0, 0));
        jLabel63.setFont(new java.awt.Font("Segoe Script", 1, 36));
        jLabel63.setForeground(new java.awt.Color(153, 255, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setOpaque(true);
        showroom.getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 530, 50));

        jLabel64.setBackground(new java.awt.Color(0, 0, 0));
        jLabel64.setFont(new java.awt.Font("Candara", 0, 36));
        jLabel64.setForeground(new java.awt.Color(255, 153, 204));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setOpaque(true);
        showroom.getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 590, 50));

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jTable1.setFont(new java.awt.Font("Candara", 0, 18));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cost", "Mileage", "Fuel Capacity", "Top Speed", "Torque"
            }
        ));
        jTable1.setMinimumSize(new java.awt.Dimension(100, 100));
        jTable1.setOpaque(false);
        jTable1.setRowHeight(50);
        jTable1.setRowMargin(25);
        jScrollPane7.setViewportView(jTable1);

        showroom.getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 1340, 130));

        jButton4.setText("<html><h3><u>Buy This Car");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        showroom.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 450, 180, 70));

        login.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        login.setBounds(new java.awt.Rectangle(1, 6, 612, 663));
        login.setMinimumSize(new java.awt.Dimension(1345, 645));
        login.setResizable(false);
        login.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordField1.setFont(new java.awt.Font("Segoe Script", 0, 24));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        login.getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 280, 50));

        jLabel68.setFont(new java.awt.Font("Andalus", 0, 36));
        jLabel68.setText("Password");
        login.getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 180, 50));

        jTextField5.setFont(new java.awt.Font("Segoe Script", 0, 24));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        login.getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 280, 50));

        jLabel67.setFont(new java.awt.Font("Andalus", 0, 36));
        jLabel67.setText("Name");
        login.getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 180, 50));

        jLabel65.setBackground(new java.awt.Color(0, 0, 0));
        jLabel65.setFont(new java.awt.Font("Comic Sans MS", 0, 36));
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("DEALS ON WHEELS");
        jLabel65.setOpaque(true);
        login.getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 60));

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        login.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 90, 30));

        jLabel69.setFont(new java.awt.Font("Andalus", 0, 18));
        jLabel69.setForeground(new java.awt.Color(255, 51, 51));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 630, 60));

        jButton5.setText("<html><h2>LOG IN");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        login.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 210, 70));

        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w2.JPG"))); // NOI18N
        login.getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1340, 590));

        database.setBounds(new java.awt.Rectangle(1, 6, 612, 663));
        database.setMinimumSize(new java.awt.Dimension(1340, 630));
        database.setResizable(false);
        database.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setBackground(new java.awt.Color(0, 0, 0));
        jLabel70.setFont(new java.awt.Font("Comic Sans MS", 0, 36));
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("DEALS ON WHEELS");
        jLabel70.setOpaque(true);
        database.getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 60));

        jLabel71.setText("name");
        database.getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, 60));

        jLabel72.setText("cost");
        database.getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 140, 70));

        jLabel73.setText("mileage");
        database.getContentPane().add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 140, 70));

        jLabel74.setText("fuel");
        database.getContentPane().add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 140, 70));

        jLabel75.setText("topspeed");
        database.getContentPane().add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 140, 70));
        database.getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 150, 40));
        database.getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 150, 50));
        database.getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 150, 50));
        database.getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 150, 50));

        jButton9.setText("<html><h2>Fetch  Details");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        database.getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 160, 70));

        jButton10.setText("<html><h2>Update");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        database.getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 160, 70));

        jButton11.setText("<html><h2>Add new");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        database.getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 160, 70));

        jButton12.setText("<html><h2>Remove");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        database.getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 160, 60));

        jLabel76.setText("torque");
        database.getContentPane().add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 140, 70));
        database.getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 150, 50));
        database.getContentPane().add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, 50));

        jButton13.setText("<html><h2>Show Details of all Cars");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        database.getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 250, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name Of Car", "Cost", "Mileage", "Fuel", "Topspeed", "Torque"
            }
        ));
        jTable2.setOpaque(false);
        jTable2.setRowHeight(50);
        jTable2.setRowMargin(25);
        jScrollPane8.setViewportView(jTable2);

        database.getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 630, 210));

        jButton15.setText("<html><h2>Log Out");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        database.getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 130, 60));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cost", "mileage", "fuel" }));
        database.getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 130, 110, 50));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=", "<", ">", ">=", "<=" }));
        database.getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 130, 50, 50));

        jButton17.setText("<html><h2>Search in Database");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        database.getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, 330, 40));
        database.getContentPane().add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 130, 120, 50));

        jLabel103.setText("<html><h2>Search With Criteria");
        database.getContentPane().add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 70, 280, 40));

        buy.setBounds(new java.awt.Rectangle(1, 6, 612, 663));
        buy.setMinimumSize(new java.awt.Dimension(1340, 660));
        buy.setResizable(false);

        jButton8.setText("<html><font color=\"Red\" size=36><h1>Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Algerian", 0, 18));
        jRadioButton1.setText("Cash on delivery");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        jLabel78.setBackground(new java.awt.Color(0, 0, 0));
        jLabel78.setFont(new java.awt.Font("Andalus", 0, 24));
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("Payment Options");
        jLabel78.setOpaque(true);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Algerian", 0, 18));
        jRadioButton2.setText("Pay by cheque");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });
        jRadioButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jRadioButton2KeyTyped(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Algerian", 0, 18));
        jRadioButton3.setText("Credit card");
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });

        ccp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ccp.setForeground(new java.awt.Color(0, 255, 255));
        ccp.setOpaque(false);
        ccp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel88.setFont(new java.awt.Font("Andalus", 0, 24));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("Your Name");
        ccp.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 170, 60));

        jLabel89.setFont(new java.awt.Font("Andalus", 0, 24));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("Mobile no");
        ccp.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 170, 60));

        jTextField18.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jTextField18.setForeground(new java.awt.Color(102, 51, 0));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setOpaque(false);
        jTextField18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField18KeyTyped(evt);
            }
        });
        ccp.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 700, 50));

        jTextField19.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jTextField19.setForeground(new java.awt.Color(102, 51, 0));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setOpaque(false);
        ccp.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 700, 50));

        jLabel90.setFont(new java.awt.Font("Andalus", 0, 24));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("Address");
        ccp.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 170, 60));

        jPasswordField2.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jPasswordField2.setForeground(new java.awt.Color(102, 51, 0));
        jPasswordField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField2.setOpaque(false);
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyTyped(evt);
            }
        });
        ccp.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 700, 50));

        jLabel91.setFont(new java.awt.Font("Andalus", 0, 24));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("Car choosen");
        ccp.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 170, 60));

        jTextField20.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jTextField20.setForeground(new java.awt.Color(102, 51, 0));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setOpaque(false);
        ccp.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 700, 50));

        jLabel92.setFont(new java.awt.Font("Andalus", 0, 24));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("Credit card No.");
        ccp.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 160, 60));

        jTextField23.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jTextField23.setForeground(new java.awt.Color(102, 51, 0));
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setOpaque(false);
        ccp.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 700, 50));

        cheq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cheq.setOpaque(false);
        cheq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel83.setFont(new java.awt.Font("Andalus", 0, 24));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("Your Name");
        cheq.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 170, 60));

        jLabel84.setFont(new java.awt.Font("Andalus", 0, 24));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("Mobile no");
        cheq.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 170, 60));

        jTextField14.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jTextField14.setForeground(new java.awt.Color(102, 51, 0));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setOpaque(false);
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField14KeyTyped(evt);
            }
        });
        cheq.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 700, 50));

        jLabel85.setFont(new java.awt.Font("Andalus", 0, 24));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("Address");
        cheq.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 170, 60));

        jLabel86.setFont(new java.awt.Font("Andalus", 0, 24));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("Car choosen");
        cheq.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 170, 60));

        jLabel87.setFont(new java.awt.Font("Andalus", 0, 24));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("Cheque No.");
        cheq.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 160, 60));

        jTextField17.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jTextField17.setForeground(new java.awt.Color(102, 51, 0));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setOpaque(false);
        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField17KeyTyped(evt);
            }
        });
        cheq.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 700, 50));

        jTextField22.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jTextField22.setForeground(new java.awt.Color(102, 51, 0));
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setOpaque(false);
        cheq.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 700, 50));

        jTextField16.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jTextField16.setForeground(new java.awt.Color(102, 51, 0));
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setOpaque(false);
        cheq.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 700, 50));

        jTextField15.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jTextField15.setForeground(new java.awt.Color(102, 51, 0));
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setOpaque(false);
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField15KeyTyped(evt);
            }
        });
        cheq.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 700, 50));

        codp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        codp.setOpaque(false);
        codp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setFont(new java.awt.Font("Andalus", 0, 24));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("Your Name");
        codp.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 170, 60));

        jLabel80.setFont(new java.awt.Font("Andalus", 0, 24));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("Mobile no");
        codp.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 170, 60));

        jLabel81.setFont(new java.awt.Font("Andalus", 0, 24));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("Car choosen");
        codp.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 170, 60));

        jLabel82.setFont(new java.awt.Font("Andalus", 0, 24));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("Address");
        codp.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 170, 60));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jTextField6.setForeground(new java.awt.Color(102, 51, 0));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setOpaque(false);
        codp.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 700, 50));

        jTextField12.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jTextField12.setForeground(new java.awt.Color(102, 51, 0));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setOpaque(false);
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });
        codp.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 700, 50));

        jTextField13.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jTextField13.setForeground(new java.awt.Color(102, 51, 0));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setOpaque(false);
        codp.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 700, 50));

        jTextField21.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jTextField21.setForeground(new java.awt.Color(102, 51, 0));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setOpaque(false);
        codp.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 700, 50));

        jButton7.setText("<html><h2>Proceed");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout buyLayout = new javax.swing.GroupLayout(buy.getContentPane());
        buy.getContentPane().setLayout(buyLayout);
        buyLayout.setHorizontalGroup(
            buyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buyLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(buyLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(cheq, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(buyLayout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(buyLayout.createSequentialGroup()
                .addGap(1050, 1050, 1050)
                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(buyLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(codp, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(buyLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ccp, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(buyLayout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(buyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(buyLayout.createSequentialGroup()
                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        buyLayout.setVerticalGroup(
            buyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buyLayout.createSequentialGroup()
                .addGroup(buyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buyLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jRadioButton1))
                    .addGroup(buyLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(cheq, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(buyLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jRadioButton2))
                    .addGroup(buyLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jRadioButton3))
                    .addGroup(buyLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(codp, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buyLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(ccp, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buyLayout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        bill.setBounds(new java.awt.Rectangle(390, 6, 612, 630));
        bill.setMinimumSize(new java.awt.Dimension(612, 657));
        bill.setResizable(false);

        jLabel93.setBackground(new java.awt.Color(0, 0, 0));
        jLabel93.setFont(new java.awt.Font("Comic Sans MS", 0, 36));
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("DEALS ON WHEELS");
        jLabel93.setOpaque(true);

        jLabel94.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("Customer Name");

        jLabel95.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("Car Bought");

        jLabel96.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("Price");

        jLabel97.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("5% Tax");

        jLabel98.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("Shipping Charges");

        jLabel99.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel99.setForeground(new java.awt.Color(51, 0, 0));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setEnabled(false);

        jLabel100.setFont(new java.awt.Font("Andalus", 0, 24));
        jLabel100.setForeground(new java.awt.Color(0, 0, 255));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("<html>Your Car will be Delivered to you.<br>&nbsp&nbsp Have a Safe and Happy Ride!!!!");
        jLabel100.setEnabled(false);

        jTextField24.setEditable(false);
        jTextField24.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18));

        jTextField25.setEditable(false);
        jTextField25.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18));

        jTextField26.setEditable(false);
        jTextField26.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18));
        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });

        jTextField27.setEditable(false);
        jTextField27.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18));

        jTextField28.setEditable(false);
        jTextField28.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18));

        jLabel102.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("* Includes Service Tax,Road Tax,Registration Tax etc.");

        javax.swing.GroupLayout billLayout = new javax.swing.GroupLayout(bill.getContentPane());
        bill.getContentPane().setLayout(billLayout);
        billLayout.setHorizontalGroup(
            billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billLayout.createSequentialGroup()
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(billLayout.createSequentialGroup()
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(billLayout.createSequentialGroup()
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(billLayout.createSequentialGroup()
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(billLayout.createSequentialGroup()
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
            .addGroup(billLayout.createSequentialGroup()
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
            .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
            .addComponent(jLabel100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );
        billLayout.setVerticalGroup(
            billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billLayout.createSequentialGroup()
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(billLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(billLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(billLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(billLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBounds(new java.awt.Rectangle(1, 6, 612, 663));
        setMinimumSize(new java.awt.Dimension(1345, 645));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DEALS ON WHEELS");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 60));

        jButton1.setFont(new java.awt.Font("Andalus", 0, 24));
        jButton1.setText("log in as a customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 420, 60));

        jButton2.setFont(new java.awt.Font("Andalus", 0, 24));
        jButton2.setText("log in as administrator");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 420, 60));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.JPG"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1340, 570));

        jButton16.setText("<html><h1>X");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 70, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jProgressBar1.setVisible(true);
        p = new Timer(20, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Color col = new Color(r, v, k);
                ++count;
                r += 1;
                v += 2;
                k += 2;
                jProgressBar1.setValue(count);
                if (jProgressBar1.getValue() == 100) {
                    p.stop();
                    count = 0;
                    k = 0;
                    r = 0;
                    v = 0;
                    login.setVisible(true);
                    jProgressBar1.setVisible(false);
                }
            }
        });
        p.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jProgressBar1.setVisible(true);
        p = new Timer(20, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Color col = new Color(r, v, k);
                ++count;
                r += 1;
                v += 2;
                k += 2;
                jProgressBar1.setValue(count);
                if (jProgressBar1.getValue() == 100) {
                    p.stop();
                    count = 0;
                    k = 0;
                    r = 0;
                    v = 0;
                    Home.setVisible(true);
                    jProgressBar1.setVisible(false);
                }
            }
        });
        p.start();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setBackground(Color.white);
        jLabel3.setForeground(Color.black);
    }//GEN-LAST:event_jLabel3MouseEntered
    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jLabel3.setBackground(Color.black);
        jLabel3.setForeground(Color.white);
    }//GEN-LAST:event_jLabel3MouseExited
    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        jLabel4.setBackground(Color.white);
        jLabel4.setForeground(Color.black);
    }//GEN-LAST:event_jLabel4MouseEntered
    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        jLabel4.setBackground(Color.black);
        jLabel4.setForeground(Color.white);
    }//GEN-LAST:event_jLabel4MouseExited
    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        jLabel5.setBackground(Color.white);
        jLabel5.setForeground(Color.black);
    }//GEN-LAST:event_jLabel5MouseEntered
    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        jLabel5.setBackground(Color.black);
        jLabel5.setForeground(Color.white);
    }//GEN-LAST:event_jLabel5MouseExited
    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        jLabel6.setBackground(Color.white);
        jLabel6.setForeground(Color.black);
    }//GEN-LAST:event_jLabel6MouseEntered
    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        jLabel6.setBackground(Color.black);
        jLabel6.setForeground(Color.white);
    }//GEN-LAST:event_jLabel6MouseExited
    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        jLabel7.setBackground(Color.white);
        jLabel7.setForeground(Color.black);
    }//GEN-LAST:event_jLabel7MouseEntered
    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        jLabel7.setBackground(Color.black);
        jLabel7.setForeground(Color.white);
    }//GEN-LAST:event_jLabel7MouseExited
    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
        jLabel9.setBackground(Color.white);
        jLabel9.setForeground(Color.black);
    }//GEN-LAST:event_jLabel9MouseEntered
    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
        jLabel9.setBackground(Color.black);
        jLabel9.setForeground(Color.white);
    }//GEN-LAST:event_jLabel9MouseExited
    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        jLabel8.setBackground(Color.white);
        jLabel8.setForeground(Color.black);
    }//GEN-LAST:event_jLabel8MouseEntered
    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        jLabel8.setBackground(Color.black);
        jLabel8.setForeground(Color.white);
    }//GEN-LAST:event_jLabel8MouseExited
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        Home.setVisible(false);
}//GEN-LAST:event_jLabel9MouseClicked
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        System.exit(0);
}//GEN-LAST:event_jLabel8MouseClicked
    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        // TODO add your handling code here:
        jLabel16.setBackground(Color.white);
        jLabel16.setForeground(Color.black);
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        // TODO add your handling code here:
        jLabel16.setBackground(Color.black);
        jLabel16.setForeground(Color.white);
    }//GEN-LAST:event_jLabel16MouseExited
    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        // TODO add your handling code here:
        jLabel18.setBackground(Color.white);
        jLabel18.setForeground(Color.black);
    }//GEN-LAST:event_jLabel18MouseEntered
    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        // TODO add your handling code here:
        jLabel18.setBackground(Color.black);
        jLabel18.setForeground(Color.white);
    }//GEN-LAST:event_jLabel18MouseExited
    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        // TODO add your handling code here:
        jLabel19.setBackground(Color.white);
        jLabel19.setForeground(Color.black);
    }//GEN-LAST:event_jLabel19MouseEntered
    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        // TODO add your handling code here:
        jLabel19.setBackground(Color.black);
        jLabel19.setForeground(Color.white);
    }//GEN-LAST:event_jLabel19MouseExited
    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        // TODO add your handling code here:
        jLabel20.setBackground(Color.white);
        jLabel20.setForeground(Color.black);
    }//GEN-LAST:event_jLabel20MouseEntered
    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        // TODO add your handling code here:
        jLabel20.setBackground(Color.black);
        jLabel20.setForeground(Color.white);
    }//GEN-LAST:event_jLabel20MouseExited
    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        // TODO add your handling code here:
        jLabel21.setBackground(Color.white);
        jLabel21.setForeground(Color.black);
    }//GEN-LAST:event_jLabel21MouseEntered
    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        // TODO add your handling code here:
        jLabel21.setBackground(Color.black);
        jLabel21.setForeground(Color.white);
    }//GEN-LAST:event_jLabel21MouseExited
    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel22MouseClicked
    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        // TODO add your handling code here:
        jLabel22.setBackground(Color.white);
        jLabel22.setForeground(Color.black);
    }//GEN-LAST:event_jLabel22MouseEntered
    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        // TODO add your handling code here:
        jLabel22.setBackground(Color.black);
        jLabel22.setForeground(Color.white);
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        aboutus.setVisible(false);
    }//GEN-LAST:event_jLabel23MouseClicked
    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        // TODO add your handling code here:
        jLabel23.setBackground(Color.white);
        jLabel23.setForeground(Color.black);
    }//GEN-LAST:event_jLabel23MouseEntered
    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        // TODO add your handling code here:
        jLabel23.setBackground(Color.black);
        jLabel23.setForeground(Color.white);
    }//GEN-LAST:event_jLabel23MouseExited
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        aboutus.setVisible(true);
        Home.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        photogallery.setVisible(true);

        Home.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked
    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        // TODO add your handling code here:
        int m = jList2.getSelectedIndex();
        if (m == 0) {
            jLabel32.setIcon(pg1);
        }
        if (m == 1) {
            jLabel32.setIcon(pg2);
        }
        if (m == 2) {
            jLabel32.setIcon(pg3);
        }
        if (m == 3) {
            jLabel32.setIcon(pg4);
        }
        if (m == 4) {
            jLabel32.setIcon(pg5);
        }
        if (m == 5) {
            jLabel32.setIcon(pg6);
        }
        if (m == 6) {
            jLabel32.setIcon(pg7);
        }
        if (m == 7) {
            jLabel32.setIcon(pg8);
        }
        if (m == 8) {
            jLabel32.setIcon(pg9);
        }
        if (m == 9) {
            jLabel32.setIcon(pg10);
        }
        if (m == 10) {
            jLabel32.setIcon(pg11);
        }
        if (m == 11) {
            jLabel32.setIcon(pg12);
        }
        if (m == 12) {
            jLabel32.setIcon(pg13);
        }
        if (m == 13) {
            jLabel32.setIcon(pg14);
        }
        if (m == 14) {
            jLabel32.setIcon(pg15);
        }
        if (m == 15) {
            jLabel32.setIcon(pg16);
        }
    }//GEN-LAST:event_jList2ValueChanged
    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        // TODO add your handling code here:
        jLabel24.setBackground(Color.white);
        jLabel24.setForeground(Color.black);
    }//GEN-LAST:event_jLabel24MouseEntered
    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        // TODO add your handling code here:
        jLabel24.setBackground(Color.black);
        jLabel24.setForeground(Color.white);
    }//GEN-LAST:event_jLabel24MouseExited
    private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
        // TODO add your handling code here:
        jLabel25.setBackground(Color.white);
        jLabel25.setForeground(Color.black);
    }//GEN-LAST:event_jLabel25MouseEntered
    private void jLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseExited
        jLabel25.setBackground(Color.black);
        jLabel25.setForeground(Color.white);
    }//GEN-LAST:event_jLabel25MouseExited
    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel26MouseClicked
    private void jLabel26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseEntered
        // TODO add your handling code here:
        jLabel26.setBackground(Color.white);
        jLabel26.setForeground(Color.black);
    }//GEN-LAST:event_jLabel26MouseEntered
    private void jLabel26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseExited
        // TODO add your handling code here:
        jLabel26.setBackground(Color.black);
        jLabel26.setForeground(Color.white);
    }//GEN-LAST:event_jLabel26MouseExited
    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        aboutus.setVisible(true);
        photogallery.setVisible(false);
    }//GEN-LAST:event_jLabel27MouseClicked
    private void jLabel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseEntered
        // TODO add your handling code here:
        jLabel27.setBackground(Color.white);
        jLabel27.setForeground(Color.black);
    }//GEN-LAST:event_jLabel27MouseEntered
    private void jLabel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseExited
        // TODO add your handling code here:
        jLabel27.setBackground(Color.black);
        jLabel27.setForeground(Color.white);
    }//GEN-LAST:event_jLabel27MouseExited
    private void jLabel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseEntered
        // TODO add your handling code here:
        jLabel28.setBackground(Color.white);
        jLabel28.setForeground(Color.black);
    }//GEN-LAST:event_jLabel28MouseEntered
    private void jLabel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseExited
        // TODO add your handling code here:
        jLabel28.setBackground(Color.black);
        jLabel28.setForeground(Color.white);
    }//GEN-LAST:event_jLabel28MouseExited
    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel29MouseClicked
    private void jLabel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseEntered
        // TODO add your handling code here:
        jLabel29.setBackground(Color.white);
        jLabel29.setForeground(Color.black);
    }//GEN-LAST:event_jLabel29MouseEntered
    private void jLabel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseExited
        // TODO add your handling code here:
        jLabel29.setBackground(Color.black);
        jLabel29.setForeground(Color.white);
    }//GEN-LAST:event_jLabel29MouseExited
    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
        photogallery.setVisible(false);
    }//GEN-LAST:event_jLabel30MouseClicked
    private void jLabel30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseEntered
        // TODO add your handling code here:
        jLabel30.setBackground(Color.white);
        jLabel30.setForeground(Color.black);
    }//GEN-LAST:event_jLabel30MouseEntered
    private void jLabel30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseExited
        // TODO add your handling code here:
        jLabel30.setBackground(Color.black);
        jLabel30.setForeground(Color.white);
    }//GEN-LAST:event_jLabel30MouseExited
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        Home.setVisible(true);
        aboutus.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked
    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        photogallery.setVisible(true);
        aboutus.setVisible(false);
    }//GEN-LAST:event_jLabel19MouseClicked
    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked
    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        Home.setVisible(true);
        photogallery.setVisible(false);
    }//GEN-LAST:event_jLabel24MouseClicked
    private void jLabel40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseExited
        // TODO add your handling code here:
        jLabel40.setBackground(Color.black);
        jLabel40.setForeground(Color.white);
}//GEN-LAST:event_jLabel40MouseExited
    private void jLabel40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseEntered
        // TODO add your handling code here:
        jLabel40.setBackground(Color.white);
        jLabel40.setForeground(Color.black);
}//GEN-LAST:event_jLabel40MouseEntered
    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        // TODO add your handling code here:
        review.setVisible(false);
}//GEN-LAST:event_jLabel40MouseClicked
    private void jLabel39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseExited
        // TODO add your handling code here:
        jLabel39.setBackground(Color.black);
        jLabel39.setForeground(Color.white);
}//GEN-LAST:event_jLabel39MouseExited
    private void jLabel39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseEntered
        // TODO add your handling code here:
        jLabel39.setBackground(Color.white);
        jLabel39.setForeground(Color.black);
}//GEN-LAST:event_jLabel39MouseEntered
    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        // TODO add your handling code here:
        System.exit(0);
}//GEN-LAST:event_jLabel39MouseClicked
    private void jLabel38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseExited
        // TODO add your handling code here:
        jLabel38.setBackground(Color.black);
        jLabel38.setForeground(Color.white);
}//GEN-LAST:event_jLabel38MouseExited
    private void jLabel38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseEntered
        // TODO add your handling code here:
        jLabel38.setBackground(Color.white);
        jLabel38.setForeground(Color.black);
}//GEN-LAST:event_jLabel38MouseEntered
    private void jLabel37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseExited
        // TODO add your handling code here:
        jLabel37.setBackground(Color.black);
        jLabel37.setForeground(Color.white);
}//GEN-LAST:event_jLabel37MouseExited
    private void jLabel37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseEntered
        // TODO add your handling code here:
        jLabel37.setBackground(Color.white);
        jLabel37.setForeground(Color.black);
}//GEN-LAST:event_jLabel37MouseEntered
    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        // TODO add your handling code here:
        aboutus.setVisible(true);
        review.setVisible(false);

}//GEN-LAST:event_jLabel37MouseClicked
    private void jLabel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseExited
        // TODO add your handling code here:
        jLabel36.setBackground(Color.black);
        jLabel36.setForeground(Color.white);
}//GEN-LAST:event_jLabel36MouseExited
    private void jLabel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseEntered
        // TODO add your handling code here:
        jLabel36.setBackground(Color.white);
        jLabel36.setForeground(Color.black);
}//GEN-LAST:event_jLabel36MouseEntered
    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // TODO add your handling code here:
        photogallery.setVisible(true);

        review.setVisible(false);
}//GEN-LAST:event_jLabel36MouseClicked
    private void jLabel35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseExited
        // TODO add your handling code here:
        jLabel35.setBackground(Color.black);
        jLabel35.setForeground(Color.white);
}//GEN-LAST:event_jLabel35MouseExited
    private void jLabel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseEntered
        // TODO add your handling code here:
        jLabel35.setBackground(Color.white);
        jLabel35.setForeground(Color.black);
}//GEN-LAST:event_jLabel35MouseEntered
    private void jLabel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseExited
        // TODO add your handling code here:
        jLabel33.setBackground(Color.black);
        jLabel33.setForeground(Color.white);
}//GEN-LAST:event_jLabel33MouseExited
    private void jLabel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseEntered
        // TODO add your handling code here:
        jLabel33.setBackground(Color.white);
        jLabel33.setForeground(Color.black);
}//GEN-LAST:event_jLabel33MouseEntered
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String name = jTextField1.getText();
        String Heading = jTextField4.getText();
        String feedback = jTextArea3.getText();
        int rate = jComboBox1.getSelectedIndex();

        jTextArea1.append("\n" + "-----------------------------------------" + "\n" + name);
        jTextArea1.append("\n" + Heading);
        if (rate == 0) {
            jTextArea1.append("\n" + "*");

        }
        if (rate == 1) {
            jTextArea1.append("\n" + "**");

        }
        if (rate == 2) {
            jTextArea1.append("\n" + "***");

        }
        if (rate == 3) {
            jTextArea1.append("\n" + "****");

        }
        if (rate == 4) {
            jTextArea1.append("\n" + "*****");

        }
        jTextArea1.append("\n" + feedback + "\n" + "-----------------------------------------");

        //////////////////////////////////////////////////////

        jTextArea2.append("\n" + "-----------------------------------------" + "\n" + name);
        jTextArea2.append("\n" + Heading);
        if (rate == 0) {

            jTextArea2.append("\n" + "*");
        }
        if (rate == 1) {

            jTextArea2.append("\n" + "**");
        }
        if (rate == 2) {

            jTextArea2.append("\n" + "***");
        }
        if (rate == 3) {

            jTextArea2.append("\n" + "****");
        }
        if (rate == 4) {

            jTextArea2.append("\n" + "*****");
        }
        jTextArea2.append("\n" + feedback + "\n" + "-----------------------------------------");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextArea3.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed
    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // TODO add your handling code here:
        Home.setVisible(true);
        review.setVisible(false);
    }//GEN-LAST:event_jLabel33MouseClicked
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        review.setVisible(true);
        Home.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked
    private void jLabel52MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseEntered
        // TODO add your handling code here:
        jLabel52.setBackground(Color.white);
        jLabel52.setForeground(Color.black);
    }//GEN-LAST:event_jLabel52MouseEntered
    private void jLabel52MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseExited
        // TODO add your handling code here:
        jLabel52.setBackground(Color.black);
        jLabel52.setForeground(Color.white);
    }//GEN-LAST:event_jLabel52MouseExited
    private void jLabel53MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseEntered
        // TODO add your handling code here:
        jLabel53.setBackground(Color.white);
        jLabel53.setForeground(Color.black);
    }//GEN-LAST:event_jLabel53MouseEntered
    private void jLabel53MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseExited
        // TODO add your handling code here:
        jLabel53.setBackground(Color.black);
        jLabel53.setForeground(Color.white);
    }//GEN-LAST:event_jLabel53MouseExited
    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
        // TODO add your handling code here:
        photogallery.setVisible(true);

        showroom.setVisible(false);
    }//GEN-LAST:event_jLabel54MouseClicked
    private void jLabel54MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseEntered
        // TODO add your handling code here:
        jLabel54.setBackground(Color.white);
        jLabel54.setForeground(Color.black);
    }//GEN-LAST:event_jLabel54MouseEntered
    private void jLabel54MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseExited
        // TODO add your handling code here:
        jLabel54.setBackground(Color.black);
        jLabel54.setForeground(Color.white);
    }//GEN-LAST:event_jLabel54MouseExited
    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
        // TODO add your handling code here:
        aboutus.setVisible(true);
        showroom.setVisible(false);
    }//GEN-LAST:event_jLabel55MouseClicked
    private void jLabel55MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseEntered
        // TODO add your handling code here
        jLabel55.setBackground(Color.white);
        jLabel55.setForeground(Color.black);
    }//GEN-LAST:event_jLabel55MouseEntered
    private void jLabel55MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseExited
        // TODO add your handling code here:
        jLabel55.setBackground(Color.black);
        jLabel55.setForeground(Color.white);
    }//GEN-LAST:event_jLabel55MouseExited
    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
        // TODO add your handling code here:
        review.setVisible(true);
        showroom.setVisible(false);
    }//GEN-LAST:event_jLabel56MouseClicked
    private void jLabel56MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseEntered
        // TODO add your handling code here:
        jLabel56.setBackground(Color.white);
        jLabel56.setForeground(Color.black);
    }//GEN-LAST:event_jLabel56MouseEntered
    private void jLabel56MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseExited
        // TODO add your handling code here:
        jLabel56.setBackground(Color.black);
        jLabel56.setForeground(Color.white);
    }//GEN-LAST:event_jLabel56MouseExited
    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel57MouseClicked
    private void jLabel57MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseEntered
        // TODO add your handling code here:
        jLabel57.setBackground(Color.white);
        jLabel57.setForeground(Color.black);
    }//GEN-LAST:event_jLabel57MouseEntered
    private void jLabel57MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseExited
        // TODO add your handling code here:
        jLabel57.setBackground(Color.black);
        jLabel57.setForeground(Color.white);
    }//GEN-LAST:event_jLabel57MouseExited
    private void jLabel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseClicked
        // TODO add your handling code here:
        showroom.setVisible(false);
    }//GEN-LAST:event_jLabel58MouseClicked
    private void jLabel58MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseEntered
        // TODO add your handling code here:
        jLabel58.setBackground(Color.white);
        jLabel58.setForeground(Color.black);
    }//GEN-LAST:event_jLabel58MouseEntered
    private void jLabel58MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseExited
        // TODO add your handling code here:
        jLabel58.setBackground(Color.black);
        jLabel58.setForeground(Color.white);
    }//GEN-LAST:event_jLabel58MouseExited
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        showroom.setVisible(true);
        Home.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked
    private void jList3ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList3ValueChanged
        // TODO add your handling code here:
        int company = jList1.getSelectedIndex();
        int model = jList3.getSelectedIndex();
        if (company == 0)/// zero corresponds to lambo
        {
            if (model == 0) {
                jLabel63.setText("Lamborghini");
                jLabel64.setText("SuperLeggara");
                jLabel62.setIcon(l1);
            }
            if (model == 1) {
                jLabel63.setText("Lamborghini");
                jLabel64.setText("SuperVeloce");
                jLabel62.setIcon(l3);
            }
        }

        /////////////////////////////////////////////////////////////////////


        if (company == 1)/// one corresponds to ferrari and so on pandey
        {
            if (model == 0) {
                jLabel63.setText("Ferrari");
                jLabel64.setText("Scruderia");
                jLabel62.setIcon(f2);
            }
            if (model == 1) {
                jLabel63.setText("Ferrari");
                jLabel64.setText("California");
                jLabel62.setIcon(f3);
            }
        }

        /////////////////////////////////////////////////////////////////////

        if (company == 2) {
            if (model == 0) {
                jLabel63.setText("Audi");
                jLabel64.setText("R8");
                jLabel62.setIcon(a1);
            }
            if (model == 1) {
                jLabel63.setText("Audi");
                jLabel64.setText("R9");
                jLabel62.setIcon(a3);
            }
        }

        /////////////////////////////////////////////////////////////////////
        if (company == 3) {
            if (model == 0) {
                jLabel63.setText("Etori Bugatti");
                jLabel64.setText("16.4");
                jLabel62.setIcon(b2);
            }
            if (model == 1) {
                jLabel63.setText("Etori Bugatti");
                jLabel64.setText("Supersport");
                jLabel62.setIcon(b3);
            }
        }

        /////////////////////////////////////////////////////////////////////


        if (company == 4) {
            if (model == 0) {
                jLabel63.setText("BMW");
                jLabel64.setText("BMW M4");

                jLabel62.setIcon(bmw1);
            }
            if (model == 1) {
                jLabel63.setText("Hummer");
                jLabel64.setText("H2");
                jLabel62.setIcon(h2);
            }
        }

        /////////////////////////////////////////
        DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
        try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/shubham", "root", "admin");
            stmt = con.createStatement();
            String cname = (String) jList3.getSelectedValue();
            String query = "select * from car where name='" + cname + "';";
            rs = stmt.executeQuery(query);
            count = 0;
            int rows = model2.getRowCount();
            if (rows > 0) {
                for (int l = 0; l < rows; l++) {
                    model2.removeRow(0);
                }
            }

            while (rs.next()) {
                count++;
                model2.addRow(new Object[]{rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});

            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error in Connectivity");
        }

    }//GEN-LAST:event_jList3ValueChanged

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        DefaultListModel pc = (DefaultListModel) jList3.getModel();
        int company = jList1.getSelectedIndex();
        if (company == 0) {
            pc.removeAllElements();
            pc.addElement("Superleggara");
            pc.addElement("SuperVeloce");
        }

        if (company == 1) {
            pc.removeAllElements();
            pc.addElement("Scruderia");
            pc.addElement("California");
        }

        if (company == 2) {
            pc.removeAllElements();
            pc.addElement("R9");
            pc.addElement("R8");
        }

        if (company == 3) {
            pc.removeAllElements();
            pc.addElement("16.4");
            pc.addElement("Supersport");
        }

        if (company == 4) {
            pc.removeAllElements();
            pc.addElement("BMW M4");
            pc.addElement("H2");

        }
    }//GEN-LAST:event_jList1ValueChanged
    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        showroom.setVisible(true);
        aboutus.setVisible(false);
    }//GEN-LAST:event_jLabel18MouseClicked
    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        showroom.setVisible(true);
        photogallery.setVisible(false);
    }//GEN-LAST:event_jLabel25MouseClicked
    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
        showroom.setVisible(true);
        review.setVisible(false);
    }//GEN-LAST:event_jLabel35MouseClicked
    private void jLabel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel53MouseClicked
    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        // TODO add your handling code here:
        Home.setVisible(true);
        showroom.setVisible(false);
    }//GEN-LAST:event_jLabel52MouseClicked
    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        review.setVisible(true);
        aboutus.setVisible(false);
    }//GEN-LAST:event_jLabel21MouseClicked
    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        review.setVisible(true);
        photogallery.setVisible(false);
    }//GEN-LAST:event_jLabel28MouseClicked
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        login.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String name = jTextField5.getText();
        String Password = new String(jPasswordField1.getPassword());
        if (name.equals("shubham") && Password.equals("abcd")) {
            database.setVisible(true);
            login.setVisible(false);
        } else {
            jLabel69.setText("User name/Password is Incorrect");
        }
        jTextField5.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed
    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        codp.setVisible(false);
        cheq.setVisible(false);
        ccp.setVisible(false);


        buy.setVisible(true);
        showroom.setVisible(false);

        String car = (String) jList3.getSelectedValue();

        if (car.equals("Superleggara")) {
            jLabel77.setIcon(l1);
            jTextField13.setText("Superleggara");
            jTextField16.setText("Superleggara");
            jTextField20.setText("Superleggara");
        }
        if (car.equals("SuperVeloce")) {
            jLabel77.setIcon(l3);
            jTextField13.setText("SuperVeloce");
            jTextField16.setText("SuperVeloce");
            jTextField20.setText("SuperVeloce");
        }

        ///////////////////

        if (car.equals("Scruderia")) {
            jLabel77.setIcon(f2);
            jTextField13.setText("Scruderia");
            jTextField16.setText("Scruderia");
            jTextField20.setText("Scruderia");
        }
        if (car.equals("California")) {
            jLabel77.setIcon(f3);
            jTextField13.setText("California");
            jTextField16.setText("California");
            jTextField20.setText("California");
        }
        /////////////////////

        if (car.equals("R9")) {
            jLabel77.setIcon(a1);
            jTextField13.setText("R9");
            jTextField16.setText("R9");
            jTextField20.setText("R9");
        }
        if (car.equals("R8")) {
            jLabel77.setIcon(a3);
            jTextField13.setText("R8");
            jTextField16.setText("R8");
            jTextField20.setText("R8");
        }

        /////////////////////////

        if (car.equals("16.4")) {
            jLabel77.setIcon(b2);
            jTextField13.setText("16.4");
            jTextField16.setText("16.4");
            jTextField20.setText("16.4");
        }
        if (car.equals("Supersport")) {
            jLabel77.setIcon(b3);
            jTextField13.setText("Supersport");
            jTextField16.setText("Supersport");
            jTextField20.setText("Supersport");
        }
        //////////////////////////
        if (car.equals("BMW M4")) {
            jLabel77.setIcon(bmw1);
            jTextField13.setText("BMW M4");
            jTextField16.setText("BMW M4");
            jTextField20.setText("BMW M4");
        }
        if (car.equals("H2")) {
            jLabel77.setIcon(h2);
            jTextField13.setText("H2");
            jTextField16.setText("H2");
            jTextField20.setText("H2");
        }

    }//GEN-LAST:event_jButton4ActionPerformed
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jTextField6.setText("");
        jTextField12.setText("");
        jTextField21.setText("");

        jTextField14.setText("");
        jTextField15.setText("");
        jTextField17.setText("");
        jTextField22.setText("");

        jTextField19.setText("");
        jTextField18.setText("");
        jTextField23.setText("");
        jPasswordField2.setText("");

        showroom.setVisible(true);
        buy.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed
    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        jTextField6.setText("");
        jTextField12.setText("");
        jTextField21.setText("");

        boolean cod = jRadioButton1.isSelected();
        String car = (String) jList3.getSelectedValue();
        jTextField13.setText("" + car);
        if (cod == true) {
            this.codp.setVisible(true);
            cheq.setVisible(false);
            ccp.setVisible(false);
        }

    }//GEN-LAST:event_jRadioButton1ItemStateChanged
    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        // TODO add your handling code here:
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField17.setText("");
        jTextField22.setText("");

        String car = (String) jList3.getSelectedValue();
        jTextField16.setText("" + car);
        boolean pbc = jRadioButton2.isSelected();
        if (pbc == true) {
            cheq.setVisible(true);
            codp.setVisible(false);
            ccp.setVisible(false);
        }

    }//GEN-LAST:event_jRadioButton2ItemStateChanged
    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        // TODO add your handling code here:
        jTextField19.setText("");
        jTextField18.setText("");
        jTextField23.setText("");
        jPasswordField2.setText("");

        String car = (String) jList3.getSelectedValue();
        jTextField20.setText("" + car);
        boolean pbcc = jRadioButton3.isSelected();
        if (pbcc == true) {
            ccp.setVisible(true);
            cheq.setVisible(false);
            codp.setVisible(false);
        }

    }//GEN-LAST:event_jRadioButton3ItemStateChanged
    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if ((jTextField14.getText()).equals("") && (jTextField6.getText().equals("")) && (jTextField19.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "you have not entered your name");
        } else {

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            buy.setVisible(false);
            bill.setVisible(true);
            String cust;

            boolean rb1 = jRadioButton1.isSelected();
            boolean rb2 = jRadioButton2.isSelected();
            boolean rb3 = jRadioButton3.isSelected();

            if (rb1 == true) {
                cust = jTextField6.getText();
            } else {
                if (rb2 == true) {
                    cust = jTextField14.getText();
                } else {
                    cust = jTextField19.getText();
                }
            }

            String car = jTextField16.getText();
            jTextField24.setText("" + cust);
            jTextField25.setText("" + car);
            int row = jTable1.getSelectedRow();
            String cost = (String) jTable1.getValueAt(row, 0);
            jTextField26.setText("" + cost);
            double price = Integer.parseInt((jTextField26.getText()));
            double tax = price * 0.05;
            double Shipping = 1000;
            jTextField27.setText("" + tax);
            jTextField28.setText("" + Shipping);
            double total = price + tax + Shipping;
            jLabel99.setText("You have To pay Rs " + total + "");

            o = new Timer(100, new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    mp--;
                    if (mp == 15) {
                        jLabel100.setForeground(Color.red);
                    }
                    if (mp == 10) {
                        jLabel100.setForeground(Color.blue);
                    }
                    if (mp == 5) {
                        jLabel100.setForeground(Color.orange);
                    }
                    if (mp == 0) {
                        mp = 20;
                    }
                }
            });
            o.start();
        }
    }//GEN-LAST:event_jButton7ActionPerformed
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        String item = jTextField29.getText();
        try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/shubham", "root", "admin");
            stmt = con.createStatement();
            String query = "select * from car where name='" + item + "';";
            rs = stmt.executeQuery(query);

            if (rs.next()) {
                String cost = rs.getString("cost");
                String mileage = rs.getString("mileage");
                String fuel = rs.getString("fuel");
                String topspeed = rs.getString("topspeed");
                String torque = rs.getString("torque");


                jTextField7.setText(cost);
                jTextField8.setText(mileage);
                jTextField9.setText(fuel);
                jTextField10.setText(topspeed);
                jTextField11.setText(torque);

            } else {
                JOptionPane.showMessageDialog(null, "No such record found");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in Connectivity");
        }
}//GEN-LAST:event_jButton9ActionPerformed
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String item = jTextField29.getText();
        int ans = JOptionPane.showConfirmDialog(null, "Want to update the record");
        if (ans == JOptionPane.YES_OPTION) {
            try {
                Class.forName("java.sql.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/shubham", "root", "admin");
                stmt = con.createStatement();
                String query = "update car set cost=" + jTextField7.getText() + ",mileage=" + jTextField8.getText() + ",fuel=" + jTextField9.getText() + ",topspeed=" + jTextField10.getText() + ",torque=" + jTextField11.getText() + " " + "where name='" + item + "';";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "record updated");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "error in updation");
            }
        }
        jTextField29.setText("");
        jTextField11.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jButton13.doClick();
    }//GEN-LAST:event_jButton10ActionPerformed
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        int ans = JOptionPane.showConfirmDialog(null, "Want to insert the record");
        if (ans == JOptionPane.YES_OPTION) {
            try {
                Class.forName("java.sql.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/shubham", "root", "admin");
                stmt = con.createStatement();
                String query = "Insert into car values(" + "'" + jTextField29.getText() + "'" + "," + jTextField7.getText() + "," + jTextField8.getText() + "," + jTextField9.getText() + "," + jTextField10.getText() + "," + jTextField11.getText() + ");";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "record inserted");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "error in insertion");
            }
        }
        jTextField29.setText("");
        jTextField11.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jButton13.doClick();
    }//GEN-LAST:event_jButton11ActionPerformed
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        String item = jTextField29.getText();
        int res = JOptionPane.showConfirmDialog(null, "Want to delete the record");
        if (res == JOptionPane.YES_OPTION) {
            try {
                Class.forName("java.sql.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/shubham", "root", "admin");
                stmt = con.createStatement();
                String query1 = "select * from car where name='" + item + "';";
                rs = stmt.executeQuery(query1);
                if (rs.next()) {
                    String query = "delete from car where name='" + item + "';";
                    stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "record deleted");
                } else {
                    JOptionPane.showMessageDialog(null, "No such record Found");
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "error in deletion");
            }
        }

        jTextField29.setText("");
        jTextField11.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jButton13.doClick();
    }//GEN-LAST:event_jButton12ActionPerformed
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/shubham", "root", "admin");
            stmt = con.createStatement();
            String query = "select * from car;";
            rs = stmt.executeQuery(query);

            count = 0;
            int rows = model.getRowCount();
            if (rows > 0) {
                for (int l = 0; l < rows; l++) {
                    model.removeRow(0);
                }
            }
            while (rs.next()) {
                count++;
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
            //jTable2.setEnabled(false);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error in Connectivity");
        }
}//GEN-LAST:event_jButton13ActionPerformed
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        database.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton16ActionPerformed
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/shubham", "root", "admin");
            stmt = con.createStatement();
            String combo1 = (String) jComboBox2.getSelectedItem();
            String combo2 = (String) jComboBox3.getSelectedItem();
            String Textf = jTextField30.getText();
            String query = "select * from car where " + combo1 + "" + combo2 + "" + Textf + ";";
            rs = stmt.executeQuery(query);
            int count2 = 0;
            int rows = model.getRowCount();
            if (rows > 0) {
                for (int l = 0; l < rows; l++) {
                    model.removeRow(0);
                }
            }
            while (rs.next()) {
                count2++;
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in Connectivity");
        }
        
        jTextField30.setText("");
    }//GEN-LAST:event_jButton17ActionPerformed
    private void jTextField18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField18KeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        if (!(character >= '0' && character <= '9')) {
            evt.consume();
        }
        String len = jTextField18.getText();
        int it = len.length();
        if (it >= 10) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Only 10 Numbers allowed");
        }
    }//GEN-LAST:event_jTextField18KeyTyped
    private void jTextField15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        if (!(character >= '0' && character <= '9')) {
            evt.consume();
        }
        String len = jTextField15.getText();
        int it = len.length();
        if (it >= 10) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Only 10 Numbers allowed");
        }
    }//GEN-LAST:event_jTextField15KeyTyped
    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        if (!(character >= '0' && character <= '9')) {
            evt.consume();
        }

        String len = jTextField12.getText();
        int it = len.length();
        if (it >= 10) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Only 10 Numbers allowed");
        }
    }//GEN-LAST:event_jTextField12KeyTyped
    private void jRadioButton2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2KeyTyped
    private void jTextField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14KeyTyped
    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        if (!(character >= '0' && character <= '9')) {
            evt.consume();
        }
        String len = jTextField3.getText();
        int it = len.length();
        if (it >= 10) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Only 10 Numbers allowed");
        }
    }//GEN-LAST:event_jTextField3KeyTyped
    private void jPasswordField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        if (!(character >= '0' && character <= '9')) {
            evt.consume();
        }
        String len = new String(jPasswordField2.getPassword());
        int it = len.length();
        if (it >= 4) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Only 4 Numbers allowed");
        }
    }//GEN-LAST:event_jPasswordField2KeyTyped
    private void jTextField17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        if (!(character >= '0' && character <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField17KeyTyped
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new project().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Home;
    private javax.swing.JFrame aboutus;
    private javax.swing.JFrame bill;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFrame buy;
    private javax.swing.JPanel ccp;
    private javax.swing.JPanel cheq;
    private javax.swing.JPanel codp;
    private javax.swing.JFrame database;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JFrame login;
    private javax.swing.JFrame photogallery;
    private javax.swing.JFrame review;
    private javax.swing.JFrame showroom;
    // End of variables declaration//GEN-END:variables
}
