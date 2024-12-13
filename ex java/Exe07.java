public class Exe07{
  public static void main(String args[]){
    int contador = 1;
    int x = 13;
    int y = 1;
 
while(y >= 1){
  if((x % 2) ==0){
    y = x / 2;
  } else{
    y = 3 * x + 1;
  }
  System.out.println(y);
  x = y;
  contador++;

  }
 }
}