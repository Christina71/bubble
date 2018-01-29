package com.example.bubble;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BubbleSort {
    @RequestMapping("/bub")
    public static void bubble() {
        //String output = " ";
        /*int a[] = new int[4];
        a[0] = 34;
        a[1] = 29;
        a[2] = 69;
        a[3] = 33;*/

        /*char a[]=new char[4];
        char temp;
        a[0]='t';
        a[1] = 'i';
        a[2] = 'n';
        a[3] = 'a';*/

         int a[] = new int[4];
         int temp;
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
             System.out.print(a[i]);
             System.out.println("");



        }
    }
}
