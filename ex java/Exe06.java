public class Exe06{
  public static void main(String args[]){
    int contador = 1;
    int b = 1;
    int x = 1;
    int y = 0;

while(b <= 100){
  System.out.println(x);
  b = x;
  x = x + y;
  y = b;
  contador++;

  }
 }
}