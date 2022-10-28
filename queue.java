import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class queue {
    int N; //Cantidad de arreglos
    int M; //Cantidad de objetos en cada arreglo

    public static void main(String[] args) {

        Integer[] Arreglo1 = {5,9,48,7,47,69,222}; //arreglo inventado para asegurar que funcione
        int M = Arreglo1.length;
        int N = 2;
        Stack pila = new Stack();

        Queue<Integer> ColaEnteros = new PriorityQueue<Integer>();

        for(int j=0; j < N; j++) {          //para cambiar de array a una queue
            ColaEnteros.add(Arreglo1[j]);
        }

        for(int k = 0; k < N; k++){
            for (int i = 0; i < M; i++) {
                pila.push(ColaEnteros.peek());
                ColaEnteros.poll();
            }
        }
        System.out.println(pila);
    }

}