import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class ViewDelete extends JFrame {
    
    JPanel pPanelBottom = new JPanel();
    JPanel pPanelTop = new JPanel();
    JPanel pPanelMiddle = new JPanel();
    JLabel lJudul = new JLabel("== Delete Data Kontak ==");
    
    JLabel lDeskripsi1 = new JLabel("Input nama dari kontak");
    JLabel lDeskripsi2 = new JLabel("yang ingin dihapus!");
    JLabel lNama = new JLabel("Nama");
    JTextField tfNama = new JTextField();
    JButton btnDelete = new JButton("Delete");
    JButton btnCancel = new JButton("Cancel");
    
    GroupLayout gpPanelBottom, gpPanelTop, gpPanelMiddle;
    
    public ViewDelete() {
        setTitle("Delete Data");
        setSize(400,400);
        setVisible(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 25));
        lDeskripsi1.setFont(new Font("COURIER NEW", Font.BOLD, 18));
        lDeskripsi2.setFont(new Font("COURIER NEW", Font.BOLD, 18));
        lNama.setFont(new Font("COURIER NEW", Font.BOLD, 20));
        
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
        pPanelBottom.add(lDeskripsi1);
        pPanelBottom.add(lDeskripsi2);
        pPanelBottom.add(lNama);
        pPanelBottom.add(tfNama);
        pPanelBottom.add(btnDelete);
        pPanelBottom.add(btnCancel);
        
        pPanelTop.setBounds(0, 0, 400, 70);
        pPanelTop.setBackground(Color.PINK);
        pPanelMiddle.setBounds(0, 70, 400, 10);
        pPanelMiddle.setBackground(Color.DARK_GRAY);
        pPanelBottom.setBounds(0, 80, 400, 300);
        pPanelBottom.setBackground(Color.GRAY);
        
        lJudul.setBounds(10, 30, 380, 20);
        lDeskripsi1.setBounds(70, 20, 300, 20);
        lDeskripsi2.setBounds(90, 40, 300, 20);
        lNama.setBounds(50, 90, 100, 20);
        tfNama.setBounds(150, 90, 180, 20);
        
        btnDelete.setBounds(85, 170, 80, 20);
        btnCancel.setBounds(185, 170, 100, 20);
        
    }
    
    public String getNama () {
        return tfNama.getText();
    }
    
//    public static void main(String[] args) {
//        new ViewDelete();
//    }
    
}
