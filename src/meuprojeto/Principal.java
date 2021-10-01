package meuprojeto;

public class Principal {
    public static void main(String[] args) {
        System.out.println("oi galera");

        Curso c1 = new Curso(1, "Eng.Soft.", true);
        Curso c2 = new Curso(2, "Eng.Civil", true);

        System.out.println(c1);
        System.out.println(c2);

        Universidade u1 = new Universidade(1,"Uniamerica");
        u1.getCursos().add(c1);
        u1.getCursos().add(c2);

        System.out.println(u1);
    }
}
