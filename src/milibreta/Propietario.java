package milibreta;
/**
 * Rexistra ao propietario da libreta e permite modificar a mesma
 * @author ylagorebollar
 * @version 2.0
 */
public class Propietario {
    String nomePropietario,apelidoPropietario,pass;
    int id;

    /**
     *
     */
    public Propietario() {
    }

    /**
     * 
     * @param nomePropietario
     * @param apelidoPropietario
     * @param pass
     * @param id 
     */
    public Propietario(String nomePropietario, String apelidoPropietario, String pass, int id) {
        this.nomePropietario = nomePropietario;
        this.apelidoPropietario = apelidoPropietario;
        this.pass = pass;
        this.id = id;
    }

    /**
     *Elimina a libreta de contactos
     */
    public void borrarLibreta(){
        
    }

    /**
     *Crea a libreta de contactos
     */
    public void crearLibreta(){
        
    }

    /**
     *Fai cambios na libreta de contactos
     */
    public void modificarLibreta(){
        
    }
}