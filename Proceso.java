
public class Proceso {
    //Atributos de un proceso

    private int nProceso;
    private String nombre;
    private int unidadesTiempo;
    private int unidadesMem;
    private int unidadesCpu;// solo una por proceso 
    private ListaRecursos listaRecursosProcesos;
    private int prioridad;
    private int quantium;
    private int estado;
    private int tipo;

    public Proceso() {
        nProceso = 8888;
        nombre = "sNombre";
        unidadesTiempo = 1;
        unidadesMem = 1;
        prioridad = 0;
        quantium = 0;
        listaRecursosProcesos = new ListaRecursos();

    }

    public Proceso(Proceso nuevo) {
        this.nProceso = nuevo.nProceso;
        this.nombre = nuevo.nombre;
        this.unidadesTiempo = nuevo.unidadesTiempo;
        this.unidadesMem = nuevo.unidadesMem;
        this.prioridad = nuevo.prioridad;
        this.quantium = nuevo.quantium;
        this.listaRecursosProcesos = nuevo.listaRecursosProcesos;
//    this.unidadesReq      =nuevo.unidadesReq;
//    this.maxRecursosReq   =nuevo.maxRecursosReq;
//    this.apuntUnidadesReq =nuevo.apuntUnidadesReq;
    }

    public Proceso(int nProceso, String nombre) {
        this.nProceso = nProceso;
        this.nombre = nombre;
        this.unidadesTiempo = 1;
        this.unidadesMem = 1;
        this.prioridad = 0;
        this.quantium = 0;
        listaRecursosProcesos = new ListaRecursos();

    }

    public Proceso(int nProceso, String nombre, int prioridad) {
        this.nProceso = nProceso;
        this.nombre = nombre;
        unidadesTiempo = 1;
        unidadesMem = 1;
        this.prioridad = prioridad;
        quantium = 0;
        listaRecursosProcesos = new ListaRecursos();

    }

    public Proceso(ListaRecursos nueva, int nProceso, String nombre, int prioridad) {
        this.nProceso = nProceso;
        this.nombre = nombre;
        unidadesTiempo = 1;
        unidadesMem = 1;
        this.prioridad = prioridad;
        quantium = 0;
        listaRecursosProcesos = nueva;
    }

    public void setNProceso(int nProceso) {
        this.nProceso = nProceso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidadesTiempo(int unidadesTiempo) {
        this.unidadesTiempo = unidadesTiempo;
    }

    public void setUnidadesMem(int unidadesMem) {
        this.unidadesMem = unidadesMem;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setQuantium(int quantium) {
        this.quantium = quantium;
    }

    public int getNProceso() {
        return this.nProceso;
    }

    public int getUnidadesCpu() {

        return this.unidadesCpu;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getUnidadesTiempo() {
        return this.unidadesTiempo;
    }

    public int getUnidadesMem() {
        return this.unidadesMem;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public int getTipo() {
        return this.tipo;
    }

    public int getQuantium() {
        return this.quantium;
    }

    public String listaDetalleProceso() {
        String sal = "";
        sal += "" + nProceso;
        sal += "\t" + nombre;
        sal += "\t" + unidadesTiempo;
        sal += "\t" + unidadesMem;
        sal += "\t" + prioridad;
        sal += "\t" + tipo;
        sal += "\t" + estado;
        sal += "\t" + quantium;
        sal += listaRecursosProcesos.listarRecursosDetalle();

        return sal;
    }

    public String toString() {
        String sal = "";
        sal += "\nNumero de Proceso:...." + nProceso;
        sal += "\nNombre:..............." + nombre;
        sal += "\nUnidades de tiempo:..." + unidadesTiempo;
        sal += "\nUnidades de Memoria:.." + unidadesMem;
        sal += "\nPriodidad:............" + prioridad;
        sal += "\nTipo:................." + tipo;
        sal += "\nEstado:..............." + estado;
        sal += "\nQuantium:............." + quantium + "\n";
        sal += listaRecursosProcesos.listarRecursosDetalle();
        return sal;
    }

    public void asignarRecurso(Recurso nuevo, int pos) {

        listaRecursosProcesos.agregarRecurso(nuevo, pos);

    }

    public void asignarRecurso(Recurso nuevo) {

        listaRecursosProcesos.agregarRecurso(nuevo);
    }
}
