package Pattern_Printing;

public class Pattern_class {
    public static void main(String[] args) {

    //Pattern-1:

//        for(int i = 1 ; i <= 7 ; i++){
//            for(int j = 1 ; j <= 7 ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



    //Pattern-2:

//        for (int i = 0; i <= 6; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


    //Pattern-3:
//
//            for(int i = 1 ; i<= 6  ; i++){
//                for (int j = 1; j <=i; j++) {
//                    System.out.print(j+" ");
//                }
//                System.out.println();
//            }

    //Pattern-4:
//        int n =6 ;
//
//        for (int i =  1; i <=n; i++) {
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    //Pattern-5:
//        int m =6 ;
//
//        for (int i =  1; i <=m; i++) {
//            for (int j = 1; j <=m-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //Pattern 6: Retry
//        int n = 6;
//
//        for(int i = 0 ; i <= n;i++){
//            for(int j = 1 ; j <= n-i ;j++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for(int j = 0 ; j<=2*i-1;j++){
//                if(j == 2*i-1){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i = n-2; i>=0 ; i--){
//            for(int j = 1 ; j <= n-i ;j++){
//                System.out.print(" ");
//            }
//                System.out.print("*");
//            for(int j = 0 ; j<=2*i-1;j++){
//                if(j == 2*i-1){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

    }
}
