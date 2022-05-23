import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       // System.out.println(curso1);
       // System.out.println(curso2);
       // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBreno = new Dev();
        devBreno.setName("Breno");
        devBreno.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Breno" + devBreno.getConteudosInscrito());
        devBreno.progredir();
        System.out.println("Conteudos Concluidos Breno" + devBreno.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Breno" + devBreno.getConteudosInscrito());
        System.out.println("XP" + devBreno.calcularTotalXp());


        Dev devJoao = new Dev();
        devJoao.setName("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscrito());
        devJoao.progredir();
        System.out.println("Conteudos Concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscrito());
        System.out.println("XP" + devJoao.calcularTotalXp());

    }
}
