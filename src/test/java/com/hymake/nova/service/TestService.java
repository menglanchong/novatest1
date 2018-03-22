package com.hymake.nova.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/13.
 * 个人随意写来测试
 */
public class TestService {
    public static void digui_Test1() {

            System.out.println(f(30));
    }

    public static int f(int n){
                if(n<=2)
                       return 1;
                else
                    return f(n-1)+f(n-2);

            }

    public static void scanner(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
        /*Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();*/
        String a= null ;
        try {
            a = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(a);
    }



}
