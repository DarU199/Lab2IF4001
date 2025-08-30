
public class Maquina {

    private ListaRecursos listaRecursoMaquina;
    private int unidadesMemoriaMaquina;
    private int unidadesMemoriaDisponible;
    private int unidadesMemoriaUtilizada;
    private int cantidadNucleos;
//  private int unidadesCPUMaquina;
//  private int unidadesCPUDisponible;
//  private int unidadesCPUUtilizadas;
    private String nombre;
    private String ubicacion;
    private int tiempoInicio;   //Tiempo en que la maquina inicia.

    //Constructores
    public Maquina(int unidadesMemoriaMaquina, String nombre, String ubicacion, int tiempoInicio)//crear unidadesCPUMaquina
    {
        this.unidadesMemoriaMaquina = unidadesMemoriaMaquina;
        this.unidadesMemoriaUtilizada = 0;
        //this.unidadesCPUMaquina=unidadesCPUMaquina;
        //this.unidadesCPUUtilizadas=0;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tiempoInicio = tiempoInicio;
        this.unidadesMemoriaDisponible = unidadesMemoriaMaquina;
        this.cantidadNucleos = 1;
        //this.unidadesCPUDisponible=unidadesCPUMaquina;
    }

    public Maquina(ListaRecursos listaNueva, int unidadesMemoriaMaquina,
            String nombre, String ubicacion, int tiempoInicio,
            int cantidadNucleos) {
        this.listaRecursoMaquina = listaNueva;
        this.unidadesMemoriaMaquina = unidadesMemoriaMaquina;
        this.unidadesMemoriaUtilizada = 0;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tiempoInicio = tiempoInicio;
        this.unidadesMemoriaDisponible = unidadesMemoriaMaquina;
        this.cantidadNucleos = cantidadNucleos;
    }

    //Metodos set y get
    public void setUnidadesMemoriaMaquina(int unidades) {
        this.unidadesMemoriaMaquina = unidades;
    }

    public void setCantidadNucleos(int cantidadNucleos) {
        this.cantidadNucleos = cantidadNucleos;
    }
//  public void setUnidadesCPUMaquina(int unidades){
//    this.unidadesCPUMaquina=unidades;
//  }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setTiempoInicio(int tiempo) {
        this.tiempoInicio = tiempo;
    }

    public int getUnidadesMemoriaMaquina() {
        return this.unidadesMemoriaMaquina;
    }

    public int getUnidadesMemoriaUtilizada() {
        return this.unidadesMemoriaUtilizada;
    }

    public int getUnidadesMemoriaDisponible() {
        return this.unidadesMemoriaDisponible;
    }
//  public int getUnidadesCPUMaquina(){
//    return this.unidadesCPUMaquina;
//  }

    public String getNombre() {
        return this.nombre;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public int getTiempoInicio() {
        return this.tiempoInicio;
    }

    public void liberarMemoria(int cantidadLiberar) {
        this.unidadesMemoriaDisponible += cantidadLiberar;
        this.unidadesMemoriaUtilizada -= cantidadLiberar;
    }

    public void asignarMemoria(int cantidadAsignar) {
        this.unidadesMemoriaDisponible -= cantidadAsignar;
        this.unidadesMemoriaUtilizada += cantidadAsignar;
    }

    public String toString() {
        String sal = "Maquina..............." + getNombre();
        sal += "\nUbicacion..........." + getUbicacion();
        sal += "\nTiempo de Inicio...." + getTiempoInicio();
        sal += "\nMemoria Disponible ." + getUnidadesMemoriaMaquina();
        sal += "\nMemoria Usada......." + getUnidadesMemoriaUtilizada();
        sal += "\nLista de Recursos:.." + "\n";
        sal += listaRecursoMaquina.listarRecursosDetalle();

        return sal;
    }

    public String listarMaquinaDetalle() {
        String sal = "" + getNombre();
        sal += "\t\t" + getUbicacion();
        sal += "\t" + getTiempoInicio();
        sal += "\t" + unidadesMemoriaMaquina;
        sal += "\t" + unidadesMemoriaDisponible;
        sal += "\t" + unidadesMemoriaUtilizada;
        sal += "\nLista de Recursos:\n";
        sal += listaRecursoMaquina.listarRecursosDetalle();

        return sal;
    }

    // ASIGNAR RECURSOS A LA MAQUINA 
    public void asignarRecurso(Recurso nuevo, int pos) {

        listaRecursoMaquina.agregarRecurso(nuevo, pos);

    }

    public void asignarRecurso(Recurso nuevo) {

        listaRecursoMaquina.agregarRecurso(nuevo);
    }

}
