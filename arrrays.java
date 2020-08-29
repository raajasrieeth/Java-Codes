public class arrrays {
    //TODO:Use Arrays in java.
    //Store more than one value in an array.
    public static void main(String[] args) {
    int[] marks = {1, 2 , 3, 5,6, 7};//create an integer array of name marks.
    marks[4] = 9;//makes the 4th object in the array 9.
    System.out.println(marks[0]);//Starting index is 0., prints the value at that position.
    //For iterating over the array:
    for( int i=0;i< marks.length ;i++){//Dont use <= so that you dont get a out of bounds error.
        if(i%2==0){
            System.out.println("The object "+marks[i]+ " has an even index in the array of marks.");
        }
        else{
            System.out.println("The object "+marks[i]+ " has an odd index in the array of marks.");
    }
    }
    // Another way:
    for(int value:marks){
        System.out.println(value);
    }
    //Multidimensional arrays:
    int [][] matrix = {{1,2,3},{4,5,6}};
    System.out.println(matrix[0][1]);//prints 2nd item in first array.

    //String arrays:
    String [] items = {"Item0","Item1","Item2","Item3",};
    for(String value:items){
        System.out.println(value);
    }
 }

}