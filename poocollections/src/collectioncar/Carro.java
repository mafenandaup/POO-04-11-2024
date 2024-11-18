package collectioncar;

import java.util.Objects;

public class Carro {
    private String marca;
    private int ano;
    private String cor;
    private double preco;

    public Carro(String marca, int ano, String cor, double preco) {
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca.toLowerCase(), ano, cor.toLowerCase()); // ano não tá em lowecase pq é int kkkk
    }
}

