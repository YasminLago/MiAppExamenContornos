package milibreta;

/**
 * Esta clase usase para xestionar os grupos e contactos da libreta de contactos
 *
 * @author ylagorebollar
 * @version 2.0
 */

public class Libreta {

    private String nome, dni;

    private int libre = cualLibre();
    Contacto[] arrayContactos = new Contacto[3];

    /**
     * 
     */
    public Libreta() {
        nome = dni = "";
    }

    /**
     *
     * @param aux_nome
     * @param aux_dni
     */
    public Libreta(String aux_nome, String aux_dni) {
        this.nome = aux_nome;
        this.dni = aux_dni;
    }

    /**
     * Metodos de acceso a los atributos de la clase Libreta
     * 
     */
    public String getNome() {
        return nome;
    }

    public String getDni() {
        return dni;
    }

    /**
     * Engade contactos a libreta despois de comprobar se hai espacio
     */
    public void engadir() {
        libre = cualLibre();
        if (libre > 0) {
            System.out.println("Introduzca nombre");
            arrayContactos[libre].setNome(nome);
        }
    }

    /**
     * Comproba se hai espacio na libreta para engadir mais contactos
     *
     * @return
     */
    public int cualLibre() {
        for (int libre = 0; libre < arrayContactos.length; libre++) {
            if (arrayContactos[libre].getNome().equals("")) {
                System.out.println("Hay hueco");
                return libre;
            } else if (libre == arrayContactos.length) {
            }
        }
        return -1;
    }

    /**
     *
     */
    public void listar() {

    }

    /**
     * Engade grupos a libreta de contactos
     */
    public void engadirGrupo() {

    }

    /**
     * Borra grupos da libreta de contactos
     */
    public void borrarGrupo() {

    }

    /**
     *
     */
    public void listarGrupo() {

    }
}
