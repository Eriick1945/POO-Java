import classes.Livros;
import classes.Produtos;
import classes.Aluno;

public class Main {
    public static void main(String[] args) {
        Livros livro=new Livros();
        livro.setAutor("Ariano suassuna");
        livro.setTitulo("auto da Compadecida");
        livro.setAnoDePublicacao(1995);

        Livros livro1=new Livros();
        livro1.setAutor("J.K ROWLLING");
        livro1.setTitulo("Harry Potter");
        livro1.setAnoDePublicacao(2001);

        
        Livros livro2=new Livros();
        livro2.setAutor("Dante");
        livro2.setTitulo("A divina comédia");
        livro2.setAnoDePublicacao(1843);

        Aluno aluno=new Aluno("claudio", 18,5);
        Aluno aluno1=new Aluno("cleber", 17, 3);
        Aluno aluno2=new Aluno("cleide", 16, 2);

        Produtos produto=new Produtos("feijão", 25.79, "Comida");
        Produtos produto1=new Produtos("Desodorante",15.90,"Limpeza");
        Produtos produto2=new Produtos("mouse", 10.00, "Eletronico");
        
    }
}

