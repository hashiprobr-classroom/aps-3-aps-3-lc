package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;

public class Central {
    private List<Corrida> corridas;

    public Central(){
        this.corridas = new ArrayList<>();
    }

    public void adiciona(Corrida corrida){
        corridas.add(corrida);
    }
    public double mediaPassageiro(String cpf){
        double s = 0;
        int qtd = 0;
        for(Corrida corrida: corridas){
            if (corrida.getPassageiro().getCpf().equals(cpf) && corrida.getNotaPassageiro() > 0){
                s += corrida.getNotaPassageiro();
                qtd++;
            }

        }
        if (qtd == 0){
            return 0;
        }
        return s/qtd;
    }

    public double mediaMotorista(String cpf){
        double s = 0;
        int qtd = 0;
        for(Corrida corrida: corridas){
            if (corrida.getMotorista() != null && corrida.getMotorista().getCpf().equals(cpf) && corrida.getNotaMotorista() > 0){
                s += corrida.getNotaMotorista();
                qtd++;
            }

        }
        if (qtd == 0){
            return 0;
        }
        return s/qtd;
    }
}
