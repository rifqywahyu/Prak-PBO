import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Rifqy W
 */
public class Model {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/responsi_prak_pbo";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection konek;
    Statement statement;
    
    public Model() {
        try {
            Class.forName(JDBC_DRIVER);
            konek = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil!");
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal. . .");
        }
    }
    
    public int cekLogin (String username, String password) {
        int user = 0;
        try {
            String query = "SELECT * FROM user WHERE username = '" +username+ "' AND password = '" +password+ "' ";
            statement = (Statement) konek.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                user++;
            }
            if (user == 1) {
                JOptionPane.showMessageDialog(null, "Login Berhasil!");
                return user;
            }
            else {
                throw new SQLException();
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0;
        }
    }
    
    public int jumlahPinjam() {
        int jumlah = 0;
        try {
            statement = (com.mysql.jdbc.Statement) konek.createStatement();
            String query = "SELECT * FROM pinjam";
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                jumlah++;
            }
            return jumlah;
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            System.err.println("SQL Error . . .");
            return 0;
        }
    }
    
    public String[][] tampilPinjam() {
        int jumlah = 0;
        try {
            String data[][] = new String[jumlahPinjam()][4];
            String query = "SELECT * FROM pinjam";
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                data[jumlah][0] = rs.getString("id");
                data[jumlah][1] = rs.getString("nama");
                data[jumlah][2] = rs.getString("id_buku");
                data[jumlah][3] = rs.getString("judul_buku");
                jumlah++;
            }
            return data;
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            System.err.println("SQL Error . . .");
            return null;
        }
    }
    
    public void tambahPinjam(String idAngg, String namaAngg, String idBuku, String judulBuku) {
        try {
            String query = "INSERT INTO `pinjam` (`id` , `nama` , `id_buku` , `judul_buku`) VALUES ( '" +idAngg + "' , '" +namaAngg+ "' , '" +idBuku+ "' , '" +judulBuku+ "' )";
            statement = (com.mysql.jdbc.Statement) konek.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Proses Peminjaman Buku Berhasil!");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void editPinjam(int id, String nama, String id_buku, String judul_buku) {
        try {
            if ("".equals(id) || "".equals(nama) || "".equals(id_buku) || "".equals(judul_buku)) {
                JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong . . .");
            }
            else {
                String query = "UPDATE `pinjam` SET id = '" +id+ "',nama = '" +nama+ "', id_buku = '" +id_buku+ "', judul_buku = '" +judul_buku+ "' WHERE id = '" +id+ "' ";
                statement = (Statement) konek.createStatement();
                statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Proses Pengeditan Berhasil!");
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            System.err.println("SQL Error . . .");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void hapusPinjam(int id) {
        try {
            if("".equals(id)) {
                JOptionPane.showMessageDialog(null, "Proses Penghapusan Gagal . . .");
            }
            else {
                String query = "DELETE FROM `pinjam` WHERE `id` = '" +id+ "' ";
                statement = konek.createStatement();
                statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Proses Penghapusan Berhasil!");
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            System.err.println("SQL Error . . .");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public String[][] searchPinjam(String nama) {
        try {
            int jumlah = 0;
            
            String data[][] = new String [jumlahPinjam()][4];
            
            String query = "SELECT * FROM `pinjam` WHERE nama LIKE '%"+nama+"%' ";
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                data[jumlah][0] = rs.getString("id");
                data[jumlah][1] = rs.getString("nama");
                data[jumlah][2] = rs.getString("id_buku");
                data[jumlah][3] = rs.getString("judul_buku");
                jumlah++;
            }
            return data;
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            System.err.println("SQL Error . . .");
            return null;
        }
    }
}
