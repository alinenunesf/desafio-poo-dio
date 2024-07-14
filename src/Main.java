import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição da mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

            Dev devAline = new Dev();
        devAline.setNome("Aline");
        devAline.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Aline: " + devAline.getConteudosInscritos());
        devAline.progredir();
        devAline.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos de Aline: " + devAline.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Aline: " + devAline.getConteudosConcluidos());
        System.out.println("XP: " + devAline.calcularTotalXp());

        System.out.println("----------------------");

            Dev devRaj = new Dev();
        devRaj.setNome("Raj");
        devRaj.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Raj: " + devRaj.getConteudosInscritos());
        devRaj.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos de Raj: " + devRaj.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Raj: " + devRaj.getConteudosConcluidos());
        System.out.println("XP: " + devRaj.calcularTotalXp());


    }
}
