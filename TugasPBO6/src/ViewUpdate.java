import javax.swing.*;

public class ViewUpdate extends JFrame {
    
    JLabel lJudul = new JLabel("Update Data Mahasiswa");
    JLabel lNim = new JLabel("Nim");
    JLabel lNama = new JLabel("Nama");
    JLabel lJenisKelamin = new JLabel("Jenis Kelamin");
    JLabel lNoTelp = new JLabel("No Telepon");
    JLabel lAlamat = new JLabel("Alamat");
    JLabel lNomorNim = new JLabel();
    JTextField tfNama = new JTextField();
    JTextField tfJenisKelamin = new JTextField();
    JTextField tfNoTelp = new JTextField();
    JTextField tfAlamat = new JTextField();
    JButton btnUpdate = new JButton("Update");
    JButton btnCancel = new JButton("Cancel");
    
    public ViewUpdate() {
        setTitle("Update Data");
        setSize(400,400);
        setVisible(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(lJudul);
        add(lNim);
        add(lNama);
        add(lJenisKelamin);
        add(lNoTelp);
        add(lAlamat);
        add(lNomorNim);
        add(tfNama);
        add(tfJenisKelamin);
        add(tfNoTelp);
        add(tfAlamat);
        add(btnUpdate);
        add(btnCancel);
        
        lJudul.setBounds(140, 40, 150, 20);
        lNim.setBounds(60, 100, 100, 20);
        lNomorNim.setBounds(160, 100, 180, 20);
        lNama.setBounds(60, 140, 100, 20);
        tfNama.setBounds(160, 140, 180, 20);
        lJenisKelamin.setBounds(60, 180, 100, 20);
        tfJenisKelamin.setBounds(160, 180, 180, 20);
        lNoTelp.setBounds(60, 220, 100, 20);
        tfNoTelp.setBounds(160, 220, 180, 20);
        lAlamat.setBounds(60, 260, 100, 20);
        tfAlamat.setBounds(160, 260, 180, 20);
        
        btnUpdate.setBounds(120, 300, 80, 20);
        btnCancel.setBounds(220, 300, 80, 20);
        
    }
    
//    public static void main(String[] args) {
//        new ViewUpdate();
//    }
    
}
