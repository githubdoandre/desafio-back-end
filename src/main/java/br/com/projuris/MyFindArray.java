package br.com.projuris;

public class MyFindArray implements FindArray {

	@Override
	public int findArray(int[] array, int[] subArray) {
 	
	    int diferenca = array.length - subArray.length;
	    int pos = -1;
	    boolean achou = false;

	    proximo:
	    for (int i = 0; i <= diferenca; i++) {
	        for (int j = 0; j < subArray.length; j++) {
	            if (subArray[j] != array[i+j]) {
	                continue proximo;
	            }
	        }
	        
	        achou = true;
	        pos = i;
	        continue proximo;
	        //return i;
	    }
	    return pos;	 	
	}

}
