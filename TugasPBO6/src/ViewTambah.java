import javax.swing.*;

public class ViewTambah extends JFrame {
    JLabel lJudul,lNim,lNama,lJenisKelamin,lNoTelp,lAlamat;
    JTextField tfNim,tfNama,tfJenisKelamin,tfNoTelp,tfAlamat;
    JButton btnSubmit,btnCancel,btnOutput;
    
    public ViewTambah() {
        setTitle("Tambah Data");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(400,400);
        setLocationRelativeTo(null);
        
        lJudul = new JLabel("Input Data Mahasiswa");
        lNim = new JLabel("Nim");
        lNama = new JLabel("Nama");
        lJenisKelamin = new JLabel("Jenis Kelamin");
        lNoTelp = new JLabel("No Telepon");
        lAlamat = new JLabel("Alamat");
        tfNim = new JTextField();
        tfNama = new JTextField();
        tfJenisKelamin = new JTextField();
        tfNoTelp = new JTextField();
        tfAlamat = new JTextField();
        btnSubmit = new JButton("Submit");
        btnOutput = new JButton("Lihat Data");
        
        add(lJudul);
        add(lNim);
        add(lNama);
        add(lJenisKelamin);
        add(lNoTelp);
        add(lAlamat);
        add(tfNim);
        add(tfNama);
        add(tfJenisKelamin);
        add(tfNoTelp);
        add(tfAlamat);
        add(btnSubmit);
        add(btnOutput);
        
        lJudul.setBounds(130, 40, 150, 20);
        lNim.setBounds(60, 100, 100, 20);
        tfNim.setBounds(160, 100, 180, 20);
        lNama.setBounds(60, 140, 100, 20);
        tfNama.setBounds(160, 140, 180, 20);
        lJenisKelamin.setBounds(60, 180, 100, 20);
        tfJenisKelamin.setBounds(160, 180, 180, 20);
        lNoTelp.setBounds(60, 220, 100, 20);
        tfNoTelp.setBounds(160, 220, 180, 20);
        lAlamat.setBounds(60, 260, 100, 20);
        tfAlamat.setBounds(160, 260, 180, 20);
        
        btnSubmit.setBounds(110, 300, 80, 20);
        btnOutput.setBounds(210, 300, 100, 20);
        
    }
    
    public String getNim () {
        return tfNim.getText();
    }
    public String getNama () {
        return tfNama.getText();
    }
    public String getJenisKelamin () {
        return tfJenisKelamin.getText();
    }
    public String getNoTelp () {
        return tfNoTelp.getText();
    }
    public String getAlamat () {
        return tfAlamat.getText();
    }
    
//    public static void main(String[] args) {
//        new ViewTambah();
//    }
}
