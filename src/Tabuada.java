
public class Tabuada {

	public static void main(String[] args) {
		int i,j;
		System.out.println("==============TABUADA=DO=1=AO=10===============");
			//Escreve a tabuada do 1 ao 5
			for( j=1;j<=10;j++) {	  			//Lê os números
				System.out.println();			//linha por linha.
					for ( i = 1;i<=5;i++) {						//Repete os números a cada linha 
						System.out.print(i+"X"+j+"="+i*j+"\t");	//e por coluna acrescentando+1.
					}
			}
			//Eepete a mesma idéia acima, com a tabuada do 6 ao 10.
			System.out.println();
			for( j=1;j<=10;j++) {
				System.out.println();
					for ( i = 6;i<=10;i++) {	
						System.out.print(i+"X"+j+"="+i*j+"\t");
					}
			}
	
			System.out.println();	
		}
	}


