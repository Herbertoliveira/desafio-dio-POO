import desafio.dio.dominio.Bootcamp;
import desafio.dio.dominio.Curso;
import desafio.dio.dominio.Dev;
import desafio.dio.dominio.Mentoria;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

    
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHerbert = new Dev();
        devHerbert.setNome("Herbert");
        devHerbert.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Herbert:" + devHerbert.getConteudosInscritos());
        devHerbert.progredir();
        devHerbert.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Herbert:" + devHerbert.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Herbert:" + devHerbert.getConteudosConcluidos());
        System.out.println("XP:" + devHerbert.calcularTotalXp());

        System.out.println("-------");

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Davi:" + devDavi.getConteudosInscritos());
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Davi:" + devDavi.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Davi:" + devDavi.getConteudosConcluidos());
        System.out.println("XP:" + devDavi.calcularTotalXp());
    }
}