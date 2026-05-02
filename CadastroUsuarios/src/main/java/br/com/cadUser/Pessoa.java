package br.com.cadUser;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "pessoa")
@RequestScoped
public class Pessoa {
    
    // Atributo privado para armazenar o nome digitado
    private String nome;
    
    // Atributo privado ArrayList para armazenar a lista de nomes
    private List<String> listaNomes;
    
    // Construtor - inicializa o ArrayList
    public Pessoa() {
        listaNomes = new ArrayList<>();
    }
    
    // Método para adicionar nome à lista
    public String adicionarNome() {
        if (nome != null && !nome.trim().isEmpty()) {
            listaNomes.add(nome);
            nome = ""; // Limpa o campo após cadastrar
        }
        return null;
    }
    
    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Getter e Setter para listaNomes
    public List<String> getListaNomes() {
        return listaNomes;
    }
    
    public void setListaNomes(List<String> listaNomes) {
        this.listaNomes = listaNomes;
    }
}