
import java.util.Scanner;

public class massa {

    public massa() {
    	
    	
    	Scanner entrada = new Scanner(System.in);
    	
	    System.out.print("\n\nQual dado você deseja colocar?" 
	    	+ "\n1 - Miligrama"
	    	+ "\n2 - Grama"
	    	+ "\n3 - Quilograma"	
	    	+ "\n4 - Libra"	
	    	+ "\n5 - Tonelada"	
	    	+ "\nDigite: ");
	    	
	    	int unidade1 = entrada.nextInt();
	    	
	    	
	     System.out.print("\n\nDeseja converter para quê?" 
	    	+ "\n1 - Miligrama"
	    	+ "\n2 - Grama"
	    	+ "\n3 - Quilograma"	
	    	+ "\n4 - Libra"	
	    	+ "\n5 - Tonelada"		
	    	+ "\nDigite: ");
	    	
	    	
	  		int unidade2 = entrada.nextInt();
	  	
	  	System.out.print("\n\nAgora digite a quantidade:" );
	  	
	  		double quantidade = entrada.nextDouble();
	  		
	  		
	  		
	  		
	  		
	  		switch (unidade1) {
        		case 1 : 
        			if(unidade2 == 1){
        				System.out.print(quantidade + "Miligramas");
        			} else if(unidade2 == 2){
        				System.out.print(quantidade/100 + " Gramas");
        			} else if(unidade2 == 3){
        				System.out.print(quantidade/1e+6 + " Quilogramas");
        			} else if(unidade2 == 4){
        				System.out.print(quantidade/453592 + " Libras");
        			} else if(unidade2 == 5){
        				System.out.print(quantidade/1e+9 + " Toneladas");
        			}
        		break;
        		
        		case 2 : 
        			if(unidade2 == 1){
        				System.out.print(quantidade*1000 + "Miligramas");
        			} else if(unidade2 == 2){
        				System.out.print(quantidade + " Gramas");
        			} else if(unidade2 == 3){
        				System.out.print(quantidade/1000 + " Quilogramas");
        			} else if(unidade2 == 4){
        				System.out.print(quantidade/454 + " Libras");
        			} else if(unidade2 == 5){
        				System.out.print(quantidade/1e+6 + " Toneladas");
        			}
        		break;
        		
        		case 3 : 
        			if(unidade2 == 1){
        				System.out.print(quantidade*1e+6 + "Miligramas");
        			} else if(unidade2 == 2){
        				System.out.print(quantidade*1000 + " Gramas");
        			} else if(unidade2 == 3){
        				System.out.print(quantidade + " Quilogramas");
        			} else if(unidade2 == 4){
        				System.out.print(quantidade*2.205 + " Libras");
        			} else if(unidade2 == 5){
        				System.out.print(quantidade/1000 + " Toneladas");
        			}
        		break;
        		
        		case 4 : 
        			if(unidade2 == 1){
        				System.out.print(quantidade*453592 + "Miligramas");
        			} else if(unidade2 == 2){
        				System.out.print(quantidade*454 + " Gramas");
        			} else if(unidade2 == 3){
        				System.out.print(quantidade/2.205 + " Quilogramas");
        			} else if(unidade2 == 4){
        				System.out.print(quantidade + " Libras");
        			} else if(unidade2 == 5){
        				System.out.print(quantidade/2205 + " Toneladas");
        			}
        		break;
        		
        		case 5 : 
        			if(unidade2 == 1){
        				System.out.print(quantidade*1e+9 + "Miligramas");
        			} else if(unidade2 == 2){
        				System.out.print(quantidade*1e+6 + " Gramas");
        			} else if(unidade2 == 3){
        				System.out.print(quantidade*1000 + " Quilogramas");
        			} else if(unidade2 == 4){
        				System.out.print(quantidade*2205 + " Libras");
        			} else if(unidade2 == 5){
        				System.out.print(quantidade + " Toneladas");
        			}
        		break;
    	
    	
    	
   		}
    	
    }
    
    
}