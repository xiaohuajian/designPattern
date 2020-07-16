package com.company.state;

public class GumballMachine {

    public static final int SOLD_OUT = 0;
    public static final int NO_MONEY = 1;
    public static final int HAS_MONEY = 2;
    public static final int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count){
        this.count = count;
        if (count > 0){
            state = NO_MONEY;
        }
    }

    public void insertMoney(){
        if (state == HAS_MONEY){
            System.out.println("你已透过币");
        }else if (state == SOLD_OUT){
            System.out.println("投币无效，糖果已卖完");
        }else if (state == SOLD){
            System.out.println("请拿好刚刚给你的糖果");
        }else if(state == NO_MONEY){
            System.out.println("投币成功");
            state = HAS_MONEY;
        }
    }

    public void ejectMoney(){
        if (state == HAS_MONEY){
            System.out.println("退钱成功");
            state = NO_MONEY;
        }else if (state == SOLD_OUT){
            System.out.println("操作无效，你未投钱无法退钱");
        }else if (state == SOLD){
            System.out.println("正在售货，无法退钱");
        }else if(state == NO_MONEY){
            System.out.println("操作无效，你未投钱无法退钱");
        }
    }

    public void makeGumball(){
        if (state == HAS_MONEY){
            System.out.println("正在售货,请等待...");
            dispense();
        }else if (state == SOLD_OUT){
            System.out.println("糖果已卖完");
        }else if (state == SOLD){
            System.out.println("正在售货,请等待...");
        }else if(state == NO_MONEY){
            System.out.println("操作无效，你未投钱无法给你糖果");
        }
    }

    private void dispense() {
        if (state == HAS_MONEY){
            System.out.println("正在给你投递一个糖果，等一下");
            state = SOLD;
            if (count == 0){
                System.out.println("注意一下，糖果已经卖完了");
                state = SOLD_OUT;
            }else {
                state = NO_MONEY;
                System.out.println("投给你了糖果，请查收");
                count = count -1;
            }
        }else if (state == SOLD_OUT){
            System.out.println("糖果已卖完");
        }else if (state == SOLD){
            System.out.println("正在售货,请等待...");
        }else if(state == NO_MONEY){
            System.out.println("操作无效，你未投钱无法给你糖果");
        }
    }


    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(3);

        gumballMachine.insertMoney();
        gumballMachine.makeGumball();

        gumballMachine.ejectMoney();
    }
}
