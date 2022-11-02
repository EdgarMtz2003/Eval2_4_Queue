/*
add -> al final de la lista
poll -> lee y elimina el primer elemento de la lista
peek ->lee el primer elemento de la lista
 */
package eval2_4_queue;

/**
 *
 * @author moviles
 */

public class Eval2_4_Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyQueue myQueue = new MyQueue();
        //Fifo --> first in, first out
        myQueue.agregar(10);//primero en llegar, primero en se aten
        myQueue.agregar(20);
        myQueue.agregar(30);
        myQueue.agregar(40);
        myQueue.agregar(50);//unlimo en llegar
        
        System.out.println("Primer valor en llegar es: "+myQueue.peek());
        myQueue.imprimir();
        
        try{
        System.out.println("Primer valor en llegar es: "+myQueue.pool());
        myQueue.imprimir();
        }catch(Exception ex){
                   
        }
    }
    
}
