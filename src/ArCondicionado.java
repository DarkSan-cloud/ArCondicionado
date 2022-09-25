public class ArCondicionado {
    private boolean estaligado;
    private String status;
    private int temperatura= 23, min = 16, max = 30;

    private String modooperacao;
    private String marca;
    private String modelo;
    private String capacidade;

    public void ligar() {
        estaligado = true;
    }

    public void desligar() {
        estaligado = false;
    }

    public void aumentarTemperatura() {
        if (temperatura == max) {
            return;
        }
        temperatura += 1;
    }

    public void diminuirTemperatura() {
        if (temperatura == min) {
            return;
        }
        temperatura -= 1;
    }

    public boolean isEstaligado() {
        return estaligado;
    }

    public void setEstaligado(boolean estaligado) {
        this.estaligado = estaligado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getModooperacao() {
        return modooperacao;
    }

    public void setModooperacao(String modooperacao) {
        this.modooperacao = modooperacao;
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

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

}
