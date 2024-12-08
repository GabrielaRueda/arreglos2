import javax.swing.JOptionPane;
public class arregloDos {
    public static void main(String[] args) {
        byte Posicion1[] = {0, 1, 2};
        byte Posicion2[] = {0, 1, 2};
        byte numero[][]=new byte[3][3];
        byte x,y;
        
        // Ingresa los numeros
        for (x = 0; x <=3; x++) {  // filas
            for (y = 0; y < 3; y++) {  // columnas
                numero[x][y] = Byte.parseByte(JOptionPane.showInputDialog("Ingresa un numero de entre 1 a 9. " ));
            }
        }
         // Impresión de encabezado
        for (x = 0; x < 2; x++) {  
            System.out.printf(Posicion2[x] + "\t");
        }
        System.out.println();
        
        for (x = 0; x <= 4; x++) {  // filas
            System.out.print(Posicion2[x] + "\t");

            for (y = 0; y < 4; y++) {   // columnas
                System.out.print(numero[x][y] + "\t");  
            }
    }
  }
}