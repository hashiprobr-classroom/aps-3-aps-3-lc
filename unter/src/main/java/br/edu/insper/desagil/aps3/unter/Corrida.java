package br.edu.insper.desagil.aps3.unter;

public class Corrida {
    private Passageiro passageiro;
    private Motorista motorista;
    private Integer notaPassageiro;
    private Integer notaMotorista;

    public Corrida (Passageiro passageiro) {
        this.passageiro = passageiro;
        this.motorista = null;
        this.notaPassageiro = 0;
        this.notaMotorista = 0;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Integer getNotaPassageiro() {
        return notaPassageiro;
    }

    public Integer getNotaMotorista() {
        return notaMotorista;
    }

    private int truncaNota(int nota){
        if (nota < 1){
            return 1;
        }
        else if (nota > 5) {
            return 5;

        }
        return nota;
    }

    public void avaliaPassageiro(int notaPassageiro){
        this.notaPassageiro = truncaNota(notaPassageiro);
    }

    public void avaliaMotorista(int notaMotorista){
        this.notaMotorista = truncaNota(notaMotorista);
    }
}
