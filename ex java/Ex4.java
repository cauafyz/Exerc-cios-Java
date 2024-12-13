public class Ex4{
  public static void main(String args[]){

    System.out.println("Fatoriais de 10");

    //espaço para ficar mais bunitinhu

    System.out.println();
     
  for(int i = 1; i <=10; i++){
    int num = i;

    for(int j = (num-1); j>=1; j--){
        num *= j;
    }
    
   System.out.println(i + "! = " + num);
   
  } 
 }
}