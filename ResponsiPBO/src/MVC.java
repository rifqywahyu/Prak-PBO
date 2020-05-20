/**
 *
 * @author Rifqy W
 */
public class MVC {
    Model model = new Model();
    
    ViewLogin viewlogin = new ViewLogin();
    ViewMenu viewmenu = new ViewMenu();
    ViewPinjam viewpinjam = new ViewPinjam();
    ViewTampil viewtampil = new ViewTampil();
    ViewAbout viewabout = new ViewAbout();
    
    Controller controller = new Controller(model, viewlogin, viewmenu, viewpinjam, viewtampil, viewabout);
}
