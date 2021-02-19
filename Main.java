public class Main {

    public static void main(String[] args) {
        Complejidad c = new Complejidad();
        int ejecuciones = 20;
        int resultados[][] = new int[ejecuciones][20];
        int columna = 0;
        /*for (int renglon = 0; renglon < ejecuciones; renglon++) {
            int n = (renglon + 1) * 1;
            //resultados[renglon][0] = n;
            resultados[renglon][columna] = c.lineal(n);
            columna++;
        }
        imprimir(resultados);

        for (int renglon=0; renglon < ejecuciones; renglon++) {
            int n = (renglon + 1) * 1;
            resultados[renglon][columna] = c.cuadratica(n);
            columna++;
        }
        imprimir(resultados);
*/

        for (int renglon=0; renglon < ejecuciones; renglon++) {
            int n = (renglon + 1) * 100;
            resultados[renglon][columna] = c.log(n);
            columna++;
        }
        imprimir(resultados);

    }

    private static void nada() {
        // hacer algo
    }
    private static void imprimir(int [][] resultado){
        int columna = 0;
        for (int renglon = 0; renglon < resultado.length ; renglon++){
            for(int espacios = 20; espacios >= resultado[renglon][columna]; espacios--){
                System.out.print(" ");
            }
            for(int veces = 0; veces < resultado[renglon][columna]; veces++){
                System.out.print("*");
            }
            columna++;
            lfñfdsSystem.out.println();
        }
    }
}
