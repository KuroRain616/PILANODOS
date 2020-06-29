import java.util.Scanner;
import javax.swing.JOptionPane;


public class Pila

{//////CLASE PILA
  
public  Pila(int M)
{
    M=200;
cima=null;
}

Nodo cima;
Scanner teclado=new Scanner(System.in);

    public void INGRESARNODO()
    
    {
      
    Nodo Stack = new Nodo(); 
    System.out.println("\n INGRESE EL DATO: ");
    Stack.datos=teclado.nextInt();
    Stack.siguiente=cima;
    cima=Stack;
    System.out.println("\n NODO INGRESADO");
    
    }
    public void MOSTRARPILA()
    {
    Nodo recorrido =new Nodo();
recorrido=cima;
if(cima!=null)
{
    while(recorrido!=null)
    {
        System.out.println("   "+recorrido.datos);
        recorrido=recorrido.siguiente;
    }
}else
{
    System.out.println("\n PILA VACIA");
}
    }
    public void ELIMINAR()
    {
        Nodo Battery = new Nodo();
        Battery = cima;
        Nodo contador = new Nodo();
        contador = null;
        boolean eliminar = false;
        System.out.print("\n INGRESE EL DATO A ELIMINAR:  ");
        int DATO = teclado.nextInt();
        if(cima != null){
            while(Battery != null && eliminar != true){
                if(Battery.datos == DATO){
                    if(Battery == cima){
                        cima = cima.siguiente;
                    }else{
                        contador.siguiente = Battery.siguiente;
                    }
                    System.out.println("\n EL DATO " + Battery.datos + " SE ELIMINO \n");
                    eliminar = true;
                }
                contador = Battery;
                Battery = Battery.siguiente;
            }
            if(!eliminar){
                System.out.println("\n NO EXISTE\n");
            }
        }else{
            System.out.println("\n LA PILA ESTA VACIA\n");
        }  
    }
    public static void main(String[] args) 
    
    {
        
        int key=0,opciones,menu;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("DE QUE TAMAÑO SERA LA PILA");
        key=keyboard.nextInt();
        Pila Stack=new Pila(key);
        System.out.println("-------------------------------------");
        do{
            
        System.out.println("1.-INGRESAR DATOS");
        System.out.println("2.-MOSTRAR DATOS");
        System.out.println("3.-ELIMINAR DATOS");
        System.out.println("4.-SALIR");
        System.out.println("--------------------------------------");
        opciones=keyboard.nextInt();
        switch(opciones)
        
        {
            case 1:
            {
                System.out.println("----------------------------");
                    Scanner read=new Scanner(System.in);
      System.out.println("\n CUANTOS DATOS QUIERE INGRESAR");
      int datosingresar=read.nextInt();
      if(datosingresar>key)
      {
          System.out.println("\n VERIFIQUE SUS DATOS");
      }
      else
      { 
          int RESULTADO;
          for(int i=0;i<datosingresar;i++)
          {
               Stack.INGRESARNODO();
              
          }
      }
       break;
            }
            case 2:
            {
              System.out.println("\n LA PILA ES : ");
            Stack.MOSTRARPILA();  
            break;
            }
            case 3:
            {   
                Stack.ELIMINAR();
                break;
            }
            
            default:System.out.println("\n OPCION NO VALIDAD");
            
        }
        
        

        }
        while(opciones!=4);
        
      
      
    }
    
}///////CLASE PILA
