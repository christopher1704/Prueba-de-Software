import java.util.Scanner;
import java.util.ArrayList;

public class TareaUno{

	public static void main(String[] args) {	
		
		PilaDinamica<String> pilaString = new PilaDinamica<>();

		boolean aux = true;
		while(aux){
			System.out.println("//////////////////// MENU ///////////////////");
			System.out.println("1. Inserte una palabra a la pila");
			System.out.println("2. Ver pila.");
			System.out.println("3. Comparar elementos de la pila");	
			System.out.println("4. Salir\n");	

			System.out.println("Inserte su opcion : ");
			Scanner entrada=new Scanner(System.in);
        	int opcion=entrada.nextInt();

			if(opcion==1){
				System.out.println("Inserte la primera palabra:");
				Scanner entrada2=new Scanner(System.in);
				String palabra1=entrada2.nextLine();
				pilaString.push(palabra1);

			}else if (opcion==2){
				pilaString.Show();

			}else if (opcion==3){
				Scanner entrad3a=new Scanner(System.in);
				System.out.println("Elija que palabras comparar:");
				System.out.println("El indice de la palabra 1 debe ser menor que el de la palabra 2.");
				System.out.println("Indice palabra 1:");
        		int indPal1=entrada.nextInt();
				System.out.println("Indice palabra 2:");
        		int indPal2=entrada.nextInt();
				
				String aComparar1 = "test1";
				String aComparar2 = "test2";
				String matchPalabra;
				int cont = pilaString.size();

				ArrayList<String> respaldos = new ArrayList<String>();

				while(cont>=1){
					pilaString.Show();
					if(pilaString.size() == indPal1){
						matchPalabra = pilaString.top();
						aComparar1 = matchPalabra;
					}
					if(pilaString.size() == indPal2){
						matchPalabra = pilaString.top();
						aComparar2 = matchPalabra;
					}
					matchPalabra = pilaString.pop();
					respaldos.add(matchPalabra);
					cont--;
				}

				String respaldo = "";
				System.out.println("\n");
				System.out.println(respaldos);
				int largo = respaldos.size();
				while(largo!=0){
					pilaString.push(respaldos.get(largo-1));
					largo--;
				}

				if(aComparar1.equals(aComparar2)){
					System.out.println("Las palabras son iguales");
				}else{
					System.out.println("Las palabras son distintas");
				}


			}else if (opcion==4){
				aux = false;
			}
			
			System.out.println("\n");
		}
	}



}