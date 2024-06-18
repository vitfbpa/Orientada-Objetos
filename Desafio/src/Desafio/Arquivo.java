package Desafio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    private FileWriter arqw;
    private BufferedWriter escritor;
    private FileReader arqr;
    private BufferedReader leitor;
    private List<Aluno> listAlunos;
    public String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        listAlunos = new ArrayList<>();
    }

    public void gravaArquivo(Aluno a) {
        try {
            arqw = new FileWriter(nomeArquivo+" .txt", true);
            escritor = new BufferedWriter(arqw);
            escritor.write(a.getNome() + "," + a.getIdade());
            escritor.newLine();
            escritor.close();
            arqw.close();

            System.out.println("Alunos salvos no arquivo alunos.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Aluno> leArquivo() {
        System.out.println("Alunos lidos no arquivo: ");
        try {
            arqr = new FileReader(nomeArquivo+".txt");
            leitor = new BufferedReader(arqr);
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(",");

                String nome = campos[0];
                int idade = Integer.parseInt(campos[1]);
                Aluno aluno = new Aluno(nome, idade);
                listAlunos.add(aluno);
            }

            leitor.close();
            arqr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listAlunos;
    }
}