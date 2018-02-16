import java.awt.GridLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JPanel implements ActionListener{
    public Fenetre(){

        GridLayout gl = new GridLayout(6, 1);
        gl.setHgap(5); //Cinq pixels d'espace entre les colonnes (H comme Horizontal)
        gl.setVgap(5); //Cinq pixels d'espace entre les lignes (V comme Vertical)
        //Ou en abrégé : GridLayout gl = new GridLayout(3, 2, 5, 5);
        this.setLayout(gl);
       // this.setTitle("Bouton");
        this.setSize(150, 300);
       // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // this.setLocationRelativeTo(null);
        //On définit le layout à utiliser sur le content pane
        //Trois lignes sur deux colonnes
        //On ajoute le bouton au content pane de la JFrame

        Button BtnLivre = new Button("Livre");
        Button BtnFilm = new Button("Film");
        Button BtnJvid = new Button("Jeux Vidéos");
        Button BtnAlbum = new Button("Album");
        Button BtnSerie = new Button("Série");

        this.add(BtnLivre);
        this.add(BtnFilm);
        this.add(BtnJvid);
        this.add(BtnAlbum);
        this.add(BtnSerie);
        this.setVisible(true);

        BtnLivre.addActionListener(find.find());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}