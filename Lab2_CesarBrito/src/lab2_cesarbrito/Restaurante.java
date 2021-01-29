package lab2_cesarbrito;

public class Restaurante {

    private String franquicia;
    private String nombre;
    private String ubicacion;
    private int empleados;
    private String parqueo;
    private String juegos;
    private int mesas;
    private int cajeros;
    private String gerente;
    private String especialidad;
    private String estado;
    private String premium;

    public Restaurante() {
    }

    public Restaurante(String franquicia, String nombre, String ubicacion, int empleados, String parqueo, String juegos, int mesas, int cajeros, String gerente, String especialidad, String estado, String premium) {
        this.franquicia = franquicia;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.empleados = empleados;
        this.parqueo = parqueo;
        this.juegos = juegos;
        this.mesas = mesas;
        this.cajeros = cajeros;
        this.gerente = gerente;
        this.especialidad = especialidad;
        this.estado = estado;
        this.premium = premium;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public String getParqueo() {
        return parqueo;
    }

    public void setParqueo(String parqueo) {
        this.parqueo = parqueo;
    }

    public String getJuegos() {
        return juegos;
    }

    public void setJuegos(String juegos) {
        this.juegos = juegos;
    }

    public int getMesas() {
        return mesas;
    }

    public void setMesas(int mesas) {
        this.mesas = mesas;
    }

    public int getCajeros() {
        return cajeros;
    }

    public void setCajeros(int cajeros) {
        this.cajeros = cajeros;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "franquicia=" + franquicia + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", empleados=" + empleados + ", parqueo=" + parqueo + ", juegos=" + juegos + ", mesas=" + mesas + ", cajeros=" + cajeros + ", gerente=" + gerente + ", especialidad=" + especialidad + ", estado=" + estado + ", premium=" + premium + '}';
    }
    
    


}
