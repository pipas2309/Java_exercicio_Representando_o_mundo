import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Configurando um teste
        User userA = new User();
        User userB = new User();

        Subject math = new Subject();
        Subject portuguese = new Subject();

        Exercises mathExercisesA = new Exercises();
        Exercises mathExercisesB = new Exercises();
        Exercises portugueseExercisesA = new Exercises();
        Exercises portugueseExercisesB = new Exercises();

        //Atribuindo valores aos usuários
        userA.name = "Caju";
        userB.name = "Juca";

        userA.college = "Faculdade dos Zé";
        userB.college = "Universidades das Zeca";

        userA.setAge(32);
        userB.setAge(42);

        userA.setStartYear(2020);
        userB.setStartYear(2015);

        userA.setConclusionYear(2028);
        userB.setConclusionYear(2023);

        userA.setEmail("cajuina@pede.sai");
        userB.setEmail("jurubeba@socorro.co");

        userA.changeMembership();

        //Atrivuindo valores as matérias
        math.Name = "Matemática";
        math.changeMembership(); //Só quem paga precisa sofrer

        portuguese.Name = "Portugues";

        //Atribuindo valores aos exercícios
        mathExercisesA.name = "Quanto é, de cabeça";
        mathExercisesA.addExercise("1+1=?");
        mathExercisesA.addExplanation("vamos aprender a calcular usando nossa cabecinha! =)");
        String[] answersMA = {"Um mais 1 é dois(2)", "Não sei", "Não tenho cabeça pra isso", "ganhei uma calculadora"};
        mathExercisesA.addAnswers(answersMA);
        String[] imagesMA = {"gogle.com/imagemtop1", "randomImagensParaExerciciosDeProgramaçãoQueSimulamExerciciosDeMatematicaComplexos.com"};
        mathExercisesA.addImages(imagesMA);

        mathExercisesB.name = "Radiação de fundo no univeso";
        mathExercisesB.addExercise("Calculos de Ainstaim");
        mathExercisesB.addExplanation("Não tenco certeza, melhor ver no gugle");
        String[] answersMB = {"Não","consigo","ler","nada"};
        mathExercisesB.addAnswers(answersMB);
        String[] imagesMB = {"https://http.cat/200"};
        mathExercisesB.addImages(imagesMB);

        portugueseExercisesA.name = "Você sabe o seu nome?";
        portugueseExercisesA.addExercise("Sou cidadão?");
        portugueseExercisesA.addExplanation("Agora é a hora de olhar o RG!");
        String[] answersPA = {"Mamãe vai me contar amanha", "não", "sim"};
        portugueseExercisesA.addAnswers(answersPA);
        String[] imagesPA = {"gogle.co/bobodacorte.png","preguica.com/a.jpg"};
        portugueseExercisesA.addImages(imagesPA);

        portugueseExercisesB.name = "Uma análise do portugues lírico de 1672";
        portugueseExercisesB.addExercise("Cansei de escrever lorota...");
        portugueseExercisesB.addExplanation("Não gosto de portugues (não gosto pq sou ruim e não me dedico)");
        String[] answersPB = {"so","corro","não sei soletrar"};
        portugueseExercisesB.addAnswers(answersPB);
        String[] imagesPB = {"meioBesta.com/333.jpge", "bestao.com/666.png", "bestaMor.com/999.raw"};
        portugueseExercisesB.addImages(imagesPB);

        //Conferindo se tudo ta funfando delicinha
        System.out.println("\nNome: " + userA.name + "\nIdade: " + userA.getAge() + "\nFacul: " + userA.college + "\nÉ membro: " + userA.getMembership());
        System.out.println("\nNome: " + userB.name + "\nIdade: " + userB.getAge() + "\nFacul: " + userB.college + "\nÉ membro: " + userB.getMembership());
        
        System.out.println("\n\nNome da matéria: " + math.Name + "\n" + math.changeMembership());
        System.out.println("\nNome da matéria: " + portuguese.Name + "\n" + portuguese.changeMembership());
        
        System.out.println("\n\n Tema: " + mathExercisesA.name);
        System.out.println("Pergunta: " + mathExercisesA.getExercise());
        System.out.println(mathExercisesA.getExplanation());
        System.out.println(Arrays.toString(mathExercisesA.getAnswers()));
        System.out.println(Arrays.toString(mathExercisesA.getImages()));
        
        System.out.println("\n\n Tema: " + mathExercisesB.name);
        System.out.println("Pergunta: " + mathExercisesB.getExercise());
        System.out.println(mathExercisesB.getExplanation());
        System.out.println(Arrays.toString(mathExercisesB.getAnswers()));
        System.out.println(Arrays.toString(mathExercisesB.getImages()));
        
        System.out.println("\n\n Tema: " + portugueseExercisesA.name);
        System.out.println("Pergunta: " + portugueseExercisesA.getExercise());
        System.out.println(portugueseExercisesA.getExplanation());
        System.out.println(Arrays.toString(portugueseExercisesA.getAnswers()));
        System.out.println(Arrays.toString(portugueseExercisesA.getImages()));
        
        System.out.println("\n\n Tema: " + portugueseExercisesB.name);
        System.out.println("Pergunta: " + portugueseExercisesB.getExercise());
        System.out.println(portugueseExercisesB.getExplanation());
        System.out.println(Arrays.toString(portugueseExercisesB.getAnswers()));
        System.out.println(Arrays.toString(portugueseExercisesB.getImages()));
    }
}
