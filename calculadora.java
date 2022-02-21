package numeros;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, res=0;
		String sel=null;
		Scanner tec=new Scanner(System.in);
System.out.println("Seleccione una opcion\n");
System.out.println("+: Suma"
		+ "\n-: Resta"
		+ "\n*: Multiplicacion"
		+ "\n/: Division");
	sel=tec.next();
switch(sel) {
case "+":
	System.out.println("Ha seleccionado Suma\n Ingrese los valores");
	System.out.println("ingrese el primer numero");
	a=tec.nextInt();
	System.out.println("ingrese el segundo numero");
	b=tec.nextInt();
	
	res=a+b;
	System.out.println(a+"+"+b+"="+res);
	break;
	
case "-":
	System.out.println ("Ha seleccionado Resta\n Ingrese los valores");
	System.out.println("ingrese el primer numero");
	a=tec.nextInt();
	System.out.println("ingrese el segundo numero");
	b=tec.nextInt();
	
	res=a-b;
	System.out.println(a+"-"+b+"="+res);
	break;
	
case "*":
	System.out.println ("Ha seleccionado Multiplicacion\n Ingrese los valores");
	System.out.println("ingrese el primer numero");
	a=tec.nextInt();
	System.out.println("ingrese el segundo numero");
	b=tec.nextInt();
	
	res=a*b;
	System.out.println(a+"*"+b+"="+res);
	break;
	
case "/":
	System.out.println ("Ha seleccionado Division\n Ingrese los valores");
	System.out.println("ingrese el primer numero");
	a=tec.nextInt();
	System.out.println("ingrese el segundo numero");
	b=tec.nextInt();
	
	res=a/b;
	System.out.println(a+"/"+b+"="+res);
	break;
	default:
		System.out.println("Esta opcion no existe");
}
	
	}

}
