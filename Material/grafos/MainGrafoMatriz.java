package grafos;

public class MainGrafoMatriz 
{
	public static void main(String args[]) 
    {
        GrafoMatriz grafo = new GrafoMatriz(10);
        
        grafo.insereAresta(1, 2, 12);
        grafo.insereAresta(2, 3, 23);
        grafo.insereAresta(3, 4, 34);
        grafo.insereAresta(3, 1, 31);       

        grafo.imprimir();
        
        System.out.println("existeAresta(1, 2): " + grafo.existeAresta(1, 2) );
        System.out.println("existeAresta(2, 1): " + grafo.existeAresta(2, 1) );
        
        System.out.println("listaAdjacentes(3): "+ grafo.listaAdjacentes(3));

        System.out.println("removeAresta(3, 4): ");
        grafo.removeAresta(3, 4);
        
        grafo.imprimir();
        
        System.out.println("listaAdjacentes(3): "+ grafo.listaAdjacentes(3));
        
        Integer[] arestaMinima = grafo.arestaMinima();

        System.out.println("Aresta mínima = ("+arestaMinima[0]+","+arestaMinima[1]+")");
    }
}
