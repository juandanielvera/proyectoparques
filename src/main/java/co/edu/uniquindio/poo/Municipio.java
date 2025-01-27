package co.edu.uniquindio.poo;

public enum Municipio {
    ARMENIA(0.0),
    CALARCA(10000.0),
    MONTENEGRO(20000.0),
    QUIMBAYA(30000.0),
    TEBAIDA(15000.0),
    CIRCASIA(18000.0),
    FILANDIA(22000.0),
    GÉNOVA(70000.0),
    SALENTO(50000.0),
    PIJAO(40000.0),
    CORDOBA(30000.0),
    BUENAVISTA(35000.0);

    private final double valor;
    Municipio(double valor) {
        this.valor = valor;
    }

    public double getvalor() {
        return valor;
    }
}