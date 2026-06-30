package Class4_Loops;

public class label_break_and_continue {
    static void main(String[] args) {

//            for (int i = 0; i < 10; i++) {
//            int j =0;
//            while(j<=5){
//                if(j==3) break;  // for normal nested , for using break statements, you only skip the inner most loop not he complete nested , to break and escape the ested loop , we use : label
//                System.out.print(j+" ");
//                j++;
//            }
//            System.out.println();
//        }

            YeEkLabelHai:
            for (int i = 1; i <=10; i++) {
            int j =0;
            while(j<=5){
                if(i==3) break YeEkLabelHai;
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }

    }
}
