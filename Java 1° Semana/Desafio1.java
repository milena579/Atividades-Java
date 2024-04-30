import java.util.Random;

import org.omg.PortableInterceptor.NON_EXISTENT;

public class DesafioUm {

     public static void main(String[] args) {
        int[] array = new int[]{244,232,241,123,232,064,111,140};
        int[] result = compact(array);
        int[] result2 = decompact(result);
        int[] tres = compactThree(result);

        for (int i = 0; i < result.length; i++)
            System.out.printf("%d\n", result[i]);

        for (int i = 0; i < result2.length; i++)
            System.out.printf("\n%d", result2[i]);
    }

    static int[] compact(int[] originalData){
        int[] listaNova = new int[originalData.length/2];
        int j = 0;

        for (int i = 0; i < originalData.length; i+=2){
            listaNova[j] = ((originalData[i] >> 4 ) << 4) + (originalData[i+1] >> 4);
            j++;
        } 
        return listaNova;
    }

    static int[] decompact(int[] originalData){
        int[] descompactar = new int[originalData.length*2];
        int j = 0;
        Random gerador = new Random();
        for(int i = 0; i < originalData.length; i++){
            descompactar[j] = ((originalData[i] >> 4) << 4) + (gerador.nextInt(15));
            j++;
            descompactar[j] = ((originalData[i] & 15) << 4) + (gerador.nextInt(15));
            j++;
        }
        return descompactar;
    }

    // static int[] compactThree(int[] originalData){
    //     for (int i = 0; i < )
    // }
}
