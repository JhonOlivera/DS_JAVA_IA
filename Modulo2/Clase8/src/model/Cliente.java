package model;

public class Cliente {
    //atributos
    private int id;
    private String nombre;
    private String email;
    private String ciudad;

    //metodo constructor completo
    public Cliente(int id, String nombre, String email, String ciudad) {

        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.ciudad = ciudad;
    }

//metodo constructor sin ID
    public Cliente(String nombre, String email, String ciudad) {
        this.nombre = nombre;
        this.email = email;
        this.ciudad = ciudad;
    }

    //metodos accesores getters and setters

    public int getId() {
        return id; }

    public String getNombre() {
        return nombre; }

    public String getEmail() {
        return email; }

    public String getCiudad() {
        return ciudad; }


    //metodo ToString
    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nombre='" + nombre
                + "', email='" + email + "', ciudad='" + ciudad + "'}";
    }
}
