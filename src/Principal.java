/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Principal {
    
    
    public static void main(String[] args) {
    
        Película película1 = new Película();
        
        película1.set_idpelícula(1);
        película1.set_título("Harry Potter y la Cámara Secreta");
        película1.set_género("Fantástico");
        película1.set_director("Chris Columbus");
        película1.set_año(2002);
        película1.set_duración(161);
        película1.set_vista(true);
          
        String texto = película1.get_idpelícula() +
                "\nTítulo : " + película1.get_título() +
                "\nGénero : " + película1.get_género() +
                "\nDirector : " + película1.get_director() + 
                "\nAño : " + película1.get_año() + 
                "\nDuración : " + película1.get_duración() +
                "\nVista : " + película1.get_vista();
        JOptionPane.showMessageDialog(null,texto);
        
        Película película2 = new Película();
        
        película2.set_idpelícula(2);
        película2.set_título("Batman");
        película2.set_género("Acción");
        película2.set_director("Tim Burton");
        película2.set_año(1989);
        película2.set_duración(126);
        película2.set_vista(true);
        
        texto = película2.get_idpelícula() +
                "\nTítulo : " + película2.get_título() +
                "\nGénero : " + película2.get_género() +
                "\nDirector : " + película2.get_director() + 
                "\nAño : " + película2.get_año() + 
                "\nDuración : " + película2.get_duración() +
                "\nVista : " + película2.get_vista();
        JOptionPane.showMessageDialog(null,texto);
    }
}
