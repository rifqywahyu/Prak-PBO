import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class ViewUpdate extends JFrame {
    
    JPanel pPanelBottom = new JPanel();
    JPanel pPanelTop = new JPanel();
    JPanel pPanelMiddle = new JPanel();
    JLabel lJudul = new JLabel("== Update Data Kontak ==");
    
    JLabel lNama = new JLabel("Nama");
    JLabel lNoHP = new JLabel("No HP");
    JLabel lUmur = new JLabel("Umur");
    JLabel lEmail = new JLabel("Email");
    JLabel lNamaFix = new JLabel();
    JTextField tfNoHP = new JTextField();
    JTextField tfUmur = new JTextField();
    JTextField tfEmail = new JTextField();
    JButton btnUpdate = new JButton("Update");
    JButton btnCancel = new JButton("Cancel");
    
    GroupLayout gpPanelBottom, gpPanelTop, gpPanelMiddle;
    
    public ViewUpdate() {
        setTitle("Update Data");
        setSize(400,400);
        setVisible(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 25));
        
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
        pPanelBottom.add(lNamaFix);
        pPanelBottom.add(tfNoHP);
        pPanelBottom.add(tfUmur);
        pPanelBottom.add(tfEmail);
        pPanelBottom.add(btnUpdate);
        pPanelBottom.add(btnCancel);
        
        pPanelTop.setBounds(0, 0, 400, 70);
        pPanelTop.setBackground(Color.ORANGE);
        pPanelMiddle.setBounds(0, 70, 400, 10);
        pPanelMiddle.setBackground(Color.DARK_GRAY);
        pPanelBottom.setBounds(0, 80, 400, 300);
        pPanelBottom.setBackground(Color.GRAY);
        
        lJudul.setBounds(10, 30, 380, 20);
        lNama.setBounds(50, 20, 100, 20);
        lNamaFix.setBounds(150, 20, 180, 20);
        lNoHP.setBounds(50, 60, 100, 20);
        tfNoHP.setBounds(150, 60, 180, 20);
        lUmur.setBounds(50, 100, 100, 20);
        tfUmur.setBounds(150, 100, 180, 20);
        lEmail.setBounds(50, 140, 100, 20);
        tfEmail.setBounds(150, 140, 180, 20);
        
        btnUpdate.setBounds(85, 200, 80, 20);
        btnCancel.setBounds(185, 200, 100, 20);
        
    }
    
//    public static void main(String[] args) {
//        new ViewUpdate();
//    }
    
}
