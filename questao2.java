public class MyClass {
    public static void main(String args[]) {
     String senha="000000"; 
    String senhaDig ="Ya3&ab";
    int tamSenha=senha.length();
    
    boolean achouNumero = false;
    boolean achouMaiuscula = false;
    boolean achouMinuscula = false;
    boolean achouSimbolo = false;
     if (senhaDig.length() < 6) {
      tamSenha = senha.length()-senhaDig.length();
                 }else{
               tamSenha=0;
                          }
                          
    for (char c : senhaDig.toCharArray()) {
            if (c >= '0' && c <= '9') {
             achouNumero = true;
                         } if (c >= 'A' && c <= 'Z') {
             achouMaiuscula = true;
                         } if (c >= 'a' && c <= 'z') {
             achouMinuscula = true;
                       } if  (c >= '!' && c <= '+'){
             achouSimbolo = true;
                       }
            
            }
            
            if(achouNumero==true && achouMaiuscula==true && achouMinuscula==true && achouSimbolo==true){
                  System.out.println("Senha valida"); 
               }else{
                  System.out.println("Senha invalida");  
               }
            System.out.println("Voce precisa de pelo menos mais "+
            tamSenha+" digitos pra concluir sua senha, sendo q vc ja tem um(a) numero "+achouNumero+
            ", letra maiuscula "+achouMaiuscula+
            ", letra minuscula "+achouMinuscula+
            ", simbolo "+achouSimbolo);
          
}
    
}
