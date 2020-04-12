
public class MVC {
    
    ViewTambah tambah = new ViewTambah();
    Model model = new Model();
    ViewTampil tampil = new ViewTampil();
    ViewUpdate update = new ViewUpdate();
    Controller controller = new Controller(model, tambah, tampil, update);
    
}
