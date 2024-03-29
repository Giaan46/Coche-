package Vehiculo;

public class Coche {

    private String matricula;
    private String marca;
    private String modelo;
    private String potencia;
    private Chasis chasis;
    private Rueda rueda;


    public Coche(String matricula, String marca, String modelo, String potencia, int velocidadMaxima) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.velocidadMaxima = velocidadMaxima;
    }
    public Coche(){

    }

    int velocidadMaxima = 0;

     static class  Chasis{
        String material;
        String peso;

        public Chasis(String material, String peso) {
            this.material = material;
            this.peso = peso;
        }
        public Chasis(){

        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getPeso() {
            return peso;
        }

        public void setPeso(String peso) {
            this.peso = peso;
        }

     }
    static class Rueda{
        int medida;
        String tipo;
        String marca;
        String modelo;

        public Rueda(int medida, String tipo, String marca, String modelo) {
            this.medida = medida;
            this.tipo = tipo;
            this.marca = marca;
            this.modelo = modelo;
        }
        public Rueda(){

        }

        public int getMedida() {
            return medida;
        }

        public void setMedida(int medida) {
            this.medida = medida;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}
