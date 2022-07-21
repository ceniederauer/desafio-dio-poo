import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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
//
//        System.out.println(curso);
//        System.out.println(curso2);
//
//        System.out.println("############################################");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("javajavajava");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de javascript");
        mentoria1.setDescricao("javascriptjavascriptjavascript");
        mentoria1.setData(LocalDate.now());

//        System.out.println(mentoria);
//        System.out.println(mentoria1);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java");
        bootcamp.setDescricao("Seja um programador java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);


        Dev devDiego = new Dev();
        devDiego.setName("Diego");
        devDiego.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos " + devDiego.getName() + ": " + devDiego.getConteudosInscritos());
        devDiego.progredir();
        System.out.println("Conteúdos inscritos " + devDiego.getName() + ": " + devDiego.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + devDiego.getName() + ": " + devDiego.getConteudosConcluidos());
        System.out.println("XP total " + devDiego.getName() + ": " + devDiego.calcularXpTotal());

        Dev devJoao = new Dev();
        devJoao.setName("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos " + devJoao.getName() + ": " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos inscritos " + devJoao.getName() + ": " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + devJoao.getName() + ": " + devJoao.getConteudosConcluidos());
        System.out.println("XP total " + devJoao.getName() + ": " + devJoao.calcularXpTotal());

        Dev devCarla = new Dev();
        devCarla.setName("Carla");
        devCarla.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos " + devCarla.getName() + ": " + devCarla.getConteudosInscritos());
        devCarla.progredir();
        devCarla.progredir();
        System.out.println("Conteúdos inscritos " + devCarla.getName() + ": " + devCarla.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + devCarla.getName() + ": " + devCarla.getConteudosConcluidos());
        System.out.println("XP total " + devCarla.getName() + ": " + devCarla.calcularXpTotal());
    }
}
