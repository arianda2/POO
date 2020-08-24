public class Livro{


private String titulo;
private String autor;
private int ano;
private String categoria;
private int estante;
private int prateleira;
private boolean emprestimo;

public Livro (String ntitulo, String nautor, int nano, String ncategoria, int nestante, int nprateleira, boolean nemprestimo){

String getTitulo(){
    return titulo;
}   
void setTitulo(String novoTitulo){
    titulo = novoTitulo;
}
String getAutor(){
    return autor;
}   
void setAutor(String novoAutor){
    autor = novoAutor;
}
String getAno(){
    return ano;
}   
void setAno(int novoAno){
    ano = novoAno;
}
String getCategoria(){
    return categoria;
}   
void setCategoria(String novoCategoria){
    categoria = novoCategoria;
}
String getEstante(){
    return estante;
}   
void setEstante(int novoEstante){
    estante = novoEstante;
}
String getPrateleira(){
    return prateleira;
}   
void setPrateleira(int novoPrateleira){
    prateleira = novoPrateleira;
}
String getEmprestimo(){
    return emprestimo;
}   
void setEmprestimo(int novoEmprestimo){
    emprestimo = novoEmprestimo;
}

}