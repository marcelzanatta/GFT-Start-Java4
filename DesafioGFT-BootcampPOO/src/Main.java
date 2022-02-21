import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Bootcamp JavaDeveloper");
        curso1.setDescricao("Description Java");
        curso1.setCargaHoraria(120);

        Curso curso2 = new Curso();
        curso2.setTitulo("Bootcamp GFT");
        curso2.setDescricao("Description GFT4");
        curso2.setCargaHoraria(56);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java Developer");
        mentoria.setDescricao("Description Mentoria JavaDeveloper");
        mentoria.setData(LocalDate.now());

        // Instanciar bootcamp e criar 2 Devs

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp java Develepoper");
        bootcampJava.setDescricao("Description Bootcamp Java Developer");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos Camilla: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos Concluidos Camilla: " + devCamila.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Atualizados Camilla: " + devCamila.getConteudosInscritos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("");

        Dev devMarcel = new Dev();
        devCamila.setNome("Marcel");
        devMarcel.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos Marcel: " + devMarcel.getConteudosInscritos());
        devMarcel.progredir();
        System.out.println("Conteúdos Concluidos Marcel: " + devMarcel.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Atualizados Marcel: " + devMarcel.getConteudosInscritos());
        System.out.println("XP: " + devCamila.calcularTotalXp());


    }
}
