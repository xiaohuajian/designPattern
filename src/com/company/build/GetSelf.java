package com.company.build;

public class GetSelf {

    public GetSelf(){}

    public GetSelf get(){
        return this;
    }

    public static void main(String[] args) {
        GetSelf getSelf = new GetSelf();
        System.out.println(getSelf.get().toString());
        int a =  2;
        while(a > 0){
            a--;
        }
        System.out.println(a);
    }
}
