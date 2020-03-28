
import java.util.Scanner;

public class temperatura {

    public temperatura() {
    	
    	
    	Scanner entrada = new Scanner(System.in);
    	
	    System.out.print("\n\nQual dado você deseja colocar?" 
	    	+ "\n1 - Celsius"
	    	+ "\n2 - Farenheit"
	    	+ "\n3 - Kevin"	
	    	
	    	+ "\nDigite: ");
	    	
	    	int unidade1 = entrada.nextInt();
	    	
	    	
	     System.out.print("\n\nDeseja converter para quê?" 
	    		+ "\n1 - Celsius"
	    		+ "\n2 - Farenheit"
	    		+ "\n3 - Kevin"			
	    		+ "\nDigite: ");
	    	
	    	
	  		int unidade2 = entrada.nextInt();
	  	
	  	System.out.print("\n\nAgora digite a quantidade:" );
	  	
	  		double quantidade = entrada.nextDouble();
	  		
	  		
	  		switch (unidade1) {
        		case 1 : 
        			if(unidade2 == 1){
        				System.out.print(quantidade + " Celsius");
        			} else if(unidade2 == 2){
        				System.out.print((quantidade*9/5)+32 + " Farenheit");
        			} else if(unidade2 == 3){
        				System.out.print(quantidade+273.15 + " Kevin");
        			}
        		break;
        		
        		case 2 : 
        			if(unidade2 == 1){
        				System.out.print((quantidade-32)*5/9 + " Celsius");
        			} else if(unidade2 == 2){
        				System.out.print(quantidade + " Farenheit");
        			} else if(unidade2 == 3){
        				System.out.print(((quantidade-32)*5/9)+273.15 + " Kevin");
        			}
        		break;
        		
        		case 3 : 
        			if(unidade2 == 1){
        				System.out.print(quantidade-273.15 + " Celsius");
        			} else if(unidade2 == 2){
        				System.out.print(((quantidade-273.15)*9/5)+32 + " Farenheit");
        			} else if(unidade2 == 3){
        				System.out.print(quantidade + " Kevin");
        			}
        		break;
	  		}
    	
    	
    }
    
    
}