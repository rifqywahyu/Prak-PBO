import java.sql.*;
import javax.swing.JOptionPane;

public class Model {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String dbUrl = "jdbc:mysql://localhost/pbo6_mahasiswa";
    static final String user = "root";
    static final String pass = "";
    
    Connection koneksi;
    Statement statement;
    
    public Model() {
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection)DriverManager.getConnection(dbUrl, user, pass);
            System.out.println("Koneksi Berhasil!");
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal!");
        }
    }
    
    public void inputData(String Nim, String Nama, String JenisKelamin, String NoTelp, String Alamat) {
        try {
            String query = "INSERT INTO `mahasiswa` (`Nim`,`Nama`,`JenisKelamin`,`NoTelp`,`Alamat`) VALUES ( '" +Nim+ "' , '" +Nama+ "' , '" +JenisKelamin+ "' , '" +NoTelp+ "' , '" +Alamat+ "')";
            statement = (Statement)koneksi.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data Berhasil Ditambah!");
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah!");
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public String[][] outputData() {
        int mahasiswa = 0;
        try {
            String data[][] = new String [ getJumlah() ][5];
            String query = "SELECT * FROM mahasiswa";
            ResultSet rS = statement.executeQuery(query);
            while(rS.next()) {
                data[mahasiswa][0] = rS.getString("Nim");
                data[mahasiswa][1] = rS.getString("Nama");
                data[mahasiswa][2] = rS.getString("JenisKelamin");
                data[mahasiswa][3] = rS.getString("NoTelp");
                data[mahasiswa][4] = rS.getString("Alamat");
                mahasiswa = mahasiswa + 1;
            }
            return data;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Database Error!");
            return null;
        }
    }
    
    public int getJumlah() {
        int mahasiswa = 0;
        try {
            statement = (Statement)koneksi.createStatement();
            String query = "SELECT * FROM mahasiswa";
            ResultSet rS = statement.executeQuery(query);
            while(rS.next()) {
                mahasiswa = mahasiswa + 1;
            }
            return mahasiswa;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Database Error!");
            return 0;
        }
    }
    
    public void updateData (String Nim, String Nama, String JenisKelamin, String NoTelp, String Alamat) {
        try {
            String query = "UPDATE mahasiswa SET Nama = '" +Nama+ "', JenisKelamin = '" +JenisKelamin+ "', NoTelp = '" +NoTelp+ "', Alamat = '" +Alamat+ "' WHERE Nim = '" +Nim+ "' ";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate!");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
