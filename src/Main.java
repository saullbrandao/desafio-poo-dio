import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("curso java", "descrição curso java", 8);
        Curso curso2 = new Curso("curso js", "descrição curso js", 4 );
        Mentoria mentoria = new Mentoria("mentoria de java", "descrição mentoria java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer",
                "Descrição Bootcamp Java Developer",
                LocalDate.now(),
                new LinkedHashSet<>(){{
                    add(curso1);
                    add(curso2);
                    add(mentoria);
                }});

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularXpTotal());

        System.out.println("-------");

        Dev devJoao = new Dev("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularXpTotal());
    }
}