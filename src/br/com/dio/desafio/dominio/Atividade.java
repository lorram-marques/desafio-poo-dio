package br.com.dio.desafio.dominio;

public class Atividade extends Conteudo{

	private int acertos;
	private static final int QUESTOES_QUANTIDADE = 10;
	protected static final double XP_MAXIMO = 30d;

    @Override
    public double calcularXp() {
        return XP_MAXIMO * (acertos / QUESTOES_QUANTIDADE);
    }
    
    public Atividade() {
    }


    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    @Override
    public String toString() {
        return "atividade{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", acertos=" + acertos +
                ", xp=" + calcularXp() +
                '}';
    }

}
