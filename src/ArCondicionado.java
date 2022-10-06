public class ArCondicionado {
    private boolean estaligado;
    private String status;
    private int temperatura = 23, min = 16, max = 30;

    private String modooperacao;
    private String marca;
    private String modelo;
    private String capacidade;

    public ArCondicionado() {
        marca = "ELGIN";
        modelo = "SPLIT INVERTER";
        capacidade = "12.000 BTUS";
        modooperacao = "r";
    }
    // METODOS

    // Ligar de desligar
    public void liga_desliga() {
        if (estaligado) {
            estaligado = false;
        } else {
            estaligado = true;
            System.out.println("Ar Condicionado ligado!");
        }
    }

    // MUDAR MODO DE OPERAÇÃO
    public void modoop() {
        if (estaligado) {
            if (modooperacao == "r") {
                modooperacao = "v";
                System.out.println("Modo Ventilação Ativado!");

            } else if (modooperacao == "v") {
                modooperacao = "d";
                System.out.println("Modo Desumidificação Ativado!");

            } else if (modooperacao == "d") {
                modooperacao = "a";
                System.out.println("Modo Aquecer Ativado!");

            } else {
                modooperacao = "r";
                System.out.println("Modo de Refrigeração Ativado!");
            }
        }
    }

    // aumentarTemperatura
    public void aumentarTemperatura() {
        if (estaligado) {
            if (modooperacao == "r" || modooperacao == "a") {
                if (temperatura < max) {
                    temperatura++;
                    System.out.println("Temperatura aumentada para " + temperatura + "ºC");
                }
            } else if (modooperacao == "v" || modooperacao == "d") {
                System.out.println("Não possivel aumentar a temperatura nesse modo de operação");
        }
        }else {
            System.out.println("Não é possível aumentar a temperatura com o ar desligado");
        }
        }
    

    // diminuirTemperatura
    public void diminuirTemperatura() {
        if (estaligado) {
            if (modooperacao == "r" || modooperacao == "a") {
                if (temperatura > min) {
                    temperatura--;
                    System.out.println("Temperatura diminuída para " + temperatura + "ºC");
                }
            }else if (modooperacao == "v" || modooperacao == "d") {
                System.out.println("Não possivel diminuir a temperatura nesse modo de operação");
        }
        } else {
            System.out.println("Não é possivel diminuir a temperatura com o ar desligado");
        }
    }

    // STATUS
    public void exibirStatus() {
        // if (!estaligado) {
        // System.out.println("Ar condicionado desligado");
        // } else if {
        // System.out.println("Marca.:" + marca);
        // System.out.println("Modelo.:" + modelo);
        // System.out.println("Capacidade." + capacidade);
        // else if (modooperacao == "r") {
        // System.out.println("Modo.: Refrigeração");
        // System.out.println("Temperatura.:" + temperatura + "C");
        // } else {
        // System.out.println("Modo.: ");
        // }
        // }
        // }
        if (!estaligado) {
            System.out.println("O Ar Condicionado está desligado");
        } else if (modooperacao == "r") {
            System.out.println("Marca.: " + marca);
            System.out.println("Modelo.: " + modelo);
            System.out.println("Capacidade.: " + capacidade);
            System.out.println("Modo.: Refrigeração");
            System.out.println("A temperatura atual é " + temperatura + " ºC");
        } else if (modooperacao == "d") {
            System.out.println("Marca.: " + marca);
            System.out.println("Modelo.: " + modelo);
            System.out.println("Capacidade.: " + capacidade);
            System.out.println("Modo.: Desumidificação");
        } else if (modooperacao == "v") {
            System.out.println("Marca.: " + marca);
            System.out.println("Modelo.: " + modelo);
            System.out.println("Capacidade.: " + capacidade);
            System.out.println("Modo.: Ventilação");
        } else if (modooperacao == "a") {
            System.out.println("Marca.: " + marca);
            System.out.println("Modelo.: " + modelo);
            System.out.println("Capacidade.: " + capacidade);
            System.out.println("Modo.: Aquecimento");
        }
    }

    // DESUMIDIFICAÇÃO
    public void desumidificar() {
        if (estaligado) {
            if (modooperacao == "d") {
                temperatura = 23;

            }
        }
    }

    // Aquecer
    public void aquecer() {
        if (estaligado) {
            if (modooperacao == "a") {
                System.out.println("Modo aquecer ativado");
            }
        }
    }

    // GET AND SET
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
