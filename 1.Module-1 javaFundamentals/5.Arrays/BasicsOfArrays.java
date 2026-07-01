package class5_Arrays;

public class BasicsOfArrays {
    static void main(String[] args) {
//        int age[]; // declaration
//        age = new int[20]; //memory allocation


//        int age[] = new int[5];
//
//        age[0] = 22;
//        age[1] = 69;
//
//        System.out.println(age[0]);
//        System.out.println(age[1]);
//        System.out.println(age[2]);
//
//        System.out.println(age.length);

//Direct initialization of Array:

//        int marks[] = {12,22,3,44,24,54,65};
//
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[6]);
//        System.out.println(marks[7]);


// Itteration in an Array:

//    1. For loop
//        String names[] = {"Aman","Adi","Ajay","Amol"};
//
//        for (int i = 0; i < names.length ; i++) {
//            System.out.println(names[i]);
//        }

//    2. Foreach loop : Mostly used to itterate inside an array:
//        convetion is , name of array must be taken in prural form.

//        for(String name:names){
//            System.out.print(name+" ");
//        }

//    3.Sum of an Array:

        int Nums[] ={1,2,3,4,5,6,7,8,9,10};

//        int sum = 0;
//
//        for(int num : Nums){
//            sum += num;
//        }
//        System.out.println(sum);


//  4. Minimum value from an array:
//        int min = Integer.MAX_VALUE;
//        for(int num : Nums){
//            if(num<min){
//                min = num;
//            }
//        }
//        System.out.println(min);
//    }


//    5. Maximum Value in Array:
//    int max = Integer.MIN_VALUE;
//    for(int num : Nums){
//        if(num > max){
//            max = num;
//        }
//    }
//        System.out.println(max);




        // 2D-Array : MATRIX

//1.Declaration , initialization method:

//    int marks[][] = new int [4][3];

//        marks[0][0] = 73;
//        marks[0][1] = 77;
//        marks[0][2] = 88;
//
//        marks[1][0] = 72;
//        marks[1][1] = 65;
//        marks[1][2] = 93;
//
//        marks[2][0] = 74;
//        marks[2][1] = 78;
//        marks[2][2] = 77;
//
//        marks[3][0] = 73;
//        marks[3][1] = 65;
//        marks[3][2] = 93;


        // Direct Initialization:

//    int age[][] ={
//            {12,45,37},
//            {22,36,43},
//            {77,21,25},
//            {20,40,60},
//    };
//
//        System.out.println(age[2][1]);
//        System.out.println(age[2][5]); // Array index is out of bounds error.







}}
