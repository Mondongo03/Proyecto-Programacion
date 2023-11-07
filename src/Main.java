import java.time.LocalDate;
import java.time.chrono.ChronoPeriod;

//Definimos la clase Main que arrancaremos
public class Main {
    public static void main(String[] args) {
        /*
        //Instanciamos todas las instancias necesarias para poder usar los métodos de las clases
        Menu menu = new Menu();
        Lectura lectura = new Lectura();
        Controlador controlador = new Controlador();
        Calculadora calculadora = new Calculadora();
        Pokedex pokedex = new Pokedex();
        Pokemon pokemon = new Pokemon();

        int accion = 0;

        //Guardamos en Pokemon d,c,e los datos obtenidos con los metodos pok,pok1,pok2 para luego llamar al método para añadir Pokemons de manera default sin que sale el mensaje de pokemon añadido con exito
        Pokemon d = pokemon.pok1();
        controlador.addPkmn1(d);
        Pokemon c = pokemon.pok();
        controlador.addPkmn1(c);
        Pokemon e = pokemon.pok2();
        controlador.addPkmn1(e);

        do {
            //Aquí ya arranca el menu para ver las opciones y espera un resultado para guardar en la variable accion y asi ver que hacer
            menu.mostrarMenu();
            accion = lectura.leerOpcionMenu();

            // condicional acciones
            if (accion == 1) {
                Pokemon p = lectura.leerPokemon();
                controlador.addPkmn(p);
            } else if (accion == 2) {
                // listar productos
                controlador.listarPkmn();
            } else if (accion == 3) {
                // eliminar producto
                String codigo = lectura.leerNombrePkmnEliminar();
                controlador.eliminarPkmn(codigo);
            } else if (accion == 4) {
                // calcular eficacias
                calculadora.calcularEficacias();
            } else if (accion == 5) {
                String nombre = lectura.leerNombrePkmnModificar();
                controlador.modificarPoke(nombre);
            }
            else if (accion == 6) {
                controlador.write();
            } else if (accion == 7) {
                controlador.Load();
            }
        } while (accion != 0);

         */
        LocalDate dataCaducitat = LocalDate.ofEpochDay(2000-2-3);
        ChronoPeriod a = ChronoPeriod.between(dataCaducitat, LocalDate.now());
        System.out.println(a);
    }
}