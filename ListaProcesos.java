
public class ListaProcesos {

    private Proceso listaProcesos[];
    private int nProcesos;
    private String nombre;
    private int maxProcesos;
    private int apuntadorProceso;

    public ListaProcesos(String nombre, int nProcesos) {
        this.nombre = nombre;
        this.nProcesos = nProcesos;
        this.maxProcesos = 100;
        this.listaProcesos = new Proceso[maxProcesos];
        this.apuntadorProceso = 0;
    }

    public ListaProcesos(int maxProcesos) {
        this.nombre = "Sin nombre";
        this.nProcesos = 10;
        this.maxProcesos = maxProcesos;
        this.listaProcesos = new Proceso[maxProcesos];
        this.apuntadorProceso = 0;
    }

    public ListaProcesos(String nombre, int nProcesos, Proceso lista[]) {
        this.nombre = nombre;
        this.nProcesos = nProcesos;
        this.maxProcesos = 100;
        this.listaProcesos = lista;
        this.apuntadorProceso = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMaxProceso() {
        return this.maxProcesos;
    }

    public void setMaxProcesos(int maxProceso) {
        this.maxProcesos = maxProcesos;
    }

    public void agregarProcesos(Proceso proceso) {
        listaProcesos[apuntadorProceso++] = proceso;
    }

    public int contarUnidadesMem() {
        int contador = 0;
        for (int i = 0; i < apuntadorProceso; i++) {
            contador += listaProcesos[i].getUnidadesMem();
        }
        return contador;
    }

    public int contarUnidadesTiempo() {
        int contador = 0;
        for (int i = 0; i < apuntadorProceso; i++) {
            contador += listaProcesos[i].getUnidadesTiempo();
        }
        return contador;
    }

    public int contarUnidadesCpu() {
        int contador = 0;
        for (int i = 0; i < apuntadorProceso; i++) {
            contador += listaProcesos[i].getUnidadesCpu();
        }
        return contador;
    }

    public String listarProcesos() {
        String salida = "";
        salida += "nP";
        salida += "\tnom";
        salida += "\tUT";
        salida += "\tUM";
        salida += "\tPri";
        salida += "\tTi";
        salida += "\tEs";
        salida += "\tQ";
        salida += "\tuR1";
        salida += "\tuR2";
        salida += "\tuR3\n";
        // salida+="\tuR4";
        //salida+="\tuR5";
        for (int i = 0; i < apuntadorProceso; i++) {
            salida += listaProcesos[i].listaDetalleProceso() + "\n";
        }

        salida += totalizarProcesosDetalle();

        return salida;
    }

    public void intercambio(int i, int j) {

        Proceso aux = new Proceso();
        aux = listaProcesos[i];
        listaProcesos[i] = listaProcesos[j];
        listaProcesos[j] = aux;

    }

    public String totalizarProcesos() {
        String sal = "\n Totales:";

        sal += "\n CPU: ......." + this.contarUnidadesCpu();
        sal += "\n Memoria: ..." + this.contarUnidadesMem();
        sal += "\n Tiempo: ...." + this.contarUnidadesTiempo();
//   sal += "\n Unidades Recurso1: ...." +this.contarUnidadesRec(0);
//   sal += "\n Unidades Recurso2: ...." +this.contarUnidadesRec(1);
//   sal += "\n Unidades Recurso3: ...." +this.contarUnidadesRec(2);
        sal += "\n\n ";
        return sal;
    }

    public String totalizarProcesosDetalle() {
        String sal = "\n";

        sal += "\t\t" + "";
        sal += "\t" + "";
        sal += "\t\t\t\t\t" + "";
        sal += "\t" + "";
        sal += "\t" + "\n";

        sal += "\t\t" + this.contarUnidadesMem();
        sal += "\t" + this.contarUnidadesTiempo();
//   sal += "\t\t\t\t\t" +this.contarUnidadesRec(0);
//   sal += "\t" +this.contarUnidadesRec(1);
//   sal += "\t" +this.contarUnidadesRec(2);
        sal += "\n\n ";
        return sal;
    }

    public String toString() {
        String salida = "";
        salida += "Nombre Lista.................." + nombre;
        salida += "\nCantidad de Elementos........" + nProcesos;
        salida += "\nApuntador...................." + apuntadorProceso;
        for (int i = 0; i < apuntadorProceso; i++) {
            salida += "\nElemento.. " + i;
            salida += listaProcesos[i].toString();
        }
        return salida;
    }

    public void ordenarPrioridad() {
        for (int i = 0; i < apuntadorProceso - 1; i++) {

            for (int j = i; j < apuntadorProceso; j++) {
                if (listaProcesos[i].getPrioridad() > listaProcesos[j].getPrioridad()) {

                    intercambio(i, j);

                }

            }

        }
    }

    public void ordenarTipo() {
        for (int i = 0; i < apuntadorProceso - 1; i++) {

            for (int j = i; j < apuntadorProceso; j++) {
                if (listaProcesos[i].getTipo() > listaProcesos[j].getTipo()) {

                    intercambio(i, j);

                }

            }

        }
    }

    public void ordenarQuantium() {
        for (int i = 0; i < apuntadorProceso - 1; i++) {

            for (int j = i; j < apuntadorProceso; j++) {
                if (listaProcesos[i].getQuantium() > listaProcesos[j].getQuantium()) {

                    intercambio(i, j);

                }
            }
        }
    }
  

    public void agregarProceso(Proceso nuevo) {
        listaProcesos[apuntadorProceso++] = nuevo;

    }

    public int getApuntadorProceso() {
        return apuntadorProceso;
    }

    public int getMaxProcesos() {
        return maxProcesos;
    }

    public ListaProcesos eliminarProceso(int pos) {
        ListaProcesos temporal = new ListaProcesos(this.getApuntadorProceso());

        for (int i = 0; i < getApuntadorProceso(); i++) {

            if (i != pos) {
                temporal.agregarProceso(listaProcesos[i]);
            }
        }

        return temporal;
    }

    public void limpiarListaProcesos() {
        for (int i = 0; i < maxProcesos; i++) {
            listaProcesos[i] = null;
        }
        apuntadorProceso = 0;
    }

    public void sustituirListaProcesos(ListaProcesos nuevo) {
        limpiarListaProcesos();

        for (int i = 0; i <= apuntadorProceso; i++) {
            this.listaProcesos[i] = nuevo.getProcesoLista(i);
        }
    }

    public Proceso getProcesoLista(int pos) {
        return listaProcesos[pos];
    }

    public void ordenarListaProcesosPri() {

    }

}
