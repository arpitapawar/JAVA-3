public class Inputfunctions {
  public static void main(String[] args) {
   System.out.println("Number of Command Line Argument = "+args.length);
int sum=0;
   for(int i = 0; i< args.length; i++) {
       sum=Integer.parseInt(args[i])+sum;
			System.out.println(String.format("Command Line Argument %d is %s", i, sum));
		}
   
  
  }
}


