/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Película {
    
    private int idpelícula;
    private String título;
    private String género;
    private String director;
    private int año;
    private int duración;
    private boolean vista;
    
    public void set_idpelícula (int idpelícula_recibido){
        idpelícula = idpelícula_recibido;
    }
        
    public int get_idpelícula (){
        return idpelícula;
    }
    
    public void set_título (String título_recibido) {
        título = título_recibido;
    }
    
    public String get_título (){
        return título;
    }
    
    public void set_género (String género_recibido) {
        género = género_recibido;
    }
    
    public String get_género (){
        return género;
    }
    
    public void set_director (String director_recibido) {
        director = director_recibido;
    }
    
    public String get_director (){
        return director;
    }
    
    public void set_año (int año_recibido){
        año = año_recibido;
    }
        
    public int get_año (){
        return año;
    }
 
    public void set_duración (int duración_recibido){
        duración = duración_recibido;
    }
        
    public int get_duración (){
        return duración;
    }
    
    public void set_vista (boolean vista_recibido){
        vista = vista_recibido;
    }
        
    public boolean get_vista (){
        return vista;
    }
}
