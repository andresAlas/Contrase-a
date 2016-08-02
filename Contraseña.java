import javax.swing.*;
public class Contraseña {
	public static void main(String[] args)
	{
		int cont;
		String contrasena, clave = "gorila", msj; 

		for(cont = 0; cont < 3; cont++)
		{
			contrasena = JOptionPane.showInputDialog("Ingrese la Contraseña");

			if(contrasena.equals(clave))
			{
				msj = "Entro al sistema :)";
				System.out.println(msj);
				break;
			}else{
				msj = "No entro al sistema :(";
				System.out.println(msj);
			}
		}
	}
}