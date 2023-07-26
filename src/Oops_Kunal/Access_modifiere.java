package Oops_Kunal;

public class Access_modifiere {
        private int num;
        String name;
        int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Access_modifiere(int num, String name, int[] arr) {
        this.num = num;
        this.name = name;
        this.arr = arr;
    }

    public static void main(String[] args) {
        Access_modifiere ac = new Access_modifiere(1,"Prakhar", new int[1]);
        System.out.println(ac.arr[0]);
        System.out.println(ac.num);
    }
}

