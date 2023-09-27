// Definimos la clase Pokemon
public class Pokemon {
    // Definimos los atributos num, nombre, tipo_primario y tipo_secundario
    private int num;
    private String nombre;
    private String tipo_primario;
    private String tipo_secundario;

    // Constructor vacío de la clase Pokemon
    public Pokemon() {

    }

    // Métodos getters y setters para los atributos num, nombre, tipo_primario y tipo_secundario
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTipo_primario() {
        return tipo_primario;
    }

    public void setTipo_primario(String tipo_primario) {
        this.tipo_primario = tipo_primario;
    }

    public String getTipo_secundario() {
        return tipo_secundario;
    }

    public void setTipo_secundario(String tipo_secundario) {
        this.tipo_secundario = tipo_secundario;
    }

    // constructor para crear los objetos de tipo Producto
    Pokemon(int num, String nombre, String tipo_primario, String tipo_secundario) {
        this.num = num;
        this.nombre = nombre;
        this.tipo_primario = tipo_primario;
        this.tipo_secundario = tipo_secundario;
    }
    // Métodos para crear Pokemon default
    public Pokemon pok() {
        return new Pokemon(571, "Zoroark Hisui", "Normal", "Fantasma");
    }
    public Pokemon pok1() {
        return new Pokemon(1000, "Gholdengo", "Acero", "Fantasma");
    }
    public Pokemon pok2() {
        return new Pokemon(448, "Lucario", "Lucha", "Acero");
    }
}
