package pe.edutec.lib;

public class Matematica {

  public int promedio(int n1, int n2) {
    int p;
    p = (n1 + n2) / 2;
    return p;
  }

  public int promedio(int n1, int n2, int n3) {
    int p;
    p = (n1 + n2 + n3) / 3;
    return p;
  }

  public int promedio(int n1, int n2, int n3, int n4) {
    int p;
    p = (n1 + n2 + n3 + n4) / 4;
    return p;
  }

  public int promedio(int n1, int n2, int n3, int n4, int n5) {
    int p;
    p = (n1 + n2 + n3 + n4 + n5) / 5;
    return p;
  }
  public int factorial(int numero){
      int factorial=1;
      while( numero != 0){
          factorial=factorial*numero;
          numero--;
      }
      return factorial;
  }
  
  public int MCD(int num1, int num2){
      while(num1 != num2)
            if(num1>num2)
                num1= num1-num2;
            else
                num2= num2 -num1;
      
      return num2;
  }
public String fibonacci(int n)
{      int  fibo1=1;
       int  fibo2=1; 
       String msj = null;
        System.out.print(fibo1 + " ");
        for(int i=2;i<=n;i++)
        {
             msj = msj+" , " + Integer.toString(fibo1)+ " ";
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
        
        return msj;
} 

  public int MCM(int num1, int num2){
      int n1=num1, n2=num2;
      int mcd=0;int mcm=0;
      while(num1 != num2){
          if (num1 > num2){
              num1 = num1 - num2;
          }else{
              num2= num2 - num1;
          }
      }
      mcd= num2;
      mcm= n1*n2/mcd;
      return mcm;
  }

   public boolean esPrimo(int numero){
      int contador = 2;
      boolean primo=true;
      if(numero==1){
          return true;
      }
      if (numero%2==0)
        return false;
      while ((primo) && (contador!=numero)){
        if (numero % contador == 0)
        primo = false;
        contador++; 
      }
     return primo; 
   } 
   
   
   
}
