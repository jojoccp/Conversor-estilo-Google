import java.util.Scanner;
public class conversores {
        
    /**
     * Creates a new instance of <code>conversores</code>.
     */
    public conversores() {
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Entre as opções: "
        	+	"\n1 - Comprimento"
        	+	"\n2 - Massa"
        	+	"\n3 - Temperatura"
        	+	"\n4 - Tempo"
        	+ "\nDigite a escolhida: ");
        	
        	Scanner entrada = new Scanner(System.in);
        	
        	int escolha = entrada.nextInt();
        	
        	
        	switch (escolha) {
        		case 1 : comprimento c = new comprimento();
        		break;
        		case 2 : massa m = new massa();
        		break;
        		case 3 : temperatura t = new temperatura();
        		break;
        		case 4 : tempo time = new tempo();
        		break;
        		
        		
        	}
        	
    }
}
