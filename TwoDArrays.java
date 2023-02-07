import java.util.Scanner ;
class TwoDArrys {
    public static void main (String[]args){
        int a [] [] = new int [3][4] ;
        Scanner sc = new Scanner (System.in);
        int j ,i ;
    for (i=0; i<= 2; i++ ){
        for (j=0; j<= 3 ; j++){
            System.out.println("enter an element");
            a [i][j] = sc.nextInt();
        }
    }
    for (i=0; i<=2; i++ ){
        for (j=0; j<= 3 ; j++){
            System.out.print (a [i][j]+ " ");
        }
        System.out.println();
    }
    }
}