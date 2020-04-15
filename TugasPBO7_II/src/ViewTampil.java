import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewTampil extends JFrame {
    JPanel pPanelLeft = new JPanel();
    JPanel pPanelTop = new JPanel();
    JPanel pPanelRight = new JPanel();
    JPanel pPanelLine = new JPanel();
    JLabel lJudul = new JLabel("~ Output Data Kontak ~");
    JButton btnAdd = new JButton("Tambah Data");
    JButton btnDel = new JButton("Hapus Data");
    
    JTable tabel;
    DefaultTableModel tabelModel;
    JScrollPane scrollPane;
    Object kolom[] = {"Nama", "No HP", "Umur", "Email"};
    
    GroupLayout gpPanelLeft, gpPanelRight, gpPanelTop, gpPanelLine;
    
    public ViewTampil() {
        setTitle("Output Data Kontak");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(600,500);
        setLocationRelativeTo(null);
        
        tabelModel = new DefaultTableModel(kolom,0);
        tabel = new JTable(tabelModel);
        scrollPane = new JScrollPane(tabel);
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 30));
        
        gpPanelLeft = new GroupLayout(pPanelLeft);
        pPanelLeft.setLayout(gpPanelLeft);
        gpPanelRight = new GroupLayout(pPanelRight);
        pPanelRight.setLayout(gpPanelRight);
        gpPanelTop = new GroupLayout(pPanelTop);
        pPanelTop.setLayout(gpPanelTop);
        gpPanelLine = new GroupLayout(pPanelLine);
        pPanelLine.setLayout(gpPanelLine);
        
        add(pPanelTop);
        add(pPanelRight);
        add(pPanelLeft);
        add(pPanelLine);
        
        pPanelTop.add(lJudul);
        pPanelLeft.add(scrollPane);
        pPanelRight.add(btnAdd);
        pPanelRight.add(btnDel);
        
        pPanelTop.setBounds(0, 0, 600, 70);
        pPanelTop.setBackground(Color.LIGHT_GRAY);
        pPanelLine.setBounds(430, 70, 10, 450);
        pPanelLine.setBackground(Color.LIGHT_GRAY);
        pPanelRight.setBounds(440, 70, 190, 450);
        pPanelRight.setBackground(Color.GRAY);
        pPanelLeft.setBounds(0, 70, 430, 450);
        pPanelLeft.setBackground(Color.DARK_GRAY);
        
        lJudul.setBounds(100, 25, 400, 20);
        btnAdd.setBounds(10, 10, 120, 20);
        btnDel.setBounds(10, 40, 120, 20);
        scrollPane.setBounds(15, 15, 400, 350);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        
    }
    
//    public static void main(String[] args) {
//        new ViewTampil();
//    }
    
}
