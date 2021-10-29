public class Inputfunctions {
  public static void main(String[] args) {
   String[] a=new String[args.length];
int b;
   for(int i = 0; i< args.length; i++) {
   a[i]=args[i];
}
   b = a[0] + a[1];
   System.out.println("Total = " + b);
  }
}
