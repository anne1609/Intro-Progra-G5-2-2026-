import java.util.Scanner;

public class Torneo
{
    final int tam=4;
    int a[]=new int[tam];
    int b[]=new int[tam];
    int c[]=new int[tam];
    Scanner sc=new Scanner(System.in);

    Torneo(){
        for(int i=0;i<tam;i++){
            System.out.println("Ingrese puntos para A: ");
            a[i]=sc.nextInt();
            System.out.println("Ingrese puntos para B: ");
            b[i]=sc.nextInt();
            System.out.println("Ingrese puntos para C: ");
            c[i]=sc.nextInt();
        }

        for(int i=0;i<tam;i++){
            System.out.println("Jugador "+(i+1)+
            ": A="+a[i]+" B="+b[i]+" C="+c[i]);
        }
    }

    void parImpar(){
        int contParA=0,contParB=0,contParC=0;
        int contImparA=0,contImparB=0,contImparC=0;

        for(int i=0;i<tam;i++){
            if(a[i]%2==0){
                contParA++;
            }else{
                contImparA++;
            }

            if(b[i]%2==0){
                contParB++;
            }else{
                contImparB++;
            }

            if(c[i]%2==0){
                contParC++;
            }else{
                contImparC++;
            }
        }

        System.out.println("A: "+contParA+" pares "+contImparA+" impares");
        System.out.println("B: "+contParB+" pares "+contImparB+" impares");
        System.out.println("C: "+contParC+" pares "+contImparC+" impares");
    }

    void busqOcu(int buscado){
        int cont=0;

        for(int i=0;i<tam;i++){
            if(buscado==a[i]){
                cont++;
            }
        }

        if(cont>0){
            System.out.println("El numero "+buscado+
            " existe y aparece "+cont+" veces en el arreglo A");
        }else{
            System.out.println("El numero "+buscado+
            " no existe en el arreglo A");
        }
    }

    void mayorPuntaje(){
        int sumas[]=new int[tam];
        int jugador=0;

        for(int i=0;i<tam;i++){
            sumas[i]=a[i]+b[i]+c[i];
        }

        int mayor=sumas[0];

        for(int i=0;i<tam;i++){
            if(sumas[i]>mayor){
                mayor=sumas[i];
                jugador=i;
            }
        }

        System.out.println("El jugador "+(jugador+1)+
        " obtuvo el mayor puntaje con "+mayor+" puntos");
    }

    public static void main(String args[]){
        Torneo t=new Torneo();
        t.parImpar();
        System.out.println("Ingrese numero a buscar: ");
        int buscado=t.sc.nextInt();
        t.busqOcu(buscado);
        t.mayorPuntaje();
    }
}



