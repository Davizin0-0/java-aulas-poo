package br.sesi.dts.file;

import java.io.IOException;

public class MainFile {
    public static void main(String[] args)throws IOException {
        String path = "C:\\Users\\Aluno\\Desktop\\Davi 3º DS\\java-aulas-poo\\java-aulas-poo\\file.txt";
        ManipuladorArquivo arquivo = new ManipuladorArquivo();
        arquivo.leitor(path);
    }
}
