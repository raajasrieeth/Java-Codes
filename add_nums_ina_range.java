public class add_nums_ina_range{// add numbers within a specific range.
    public static void main(String[ ] args) {
        System.out.println(sum(1, 3));
    }
    static int sum(int start, int end) {
        if(end>=start){
            return end + sum(start , end-1);
        }
        else{//lower limit equal to or greater than upper.
            return 0;
        }

    }

}