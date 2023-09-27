import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Definimos la clase Calculadora
public class Calculadora {
    Pokedex pokedex = new Pokedex();
    //Definimos el método para calcular las eficacias
    public void calcularEficacias() {

        // Crea un mapa que contenga las eficacias de cada tipo de Pokémon(solo lo que es eficaz y poco eficaz lo que es neutro nos lo ahorramos para no morirnos del sida escribiendo)
        Map<String, Map<String, Float>> eficacias = new HashMap<>();

        Map<String, Float> tipoNormal = new HashMap<>();
        tipoNormal.put("Roca", 0.5f);
        tipoNormal.put("Acero", 0.5f);
        tipoNormal.put("Fantasma", 0.0f);
        eficacias.put("Normal", tipoNormal);

        Map<String, Float> tipoLucha = new HashMap<>();
        tipoLucha.put("Normal", 2.0f);
        tipoLucha.put("Hielo", 2.0f);
        tipoLucha.put("Roca", 2.0f);
        tipoLucha.put("Acero", 2.0f);
        tipoLucha.put("Bicho", 0.5f);
        tipoLucha.put("Veneno", 0.5f);
        tipoLucha.put("Volador", 0.5f);
        tipoLucha.put("Psíquico", 0.5f);
        tipoLucha.put("Fantasma", 0.0f);
        eficacias.put("Lucha", tipoLucha);

        Map<String, Float> tipoVolador = new HashMap<>();
        tipoVolador.put("Planta", 2.0f);
        tipoVolador.put("Bicho", 2.0f);
        tipoVolador.put("Lucha", 2.0f);
        tipoVolador.put("Volador", 0.5f);
        tipoVolador.put("Roca", 0.5f);
        tipoVolador.put("Acero", 0.5f);
        eficacias.put("Volador", tipoVolador);

        Map<String, Float> tipoVeneno = new HashMap<>();
        tipoVeneno.put("Planta", 2.0f);
        tipoVeneno.put("Hada", 2.0f);
        tipoVeneno.put("Veneno", 0.5f);
        tipoVeneno.put("Bicho", 0.5f);
        tipoVeneno.put("Lucha", 0.5f);
        tipoVeneno.put("Fantasma", 0.5f);
        eficacias.put("Veneno", tipoVeneno);

        Map<String, Float> tipoTierra = new HashMap<>();
        tipoTierra.put("Fuego", 2.0f);
        tipoTierra.put("Eléctrico", 2.0f);
        tipoTierra.put("Veneno", 2.0f);
        tipoTierra.put("Roca", 0.5f);
        tipoTierra.put("Planta", 0.5f);
        tipoTierra.put("Bicho", 0.5f);
        tipoTierra.put("Acero", 0.5f);
        eficacias.put("Tierra", tipoTierra);

        Map<String, Float> tipoRoca = new HashMap<>();
        tipoRoca.put("Fuego", 2.0f);
        tipoRoca.put("Hielo", 2.0f);
        tipoRoca.put("Volador", 2.0f);
        tipoRoca.put("Bicho", 2.0f);
        tipoRoca.put("Normal", 0.5f);
        tipoRoca.put("Fuego", 0.5f);
        tipoRoca.put("Lucha", 0.5f);
        tipoRoca.put("Veneno", 0.5f);
        tipoRoca.put("Tierra", 0.5f);
        eficacias.put("Roca", tipoRoca);

        Map<String, Float> tipoBicho = new HashMap<>();
        tipoBicho.put("Planta", 2.0f);
        tipoBicho.put("Psíquico", 2.0f);
        tipoBicho.put("Siniestro", 2.0f);
        tipoBicho.put("Lucha", 0.5f);
        tipoBicho.put("Volador", 0.5f);
        tipoBicho.put("Hada", 0.5f);
        tipoBicho.put("Fuego", 0.5f);
        tipoBicho.put("Acero", 0.5f);
        tipoBicho.put("Veneno", 0.5f);
        tipoBicho.put("Normal", 0.5f);
        eficacias.put("Bicho", tipoBicho);

        Map<String, Float> tipoFantasma = new HashMap<>();
        tipoFantasma.put("Psíquico", 2.0f);
        tipoFantasma.put("Fantasma", 2.0f);
        tipoFantasma.put("Normal", 0.0f);
        tipoFantasma.put("Lucha", 0.0f);
        tipoFantasma.put("Veneno", 0.5f);
        tipoFantasma.put("Insecto", 0.5f);
        tipoFantasma.put("Siniestro", 0.5f);
        eficacias.put("Fantasma", tipoFantasma);

        Map<String, Float> tipoAcero = new HashMap<>();
        tipoAcero.put("Hada", 2.0f);
        tipoAcero.put("Hielo", 2.0f);
        tipoAcero.put("Roca", 2.0f);
        tipoAcero.put("Acero", 0.5f);
        tipoAcero.put("Agua", 0.5f);
        tipoAcero.put("Eléctrico", 0.5f);
        tipoAcero.put("Fuego", 0.5f);
        tipoAcero.put("Acero", 0.5f);
        tipoAcero.put("Volador", 0.5f);
        tipoAcero.put("Bicho", 0.5f);
        tipoAcero.put("Planta", 0.5f);
        tipoAcero.put("Veneno", 0.0f);
        tipoAcero.put("Normal", 0.0f);
        tipoAcero.put("Lucha", 2.0f);
        tipoAcero.put("Siniestro", 2.0f);
        eficacias.put("Acero", tipoAcero);

        Map<String, Float> tipoPlanta = new HashMap<>();
        tipoPlanta.put("Agua", 0.5f);
        tipoPlanta.put("Tierra", 2.0f);
        tipoPlanta.put("Roca", 1.0f);
        tipoPlanta.put("Volador", 2.0f);
        tipoPlanta.put("Bicho", 2.0f);
        tipoPlanta.put("Fuego", 0.5f);
        tipoPlanta.put("Planta", 0.5f);
        tipoPlanta.put("Veneno", 2.0f);
        tipoPlanta.put("Dragón", 0.5f);
        tipoPlanta.put("Acero", 0.5f);
        eficacias.put("Planta", tipoPlanta);

        Map<String, Float> tipoFuego = new HashMap<>();
        tipoFuego.put("Planta", 2.0f);
        tipoFuego.put("Hielo", 2.0f);
        tipoFuego.put("Bicho", 0.5f);
        tipoFuego.put("Acero", 0.5f);
        tipoFuego.put("Agua", 0.5f);
        tipoFuego.put("Dragón", 0.5f);
        tipoFuego.put("Fuego", 0.5f);
        tipoFuego.put("Roca", 0.5f);
        eficacias.put("Fuego", tipoFuego);

        Map<String, Float> tipoAgua = new HashMap<>();
        tipoAgua.put("Planta", 0.5f);
        tipoAgua.put("Fuego", 2.0f);
        tipoAgua.put("Tierra", 2.0f);
        tipoAgua.put("Roca", 2.0f);
        tipoAgua.put("Agua", 0.5f);
        tipoAgua.put("Dragón", 0.5f);
        eficacias.put("Agua", tipoAgua);

        Map<String, Float> tipoElectrico = new HashMap<>();
        tipoElectrico.put("Agua", 2.0f);
        tipoElectrico.put("Volador", 2.0f);
        tipoElectrico.put("Tierra", 0.0f);
        tipoElectrico.put("Eléctrico", 0.5f);
        tipoElectrico.put("Planta", 0.5f);
        tipoElectrico.put("Dragón", 0.5f);
        tipoElectrico.put("Acero", 0.5f);
        eficacias.put("Eléctrico", tipoElectrico);

        Map<String, Float> tipoPsiquico = new HashMap<>();
        tipoPsiquico.put("Lucha", 2.0f);
        tipoPsiquico.put("Veneno", 2.0f);
        tipoPsiquico.put("Psíquico", 0.5f);
        tipoPsiquico.put("Acero", 0.5f);
        tipoPsiquico.put("Siniestro", 0.0f);
        eficacias.put("Psíquico", tipoPsiquico);

        Map<String, Float> tipoHielo = new HashMap<>();
        tipoHielo.put("Planta", 2.0f);
        tipoHielo.put("Tierra", 2.0f);
        tipoHielo.put("Volador", 2.0f);
        tipoHielo.put("Dragón", 2.0f);
        tipoHielo.put("Fuego", 0.5f);
        tipoHielo.put("Agua", 0.5f);
        tipoHielo.put("Hielo", 0.5f);
        tipoHielo.put("Acero", 0.5f);
        eficacias.put("Hielo", tipoHielo);

        Map<String, Float> tipoDragon = new HashMap<>();
        tipoDragon.put("Dragón", 2.0f);
        tipoDragon.put("Acero", 0.5f);
        tipoDragon.put("Hada", 0.0f);
        eficacias.put("Dragón", tipoDragon);

        Map<String, Float> tipoSiniestro = new HashMap<>();
        tipoSiniestro.put("Lucha", 2.0f);
        tipoSiniestro.put("Hada", 2.0f);
        tipoSiniestro.put("Siniestro", 0.5f);
        tipoSiniestro.put("Fantasma", 0.5f);
        tipoSiniestro.put("Psíquico", 0.0f);
        eficacias.put("Siniestro", tipoSiniestro);

        Map<String, Float> tipoHada = new HashMap<>();
        tipoHada.put("Lucha", 2.0f);
        tipoHada.put("Dragon", 2.0f);
        tipoHada.put("Siniestro", 2.0f);
        tipoHada.put("Fuego", 0.5f);
        tipoHada.put("Veneno", 0.5f);
        tipoHada.put("Acero", 0.5f);
        tipoHada.put("Normal", 0.5f);
        tipoHada.put("Planta", 0.5f);
        tipoHada.put("Hada", 0.5f);
        tipoHada.put("Agua", 0.5f);
        tipoHada.put("Eléctrico", 0.5f);
        tipoHada.put("Volador", 0.5f);
        eficacias.put("Hada", tipoHada);

        // Pide que introduzca los tipos del Pokémon a calcular la eficacia
        Scanner input = new Scanner(System.in);
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ Introduce el tipo primario del Pokémon: ║");
        System.out.println("╚═════════════════════════════════════════╝");
        String tipo1 = input.nextLine();
        System.out.println("╔════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║ Introduce el tipo secundario del Pokémon: (deja en blanco si no tiene) ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════════╝");
        String tipo2 = input.nextLine();

        // Obtiene las eficacias del primer tipo del Pokémon
        Map<String, Float> eficaciasTipo1 = eficacias.get(tipo1);
        if (eficaciasTipo1 == null) {
            System.out.println("Tipo de Pokémon no válido");
            return;
        }

        // Si el Pokémon tiene un segundo tipo, calcula la eficacia de ambos tipos
        if (!tipo2.isEmpty()) {
            Map<String, Float> eficaciasTipo2 = eficacias.get(tipo2);
            if (eficaciasTipo2 == null) {
                System.out.println("Tipo de Pokémon no válido");
                return;
            }
            // Calcula la eficacia combinada de ambos tipos
            Map<String, Double> eficaciasCombinadas = new HashMap<>();
            for (String tipo : eficaciasTipo1.keySet()) {
                double eficacia1 = eficaciasTipo1.get(tipo);
                double eficacia2 = eficaciasTipo2.getOrDefault(tipo, 1.0f);
                eficaciasCombinadas.put(tipo, eficacia1 * eficacia2);
            }
            // Printa las eficacias combinadas
            System.out.println();
            System.out.println("Eficacias combinadas:");
            System.out.println();
            for (Map.Entry<String, Double> entry : eficaciasCombinadas.entrySet()) {
                String tipo = entry.getKey();
                double eficacia = entry.getValue();
                if (eficacia != 1){
                switch (tipo) {
                    case "Acero":
                        System.out.println(Colores.WHITE_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Agua":
                        System.out.println(Colores.CYAN + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Bicho":
                        System.out.println(Colores.GREEN_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Dragón":
                        System.out.println(Colores.BLACK_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Eléctrico":
                        System.out.println(Colores.YELLOW + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Fantasma":
                        System.out.println(Colores.BLUE + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Fuego":
                        System.out.println(Colores.RED + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Hada":
                        System.out.println(Colores.PURPLE_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Hielo":
                        System.out.println(Colores.CYAN_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Lucha":
                        System.out.println(Colores.RED_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Normal":
                        System.out.println(Colores.WHITE_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Planta":
                        System.out.println(Colores.GREEN + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Psíquico":
                        System.out.println(Colores.PURPLE_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Roca":
                        System.out.println(Colores.RED_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Siniestro":
                        System.out.println(Colores.BLACK + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Tierra":
                        System.out.println(Colores.RED_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Veneno":
                        System.out.println(Colores.BLUE + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Volador":
                        System.out.println(Colores.CYAN + tipo + Colores.RESET + " " + eficacia);
                        break;
                }
            }
            }
        } else {
            // Si el Pokémon solo tiene un tipo, imprime las eficacias de ese tipo
            System.out.println();
            System.out.println("Eficacias:");
            System.out.println();
            for (Map.Entry<String, Float> entry : eficaciasTipo1.entrySet()) {
                String tipo = entry.getKey();
                double eficacia = entry.getValue();
                if (eficacia != 1){
                switch (tipo) {
                    case "Acero":
                        System.out.println(Colores.WHITE_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Agua":
                        System.out.println(Colores.CYAN + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Bicho":
                        System.out.println(Colores.GREEN_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Dragón":
                        System.out.println(Colores.BLACK_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Eléctrico":
                        System.out.println(Colores.YELLOW + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Fantasma":
                        System.out.println(Colores.BLUE + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Fuego":
                        System.out.println(Colores.RED + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Hada":
                        System.out.println(Colores.PURPLE_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Hielo":
                        System.out.println(Colores.CYAN_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Lucha":
                        System.out.println(Colores.RED_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Normal":
                        System.out.println(Colores.WHITE_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Planta":
                        System.out.println(Colores.GREEN + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Psíquico":
                        System.out.println(Colores.PURPLE_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Roca":
                        System.out.println(Colores.RED_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Siniestro":
                        System.out.println(Colores.BLACK + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Tierra":
                        System.out.println(Colores.RED_BRIGHT + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Veneno":
                        System.out.println(Colores.BLUE + tipo + Colores.RESET + " " + eficacia);
                        break;
                    case "Volador":
                        System.out.println(Colores.CYAN + tipo + Colores.RESET + " " + eficacia);
                        break;
                }
                }
            }
        }
    }
}
