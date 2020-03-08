
import javax.swing.*;


public class Swing extends JFrame {
    
    JLabel lHeader = new JLabel("REGISTER");
    JLabel lUsername = new JLabel("Username");
    JLabel lNama = new JLabel("Nama");
    JLabel lPassword = new JLabel("Password");
    JLabel lNohp = new JLabel("No HP");
    JLabel lJk = new JLabel("Jenis Kelamin");
    JLabel lAlamat = new JLabel("Alamat");
    
    JRadioButton bLaki = new JRadioButton("Laki - laki");
    JRadioButton bPerempuan = new JRadioButton("Perempuan");
    JTextField fInput1 = new JTextField(20);
    JTextField fInput2 = new JTextField(20);
    JTextField fInput3 = new JTextField(20);
    JTextArea aInput = new JTextArea(5,20);
    JPasswordField pfInput = new JPasswordField(20);
    
    JButton bSubmit = new JButton("SUBMIT");
    
    public Swing() {
        setTitle("Register");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(800,600);
        
        ButtonGroup group = new ButtonGroup();
        group.add(bLaki);
        group.add(bPerempuan);
        
        add(lHeader);
        add(lUsername);
        add(lNama);
        add(lPassword);
        add(lNohp);
        add(lJk);
        add(lAlamat);
        add(bLaki);
        add(bPerempuan);
        add(fInput1);
        add(fInput2);
        add(fInput3);
        add(aInput);
        add(pfInput);
        add(bSubmit);
        
        lHeader.setBounds(275,20,250,100);
        lHeader.setFont(new java.awt.Font("Elephant",0,36));
        
        lUsername.setBounds(120,140,250,30);
        fInput1.setBounds(275,140,300,30);
        lUsername.setFont(new java.awt.Font("Times New Roman",0,20));
        
        lPassword.setBounds(120,180,250,30);
        pfInput.setBounds(275,180,300,30);
        lPassword.setFont(new java.awt.Font("Times New Roman",0,20));
        
        lNama.setBounds(120,220,250,30);
        fInput2.setBounds(275,220,300,30);
        lNama.setFont(new java.awt.Font("Times New Roman",0,20));
        
        lJk.setBounds(120,260,250,30);
        bLaki.setBounds(275,260,120,30);
        bPerempuan.setBounds(400,260,120,30);
        lJk.setFont(new java.awt.Font("Times New Roman",0,20));
        
        lNohp.setBounds(120,300,250,30);
        fInput3.setBounds(275,300,300,30);
        lNohp.setFont(new java.awt.Font("Times New Roman",0,20));
        
        lAlamat.setBounds(120,340,250,30);
        aInput.setBounds(275,340,300,100);
        lAlamat.setFont(new java.awt.Font("Times New Roman",0,20));
        
        bSubmit.setBounds(275,470,250,30);
    }
}
