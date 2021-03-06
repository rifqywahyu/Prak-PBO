package kasirDataBuku;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

public class ViewKasirDataBuku extends JFrame {
    JPanel pPanelTop = new JPanel();
    JPanel pPanelLine = new JPanel();
    JPanel pPanelBack = new JPanel();
    JPanel pPanelTabel = new JPanel();
    
    JLabel lJudul;
    JTextField tfSearch;
    JButton btnReturn, btnSearch;
    
    JTable tabel;
    DefaultTableModel tabelModel;
    JScrollPane scrollPane;
    Object kolom[] = {"ID Buku", "Judul", "Kategori", "Penerbit", "ISBN", "Suplier", "Tahun", "Harga", "Stok"};
    
    GroupLayout gpPanelTop, gpPanelBack, gpPanelTabel, gpPanelLine;
    
    public ViewKasirDataBuku() {
        setTitle("Data Buku");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(800,500);
        setLocationRelativeTo(null);
        
        tabelModel = new DefaultTableModel(kolom,0);
        tabel = new JTable(tabelModel);
        scrollPane = new JScrollPane(tabel);
        
        lJudul = new JLabel("DATA BUKU");
        lJudul.setFont(new Font("COURIER NEW", Font.BOLD, 35));
        lJudul.setForeground(Color.WHITE);
        
        tfSearch = new JTextField();
        
        ImageIcon returnIcon = new ImageIcon(getClass().getResource("/images/iconReturn.png"));
        ImageIcon searchIcon = new ImageIcon(getClass().getResource("/images/iconSearch.png"));
        
        btnReturn = new JButton("Kembali", returnIcon);
        btnSearch = new JButton("CARI BERDASARKAN JUDUL", searchIcon);
        
        gpPanelBack = new GroupLayout(pPanelBack);
        pPanelBack.setLayout(gpPanelBack);
        gpPanelTop = new GroupLayout(pPanelTop);
        pPanelTop.setLayout(gpPanelTop);
        gpPanelLine = new GroupLayout(pPanelLine);
        pPanelLine.setLayout(gpPanelLine);
        gpPanelTabel = new GroupLayout(pPanelTabel);
        pPanelTabel.setLayout(gpPanelTabel);
        
        add(pPanelTop);
        add(pPanelLine);
        add(pPanelBack);
        pPanelBack.add(pPanelTabel);
        pPanelTabel.add(scrollPane);
        pPanelTabel.add(tfSearch);
        pPanelTabel.add(btnSearch);
        
        pPanelTop.setBounds(0, 0, 800, 80);
        pPanelTop.setBackground(Color.GRAY);
        pPanelLine.setBounds(0, 80, 800, 5);
        pPanelLine.setBackground(Color.DARK_GRAY);
        pPanelBack.setBounds(0, 85, 800, 400);
        pPanelBack.setBackground(Color.GREEN);
        
        pPanelTabel.setBounds(10, 10, 760, 345);
        pPanelTabel.setBackground(Color.WHITE);
        
        scrollPane.setBounds(10, 50, 740, 285);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        pPanelTop.add(lJudul);
        pPanelTop.add(btnReturn);
        
        lJudul.setBounds(320, 20, 370, 40);
        btnReturn.setBounds(20, 20, 120, 40);

        tfSearch.setBounds(270, 10, 250, 30);
        btnSearch.setBounds(10, 10, 250, 30);

    }
    
    public String getSearch () {
        return tfSearch.getText();
    }
    
    public static void main(String[] args) {
        new ViewKasirDataBuku();
    }
}
