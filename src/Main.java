import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java Dio");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso Js");
        curso1.setDescricao("Curso Js Dio");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Java Dio");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Develiper");
        bootcamp.setDescricao("Descrição Bootcamp Java Develiper");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devAnna = new Dev();
        devAnna.setNome("Anna");
        devAnna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Anna" + devAnna.getConteudosInscritos());
        devAnna.progredir();
        devAnna.progredir();
        devAnna.progredir();

        System.out.println("_");

        System.out.println("Conteúdos Inscritos Anna" + devAnna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Anna" + devAnna.getConteudosConcluidos());
        System.out.println("XP: " + devAnna.calcularXP());


        System.out.println("_________________________");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devAnna.getConteudosInscritos());
        devCamila.progredir();

        System.out.println("_");


        System.out.println("Conteúdos Inscritos Camila" + devAnna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila" + devAnna.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularXP());

    }
}
