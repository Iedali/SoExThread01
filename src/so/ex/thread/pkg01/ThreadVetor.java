
 
package so.ex.thread.pkg01;

/**
 *
 * @author ieda
 */
public class ThreadVetor extends Thread {
    
    private int num;
    private int numVet[];
    
    
    public ThreadVetor (int num, int numVet[]) {
        this.num = num;
        this.numVet = numVet;
        
        
    }
    
    @Override
    public void run() {
       
        long inicio= System.currentTimeMillis();
         System.out.println(inicio + " inicio ");
        // verifica se é par ou ímpar
        if (num % 2 == 0){
            // é par
            for (int i = 0; i < numVet.length; i ++) {
                
            }
                          
        } else {
            // é ímpar
            for (int i: numVet) {
                
            }
        }
        long fim= System.currentTimeMillis();
        System.out.println(fim + " fim ");
        long total= fim - inicio;
        long segundos= (total / 1000) % 60;
        System.out.println(total + " segundos ");
           
    }
   
    
}
