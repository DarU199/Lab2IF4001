
public class Recurso {

    private int nRecurso;
    private String nomRecurso;
    private int unidades;
    private int uUtilizadas;
    private int uDisponibles;

    public Recurso(Recurso nuevo) {
        nRecurso = nuevo.nRecurso;
        nomRecurso = nuevo.nomRecurso;
        unidades = nuevo.unidades;
        uUtilizadas = nuevo.uUtilizadas;
        uDisponibles = nuevo.uDisponibles;
    }

    public Recurso() {
        nRecurso = 1111;
        nomRecurso = "Sin nombre";
        unidades = 0;
        uUtilizadas = 0;
        uDisponibles = 0;
    }

    public Recurso(int nRecurso, String nomRecurso) {
        this.nRecurso = nRecurso;
        this.nomRecurso = nomRecurso;
        unidades = 0;
        uUtilizadas = 0;
        uDisponibles = 0;
    }

    public Recurso(int nRecurso, String nomRecurso, int unidades) {
        this.nRecurso = nRecurso;
        this.nomRecurso = nomRecurso;
        this.unidades = unidades;
        uUtilizadas = 0;
        uDisponibles = unidades;
    }
    //set y get

    public void setNrecurso(int nRecurso) {
        this.nRecurso = nRecurso;
    }

    public void setNomRecurso(String nomRecurso) {
        this.nomRecurso = nomRecurso;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void setUutilizadas(int uUtilizadas) {
        this.uUtilizadas = uUtilizadas;
    }

    public void setUdisponibles(int uDisponibles) {
        this.uDisponibles = uDisponibles;
    }

    public int getNrecurso() {
        return this.nRecurso;
    }

    public String getNomRecurso() {
        return this.nomRecurso;
    }

    public int getUnidades() {
        return this.unidades;
    }

    public int getUutilizadas() {
        return this.uUtilizadas;
    }

    public int getUdisponibles() {
        return this.uDisponibles;
    }

    public void liberarRecurso(int cantidadRecurso) {
        this.uDisponibles += cantidadRecurso;
        this.uUtilizadas -= cantidadRecurso;
    }

    public void asignarRecurso(int cantidadRecurso) {
        this.uDisponibles -= cantidadRecurso;
        this.uUtilizadas += cantidadRecurso;
    }

    // toString
    public boolean noHayRecursosSuficientes(int cantidad) {
        return cantidad > uDisponibles;
    }

    public boolean recursoAgotado() {
        return uDisponibles == 0;
    }

    public String mensajeAsignacionRecursos(int cantidad) {
        if (noHayRecursosSuficientes(cantidad)) {
            return "los recursos disponibles,  son insuficientes";
        } else {
            return "los recursos disponibles,  son suficientes";
        }
    }

    public String toString() {
        String sal = "";
        sal += "\nNombre Recurso:........." + nomRecurso;
        sal += "\nRecurso:................" + nRecurso;
        sal += "\nUnidades:..............." + unidades;
        sal += "\nUnidades Utilizadas:...." + uUtilizadas;
        sal += "\nUnidadesDisponibles:...." + uDisponibles + "\n";
        return sal;
    }

    
    public String toStringDetalle() {
        String sal = "";
        sal += nomRecurso + "\t\t  ";
        sal += nRecurso + "\t\t  ";
        sal += unidades + "\t  ";
        sal += uUtilizadas + "\t\t  ";
        sal += uDisponibles + "\n";
        return sal;
    }

}