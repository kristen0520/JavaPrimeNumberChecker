package com.example;

public class Main {

    public static int COUNTER = 0;

    public static void main(String[] args) {
        int counter = 0;
        for(int i=999; i<1051; i++){
            isPrime(i);
            if(COUNTER == 3){
                break;
            }
        }
    }

    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }

        for(int i=2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        COUNTER++;
        System.out.println(n + " is a prime number");
        return true;
    }
}
