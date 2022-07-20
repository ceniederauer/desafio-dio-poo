import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Java é uma linguagem de programação");
        curso.setCargaHoraria(120);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("JavaScript é uma linguagem de programação");
        curso2.setCargaHoraria(100);

        System.out.println(curso);
        System.out.println(curso2);

        System.out.println("############################################");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("javajavajava");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de javascript");
        mentoria1.setDescricao("javascriptjavascriptjavascript");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria);
        System.out.println(mentoria1);
    }
}
