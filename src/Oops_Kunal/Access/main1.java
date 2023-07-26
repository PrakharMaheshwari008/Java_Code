package Oops_Kunal.Access;

public class main1 {
        protected int num;
        String name;
        int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public main1(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
