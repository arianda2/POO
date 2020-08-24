 public class Biblioteca{ 
     public static void main(String args[]){ 

         Livro L1;
         Livro L2;
         Livro L3;        
         Livro L4;
         Livro L5;

         L1 = new Livros (titulo, autor, ano, categoria, estante, prateleira, emprestimo);
         L2 = new Livros (titulo, autor, ano, categoria, estante, prateleira, emprestimo);
         L3 = new Livros (titulo, autor, ano, categoria, estante, prateleira, emprestimo);
         L4 = new Livros (titulo, autor, ano, categoria, estante, prateleira, emprestimo);
         L5 = new Livros (titulo, autor, ano, categoria, estante, prateleira, emprestimo);

         L1.exibirInfo();
         L2.exibirInfo();
         L3.exibirInfo();
         L4.exibirInfo();
         L5.exibirInfo();



     }
 }
 }