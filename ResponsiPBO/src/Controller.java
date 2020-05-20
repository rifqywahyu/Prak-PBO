import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Rifqy W
 */
public class Controller {
    String IdAngg, NamaAngg, IdBuku, JudulBuku;
    public Controller(Model model, ViewLogin viewlogin, ViewMenu viewmenu, ViewPinjam viewpinjam, ViewTampil viewtampil, ViewAbout viewabout) {
        
//        ------ LOGIN START -----
        viewlogin.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = viewlogin.tfUsername.getText();
                String password = viewlogin.tfPassword.getText();
                if (viewlogin.tfUsername.getText().length() > 0 && viewlogin.tfPassword.getText().length() > 0 && model.cekLogin(username, password) == 1 ) {
                    viewlogin.setVisible(false);
                    viewlogin.tfUsername.setText(null);
                    viewlogin.tfPassword.setText(null);
                    viewmenu.setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Username atau Password Salah . . .");
                }
            }
        });
        
        viewlogin.btnExit.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "Logging off . . .");
               System.exit(0);
           } 
        });
//        ----- LOGIN END -----

//        ----- MENU START -----
        viewmenu.btnPinjam.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               viewmenu.setVisible(false);
               viewpinjam.setVisible(true);
           } 
        });
        
        viewmenu.btnTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(model.jumlahPinjam() > 0) {
                    String data[][] = model.tampilPinjam();
                    viewtampil.tabel.setModel((new JTable(data, viewtampil.kolom)).getModel());
                }
                viewtampil.tfIdAngg.setEditable(false);
                viewtampil.btnEdit.setEnabled(false);
                viewtampil.btnDel.setEnabled(false);
                viewtampil.btnCancel.setEnabled(false);
                viewmenu.setVisible(false);
                viewtampil.setVisible(true);
            }
        });
        
        viewmenu.btnAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewmenu.setVisible(false);
                viewabout.setVisible(true);
            }
        });
        
        viewmenu.btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Logout Berhasil!");
                viewmenu.setVisible(false);
                viewlogin.setVisible(true);
            }
        });
//        ----- MENU END -----
                
//        ----- PINJAM START -----
        viewpinjam.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.setVisible(false);
                viewmenu.setVisible(true);
            }
        });
        
        viewpinjam.btnAdd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String idAngg = viewpinjam.tfIdAngg.getText();
                String namaAngg = viewpinjam.tfNamaAngg.getText();
                String idBuku = viewpinjam.tfIdBuku.getText();
                String judulBuku = viewpinjam.tfJudulBuku.getText();
                if(viewpinjam.tfIdAngg.getText().length() > 0 && viewpinjam.tfNamaAngg.getText().length() > 0 && viewpinjam.tfIdBuku.getText().length() > 0 && viewpinjam.tfJudulBuku.getText().length() > 0) {
                    model.tambahPinjam(idAngg, namaAngg, idBuku, judulBuku);
                    viewpinjam.tfIdAngg.setText(null);
                    viewpinjam.tfNamaAngg.setText(null);
                    viewpinjam.tfIdBuku.setText(null);
                    viewpinjam.tfJudulBuku.setText(null);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Ada Yang Kosong . . .");
                    viewpinjam.tfIdAngg.setText(null);
                    viewpinjam.tfNamaAngg.setText(null);
                    viewpinjam.tfIdBuku.setText(null);
                    viewpinjam.tfJudulBuku.setText(null);
                }
            }
        });
        
        viewpinjam.btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.tfIdAngg.setText(null);
                viewpinjam.tfNamaAngg.setText(null);
                viewpinjam.tfIdBuku.setText(null);
                viewpinjam.tfJudulBuku.setText(null);
            }
        });
//        ----- PINJAM END -----
                
//        ----- TAMPIL START -----
        viewtampil.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtampil.setVisible(false);
                viewmenu.setVisible(true);
                
                viewtampil.tfIdAngg.setText(null);
                viewtampil.tfNamaAngg.setText(null);
                viewtampil.tfIdBuku.setText(null);
                viewtampil.tfJudulBuku.setText(null);
            }
        });
        
        viewtampil.tabel.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               super.mousePressed(e);
               int row = viewtampil.tabel.getSelectedRow();
               int col = viewtampil.tabel.getSelectedColumn();
               
               String data[][] = model.tampilPinjam();
               String nomor = data[row][1];
               
               viewtampil.tfIdAngg.setText(data[row][0].toString());
               viewtampil.tfIdAngg.setForeground(Color.red);
               viewtampil.tfIdAngg.setEditable(false);
               viewtampil.tfNamaAngg.setText(data[row][1].toString());
               viewtampil.tfIdBuku.setText(data[row][2].toString());
               viewtampil.tfJudulBuku.setText(data[row][3].toString());
               
               viewtampil.btnEdit.setEnabled(true);
               viewtampil.btnDel.setEnabled(true);
               viewtampil.btnCancel.setEnabled(true);
               
           } 
        });
        
        viewtampil.btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtampil.tfIdAngg.setText(null);
                viewtampil.tfNamaAngg.setText(null);
                viewtampil.tfIdBuku.setText(null);
                viewtampil.tfJudulBuku.setText(null);
                
                viewtampil.btnEdit.setEnabled(false);
                viewtampil.btnDel.setEnabled(false);
                viewtampil.btnCancel.setEnabled(false);
            }
        });
        
        viewtampil.btnEdit.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(viewtampil.getIdAnggota());
                String nama = viewtampil.getNama();
                String id_buku = viewtampil.getIdBuku();
                String judul_buku = viewtampil.getJudul();
                model.editPinjam(id, nama, id_buku, judul_buku);
                
                String data[][] = model.tampilPinjam();
                viewtampil.tabel.setModel(new JTable(data, viewtampil.kolom).getModel());
                
                viewtampil.tfIdAngg.setText(null);
                viewtampil.tfNamaAngg.setText(null);
                viewtampil.tfIdBuku.setText(null);
                viewtampil.tfJudulBuku.setText(null);
                
                viewtampil.btnEdit.setEnabled(false);
                viewtampil.btnDel.setEnabled(false);
                viewtampil.btnCancel.setEnabled(false);
            }
        });
        
        viewtampil.btnDel.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(viewtampil.getIdAnggota());
                
                model.hapusPinjam(id);
                
                String data[][] = model.tampilPinjam();
                viewtampil.tabel.setModel(new JTable(data, viewtampil.kolom).getModel());
                
                viewtampil.tfIdAngg.setText(null);
                viewtampil.tfNamaAngg.setText(null);
                viewtampil.tfIdBuku.setText(null);
                viewtampil.tfJudulBuku.setText(null);
                
                viewtampil.btnEdit.setEnabled(false);
                viewtampil.btnDel.setEnabled(false);
                viewtampil.btnCancel.setEnabled(false);
            }
        });
        
        viewtampil.btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cari = viewtampil.getSearch();
                
                String data[][] = model.searchPinjam(cari);
                viewtampil.tabel.setModel((new JTable(data, viewtampil.kolom)).getModel());
            }
        });
//        ----- TAMPIL END -----
                
//        ----- ABOUT START -----
        viewabout.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewabout.setVisible(false);
                viewmenu.setVisible(true);
            }
        });
//        ----- ABOUT END -----
    }
}

