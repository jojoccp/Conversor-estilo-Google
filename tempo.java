
import java.util.Scanner;

public class tempo {

    public tempo() {
    	
    	
    	Scanner entrada = new Scanner(System.in);
    	
	    System.out.print("\n\nQual dado você deseja colocar?" 
	    	+ "\n1 - Segundo"
	    	+ "\n2 - Minuto"
	    	+ "\n3 - Hora"	
	    	+ "\n4 - Dia"
	    	+ "\nDigite: ");
	    	
	    	int unidade1 = entrada.nextInt();
	    	
	    	
	     System.out.print("\n\nDeseja converter para quê?" 
	    		+ "\n1 - Segundo"
	    		+ "\n2 - Minuto"
	    		+ "\n3 - Hora"	
	    		+ "\n4 - Dia"			
	    		+ "\nDigite: ");
	    	
	    	
	  		int unidade2 = entrada.nextInt();
	  	
	  	System.out.print("\n\nAgora digite a quantidade:" );
	  	
	  		double quantidade = entrada.nextDouble();
	  		
	  		
	  		
	  		
	  		switch (unidade1) {
        		case 1 : 
        			if(unidade2 == 1){
        				System.out.print(quantidade + " Segundos");
        			} else if(unidade2 == 2){
        				System.out.print(quantidade/60 + " Minutos");
        			} else if(unidade2 == 3){
        				System.out.print(quantidade/3600 + " Hora");
        			} else if(unidade2 == 4){
        				System.out.print(quantidade/86400 + " Dia");
        			}
        		break;
        		
        		case 2 : 
        			if(unidade2 == 1){
        				System.out.print(quantidade*60 + " Segundos");
        			} else if(unidade2 == 2){
        				System.out.print(quantidade + " Minutos");
        			} else if(unidade2 == 3){
        				System.out.print(quantidade/60 + " Hora");
        			} else if(unidade2 == 4){
        				System.out.print(quantidade/1440 + " Dia");
        			}
        		break;
        		
        		case 3 : 
        			if(unidade2 == 1){
        				System.out.print(quantidade*3600 + " Segundos");
        			} else if(unidade2 == 2){
        				System.out.print(quantidade*60 + " Minutos");
        			} else if(unidade2 == 3){
        				System.out.print(quantidade + " Hora");
        			} else if(unidade2 == 4){
        				System.out.print(quantidade/24 + " Dia");
        			}
        		break;
        		
        		case 4 : 
        			if(unidade2 == 1){
        				System.out.print(quantidade*86400 + " Segundos");
        			} else if(unidade2 == 2){
        				System.out.print(quantidade*1440 + " Minutos");
        			} else if(unidade2 == 3){
        				System.out.print(quantidade*24 + " Hora");
        			} else if(unidade2 == 4){
        				System.out.print(quantidade + " Dia");
        			}
        		break;
        		
	  		}
    	
    	
    }
    
    
}