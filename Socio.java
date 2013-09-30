/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.gym;

/**
 *
 * @author Laura
 */

public class Socio {
    /* atributos de Socio */
    private int id;
    private String nombre;
    private String apellido;
    private String fecha_alta;

    protected Socio () {}
    
    protected Socio (int id1) { //constructor
        this.id = id1;
    }
    
    protected Socio (int id, String nombre, String apellido, String fechaalta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_alta = fechaalta;
            
        //crea un socio y te devuelve el id asignado en la base de datos
        
    }

    protected void mostrarSocioEnPantalla() {
        System.out.println(this.id);
        System.out.println(this.nombre);
        System.out.println(this.apellido);
        System.out.println(this.fecha_alta);
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the fecha_alta
     */
    public String getFecha_alta() {
        return fecha_alta;
    }

    /**
     * @param fecha_alta the fecha_alta to set
     */
    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }
}
