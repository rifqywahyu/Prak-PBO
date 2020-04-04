import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import com.mysql.jdbc.Driver;

public class InputDataMahasiswa extends JFrame {
    
    JPanel pPanel = new JPanel();
    JLabel lNim, lNama, lAlamat, lHeader;
    JTextField tfNim, tfNama, tfAlamat;
    JButton bSimpan;
    String DBurl = "jdbc:mysql://localhost/praktikum";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;
    
    public InputDataMahasiswa() {
        setTitle("Database");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        lHeader = new JLabel("INPUT DATA MAHASISWA");
        lNim = new JLabel("Nim");
        lNama = new JLabel("Nama");
        lAlamat = new JLabel("Alamat");
        tfNim = new JTextField(9);
        tfNama = new JTextField(50);
        tfAlamat = new JTextField(50);
        bSimpan = new JButton("Simpan");
        
        add(lHeader);
        add(lNim);
        add(lNama);
        add(lAlamat);
        add(tfNim);
        add(tfNama);
        add(tfAlamat);
        add(bSimpan);
        
        lHeader.setBounds(125,50,150,30);
        
        lNim.setBounds(80,100,150,30);
        tfNim.setBounds(150,100,150,30);
        
        lNama.setBounds(80,140,150,30);
        tfNama.setBounds(150,140,150,30);
        
        lAlamat.setBounds(80,180,150,30);
        tfAlamat.setBounds(150,180,150,30);
        
        bSimpan.setBounds(125,240,150,30);
        
        bSimpan.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                masukkanData();
            }
        });
    }
    
    public void masukkanData() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl, DBusername, DBpassword);
            statement = koneksi.createStatement();
            statement.executeUpdate("INSERT INTO mahasiswa VALUES ( '"+ tfNim.getText() +"' , '"+ tfNama.getText() +"' , '"+ tfAlamat.getText() +"' ) ");
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan!", "Hasil", JOptionPane.INFORMATION_MESSAGE);
            statement.close();
            koneksi.close();
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan!", "Hasil", JOptionPane.ERROR_MESSAGE);
        }
        catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan!", "Hasil", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        new InputDataMahasiswa();
    }
}
