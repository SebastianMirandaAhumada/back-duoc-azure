package atenciones.back.model;


public class AtencionesMedicas {
    private String rut;
    private String nombre;
    private String apellido;
    private String tipoAtencion;
    private String señalesVitales;
    
    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTipoAtencion() {
        return tipoAtencion;
    }
    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }
    public String getSeñalesVitales() {
        return señalesVitales;
    }
    public void setSeñalesVitales(String señalesVitales) {
        this.señalesVitales = señalesVitales;
    }
           
}
