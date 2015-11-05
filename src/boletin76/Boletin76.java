

package boletin76;

/**
 *
 * @author agomezcastro
 */
public class Boletin76 {

   
    public static void main(String[] args) {
        int num;
        Comercio obx= new Comercio();
        num= obx.pedirNumEnteiro();
        obx.consumo(num);
    }
    
}
