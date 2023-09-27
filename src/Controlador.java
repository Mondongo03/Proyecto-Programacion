import java.io.*;
import java.util.Scanner;
//Definimos la clase controlador
public class Controlador {
    //Creamos las instáncias necesarias
    Pokedex pokedex = new Pokedex();
    Lectura lectura = new Lectura();
    Pokemon pokemon;

    public Controlador() {
        pokemon = new Pokemon();
    }

    //Método para añadir pokes
    public void addPkmn(Pokemon p) {

        // anado pokemon a arraylist
        int num = pokemon.getNum();
        pokedex.listaPkmn.add(num, p);
        System.out.println("¡Pokemon registrado en la Pokedex!");


    }
    //Método para añadir pokes sin el mensaje para los que estarán default
    public void addPkmn1(Pokemon p) {

        // añado pokemon a arraylist de manera default
        int num = pokemon.getNum();
        pokedex.listaPkmn.add(num, p);


    }
    public void write() {
        try {
            FileWriter myWriter = new FileWriter("Pokedex.txt");
            myWriter.write("");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        for (int i = 0; i < pokedex.listaPkmn.size(); i++) {
            int num = pokedex.listaPkmn.get(i).getNum();
            try {
                FileWriter myWriter = new FileWriter("Pokedex.txt", true);
                myWriter.write(num + "\n");
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            String nom = pokedex.listaPkmn.get(i).getNombre();
            try {
                FileWriter myWriter = new FileWriter("Pokedex.txt", true);
                myWriter.write(nom + "\n");
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            String tipo1 = pokedex.listaPkmn.get(i).getTipo_primario();
            try {
                FileWriter myWriter = new FileWriter("Pokedex.txt", true);
                myWriter.write(tipo1 + "\n");
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            String tipo2 = pokedex.listaPkmn.get(i).getTipo_secundario();
            try {
                FileWriter myWriter = new FileWriter("Pokedex.txt", true);
                myWriter.write(tipo2 + "\n");
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try {
                FileWriter myWriter = new FileWriter("Pokedex.txt", true);
                myWriter.write("\n");
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        System.out.println("Pokedex guardada con éxito");
    }
    public void Load() {

        // Leer el fichero
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("Pokedex.txt")));

            String line = "";
            int num = 0;
            String nombre = "";
            String tipo1 = "";
            String tipo2 = "";

            int i = 1;
            while ((line = br.readLine()) != null) {

                if (i == 1) num = Integer.parseInt(line);
                if (i == 2) nombre = line;
                if (i == 3) tipo1 = line;
                if (i == 4) tipo2 = line;
                // Añadimos el elemento a la lista
                if (i == 4) {
                    pokedex.listaPkmn.add(new Pokemon(num, nombre, tipo1, tipo2));
                    i = 0;
                }

                i++;
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Método para listar pokedex
    public void listarPkmn() {
        // Nos recorremos la arraylist entera para ir sacando los datos en los prints
        for (int i = 0; i<pokedex.listaPkmn.size(); i++){
            // Printo la distinta información de los pokemons con los gets a modo de lita
            System.out.println(" Nº Pokedex: "+pokedex.listaPkmn.get(i).getNum());
            System.out.println(" Nombre: "+pokedex.listaPkmn.get(i).getNombre());

            // Este switch lo que hace es comprobar el tipo primario del pokemon y depende cual sea printa el tipo de un color o no
            switch (pokedex.listaPkmn.get(i).getTipo_primario()) {
                case "Acero": System.out.println(" Tipo primario: " + Colores.WHITE_BRIGHT + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Agua": System.out.println(" Tipo primario: " + Colores.CYAN + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Bicho": System.out.println(" Tipo primario: " + Colores.GREEN_BRIGHT + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Dragón": System.out.println(" Tipo primario: " + Colores.BLACK_BRIGHT + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Eléctrico": System.out.println(" Tipo primario: " + Colores.YELLOW + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Fantasma": System.out.println(" Tipo primario: " + Colores.BLUE + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Fuego": System.out.println(" Tipo primario: " + Colores.RED + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Hada": System.out.println(" Tipo primario: " + Colores.PURPLE_BRIGHT + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Hielo": System.out.println(" Tipo primario: " + Colores.CYAN_BRIGHT + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Lucha": System.out.println(" Tipo primario: " + Colores.RED_BRIGHT + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Normal": System.out.println(" Tipo primario: " + Colores.WHITE_BRIGHT + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Planta": System.out.println(" Tipo primario: " + Colores.GREEN + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Psíquico": System.out.println(" Tipo primario: " + Colores.PURPLE_BRIGHT + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Roca": System.out.println(" Tipo primario: " + Colores.RED_BRIGHT + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Siniestro": System.out.println(" Tipo primario: " + Colores.BLACK + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Tierra": System.out.println(" Tipo primario: " + Colores.RED_BRIGHT + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Veneno": System.out.println(" Tipo primario: " + Colores.BLUE + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
                case "Volador": System.out.println(" Tipo primario: " + Colores.CYAN + pokedex.listaPkmn.get(i).getTipo_primario() + Colores.RESET); break;
            }

            // Esto hace lo mismo que el switch anterior pero con el tipo secundario
            switch (pokedex.listaPkmn.get(i).getTipo_secundario()) {
                case "": System.out.println(" Tipo secundario: No tiene"); break;
                case "Acero": System.out.println(" Tipo secundario: " + Colores.WHITE_BRIGHT + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Agua": System.out.println(" Tipo secundario: " + Colores.CYAN + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Bicho": System.out.println(" Tipo secundario: " + Colores.GREEN_BRIGHT + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Dragón": System.out.println(" Tipo secundario: " + Colores.BLACK_BRIGHT + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Eléctrico": System.out.println(" Tipo secundario: " + Colores.YELLOW + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Fantasma": System.out.println(" Tipo secundario: " + Colores.BLUE + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Fuego": System.out.println(" Tipo secundario: " + Colores.RED + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Hada": System.out.println(" Tipo secundario: " + Colores.PURPLE_BRIGHT + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Hielo": System.out.println(" Tipo secundario: " + Colores.CYAN_BRIGHT + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Lucha": System.out.println(" Tipo secundario: " + Colores.RED_BRIGHT + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Normal": System.out.println(" Tipo secundario: " + Colores.WHITE_BRIGHT + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Planta": System.out.println(" Tipo secundario: " + Colores.GREEN + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Psíquico": System.out.println(" Tipo secundario: " + Colores.PURPLE_BRIGHT + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Roca": System.out.println(" Tipo secundario: " + Colores.RED_BRIGHT + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Siniestro": System.out.println(" Tipo secundario: " + Colores.BLACK + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Tierra": System.out.println(" Tipo secundario: " + Colores.RED_BRIGHT + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Veneno": System.out.println(" Tipo secundario: " + Colores.BLUE + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
                case "Volador": System.out.println(" Tipo secundario: " + Colores.CYAN + pokedex.listaPkmn.get(i).getTipo_secundario() + Colores.RESET); break;
            }
            System.out.println();
        }
    }

    //Método para eliminar pokemon
    public void eliminarPkmn(String nombre) {

        boolean eliminado = false;
        //Recorremos la arraylist hasta que el nombre que recibe sea igual a un nombre de algún pokemon y lo elimina en el caso de que no el booleano no se volverá true y pasará al else para avisar que no se ha podido eliminar
        for (int i = 0; i < pokedex.listaPkmn.size(); i++) {
            if (pokedex.listaPkmn.get(i).getNombre().equals(nombre)) {
                pokedex.listaPkmn.remove(i);
                eliminado = true;
                System.out.println("Pokemon eliminado");
                break;
            }
        }

        if (!eliminado) System.out.println("No se ha podido eliminar. No existe ningún pokemon con ese nombre en la Pokedex.");

    }
    // Método para modifcicar pokemons y con los set actualizas la información
    public void modificarPoke(String nombre) {
        Scanner input = new Scanner(System.in);
        boolean modificado = false;
        for (Pokemon p : pokedex.listaPkmn) {
            if (p.getNombre().equals(nombre)) {

                modificado = true;
                System.out.println("╔═══════════════════════════════════════╗");
                System.out.println("║ Quieres modificar número del Pokemon? ║");
                System.out.println("║             1-Si      2-No            ║");
                System.out.println("╚═══════════════════════════════════════╝");
                int eleccion = input.nextInt();
                if(eleccion == 1){
                    System.out.println("╔═════════════════════════════════╗");
                    System.out.println("║ Que número le quieres asignar?  ║");
                    System.out.println("╚═════════════════════════════════╝");
                    int nuevoCodigo = input.nextInt();
                    p.setNum(nuevoCodigo);

                }

                System.out.println("╔═══════════════════════════════════════╗");
                System.out.println("║ Quieres modificar nombre del Pokemon? ║");
                System.out.println("║             1-Si      2-No            ║");
                System.out.println("╚═══════════════════════════════════════╝");
                eleccion = input.nextInt();
                input.nextLine();
                if (eleccion == 1){
                    System.out.println("╔═════════════════════════════════╗");
                    System.out.println("║ Que nombre le quieres asignar?  ║");
                    System.out.println("╚═════════════════════════════════╝");
                    String nuevoNombre = input.nextLine();
                    p.setNombre(nuevoNombre);
                }
                System.out.println("╔══════════════════════════════════════════════╗");
                System.out.println("║ Quieres modificar tipo primario del Pokemon? ║");
                System.out.println("║                1-Si       2-No               ║");
                System.out.println("╚══════════════════════════════════════════════╝");
                eleccion = input.nextInt();
                input.nextLine();
                if (eleccion == 1){
                    System.out.println("╔═══════════════════════════════╗");
                    System.out.println("║ Que tipo le quieres asignar?  ║");
                    System.out.println("╚═══════════════════════════════╝");
                    String nuevoTipoPrimario = input.nextLine();
                    p.setTipo_primario(nuevoTipoPrimario);
                }
                System.out.println("╔════════════════════════════════════════════════╗");
                System.out.println("║ Quieres modificar tipo secundario del Pokemon? ║");
                System.out.println("║                  1-Si       2-No               ║");
                System.out.println("╚════════════════════════════════════════════════╝");
                eleccion = input.nextInt();
                input.nextLine();
                if (eleccion == 1){
                    System.out.println("╔═══════════════════════════════╗");
                    System.out.println("║ Que tipo le quieres asignar?  ║");
                    System.out.println("╚═══════════════════════════════╝");
                    String nuevoTipoSecundario = input.nextLine();
                    p.setTipo_secundario(nuevoTipoSecundario);
                }
                break;
            }
        }
        if(!modificado) {
            System.out.println("No se encontró ningún Pokemon con el nombre descrito.");
        }
    }


}
