import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewTampil extends JFrame {
    
    JLabel lJudul = new JLabel("Output Data Mahasiswa");
    JButton btnAdd = new JButton("Tambah Data");
    
    JTable tabel;
    DefaultTableModel tabelModel;
    JScrollPane scrollPane;
    Object kolom[] = {"Nim", "Nama", "JK", "NoTelp", "Alamat"};
    
    public ViewTampil() {
        tabelModel = new DefaultTableModel(kolom,0);
        tabel = new JTable(tabelModel);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Mahasiswa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(400,500);
        setLocationRelativeTo(null);
        
        add(lJudul);
        add(scrollPane);
        add(btnAdd);
        
        scrollPane.setBounds(20, 50, 350, 330);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        lJudul.setBounds(120, 20, 150, 20);
        btnAdd.setBounds(120, 390, 150, 20);
        
    }
    
//    public static void main(String[] args) {
//        new ViewTampil();
//    }
}
