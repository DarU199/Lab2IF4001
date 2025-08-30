
public class PruebaSGP2025 {
    
    public static void main(String[] args) {
        
        Recurso ip = new Recurso(5,"imp",15);
        
        System.out.println(ip);
        System.out.println(ip.toStringDetalle());
        
        
        //System.out.println(disco);
        //System.out.println(disco.toStringDetalle());
        
        
        ListaRecursos Lista1 = new ListaRecursos();
        Lista1.setCantidadRecurso(0, 10);
        Lista1.setCantidadRecurso(1, 8);
        Lista1.setCantidadRecurso(2, 7);
        Lista1.setCantidadRecurso(3, 3);
        Lista1.setCantidadRecurso(4, 9);
        System.out.println(Lista1);
        System.out.println(Lista1.listarRecursosDetalle());
        
        
    }
    
}
