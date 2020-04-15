import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class ViewTambah extends JFrame {
    JPanel pPanelBottom = new JPanel();
    JPanel pPanelTop = new JPanel();
    JPanel pPanelMiddle = new JPanel();
    
    JLabel lJudul,lNama,lNoHP,lUmur,lEmail;
    JTextField tfNama,tfNoHP,tfUmur,tfEmail;
    JButton btnSubmit,btnCancel,btnOutput;
    
    GroupLayout gpPanelBottom, gpPanelTop, gpPanelMiddle;
    
    public ViewTambah() {
        setTitle("Tambah Data");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(400,400);
        setLocationRelativeTo(null);
        
        lJudul = new JLabel("== Input Data Kontak ==");
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 25));
        lNama = new JLabel("Nama");
        lNoHP = new JLabel("No HP");
        lUmur = new JLabel("Umur");
        lEmail = new JLabel("Email");
        tfNama = new JTextField();
        tfNoHP = new JTextField();
        tfUmur = new JTextField();
        tfEmail = new JTextField();
        btnSubmit = new JButton("Submit");
        btnOutput = new JButton("Lihat Data");
        
        gpPanelBottom = new GroupLayout(pPanelBottom);
        pPanelBottom.setLayout(gpPanelBottom);
        gpPanelTop = new GroupLayout(pPanelTop);
        pPanelTop.setLayout(gpPanelTop);
        gpPanelMiddle = new GroupLayout(pPanelMiddle);
        pPanelMiddle.setLayout(gpPanelMiddle);
        
        add(pPanelTop);
        add(pPanelMiddle);
        add(pPanelBottom);
        
        pPanelTop.add(lJudul);
        pPanelBottom.add(lNama);
        pPanelBottom.add(lNoHP);
        pPanelBottom.add(lUmur);
        pPanelBottom.add(lEmail);
        pPanelBottom.add(tfNama);
        pPanelBottom.add(tfNoHP);
        pPanelBottom.add(tfUmur);
        pPanelBottom.add(tfEmail);
        pPanelBottom.add(btnSubmit);
        pPanelBottom.add(btnOutput);
        
        pPanelTop.setBounds(0, 0, 400, 70);
        pPanelTop.setBackground(Color.CYAN);
        pPanelMiddle.setBounds(0, 70, 400, 10);
        pPanelMiddle.setBackground(Color.DARK_GRAY);
        pPanelBottom.setBounds(0, 80, 400, 300);
        pPanelBottom.setBackground(Color.GRAY);
        
        lJudul.setBounds(18, 30, 380, 20);
        lNama.setBounds(50, 20, 100, 20);
        lNoHP.setBounds(50, 60, 100, 20);
        lUmur.setBounds(50, 100, 100, 20);
        lEmail.setBounds(50, 140, 100, 20);
        
        tfNama.setBounds(150, 20, 180, 20);
        tfNoHP.setBounds(150, 60, 180, 20);
        tfUmur.setBounds(150, 100, 180, 20);
        tfEmail.setBounds(150, 140, 180, 20);  
        
        btnSubmit.setBounds(85, 200, 80, 20);
        btnOutput.setBounds(185, 200, 100, 20);
        
    }
    
    public String getNama () {
        return tfNama.getText();
    }
    public String getNoHP () {
        return tfNoHP.getText();
    }
    public String getUmur () {
        return tfUmur.getText();
    }
    public String getEmail () {
        return tfEmail.getText();
    }
    
//    public static void main(String[] args) {
//        new ViewTambah();
//    }
    
}
