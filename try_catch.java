public class try_catch {
    public static void main(String[] args){
        String [] indexes = {"index0","index1"};
        try{
            System.out.println(indexes[2]);//try to do something
        }
        catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error!");

        }
        System.out.println("Out of the try_catch block");
    }

}