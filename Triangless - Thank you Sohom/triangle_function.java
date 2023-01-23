// You can modify the algebric function in the MAIN fuction slightly to generate any kind of triangle formation.
// Comment out the portion you want to run!!!

// READ ME READ ME READ ME READ ME ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
// READ ME READ ME READ ME READ ME ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
// READ ME READ ME READ ME READ ME ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
// READ ME READ ME READ ME READ ME ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
// READ ME READ ME READ ME READ ME ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
// READ ME READ ME READ ME READ ME ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

// Below:
// *************
// ****** ******
// *****   *****
// ****     ****
// ***       ***
// **         **
// *           *

// public class triangle_function {
//     public static void main(String[] args) {
//         System.out.println("*************");
//         int number = 13, temp = 1;

//         for (int x = number; x > 0; x = x - 2) {
//             print_star((x - 1) / 2);
//             print_space(temp);
//             print_star((x - 1) / 2);
//             temp = temp + 2;
//             System.out.println();

//         }

//     }

//     public static void print_star(int xyz) {

//         for (int i = 1; i > 0; i--) {

//             for (int j = xyz; j > 0; j--) {
//                 System.out.print("*");
//             }

//         }

//     }

//     public static void print_space(int abc) {

//         for (int i = 1; i > 0; i--) {

//             for (int j = abc; j > 0; j--) {
//                 System.out.print(" ");
//             }

//         }

//     }
// }

//##########################################
//##########################################
//##########################################
//##########################################
//##########################################

/// Below: 
// *           *
// **         **
// ***       ***
// ****     ****
// *****   *****
// ****** ******
// *************

// public class triangle_function {
//     public static void main(String[] args) {

//         int number = 13, temp = 13;

//         for (int x = 1; x <= number; x = x + 2) {
//             print_star((x - 1) / 2);
//             print_space(temp);
//             print_star((x - 1) / 2);
//             temp = temp - 2;
//             System.out.println();

//         }
//         System.out.println("*************");

//     }

    // public static void print_star(int xyz) {

    //     for (int i = 1; i > 0; i--) {

    //         for (int j = xyz; j > 0; j--) {
    //             System.out.print("*");
    //         }

    //     }

    // }

    // public static void print_space(int abc) {

    //     for (int i = 1; i > 0; i--) {

    //         for (int j = abc; j > 0; j--) {
    //             System.out.print(" ");
    //         }

    //     }

    // }
// }


//##########################################
//##########################################
//##########################################
//##########################################
//##########################################

// Below:

// *****
// ****
// ***
// **
// *
// **
// ***
// ****
// *****


// public class triangle_function {
//     public static void main(String[] args) {

//         int number = 5;

//         for (int x = number; x > 0; x--) {
//             print_star(x);
//             System.out.println();
//         }

//         for (int x = 2; x <= number; x++) {
//             print_star(x);
//             System.out.println();
//         }

//     }

//     public static void print_star(int xyz) {

//         for (int i = 1; i > 0; i--) {

//             for (int j = xyz; j > 0; j--) {
//                 System.out.print("*");
//             }

//         }

//     }

//     public static void print_space(int abc) {

//         for (int i = 1; i > 0; i--) {

//             for (int j = abc; j > 0; j--) {
//                 System.out.print(" ");
//             }

//         }

//     }
// }

//##########################################
//##########################################
//##########################################
//##########################################
//##########################################

// Below:
// *****
//  ****
//   ***
//    **
//     *
//    **
//   ***
//  ****
// *****

// public class triangle_function {
//     public static void main(String[] args) {

//         int number = 5, temp =0;

//         for (int x = number; x > 0; x--) {
//             print_space(temp);
//             print_star(x);
//             temp++;
            
//             System.out.println();
//         }

//         temp= temp-2;

//         for (int x = 2; x <= number; x++) {
//             print_space(temp);
//             print_star(x);
//             temp--;
//             System.out.println();
//         }

//     }

//     public static void print_star(int xyz) {

//         for (int i = 1; i > 0; i--) {

//             for (int j = xyz; j > 0; j--) {
//                 System.out.print("*");
//             }

//         }

//     }

//     public static void print_space(int abc) {

//         for (int i = 1; i > 0; i--) {

//             for (int j = abc; j > 0; j--) {
//                 System.out.print(" ");
//             }

//         }

//     }
// }
