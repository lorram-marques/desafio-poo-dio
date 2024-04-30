package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
    	double sum = 0;
    	for (int i = 0; i < atividades.size(); i++) {
    		sum = sum + ((XP_PADRAO * cargaHoraria) + atividades.get(i).calcularXp());
    	}
        return sum ;
    }
    
    List<Atividade> atividades = new ArrayList<>();

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public List<Atividade> getAtividades() {
		return atividades;
	}

	@Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
