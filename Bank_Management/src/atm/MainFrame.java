package atm;

import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

// 캡챠 사용을 위한 모듈
import nl.captcha.Captcha;
import nl.captcha.backgrounds.GradiatedBackgroundProducer;
import nl.captcha.noise.CurvedLineNoiseProducer;
import nl.captcha.noise.StraightLineNoiseProducer;

public class MainFrame extends javax.swing.JFrame {

    DB_MAN DBM = new DB_MAN();
    String ID;
    String NAME;
    private String captchaAnswer;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    
    public MainFrame() {
        initComponents();
        generateCaptcha();
    }

    private void generateCaptcha() {
        Captcha.Builder builder = new Captcha.Builder(150, 50);
        
        builder.addText();
        builder.addBackground(new GradiatedBackgroundProducer());
        builder.addNoise(new CurvedLineNoiseProducer(Color.BLACK, 2));
        builder.addNoise(new StraightLineNoiseProducer(Color.BLACK, 2));
        
        
        Captcha captcha = builder.build();
        
        ImageIcon icon = new ImageIcon(captcha.getImage());
        captchaLabel.setIcon(icon);
        
        this.captchaAnswer = captcha.getAnswer();
    }
    
     public boolean getId(String id) {
        try {
            String strSQL = "SELECT * FROM user WHERE userID = '" + id + "';";
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
            while(DBM.DB_rs.next()) {
                return id.equals(DBM.DB_rs.getString("userID"));
            }
            DBM.DB_rs.close();
            DBM.dbClose();
            } catch(Exception e) {
                System.out.println("SQLException : " + e.getMessage());
            }
        return false;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JFrame();
        lblLogin = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPW = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtPW = new javax.swing.JPasswordField();
        btnLogin1 = new javax.swing.JButton();
        btnExit4 = new javax.swing.JButton();
        join = new javax.swing.JFrame();
        btnJoin1 = new javax.swing.JButton();
        btnOverlap = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        captchaLabel = new javax.swing.JLabel();
        lblPW2 = new javax.swing.JLabel();
        txtCapcha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtJoinID = new javax.swing.JTextField();
        txtJoinPW = new javax.swing.JPasswordField();
        lblPW1 = new javax.swing.JLabel();
        txtJoinAccountPW = new javax.swing.JPasswordField();
        title3 = new javax.swing.JLabel();
        lblSignup = new javax.swing.JLabel();
        lblID2 = new javax.swing.JLabel();
        lblID1 = new javax.swing.JLabel();
        txtJoinName = new javax.swing.JTextField();
        txtIDCheck = new javax.swing.JLabel();
        txtJoinPhone = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        atm = new javax.swing.JFrame();
        btnMoneyTrans = new javax.swing.JButton();
        btnTransEng = new javax.swing.JRadioButton();
        btnTransJapan = new javax.swing.JRadioButton();
        footer = new javax.swing.JLabel();
        rbtnKorean = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnListView = new javax.swing.JButton();
        btnWithdraw = new javax.swing.JButton();
        lblNomal = new javax.swing.JLabel();
        lblOther = new javax.swing.JLabel();
        deposit = new javax.swing.JFrame();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtMoney1 = new javax.swing.JTextField();
        txtPlusPW1 = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtPlus = new javax.swing.JButton();
        depositFooter = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        withdraw = new javax.swing.JFrame();
        btnWithdrawFrame = new javax.swing.JButton();
        txtMinusPW = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        withdrawFooter = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtMinus = new javax.swing.JTextField();
        btnExit1 = new javax.swing.JButton();
        TransToOthers = new javax.swing.JFrame();
        rbtnOther = new javax.swing.JRadioButton();
        rbtnMine = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        txtTransMoney = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnTransToOhers = new javax.swing.JButton();
        txtTransPW = new javax.swing.JPasswordField();
        title5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtTransAccount = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        btnExit2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        transList = new javax.swing.JFrame();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtViewAccount = new javax.swing.JTextField();
        txtViewName = new javax.swing.JTextField();
        txtViewBalance = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareaList = new javax.swing.JTextArea();
        btnExit3 = new javax.swing.JButton();
        rbtnGroupLanguage = new javax.swing.ButtonGroup();
        exchange = new javax.swing.JFrame();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtExchangeMoney = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        btnExchangeY = new javax.swing.JButton();
        btnExchangeS = new javax.swing.JButton();
        btnExcahngeD = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        btnExitExcahnge = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        txtExchangePW = new javax.swing.JPasswordField();
        jLabel36 = new javax.swing.JLabel();
        rbtnGroupBank = new javax.swing.ButtonGroup();
        title1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnJoin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        lblLogin.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("LOGIN");

        lblID.setText("ID");

        title2.setBackground(new java.awt.Color(153, 204, 255));
        title2.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("INHA BANK");
        title2.setOpaque(true);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/bank.png"))); // NOI18N

        lblPW.setText("PASSWORD");

        txtID.setName(""); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPWActionPerformed(evt);
            }
        });

        btnLogin1.setText("로그인");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });

        btnExit4.setBackground(new java.awt.Color(153, 153, 153));
        btnExit4.setText("돌아가기");
        btnExit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login.getContentPane());
        login.getContentPane().setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPW)
                    .addComponent(lblID))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addComponent(btnExit4)
                .addGap(18, 18, 18)
                .addComponent(btnLogin1)
                .addGap(20, 20, 20))
            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginLayout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                .addComponent(txtPW))
                            .addGap(23, 23, 23))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                            .addComponent(lblLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(4, 4, 4)))))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(lblID)
                .addGap(50, 50, 50)
                .addComponent(lblPW)
                .addGap(40, 40, 40)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogin1))
                .addGap(17, 17, 17))
            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(title2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblLogin)
                    .addGap(27, 27, 27)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(45, 45, 45)
                    .addComponent(txtPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(76, Short.MAX_VALUE)))
        );

        btnJoin1.setText("회원가입");
        btnJoin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoin1ActionPerformed(evt);
            }
        });

        btnOverlap.setText("중복확인");
        btnOverlap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOverlapActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/bank.png"))); // NOI18N

        captchaLabel.setText("캡챠 이미지 자리");

        lblPW2.setText("비밀번호");

        jLabel7.setText("하이픈을 제외한 번호를 입력하세요 ex) 01029875082");

        txtJoinPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJoinPWActionPerformed(evt);
            }
        });
        txtJoinPW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJoinPWKeyReleased(evt);
            }
        });

        lblPW1.setText("계좌 비밀번호");

        txtJoinAccountPW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJoinAccountPWKeyReleased(evt);
            }
        });

        title3.setBackground(new java.awt.Color(153, 204, 255));
        title3.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        title3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title3.setText("INHA BANK");
        title3.setOpaque(true);

        lblSignup.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        lblSignup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignup.setText("SIGN UP");

        lblID2.setText("이름");

        lblID1.setText("아이디");

        txtJoinName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJoinNameActionPerformed(evt);
            }
        });

        txtIDCheck.setText("아이디 중복확인을 해주세요");
        txtIDCheck.setAutoscrolls(true);

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setText("돌아가기");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel8.setText("핸드폰 번호");

        javax.swing.GroupLayout joinLayout = new javax.swing.GroupLayout(join.getContentPane());
        join.getContentPane().setLayout(joinLayout);
        joinLayout.setHorizontalGroup(
            joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(joinLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(joinLayout.createSequentialGroup()
                        .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPW1)
                            .addComponent(lblPW2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joinLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(title3, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                        .addGap(26, 26, 26))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDCheck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(joinLayout.createSequentialGroup()
                    .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joinLayout.createSequentialGroup()
                            .addGap(217, 217, 217)
                            .addComponent(btnBack)
                            .addGap(18, 18, 18)
                            .addComponent(btnJoin1))
                        .addGroup(joinLayout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addComponent(lblSignup))
                        .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(joinLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtJoinPW, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                        .addComponent(txtJoinAccountPW, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtJoinName, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joinLayout.createSequentialGroup()
                                            .addComponent(txtJoinID, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnOverlap)))))
                            .addGroup(joinLayout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(txtJoinPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joinLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(captchaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCapcha, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(9, 9, 9)))
        );
        joinLayout.setVerticalGroup(
            joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joinLayout.createSequentialGroup()
                .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(joinLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joinLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title3)
                        .addGap(74, 74, 74)))
                .addComponent(lblID2)
                .addGap(39, 39, 39)
                .addComponent(lblID1)
                .addGap(5, 5, 5)
                .addComponent(txtIDCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(lblPW2)
                .addGap(18, 18, 18)
                .addComponent(lblPW1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(106, 106, 106))
            .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(joinLayout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(lblSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(14, 14, 14)
                    .addComponent(txtJoinName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtJoinID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOverlap))
                    .addGap(41, 41, 41)
                    .addComponent(txtJoinPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txtJoinAccountPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txtJoinPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(49, 49, 49)
                    .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(captchaLabel)
                        .addComponent(txtCapcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(joinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack)
                        .addComponent(btnJoin1))
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        btnMoneyTrans.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btnMoneyTrans.setText("환전 서비스");
        btnMoneyTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoneyTransActionPerformed(evt);
            }
        });

        rbtnGroupLanguage.add(btnTransEng);
        btnTransEng.setText("English");
        btnTransEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransEngActionPerformed(evt);
            }
        });

        rbtnGroupLanguage.add(btnTransJapan);
        btnTransJapan.setText("日本語");
        btnTransJapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransJapanActionPerformed(evt);
            }
        });

        footer.setBackground(new java.awt.Color(153, 204, 255));
        footer.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        footer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        footer.setText("INHA BANK");
        footer.setOpaque(true);

        rbtnGroupLanguage.add(rbtnKorean);
        rbtnKorean.setSelected(true);
        rbtnKorean.setText("한국어");
        rbtnKorean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnKoreanActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/bank.png"))); // NOI18N

        btnSubmit.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btnSubmit.setText("이체");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnDeposit.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btnDeposit.setText("입금");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnListView.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btnListView.setText("거래내역 조회");
        btnListView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListViewActionPerformed(evt);
            }
        });

        btnWithdraw.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        btnWithdraw.setText("출금");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        lblNomal.setText("일반 거래");

        lblOther.setText("외화 거래");

        javax.swing.GroupLayout atmLayout = new javax.swing.GroupLayout(atm.getContentPane());
        atm.getContentPane().setLayout(atmLayout);
        atmLayout.setHorizontalGroup(
            atmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atmLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(atmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(atmLayout.createSequentialGroup()
                        .addGroup(atmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnMoneyTrans, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(atmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListView, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(btnTransEng, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbtnKorean)
                            .addComponent(btnTransJapan, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblOther, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        atmLayout.setVerticalGroup(
            atmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atmLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addGap(25, 25, 25)
                .addComponent(lblNomal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(atmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(atmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnListView, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblOther)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(atmLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnMoneyTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(atmLayout.createSequentialGroup()
                        .addComponent(btnTransEng)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTransJapan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnKorean)))
                .addGap(6, 6, Short.MAX_VALUE)
                .addComponent(footer)
                .addGap(14, 14, 14))
        );

        deposit.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                depositWindowClosed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/bank.png"))); // NOI18N

        jLabel17.setBackground(new java.awt.Color(153, 204, 255));
        jLabel17.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("입금");
        jLabel17.setOpaque(true);

        jLabel20.setText("입금 금액");

        jLabel21.setText("계좌 비밀번호");

        txtPlus.setText("입금");
        txtPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlusActionPerformed(evt);
            }
        });

        depositFooter.setBackground(new java.awt.Color(153, 204, 255));
        depositFooter.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        depositFooter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        depositFooter.setText("INHA BANK");
        depositFooter.setOpaque(true);

        btnExit.setBackground(new java.awt.Color(153, 153, 153));
        btnExit.setText("돌아가기");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout depositLayout = new javax.swing.GroupLayout(deposit.getContentPane());
        deposit.getContentPane().setLayout(depositLayout);
        depositLayout.setHorizontalGroup(
            depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositLayout.createSequentialGroup()
                .addGroup(depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(depositLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel16))
                    .addGroup(depositLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(depositLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(depositLayout.createSequentialGroup()
                                .addComponent(btnExit)
                                .addGap(18, 18, 18)
                                .addComponent(txtPlus))
                            .addGroup(depositLayout.createSequentialGroup()
                                .addGroup(depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))
                                .addGap(19, 19, 19)
                                .addGroup(depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPlusPW1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(txtMoney1)))))
                    .addGroup(depositLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(depositFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        depositLayout.setVerticalGroup(
            depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtMoney1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtPlusPW1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlus)
                    .addComponent(btnExit))
                .addGap(18, 18, 18)
                .addComponent(depositFooter)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnWithdrawFrame.setText("출금");
        btnWithdrawFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawFrameActionPerformed(evt);
            }
        });

        txtMinusPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinusPWActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(153, 204, 255));
        jLabel12.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("출금");
        jLabel12.setOpaque(true);

        withdrawFooter.setBackground(new java.awt.Color(153, 204, 255));
        withdrawFooter.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        withdrawFooter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        withdrawFooter.setText("INHA BANK");
        withdrawFooter.setOpaque(true);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/bank.png"))); // NOI18N

        jLabel14.setText("출금 금액");

        jLabel15.setText("계좌 비밀번호");

        btnExit1.setBackground(new java.awt.Color(153, 153, 153));
        btnExit1.setText("돌아가기");
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout withdrawLayout = new javax.swing.GroupLayout(withdraw.getContentPane());
        withdraw.getContentPane().setLayout(withdrawLayout);
        withdrawLayout.setHorizontalGroup(
            withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, withdrawLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, withdrawLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, withdrawLayout.createSequentialGroup()
                        .addGroup(withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(withdrawLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(withdrawFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))))
            .addGroup(withdrawLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(withdrawLayout.createSequentialGroup()
                        .addComponent(btnExit1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnWithdrawFrame))
                    .addGroup(withdrawLayout.createSequentialGroup()
                        .addGroup(withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMinus)
                            .addComponent(txtMinusPW, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        withdrawLayout.setVerticalGroup(
            withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(31, 31, 31)
                .addGroup(withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtMinusPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(withdrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWithdrawFrame)
                    .addComponent(btnExit1))
                .addGap(18, 18, 18)
                .addComponent(withdrawFooter)
                .addGap(15, 15, 15))
        );

        rbtnGroupBank.add(rbtnOther);
        rbtnOther.setText("타 은행으로 이체");
        rbtnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOtherActionPerformed(evt);
            }
        });

        rbtnGroupBank.add(rbtnMine);
        rbtnMine.setSelected(true);
        rbtnMine.setText("같은 은행으로 이체");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/bank.png"))); // NOI18N

        jLabel19.setBackground(new java.awt.Color(153, 204, 255));
        jLabel19.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("이체");
        jLabel19.setOpaque(true);

        btnTransToOhers.setText("이체");
        btnTransToOhers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransToOhersActionPerformed(evt);
            }
        });

        txtTransPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransPWActionPerformed(evt);
            }
        });

        title5.setBackground(new java.awt.Color(153, 204, 255));
        title5.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        title5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title5.setText("INHA BANK");
        title5.setOpaque(true);

        jLabel22.setText("이체할 계좌");

        jLabel23.setText("이체 금액");

        jLabel24.setText("계좌 비밀번호");

        btnExit2.setBackground(new java.awt.Color(153, 153, 153));
        btnExit2.setText("돌아가기");
        btnExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("맑은 고딕", 0, 8)); // NOI18N
        jLabel10.setText("수수료 500원");

        javax.swing.GroupLayout TransToOthersLayout = new javax.swing.GroupLayout(TransToOthers.getContentPane());
        TransToOthers.getContentPane().setLayout(TransToOthersLayout);
        TransToOthersLayout.setHorizontalGroup(
            TransToOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransToOthersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TransToOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TransToOthersLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel18)))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransToOthersLayout.createSequentialGroup()
                .addGroup(TransToOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TransToOthersLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(TransToOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TransToOthersLayout.createSequentialGroup()
                                .addComponent(btnExit2)
                                .addGap(18, 18, 18)
                                .addComponent(btnTransToOhers))
                            .addGroup(TransToOthersLayout.createSequentialGroup()
                                .addGroup(TransToOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel22))
                                .addGap(18, 18, 18)
                                .addGroup(TransToOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTransAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(txtTransMoney)))
                            .addGroup(TransToOthersLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(txtTransPW, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(TransToOthersLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(title5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(TransToOthersLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(rbtnOther)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnMine)))
                .addGap(53, 53, 53))
        );
        TransToOthersLayout.setVerticalGroup(
            TransToOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransToOthersLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(TransToOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnMine)
                    .addComponent(rbtnOther)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(TransToOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtTransAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TransToOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtTransMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TransToOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtTransPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(TransToOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransToOhers)
                    .addComponent(btnExit2))
                .addGap(18, 18, 18)
                .addComponent(title5)
                .addGap(30, 30, 30))
        );

        transList.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                transListWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                transListWindowClosing(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel25.setText("거래 내역 조회");

        jLabel26.setText("조회자 계좌번호");

        jLabel27.setText("조회자 이름");

        jLabel28.setText("통장 잔고");

        txtareaList.setColumns(20);
        txtareaList.setRows(5);
        jScrollPane2.setViewportView(txtareaList);

        btnExit3.setBackground(new java.awt.Color(153, 153, 153));
        btnExit3.setText("돌아가기");
        btnExit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transListLayout = new javax.swing.GroupLayout(transList.getContentPane());
        transList.getContentPane().setLayout(transListLayout);
        transListLayout.setHorizontalGroup(
            transListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transListLayout.createSequentialGroup()
                .addGroup(transListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(transListLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(transListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(transListLayout.createSequentialGroup()
                                .addGroup(transListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28))
                                .addGap(40, 40, 40)
                                .addGroup(transListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtViewName)
                                    .addComponent(txtViewAccount)
                                    .addComponent(txtViewBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(transListLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit3)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        transListLayout.setVerticalGroup(
            transListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transListLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(transListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(btnExit3))
                .addGap(18, 18, 18)
                .addGroup(transListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(transListLayout.createSequentialGroup()
                        .addGroup(transListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtViewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(transListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtViewName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addComponent(txtViewBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel28))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel29.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel29.setText("환전 서비스");

        jLabel30.setText("뽑으실 돈을 \\ 단위로 입력하세요.");

        jLabel31.setText("출금할 금액 \\");

            btnExchangeY.setText("엔  ¥");
            btnExchangeY.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnExchangeYActionPerformed(evt);
                }
            });

            btnExchangeS.setText("달러  $");
            btnExchangeS.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnExchangeSActionPerformed(evt);
                }
            });

            btnExcahngeD.setText("동 ₫");
            btnExcahngeD.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnExcahngeDActionPerformed(evt);
                }
            });

            jLabel32.setText("일본");

            jLabel33.setText("미국");

            jLabel34.setText("베트남");

            btnExitExcahnge.setBackground(new java.awt.Color(153, 153, 153));
            btnExitExcahnge.setText("돌아가기");
            btnExitExcahnge.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnExitExcahngeActionPerformed(evt);
                }
            });

            jLabel35.setText("원");

            jLabel36.setText("비밀번호");

            javax.swing.GroupLayout exchangeLayout = new javax.swing.GroupLayout(exchange.getContentPane());
            exchange.getContentPane().setLayout(exchangeLayout);
            exchangeLayout.setHorizontalGroup(
                exchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exchangeLayout.createSequentialGroup()
                    .addGroup(exchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(exchangeLayout.createSequentialGroup()
                            .addGap(145, 145, 145)
                            .addComponent(jLabel29))
                        .addGroup(exchangeLayout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jLabel30)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exchangeLayout.createSequentialGroup()
                    .addGroup(exchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(exchangeLayout.createSequentialGroup()
                            .addGap(231, 231, 231)
                            .addComponent(btnExitExcahnge)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(exchangeLayout.createSequentialGroup()
                            .addGap(0, 24, Short.MAX_VALUE)
                            .addGroup(exchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(exchangeLayout.createSequentialGroup()
                                    .addGroup(exchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(exchangeLayout.createSequentialGroup()
                                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, exchangeLayout.createSequentialGroup()
                                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(48, 48, 48)))
                                    .addGroup(exchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtExchangePW, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                        .addComponent(txtExchangeMoney)))
                                .addGroup(exchangeLayout.createSequentialGroup()
                                    .addGroup(exchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel32)
                                        .addComponent(btnExchangeY))
                                    .addGap(40, 40, 40)
                                    .addGroup(exchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnExchangeS)
                                        .addComponent(jLabel33))
                                    .addGap(56, 56, 56)
                                    .addGroup(exchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnExcahngeD)
                                        .addComponent(jLabel34))))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel35)
                    .addGap(32, 32, 32))
            );
            exchangeLayout.setVerticalGroup(
                exchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exchangeLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel29)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel30)
                    .addGap(31, 31, 31)
                    .addGroup(exchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtExchangeMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31)
                        .addComponent(jLabel35))
                    .addGap(18, 18, 18)
                    .addGroup(exchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtExchangePW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                    .addGroup(exchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(jLabel33)
                        .addComponent(jLabel34))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(exchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExchangeS)
                        .addComponent(btnExchangeY)
                        .addComponent(btnExcahngeD))
                    .addGap(39, 39, 39)
                    .addComponent(btnExitExcahnge)
                    .addGap(20, 20, 20))
            );

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            title1.setBackground(new java.awt.Color(153, 204, 255));
            title1.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
            title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            title1.setText("INHA BANK");
            title1.setOpaque(true);

            btnLogin.setBackground(new java.awt.Color(51, 153, 255));
            btnLogin.setText("접속하기 (로그인)");
            btnLogin.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnLoginActionPerformed(evt);
                }
            });

            btnJoin.setText("회원가입");
            btnJoin.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnJoinActionPerformed(evt);
                }
            });

            jLabel1.setText("아직 인하은행의 고객님이 아니신가요?");

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/login.png"))); // NOI18N

            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/school_1.png"))); // NOI18N

            jLabel4.setFont(new java.awt.Font("맑은 고딕", 0, 10)); // NOI18N
            jLabel4.setText("가입시 5000원 지급 이벤트 진행 중!");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(31, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addComponent(btnJoin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(79, 79, 79)
                                    .addComponent(jLabel2)))
                            .addGap(70, 70, 70))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(154, 154, 154))))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(title1)
                            .addGap(27, 27, 27)
                            .addComponent(jLabel2)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4))
                        .addComponent(btnJoin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(9, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        this.setVisible(false);
        login.setLocation(1000, 500);
        login.setSize(400, 400);
        login.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinActionPerformed
        this.setVisible(false);
        join.setLocation(1000, 500);
        join.setSize(450, 580);
        join.setVisible(true);
    }//GEN-LAST:event_btnJoinActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // X
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPWActionPerformed
        // X
    }//GEN-LAST:event_txtPWActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        ID = txtID.getText().trim();  // ID 전역 변수에 내 id를 할당
        char[] password = txtPW.getPassword();
        String strPW = new String(password).trim();
        String strSQL = "SELECT * FROM user WHERE userID = '" + ID + "'";

        try {
            DBM.dbOpen();
            try {
                DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
                
                if (DBM.DB_rs.next()) {   // DB에 아이디가 존재 하는지 확인
                    if (strPW.equals(DBM.DB_rs.getString("userPW"))) {
                        JOptionPane.showMessageDialog(null, ID + "님 로그인에 성공하였습니다.");
                        
                        String getNameSQL = "SELECT username FROM user WHERE userid = '" + ID + "'";
                        DBM.DB_rs = DBM.DB_stmt.executeQuery(getNameSQL);

                        if (DBM.DB_rs.next()) {
                            NAME = DBM.DB_rs.getString("username");  
                        }
                        
                        DBM.dbClose();

                        // 로그인 성공시
                        login.setVisible(false);
                        atm.setLocation(1000, 500);
                        atm.setSize(411, 440);
                        atm.setVisible(true);

                        txtID.setText("");
                        txtPW.setText("");
                    } else {   // 암호가 같지 않다면
                        JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.");
                        DBM.dbClose();
                    }

                } else {   // 아이디가 존재하지 않다면
                    JOptionPane.showMessageDialog(null, "가입되지 않은 아이디입니다.");
                    DBM.dbClose();
                }

            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                DBM.dbClose();
            }
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void btnJoin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoin1ActionPerformed
        String name = txtJoinName.getText();
        int balance = 5000;
        String id = txtJoinID.getText();
        char[] password = txtJoinPW.getPassword();
        char[] accountPW = txtJoinAccountPW.getPassword();
        Random account = new Random();
        String phoneNo = txtJoinPhone.getText();

        String strPW = new String(password).trim();
        String strAccountPW = new String(accountPW).trim();

        if(!id.equals("") && !strPW.equals("") && !strAccountPW.equals("")) {
            boolean idCheck = getId(id); // 이미 아이디가 존재하는지 확인 (메소드 이용)
            if(!idCheck) {
                txtIDCheck.setText("사용 가능한 아이디입니다.");
                String enteredCaptcha = txtCapcha.getText();
                if (!enteredCaptcha.equals(captchaAnswer)) {
                    JOptionPane.showMessageDialog(this, "보안문자가 올바르지 않습니다.");
                    generateCaptcha();
                    return;
                }
                String accountNo = "1958";
                for (int i = 0; i < 8; i++) {   // 무작위 난수의 계좌번호 생성
                    accountNo += Integer.toString(account.nextInt(10));
                }
                String strQuery = "INSERT INTO user (username, balance, userID, userPW, account, accountPW, PhoneNo) VALUES ('" + name + "', '" + balance +"','"+ id + "', '"+ strPW + "','" + accountNo +"','" + strAccountPW + "','" + phoneNo + "');";
                try {
                    DBM.dbOpen();
                    try {
                        int result = DBM.DB_stmt.executeUpdate(strQuery);
                        if (result != 0) {
                            ID = id; // 로그인 정보 담기
                            JOptionPane.showMessageDialog(null, id + "님 회원가입 감사합니다.\n (계좌번호:  " + accountNo +")");
                            join.setVisible(false);
                            new MainFrame().setVisible(true);
                            DBM.dbClose();
                        } else {  // 회원가입에 실패한 경우 (레코드 삽입 실패)
                            JOptionPane.showMessageDialog(null, "회원가입에 실패하셨습니다.");
                            DBM.dbClose();
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                txtJoinName.setText("");
                txtJoinID.setText("");
                txtJoinPW.setText("");
                txtJoinAccountPW.setText("");
                txtJoinPhone.setText("");

            } else {
                txtIDCheck.setText("중복된 아이디입니다.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "사용하실 아이디와 비밀번호를 입력하세요.");
        }
    }//GEN-LAST:event_btnJoin1ActionPerformed

    private void btnOverlapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOverlapActionPerformed
        // 중복확인 버튼
        String id = txtJoinID.getText().trim();
        boolean idCheck = getId(id);

        if(!idCheck) {
            txtIDCheck.setText("사용 가능한 아이디입니다.");
        } else {
            txtIDCheck.setText("중복된 아이디입니다.");
        }
    }//GEN-LAST:event_btnOverlapActionPerformed

    private void txtJoinPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJoinPWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJoinPWActionPerformed

    private void txtJoinPWKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJoinPWKeyReleased

    }//GEN-LAST:event_txtJoinPWKeyReleased

    private void txtJoinAccountPWKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJoinAccountPWKeyReleased

    }//GEN-LAST:event_txtJoinAccountPWKeyReleased

    private void txtJoinNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJoinNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJoinNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        join.setVisible(false);
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnTransJapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransJapanActionPerformed
        lblNomal.setText("通常取引");
        btnDeposit.setText("預金");
        btnWithdraw.setText("引き出し");
        btnSubmit.setText("振込");
        btnListView.setText("取引履歴検索");

        lblOther.setText("外貨取引");
        btnMoneyTrans.setText("為替サービス");
        footer.setText("INHA BANK");

        lblNomal.setFont(new java.awt.Font("Malgun Gothic", 0, 12));
        btnDeposit.setFont(new java.awt.Font("Malgun Gothic", 1, 14));
        btnWithdraw.setFont(new java.awt.Font("Malgun Gothic", 1, 14));
        btnSubmit.setFont(new java.awt.Font("Malgun Gothic", 1, 14));
        btnListView.setFont(new java.awt.Font("Malgun Gothic", 1, 14));

        lblOther.setFont(new java.awt.Font("Malgun Gothic", 0, 12));
        btnMoneyTrans.setFont(new java.awt.Font("Malgun Gothic", 1, 14));
        footer.setFont(new java.awt.Font("Malgun Gothic", 1, 12));
    }//GEN-LAST:event_btnTransJapanActionPerformed

    private void rbtnKoreanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnKoreanActionPerformed
        lblNomal.setText("일반 거래");
        btnDeposit.setText("입금");
        btnWithdraw.setText("출금");
        btnSubmit.setText("이체");
        btnListView.setText("거래내역 조회");
        
        lblOther.setText("외화 거래");
        btnMoneyTrans.setText("환전 서비스");
        footer.setText("INHA BANK");
        
        lblNomal.setFont(new java.awt.Font("Malgun Gothic", 0, 12));
        btnDeposit.setFont(new java.awt.Font("Malgun Gothic", 1, 14));
        btnWithdraw.setFont(new java.awt.Font("Malgun Gothic", 1, 14));
        btnSubmit.setFont(new java.awt.Font("Malgun Gothic", 1, 14));
        btnListView.setFont(new java.awt.Font("Malgun Gothic", 1, 14));  
        
        lblOther.setFont(new java.awt.Font("Malgun Gothic", 0, 12));
        btnMoneyTrans.setFont(new java.awt.Font("Malgun Gothic", 1, 14));  
        footer.setFont(new java.awt.Font("Malgun Gothic", 1, 12));  
    }//GEN-LAST:event_rbtnKoreanActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        atm.setVisible(false);
        TransToOthers.setLocation(800, 500);
        TransToOthers.setSize(400, 450);
        TransToOthers.setVisible(true);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        atm.setVisible(false);
        deposit.setLocation(800, 500);
        deposit.setSize(411, 423);
        deposit.setVisible(true);
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        atm.setVisible(false);
        withdraw.setLocation(800, 500);
        withdraw.setSize(411, 423);
        withdraw.setVisible(true);
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnWithdrawFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawFrameActionPerformed
        int amount = Integer.parseInt(txtMinus.getText());
        char[] pw = txtMinusPW.getPassword();
        String password = new String(pw).trim();

        try {
            DBM.dbOpen();

            try {
                String strSQL = "SELECT * FROM user WHERE userid = '" + ID + "'";
                DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);

                if (DBM.DB_rs.next()) {
                    if (DBM.DB_rs.getString("accountPW").equals(password)) {
                        String account = DBM.DB_rs.getString("account");
                        int balance = Integer.parseInt(DBM.DB_rs.getString("balance"));
                        String currentDate = format.format(System.currentTimeMillis());

                        if (balance >= amount) {
                            balance -= amount;
                            JOptionPane.showMessageDialog(null, ID + "님 " + amount + "원 출금되었습니다.\n잔액: " + balance);

                            String updateSQL = "UPDATE user SET balance = " + balance + " WHERE userid = '" + ID + "'";
                            DBM.DB_stmt.executeUpdate(updateSQL);

                            String insertSQL =
                            "INSERT INTO transaction VALUES('" + account + "', '출금', " + amount + ", '본인', '" + currentDate + "')";
                            DBM.DB_stmt.executeUpdate(insertSQL);
                            DBM.dbClose();

                        } else {
                            JOptionPane.showMessageDialog(null, "잔액이 부족합니다.");
                            DBM.dbClose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "계좌 비밀번호가 다릅니다.");
                        DBM.dbClose();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "출금에 실패하였습니다.");
                    DBM.dbClose();
                }

                txtMinus.setText(null);
                txtMinusPW.setText(null);

            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                DBM.dbClose();
            }
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnWithdrawFrameActionPerformed

    private void txtMinusPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinusPWActionPerformed
        // X
    }//GEN-LAST:event_txtMinusPWActionPerformed

    private void txtPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlusActionPerformed
        int amount = Integer.parseInt(txtMoney1.getText());  // 입금 금액
        char[] pw = txtPlusPW1.getPassword();
        String password = new String(pw).trim();    // 계좌 비밀번호

        try {
            DBM.dbOpen();

            try {
                String strSQL = "SELECT * FROM user WHERE userID = '" + ID + "'";
                DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);

                if (DBM.DB_rs.next()) {
                    if (DBM.DB_rs.getString("accountPW").equals(password)) {
                        String account = DBM.DB_rs.getString("account");
                        int balance = Integer.parseInt(DBM.DB_rs.getString("balance"));
                        String currentDate = format.format(System.currentTimeMillis());

                        balance += amount;
                        JOptionPane.showMessageDialog(null, ID + "님 " + amount + "원 입금되었습니다.\n잔액: " + balance);

                        String updateSQL = "UPDATE user SET balance = " + balance + " WHERE userid = '" + ID + "'";
                        DBM.DB_stmt.executeUpdate(updateSQL);

                        String insertSQL =
                        "INSERT INTO transaction VALUES('" + account + "', '입금', " + amount + ", '본인', '" + currentDate + "')";
                        DBM.DB_stmt.executeUpdate(insertSQL);

                        DBM.dbClose();

                    } else {
                        JOptionPane.showMessageDialog(null, "계좌 비밀번호가 다릅니다.");
                        DBM.dbClose();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "입금에 실패하였습니다.");
                    DBM.dbClose();
                }

                txtMoney1.setText(null);
                txtPlusPW1.setText(null);

            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                DBM.dbClose();
            }
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtPlusActionPerformed

    private void btnTransToOhersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransToOhersActionPerformed
        if(rbtnOther.isSelected()) {
            int amount = Integer.parseInt(txtTransMoney.getText());  // 이체 금액
            char[] pw = txtTransPW.getPassword();
            String password = new String(pw).trim();
            String transAccount = txtTransAccount.getText(); // 상대 계좌번호
            String currentDate = format.format(System.currentTimeMillis());  // 현재 날짜

            try {
                DBM.dbOpen();

                try {
                    String strSQL = "SELECT * FROM user WHERE userID = '" + ID + "'";
                    DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);

                    if (DBM.DB_rs.next()) {  // 아이디가 DB에 존재하는가?
                        if (DBM.DB_rs.getString("accountPW").equals(password)) {  // 계좌 비밀번호가 일치하는가?
                            String accNo = DBM.DB_rs.getString("account");    // 내 계좌 번호
                            int balance = Integer.parseInt(DBM.DB_rs.getString("balance"));  // 내 계좌 잔액

                            if (balance >= amount) {  // 계좌 잔액이 충분한 경우  
                                int realMinus = amount + 500; // 수수료 500원도 함께 차감
                                balance -= realMinus;
                                String updateSQL = "UPDATE user SET balance = " + balance + " WHERE userID = '" + ID + "'";
                                DBM.DB_stmt.executeUpdate(updateSQL); // 내 계좌 잔액 갱신

                                String transName = transfer(transAccount, amount);
                                // 함수로 상대계좌랑 이체금액 매개변수로 보내서 처리 리턴으로 상대 이름(거래내역때 쓰려고) 받아옴
                                if (transName != null) {  // 상대 계좌번호를 발견 못한 경우
                                    JOptionPane.showMessageDialog(null, ID + "님 " + transName + "님에게" + amount + "원 이체되었습니다.\n잔액: " + balance);

                                    String insertSQL = "INSERT INTO transaction VALUES('" + accNo + "', '이체', " + amount + ",'" + transName + "','"+currentDate+"')";
                                    DBM.DB_stmt.executeUpdate(insertSQL); // 보내는 입장 거래 내역 갱신
                                    
                                    String insertOtherSQL = "INSERT INTO transaction VALUES('" + transAccount + "', '입금', " + amount + ",'" + NAME + "','"+currentDate+"')";
                                    DBM.DB_stmt.executeUpdate(insertOtherSQL); // 받는 거래 내역 갱신
                                    DBM.dbClose();

                                } else {
                                    JOptionPane.showMessageDialog(null, "올바르지 않은 계좌번호 입니다.");
                                    DBM.dbClose();
                                }

                            } else {  // 계좌 잔액이 부족한 경우
                                JOptionPane.showMessageDialog(null, "계좌 잔액이 부족합니다.");
                                DBM.dbClose();
                            }

                        } else {  // 입력한 계좌 비밀번호가 다른 경우
                            JOptionPane.showMessageDialog(null, "계좌 비밀번호가 다릅니다.");
                            DBM.dbClose();
                        }

                    } else {  // 아이디가 DB에 존재하지 않은 경우
                        JOptionPane.showMessageDialog(null, "이체에 실패하였습니다.");
                        DBM.dbClose();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    DBM.dbClose();
                }
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        } else {
            int amount = Integer.parseInt(txtTransMoney.getText());  // 이체 금액
            char[] pw = txtTransPW.getPassword();
            String password = new String(pw).trim();
            String transAccount = txtTransAccount.getText(); // 상대 계좌번호
            String currentDate = format.format(System.currentTimeMillis());  // 현재 날짜

            try {
                DBM.dbOpen();

                try {
                    String strSQL = "SELECT * FROM user WHERE userID = '" + ID + "'";
                    DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);

                    if (DBM.DB_rs.next()) {  // 아이디가 DB에 존재하는가?
                        if (DBM.DB_rs.getString("accountPW").equals(password)) {  // 계좌 비밀번호가 일치하는가?
                            String accNo = DBM.DB_rs.getString("account");    // 내 계좌 번호
                            int balance = Integer.parseInt(DBM.DB_rs.getString("balance"));  // 내 계좌 잔액

                            if (balance >= amount) {  // 계좌 잔액이 충분한 경우  
                                balance -= amount;
                                String updateSQL = "UPDATE user SET balance = " + balance + " WHERE userID = '" + ID + "'";
                                DBM.DB_stmt.executeUpdate(updateSQL); // 내 계좌 잔액 갱신

                                String transName = transfer(transAccount, amount);
                                // 함수로 상대계좌랑 이체금액 매개변수로 보내서 처리 리턴으로 상대 이름(거래내역때 쓰려고) 받아옴
                                if (transName != null) {
                                    JOptionPane.showMessageDialog(null, ID + "님 " + transName + "님에게" + amount + "원 이체되었습니다.\n잔액: " + balance);

                                    String insertSQL = "INSERT INTO transaction VALUES('" + accNo + "', '이체', " + amount + ",'" + transName + "','"+currentDate+"')";
                                    DBM.DB_stmt.executeUpdate(insertSQL); // 보내는 입장 거래 내역 갱신
                                    
                                    String insertOtherSQL = "INSERT INTO transaction VALUES('" + transAccount + "', '입금', " + amount + ",'" + ID + "','"+currentDate+"')";
                                    DBM.DB_stmt.executeUpdate(insertOtherSQL); // 받는 거래 내역 갱신
                                    DBM.dbClose();

                                } else {
                                    JOptionPane.showMessageDialog(null, "올바르지 않은 계좌번호 입니다.");
                                    DBM.dbClose();
                                }

                            } else {  // 계좌 잔액이 부족한 경우
                                JOptionPane.showMessageDialog(null, "계좌 잔액이 부족합니다.");
                                DBM.dbClose();
                            }

                        } else {  // 입력한 계좌 비밀번호가 다른 경우
                            JOptionPane.showMessageDialog(null, "계좌 비밀번호가 다릅니다.");
                            DBM.dbClose();
                        }

                    } else {  // 아이디가 DB에 존재하지 않은 경우
                        JOptionPane.showMessageDialog(null, "이체에 실패하였습니다.");
                        DBM.dbClose();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    DBM.dbClose();
                }
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }    
    }//GEN-LAST:event_btnTransToOhersActionPerformed

    private void txtTransPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransPWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransPWActionPerformed

    private void transListWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_transListWindowActivated

    }//GEN-LAST:event_transListWindowActivated

    private void transListWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_transListWindowClosing
        atm.setLocation(800, 500);
        atm.setSize(411, 423);
        atm.setVisible(true);
    }//GEN-LAST:event_transListWindowClosing

    private void btnListViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListViewActionPerformed
        atm.setVisible(false);
        transList.setLocation(800, 500);
        transList.setSize(550, 550);
        transList.setVisible(true);
        
        // 거래내역 조회
        try {
            DBM.dbOpen();
            
            try {
                String strSQL = "SELECT * FROM user WHERE userid = '" + ID + "'";
                DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);  // 현재 사용자의 정보를 끌어옴
                
                if (DBM.DB_rs.next()) {  // 현재 사용자의 정보가 존재 하는가?
                    String accountNo = DBM.DB_rs.getString("account");  // 계좌번호
                    String name = DBM.DB_rs.getString("username");            // 이름
                    String balance = DBM.DB_rs.getString("balance");      // 계좌 잔액
                    txtViewAccount.setText(accountNo);
                    txtViewName.setText(name);
                    txtViewBalance.setText(balance);
                    
                    strSQL = "SELECT * FROM transaction WHERE account = '" + accountNo + "'";
                    DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);  // 현재 사용자의 거래 내역을 끌어옴
                    String viewResult = "거래일자\t거래종류\t거래금액\t거래처\n";
                    
                    while (DBM.DB_rs.next()) {
                        String date = DBM.DB_rs.getString("date");      // 거래일
                        String type = DBM.DB_rs.getString("type");      // 구분
                        String amount = DBM.DB_rs.getString("amount");  // 거래금액
                        String opponent = DBM.DB_rs.getString("opponent");  // 입금처
                        
                        viewResult += (date + "\t");
                        viewResult += (type + "\t");
                        viewResult += (amount + "\t");
                        viewResult += (opponent + "\t\n");
                    }
                    
                    txtareaList.setText(viewResult);
                    DBM.dbClose();
                    
                } else {  // 사용자의 정보가 존재하지 않을 경우
                    JOptionPane.showMessageDialog(null, "사용자의 정보가 존재하지 않습니다.");
                    transList.setVisible(false);
                    atm.setVisible(true);
                    DBM.dbClose();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                DBM.dbClose();
            }
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);           
        }
    }//GEN-LAST:event_btnListViewActionPerformed

    private void depositWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_depositWindowClosed
        // X
    }//GEN-LAST:event_depositWindowClosed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        deposit.setVisible(false);
        atm.setLocation(800, 500);
        atm.setSize(411, 423);
        atm.setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        withdraw.setVisible(false);
        atm.setLocation(800, 500);
        atm.setSize(411, 423);
        atm.setVisible(true);
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit2ActionPerformed
        transList.setVisible(false);
        atm.setLocation(800, 500);
        atm.setSize(411, 433);
        atm.setVisible(true);
    }//GEN-LAST:event_btnExit2ActionPerformed

    private void btnExit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit3ActionPerformed
        transList.setVisible(false);
        atm.setLocation(800, 500);
        atm.setSize(411, 433);
        atm.setVisible(true);
    }//GEN-LAST:event_btnExit3ActionPerformed

    private void btnExit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit4ActionPerformed
        login.setVisible(false);
        atm.setLocation(800, 500);
        atm.setSize(411, 433);
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_btnExit4ActionPerformed

    private void btnExchangeYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExchangeYActionPerformed
        int amount = Integer.parseInt(txtExchangeMoney.getText());
        char[] pw = txtExchangePW.getPassword();
        String password = new String(pw).trim();

        try {
            DBM.dbOpen();

            try {
                String strSQL = "SELECT * FROM user WHERE userid = '" + ID + "'";
                DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);

                if (DBM.DB_rs.next()) {
                    if (DBM.DB_rs.getString("accountPW").equals(password)) {
                        String account = DBM.DB_rs.getString("account");
                        int balance = Integer.parseInt(DBM.DB_rs.getString("balance"));
                        String currentDate = format.format(System.currentTimeMillis());

                        if (balance >= amount) {
                            balance -= amount;
                            double yen = amount * 0.11;
                            JOptionPane.showMessageDialog(null, ID + "님 ¥" + yen + "출금되었습니다.\n잔액: " + balance);

                            String updateSQL = "UPDATE user SET balance = " + balance + " WHERE userid = '" + ID + "'";
                            DBM.DB_stmt.executeUpdate(updateSQL);

                            String insertSQL =
                            "INSERT INTO transaction VALUES('" + account + "', '엔화 환전', " + amount + ", '본인', '" + currentDate + "')";
                            DBM.DB_stmt.executeUpdate(insertSQL);
                            DBM.dbClose();

                        } else {
                            JOptionPane.showMessageDialog(null, "잔액이 부족합니다.");
                            DBM.dbClose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "계좌 비밀번호가 다릅니다.");
                        DBM.dbClose();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "출금에 실패하였습니다.");
                    DBM.dbClose();
                }

                txtExchangeMoney.setText(null);
                txtExchangePW.setText(null);

            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                DBM.dbClose();
            }
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExchangeYActionPerformed

    private void btnExitExcahngeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitExcahngeActionPerformed
        exchange.setVisible(false);
        atm.setLocation(800, 500);
        atm.setSize(411, 433);
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_btnExitExcahngeActionPerformed

    private void btnExchangeSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExchangeSActionPerformed
        int amount = Integer.parseInt(txtExchangeMoney.getText());
        char[] pw = txtExchangePW.getPassword();
        String password = new String(pw).trim();

        try {
            DBM.dbOpen();

            try {
                String strSQL = "SELECT * FROM user WHERE userid = '" + ID + "'";
                DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);

                if (DBM.DB_rs.next()) {
                    if (DBM.DB_rs.getString("accountPW").equals(password)) {
                        String account = DBM.DB_rs.getString("account");
                        int balance = Integer.parseInt(DBM.DB_rs.getString("balance"));
                        String currentDate = format.format(System.currentTimeMillis());

                        if (balance >= amount) {
                            balance -= amount;
                            double dalor = amount * 0.00076;
                            JOptionPane.showMessageDialog(null, ID + "님 $" + dalor + "출금되었습니다.\n잔액: " + balance);

                            String updateSQL = "UPDATE user SET balance = " + balance + " WHERE userid = '" + ID + "'";
                            DBM.DB_stmt.executeUpdate(updateSQL);

                            String insertSQL =
                            "INSERT INTO transaction VALUES('" + account + "', '달러 환전', " + amount + ", '본인', '" + currentDate + "')";
                            DBM.DB_stmt.executeUpdate(insertSQL);
                            DBM.dbClose();

                        } else {
                            JOptionPane.showMessageDialog(null, "잔액이 부족합니다.");
                            DBM.dbClose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "계좌 비밀번호가 다릅니다.");
                        DBM.dbClose();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "출금에 실패하였습니다.");
                    DBM.dbClose();
                }

                txtExchangeMoney.setText(null);
                txtExchangePW.setText(null);

            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                DBM.dbClose();
            }
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExchangeSActionPerformed

    private void btnExcahngeDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcahngeDActionPerformed
        int amount = Integer.parseInt(txtExchangeMoney.getText());
        char[] pw = txtExchangePW.getPassword();
        String password = new String(pw).trim();

        try {
            DBM.dbOpen();

            try {
                String strSQL = "SELECT * FROM user WHERE userid = '" + ID + "'";
                DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);

                if (DBM.DB_rs.next()) {
                    if (DBM.DB_rs.getString("accountPW").equals(password)) {
                        String account = DBM.DB_rs.getString("account");
                        int balance = Integer.parseInt(DBM.DB_rs.getString("balance"));
                        String currentDate = format.format(System.currentTimeMillis());

                        if (balance >= amount) {
                            balance -= amount;
                            double dong = amount * 18.39;
                            JOptionPane.showMessageDialog(null, ID + "님 ₫" + dong + "출금되었습니다.\n잔액: " + balance);

                            String updateSQL = "UPDATE user SET balance = " + balance + " WHERE userid = '" + ID + "'";
                            DBM.DB_stmt.executeUpdate(updateSQL);

                            String insertSQL =
                            "INSERT INTO transaction VALUES('" + account + "', '달러 환전', " + amount + ", '본인', '" + currentDate + "')";
                            DBM.DB_stmt.executeUpdate(insertSQL);
                            DBM.dbClose();

                        } else {
                            JOptionPane.showMessageDialog(null, "잔액이 부족합니다.");
                            DBM.dbClose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "계좌 비밀번호가 다릅니다.");
                        DBM.dbClose();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "출금에 실패하였습니다.");
                    DBM.dbClose();
                }

                txtExchangeMoney.setText(null);
                txtExchangePW.setText(null);

            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                DBM.dbClose();
            }
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcahngeDActionPerformed

    private void btnTransEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransEngActionPerformed
        lblNomal.setText("Normal Transaction");
        btnDeposit.setText("Deposit");
        btnWithdraw.setText("Withdraw");
        btnSubmit.setText("Transfer");
        btnListView.setText("View Transaction History");

        lblOther.setText("Foreign Currency Transaction");
        btnMoneyTrans.setText("Currency Exchange Service");
        footer.setText("INHA BANK");

        lblNomal.setFont(new java.awt.Font("Malgun Gothic", 0, 12));
        btnDeposit.setFont(new java.awt.Font("Malgun Gothic", 1, 14));
        btnWithdraw.setFont(new java.awt.Font("Malgun Gothic", 1, 14));
        btnSubmit.setFont(new java.awt.Font("Malgun Gothic", 1, 14));
        btnListView.setFont(new java.awt.Font("Malgun Gothic", 1, 14));

        lblOther.setFont(new java.awt.Font("Malgun Gothic", 0, 12));
        btnMoneyTrans.setFont(new java.awt.Font("Malgun Gothic", 1, 14));
        footer.setFont(new java.awt.Font("Malgun Gothic", 1, 12));

    }//GEN-LAST:event_btnTransEngActionPerformed

    private void rbtnOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnOtherActionPerformed

    private void btnMoneyTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoneyTransActionPerformed
        atm.setVisible(false);
        exchange.setLocation(800, 500);
        exchange.setSize(411, 433);
        exchange.setVisible(true);
    }//GEN-LAST:event_btnMoneyTransActionPerformed

    public String transfer(String account, int amount) throws IOException, SQLException {
        // 타행 이체시
        if (rbtnOther.isSelected()) {
            DBM.dbOpen();
            String strSQL = "SELECT * FROM user WHERE account = '" + account + "'"; // 이체 상대 찾는 SQL문
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
        
            if (DBM.DB_rs.next()) {  // 상대 계좌번호가 DB에 존재하는지
                String name = DBM.DB_rs.getString("username");  // 이체 받는 사람 이름
                int balance = Integer.parseInt(DBM.DB_rs.getString("balance"));  // 이체 받는 사람 계좌 잔액
                balance += amount;  // 이체 받은만큼 잔고 더해줌 (수수료 500원 제외)

                String updateSQL = "UPDATE user SET balance = " + balance + " WHERE account = '" + account + "'";
                DBM.DB_stmt.executeUpdate(updateSQL);  // 상대 계좌 잔액 갱신
                return name;

            } else {
                JOptionPane.showMessageDialog(null, "상대 계좌번호가 없습니다.");
                return null;
            }
        // 기본 같은 은행 이체시
        } else {
            DBM.dbOpen();
            String strSQL = "SELECT * FROM user WHERE account = '" + account + "'"; // 이체 상대 찾는 SQL문
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);

            if (DBM.DB_rs.next()) {  // 상대 계좌번호가 DB에 존재하는지
                String name = DBM.DB_rs.getString("username");  // 이체 받는 사람 이름
                int balance = Integer.parseInt(DBM.DB_rs.getString("balance"));  // 이체 받는 사람 계좌 잔액
                balance += amount;  // 이체 받은만큼 잔고 더해줌

                String updateSQL = "UPDATE user SET balance = " + balance + " WHERE account = '" + account + "'";
                DBM.DB_stmt.executeUpdate(updateSQL);  // 상대 계좌 잔액 갱신
                return name;

            } else {
                JOptionPane.showMessageDialog(null, "상대 계좌번호가 없습니다.");
                return null;
            }
        
        }
        
    }
        
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame TransToOthers;
    private javax.swing.JFrame atm;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnExcahngeD;
    private javax.swing.JButton btnExchangeS;
    private javax.swing.JButton btnExchangeY;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnExit2;
    private javax.swing.JButton btnExit3;
    private javax.swing.JButton btnExit4;
    private javax.swing.JButton btnExitExcahnge;
    private javax.swing.JButton btnJoin;
    private javax.swing.JButton btnJoin1;
    private javax.swing.JButton btnListView;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JButton btnMoneyTrans;
    private javax.swing.JButton btnOverlap;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JRadioButton btnTransEng;
    private javax.swing.JRadioButton btnTransJapan;
    private javax.swing.JButton btnTransToOhers;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JButton btnWithdrawFrame;
    private javax.swing.JLabel captchaLabel;
    private javax.swing.JFrame deposit;
    private javax.swing.JLabel depositFooter;
    private javax.swing.JFrame exchange;
    private javax.swing.JLabel footer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFrame join;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblID2;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNomal;
    private javax.swing.JLabel lblOther;
    private javax.swing.JLabel lblPW;
    private javax.swing.JLabel lblPW1;
    private javax.swing.JLabel lblPW2;
    private javax.swing.JLabel lblSignup;
    private javax.swing.JFrame login;
    private javax.swing.ButtonGroup rbtnGroupBank;
    private javax.swing.ButtonGroup rbtnGroupLanguage;
    private javax.swing.JRadioButton rbtnKorean;
    private javax.swing.JRadioButton rbtnMine;
    private javax.swing.JRadioButton rbtnOther;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title5;
    private javax.swing.JFrame transList;
    private javax.swing.JTextField txtCapcha;
    private javax.swing.JTextField txtExchangeMoney;
    private javax.swing.JPasswordField txtExchangePW;
    private javax.swing.JTextField txtID;
    private javax.swing.JLabel txtIDCheck;
    private javax.swing.JPasswordField txtJoinAccountPW;
    private javax.swing.JTextField txtJoinID;
    private javax.swing.JTextField txtJoinName;
    private javax.swing.JPasswordField txtJoinPW;
    private javax.swing.JTextField txtJoinPhone;
    private javax.swing.JTextField txtMinus;
    private javax.swing.JPasswordField txtMinusPW;
    private javax.swing.JTextField txtMoney1;
    private javax.swing.JPasswordField txtPW;
    private javax.swing.JButton txtPlus;
    private javax.swing.JPasswordField txtPlusPW1;
    private javax.swing.JTextField txtTransAccount;
    private javax.swing.JTextField txtTransMoney;
    private javax.swing.JPasswordField txtTransPW;
    private javax.swing.JTextField txtViewAccount;
    private javax.swing.JTextField txtViewBalance;
    private javax.swing.JTextField txtViewName;
    private javax.swing.JTextArea txtareaList;
    private javax.swing.JFrame withdraw;
    private javax.swing.JLabel withdrawFooter;
    // End of variables declaration//GEN-END:variables
}
