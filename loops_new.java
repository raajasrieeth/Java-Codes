public class loops_new{
        public static void main(String[] args) {
            //TODO:use while loops., do-while loops.
            /* Syntax:
            while(condition){
                do something till condition is false.
            }
            */
            int i = 0;//set i = 0
            while(i<10){//loop
                System.out.println(i);// print value of i
                i++;//increment i , else we'll have an infinite loop
            }
            //do while loops:
            /*
            do{
                //code will be run until condition is false.
            }while(condition)//condition is evaluated after the above code is run.ie , at least once
            */
            //usage:
            int j = 34;
            do{
                System.out.println(j);
            }while(j==1);//code is still run once.
            //For loops:
            /*
            for(statement1; st2; st3){
                //st1 is run once only ie, before the loop starts, st2 is the condition evaluated for each loop , the st3 is run after each iteration.
                //code to be run

            }
            */
            //Example:

            for(int k=0 ; k>=10; k++){//st1: k=0 , st2 = condition , st3 = iterative step.
                System.out.println(k);//prints k
                //break;//stops execution of code.

            }
            //Using for loops with conditionals:
            for(int e = 0 ; e>=5; e++){
                System.out.println(e);
                if(e == 2){
                    System.out.println("e is now 2");
                    continue;//2 will not be printed, skips to next iteration
            }
                else{
                    System.out.println("This number is printed"+e);//prints e.
                }
        }

}
}