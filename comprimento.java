import java.util.Scanner;


public class comprimento {

    public comprimento() {
    	
    	Scanner entrada = new Scanner(System.in);
    	
	    System.out.print("\n\nQual dado voc� deseja colocar?" 
	    	+ "\n1 - Quilometro"
	    	+ "\n2 - Metro"
	    	+ "\n3 - Centimetro"	
	    	+ "\nDigite: ");
	    	
	    	int unidade1 = entrada.nextInt();
	    	
	    	
	     System.out.print("\n\nDeseja converter para qu�?" 
	    	+ "\n1 - Quilometro"
	    	+ "\n2 - Metro"
	    	+ "\n3 - Centimetro"	
	    	+ "\nDigite: ");
	    	
	    	
	  		int unidade2 = entrada.nextInt();
	  	
	  	System.out.print("\n\nAgora digite a quantidade:" );
	  	
	  		double quantidade = entrada.nextDouble();
	  	
	  	
	  	switch (unidade1) {
        		case 1 : 
        			if(unidade2 == 1){
        				System.out.print(quantidade + "Kilometros");
        			} else if(unidade2 == 2){
        				System.out.print(quantidade*1000 + " Metros");
        			} else {
        				System.out.print(quantidade*100000 + "Cent�metros");
        			}
        		break;
        		
        		case 2 : 
        			if(unidade2 == 1){
        				System.out.print(quantidade/1000 + "Kilometros");
        			} else if(unidade2 == 2){
        				System.out.print(quantidade + " Metros");
        			} else {
        				System.out.print(quantidade*100 + "Cent�metros");
        			}
        		break;
        		
        		case 3 : 
        			if(unidade2 == 1){
        				System.out.print(quantidade/100000 + "Kilometros");
        			} else if(unidade2 == 2){
        				System.out.print(quantidade/100 + " Metros");
        			} else {
        				System.out.print(quantidade + "Cent�metros");
        			}
        		break;
    	
    	
    	
   		}
    
    }
    
   
    	
    	
}