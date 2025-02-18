
import javax.swing.JOptionPane;


/**
 *
 * @author aldomoreno
 */
public class Diagnostico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int men=0;
        String[][] famosos = {
    {"1", "Donald Trump", "@realdonaldtrump", "Presidente", "Estadounidense", "23.3M"},
    {"2", "Justin Trudeau", "@justinpjtrudeau", "Primer Ministro", "Canadiense", "4.3M"},
    {"3", "Andrés Manuel López Obrador", "@lopezobrador", "Ex Presidente", "Mexicano", "1.6M"},
    {"4", "Jair Bolsonaro", "@jairmessiasbolsonaro", "Ex Presidente", "Brasileño", "22.9M"},
    {"5", "Rishi Sunak", "@rishisunakmp", "Primer Ministro", "Británico", "0.6M"},
    {"6", "Emmanuel Macron", "@emmanuelmacron", "Presidente", "Francés", "3.1M"},
    {"7", "Narendra Modi", "@narendramodi", "Primer Ministro", "Indio", "75.1M"},
    {"8", "Olaf Scholz", "@bundeskanzler", "Canciller", "Alemán", "0.3M"},
    {"9", "Volodymyr Zelenskyy", "@zelenskiy_official", "Presidente", "Ucraniano", "16.1M"},
    {"10", "Pedro Sánchez", "@sanchezcastejon", "Presidente del Gobierno", "Español", "1.2M"}
};
    do{
        men=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: \n1.Para buscar un Famoso \n2. Para modificar la lista \n3.Para salir"));
        switch(men){
            case 1:
            int buscar=Integer.parseInt(JOptionPane.showInputDialog("Ingresa que top de famoso desea buscar(1-10)"));
            buscar=buscar-1;
            JOptionPane.showMessageDialog(null,"El top: " + famosos[buscar][0] + "\nNombre: "+ famosos[buscar][1] + "\nUsuario: "
            + famosos[buscar][2] + "\nPuesto: "+ famosos[buscar][3] + "\nNacionalidad: "+ famosos[buscar][4] + "\nSeguidores: "+ famosos[buscar][5]);
            break; 
            case 2:
            int buscar2= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el top que deseas modificar (1-10)"));
            buscar2=buscar2-1;
            String[] nombres= {"Ingrese nombre", "Ingrese nombre de usuario", "Ingrese profesion", "Ingrese nacionalidad", "Ingrese No de sguidores"};
            for(int i=1; i<6; i++){
            famosos[buscar2][i]=JOptionPane.showInputDialog(nombres[i-1]);
            }
            JOptionPane.showMessageDialog(null,"Cambios completados con exito");
            break;
            case 3: 
            JOptionPane.showMessageDialog(null,"Hasta luego");
            break;
        }
    } while (men !=3);
    }
    
}
