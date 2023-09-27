import java.util.Scanner;

//Definimos la clase Lectura
public class Lectura {
    //Definimos el método para printar las preguntas y recoger los datos de cara al siguiente método para añadirlo
    public Pokemon leerPokemon() {

        Scanner input = new Scanner(System.in);
        int num = 0;

        //escanear entradas
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║ Introduce el número del Pokemon ║");
        System.out.println("╚═════════════════════════════════╝");
        num = input.nextInt();

        input.nextLine();
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║ Introduce el nombre del Pokemon ║");
        System.out.println("╚═════════════════════════════════╝");
        String nombre = input.nextLine();
        System.out.println("╔════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                          Introduce el tipo primario del Pokemon                        ║");
        System.out.println("║ " + Colores.WHITE_BRIGHT + "1-Acero " + Colores.RESET + Colores.CYAN + "2-Agua " + Colores.RESET + Colores.GREEN_BRIGHT + "3-Bicho " + Colores.RESET + Colores.BLACK_BRIGHT + "4-Dragón " + Colores.RESET + Colores.YELLOW + "5-Eléctrico " + Colores.RESET + Colores.RESET + Colores.BLUE + "6-Fantasma " + Colores.RESET + Colores.RED + "7-Fuego " + Colores.RESET + Colores.PURPLE_BRIGHT + "8-Hada " + Colores.RESET + Colores.CYAN_BRIGHT + "9-Hielo " + Colores.RESET + Colores.RED_BRIGHT + "10-Lucha " + Colores.RESET + "║");
        System.out.println("║  " + Colores.WHITE_BRIGHT + "11-Normal " + Colores.RESET + Colores.GREEN + "12-Planta " + Colores.RESET + Colores.PURPLE_BRIGHT + "13-Psíquico " + Colores.RESET + Colores.RED_BRIGHT + "14-Roca " + Colores.RESET + Colores.BLACK + "15-Siniestro " + Colores.RESET + Colores.RED_BRIGHT + "16-Tierra " + Colores.RESET + Colores.BLUE + "17-Veneno " + Colores.RESET + Colores.CYAN + "18-Volador " + Colores.RESET + "  ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════════════════════════╝");
        int tip = input.nextInt();
        while (tip < 1 || tip > 18) {
            System.out.println("╔════════════════════════════╗");
            System.out.println("║ Introduce un número válido ║");
            System.out.println("╚════════════════════════════╝");
            tip = input.nextInt();
        }
        String tipo_primario = "";

        //Este switch es para asignar el tipo primario y el siguiente para el tipo secundario
        switch (tip) {
            case 1:
                tipo_primario = "Acero";
                break;
            case 2:
                tipo_primario = "Agua";
                break;
            case 3:
                tipo_primario = "Bicho";
                break;
            case 4:
                tipo_primario = "Dragón";
                break;
            case 5:
                tipo_primario = "Eléctrico";
                break;
            case 6:
                tipo_primario = "Fantasma";
                break;
            case 7:
                tipo_primario = "Fuego";
                break;
            case 8:
                tipo_primario = "Hada";
                break;
            case 9:
                tipo_primario = "Hielo";
                break;
            case 10:
                tipo_primario = "Lucha";
                break;
            case 11:
                tipo_primario = "Normal";
                break;
            case 12:
                tipo_primario = "Planta";
                break;
            case 13:
                tipo_primario = "Psíquico";
                break;
            case 14:
                tipo_primario = "Roca";
                break;
            case 15:
                tipo_primario = "Siniestro";
                break;
            case 16:
                tipo_primario = "Tierra";
                break;
            case 17:
                tipo_primario = "Veneno";
                break;
            case 18:
                tipo_primario = "Volador";
                break;
        }
        input.nextLine();

        System.out.println("╔════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║           Introduce el tipo secundario del Pokemon (si no tiene introduce 19)          ║");
        System.out.println("║ " + Colores.WHITE_BRIGHT + "1-Acero " + Colores.RESET + Colores.CYAN + "2-Agua " + Colores.RESET + Colores.GREEN_BRIGHT + "3-Bicho " + Colores.RESET + Colores.BLACK_BRIGHT + "4-Dragón " + Colores.RESET + Colores.YELLOW + "5-Eléctrico " + Colores.RESET + Colores.BLUE + "6-Fantasma " + Colores.RESET + Colores.RED + "7-Fuego " + Colores.RESET + Colores.PURPLE_BRIGHT + "8-Hada " + Colores.RESET + Colores.CYAN_BRIGHT + "9-Hielo " + Colores.RESET + Colores.RED_BRIGHT + "10-Lucha " + Colores.RESET + "║");
        System.out.println("║  " + Colores.WHITE_BRIGHT + "11-Normal " + Colores.RESET + Colores.GREEN + "12-Planta " + Colores.RESET + Colores.PURPLE_BRIGHT + "13-Psíquico " + Colores.RESET + Colores.RED_BRIGHT + "14-Roca " + Colores.RESET + Colores.BLACK + "15-Siniestro " + Colores.RESET + Colores.RED_BRIGHT + "16-Tierra " + Colores.RESET + Colores.BLUE + "17-Veneno " + Colores.RESET + Colores.CYAN + "18-Volador " + Colores.RESET + "  ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════════════════════════╝");
        int tip2 = input.nextInt();
        while (tip2 < 1 || tip2 > 19) {
            System.out.println("╔════════════════════════════╗");
            System.out.println("║ Introduce un número válido ║");
            System.out.println("╚════════════════════════════╝");
            tip2 = input.nextInt();
        }
        String tipo_secundario = null;
        switch (tip2) {
            case 19:
                tipo_secundario = "";
                break;
            case 1:
                tipo_secundario = "Acero";
                break;
            case 2:
                tipo_secundario = "Agua";
                break;
            case 3:
                tipo_secundario = "Bicho";
                break;
            case 4:
                tipo_secundario = "Dragón";
                break;
            case 5:
                tipo_secundario = "Eléctrico";
                break;
            case 6:
                tipo_secundario = "Fantasma";
                break;
            case 7:
                tipo_secundario = "Fuego";
                break;
            case 8:
                tipo_secundario = "Hada";
                break;
            case 9:
                tipo_secundario = "Hielo";
                break;
            case 10:
                tipo_secundario = "Lucha";
                break;
            case 11:
                tipo_secundario = "Normal";
                break;
            case 12:
                tipo_secundario = "Planta";
                break;
            case 13:
                tipo_secundario = "Psíquico";
                break;
            case 14:
                tipo_secundario = "Roca";
                break;
            case 15:
                tipo_secundario = "Siniestro";
                break;
            case 16:
                tipo_secundario = "Tierra";
                break;
            case 17:
                tipo_secundario = "Veneno";
                break;
            case 18:
                tipo_secundario = "Volador";
                break;
        }
        input.nextLine();

        // crear el pokemn
        return new Pokemon(num, nombre, tipo_primario, tipo_secundario);
    }

    public String leerNombrePkmnEliminar() {
        Scanner input = new Scanner(System.in);
        // eliminar pokemon
        System.out.println("╔═══════════════════════════════════════════════════════╗");
        System.out.println("║ Introduce el nombre del pokemon que quieres eliminar: ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
        String nombre = input.nextLine();

        return nombre;
    }

    public String leerNombrePkmnModificar() {
        Scanner input = new Scanner(System.in);
        // modificar pokemon
        System.out.println("╔════════════════════════════════════════════════════════╗");
        System.out.println("║ Introduce el nombre del pokemon que quieres modificar: ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");
        String nombre = input.nextLine();

        return nombre;
    }

    public int leerOpcionMenu() {

        Scanner input = new Scanner(System.in);
        int accion = input.nextInt();
        input.nextLine();

        return accion;
    }
}
