import java.util.Scanner;

public class examenpromedio{

	public static void main(String[] args){
		
		Scanner r = new Scanner(System.in);
		double acumulado, examen, promedio, promedioAcumulado, promedioExamen;
		System.out.println("Porfavor ingrese la nota acumulada: ");
		acumulado = r.nextDouble();
		System.out.println("Porfavor ingrese la nota del examen: ");
		examen = r.nextDouble();
		promedioAcumulado = acumulado*0.70;
		promedioExamen = examen*0.30;

		if(promedioAcumulado > 70)
		{
			promedioAcumulado = 70;
		}

		if(promedioExamen > 30)
		{
			promedioAcumulado = 30;
		}

		promedio = promedioAcumulado+promedioExamen;


		if(promedio >= 70)
		{
			System.out.println("Su nota promedio es: "+promedio);
			System.out.println("Usted ha aprobado la clase!");
		}else
		{
			System.out.println("Su nota promedio es: "+promedio);
			System.out.println("Usted ha reprobado la clase!");
		}
	}

}