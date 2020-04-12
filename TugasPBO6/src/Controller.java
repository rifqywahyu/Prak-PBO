import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controller {
    
    public Controller(Model model, ViewTambah tambah, ViewTampil tampil, ViewUpdate update) {
        
        
        
        tampil.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambah.setVisible(true);
                tampil.dispose();
            }
        });
        
        tambah.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nim = tambah.getNim();
                String Nama = tambah.getNama();
                String JenisKelamin = tambah.getJenisKelamin();
                String NoTelp = tambah.getNoTelp();
                String Alamat = tambah.getAlamat();
                
                model.inputData(Nim, Nama, JenisKelamin, NoTelp, Alamat);
                String mahasiswa[][] = model.outputData();
                tampil.tabel.setModel(new JTable(mahasiswa, tampil.kolom).getModel());
                tampil.setVisible(true);
                tambah.setVisible(false);
            }
        });
        
        tambah.btnOutput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mahasiswa[][] = model.outputData();
                tampil.tabel.setModel(new JTable(mahasiswa, tampil.kolom).getModel());
                tampil.setVisible(true);
                
                tambah.dispose();
            }
        });
        
        tampil.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int row = tampil.tabel.getSelectedRow();
                int column = tampil.tabel.getSelectedColumn();
                
                String pilih = tampil.tabel.getValueAt(row, 0). toString();
                System.out.println(pilih);
                
                int updateData = JOptionPane.showConfirmDialog(null, "Update Data " + pilih + " ?", "Pilihan", JOptionPane.YES_NO_OPTION);
                if (updateData == 0) {
                    update.lNomorNim.setText(pilih);
                    tampil.setVisible(false);
                    update.setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Update Data");
                }
            }
        });
        
        update.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nim = update.lNomorNim.getText();
                String Nama = update.tfNama.getText();
                String JenisKelamin = update.tfJenisKelamin.getText();
                String NoTelp = update.tfNoTelp.getText();
                String Alamat = update.tfAlamat.getText();
                model.updateData(Nim, Nama, JenisKelamin, NoTelp, Alamat);
                String mahasiswa[][] = model.outputData();
                tampil.tabel.setModel(new JTable(mahasiswa, tampil.kolom).getModel());
                update.setVisible(false);
                tampil.setVisible(true);
            }
        });
        
        update.btnCancel.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 update.setVisible(false);
                 tampil.setVisible(true);
             }
         });
        
    }
    
}
