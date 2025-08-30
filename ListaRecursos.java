
public class ListaRecursos {

    private int nRecursos;
    private Recurso recursos[];
    private int aRecurso;

// constructores  
    public ListaRecursos() {
        nRecursos = 5;
        aRecurso = 4;
        recursos = new Recurso[nRecursos];
        for (int i = 0; i < nRecursos; i++) {
            recursos[i] = new Recurso();

        }
        recursos[0].setNomRecurso("Imp");
        recursos[1].setNomRecurso("Dis");
        recursos[2].setNomRecurso("DVD");
        recursos[3].setNomRecurso("Cam");
        recursos[4].setNomRecurso("USB");
        recursos[0].setNrecurso(0);
        recursos[1].setNrecurso(1);
        recursos[2].setNrecurso(2);
        recursos[3].setNrecurso(3);
        recursos[4].setNrecurso(4);
        recursos[0].setUnidades(0);
        recursos[1].setUnidades(0);
        recursos[2].setUnidades(0);
        recursos[3].setUnidades(0);
        recursos[4].setUnidades(0);
    }

    public ListaRecursos(int nRecursos) {
        this.nRecursos = nRecursos;
        aRecurso = 0;
        recursos = new Recurso[this.nRecursos];
        for (int i = 0; i < nRecursos; i++) {
            recursos[i] = new Recurso();
        }
    }

    public void agregarRecurso(Recurso nuevo, int pos) {
        recursos[pos] = nuevo;
    }

    public void agregarRecurso(Recurso nuevo) {
        recursos[aRecurso++] = nuevo;
    }

    public void setCantidadRecurso(int posRecurso, int unidadesRecurso) {
        recursos[posRecurso].setUnidades(unidadesRecurso);
    }

    public String listarRecursos() {
        String sal = "";
        for (int i = 0; i < aRecurso; i++) {
            sal += recursos[i].toString();
        }
        return sal;
    }

    public String listarRecursosDetalle() {
        String sal = "Nombre        Rec  Unidades Ocupadas Disp\n";

        for (int i = 0; i <= aRecurso; i++) {
            sal += recursos[i].toStringDetalle();
        }
        return sal;
    }

    public String toString() {
        String sal = "";
        sal += listarRecursos();
        return sal;
    }

    public void asignarRecursoL(int posRecurso, int cantidadRecurso) {
        recursos[posRecurso].asignarRecurso(cantidadRecurso);
    }

    public void liberarRecursoL(int posRecurso, int cantidadRecurso) {
        recursos[posRecurso].liberarRecurso(cantidadRecurso);
    }

    public int getCantidadRecursos() {
        return nRecursos;
    }

    // para liberar por completo los recursos
    public void liberarRecursoL(int posRecurso) {
        // captura las unidades originales del inicio
        recursos[posRecurso].setUdisponibles(recursos[posRecurso].getUnidades());
// pone las unidades nuevamente en 0.
        recursos[posRecurso].setUutilizadas(0);
    }

    public void setUnidadesRecursos(int cantidad, int pos) {
        recursos[pos].setUnidades(cantidad);
    }

}
