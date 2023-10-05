package principal;


public class Dados {

	public static void main(String[] args) {
		// un programa que simule el lanzamiento de un dado
		
		/*int dado = (int)(Math.random()*6 +1);
		
		System.out.println(dado);*/
		//lanzar el dado 10.000 veces y mostraremos los porcentajes
		//de cada cara
		
		
		int[] nums = new int [6] ;
		
		nums [0] = 1;
		nums [1] = 2;
		nums [2] = 3;
		nums [3] = 4;
		nums [4] = 5;
		nums [5] = 6;
		
		for (int i=1; i<100000000; i++) {
			//lanzamiento del dado
			int dado = (int)(Math.random()*6 +1);
			//siempre se incrementa la posicion del array
			//cuyo indice es el valor del dado menos 1
				/*switch(dado) {
				case 1:
					nums[0]++;
					break;
				case 2:
					nums[1]++;
					break;
				case 3:
					nums[2]++;
					break;
				case 4:
					nums[3]++;
					break;
				case 5:
					nums[4]++;
					break;
				case 6:
					nums[5]++;
					break;	
			}	*/
				nums[dado-1]++;
		}
		
		for (int i =0; i<nums.length;i++) {
			System.out.println("porcentaje de " + (i+1)+ ": " + nums[i]*100.0/100000000);
		}

	}

}
