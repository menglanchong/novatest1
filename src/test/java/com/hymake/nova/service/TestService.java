package com.hymake.nova.service;

/**
 * Created by Administrator on 2017/12/13.
 */
public class TestService {
    public static void Digui_Test1() {

            System.out.println(f(30));
    }

    public static int f(int n){
                if(n<=2)
                       return 1;
                else
                    return f(n-1)+f(n-2);

            }



}
