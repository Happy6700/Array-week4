/**
 * Written by Madison Covey
 * For SD1
 * Learning
 */
public class arrays {

    public static void main(String[] args) {
int [] weekFour;
int testRun=0; 
weekFour=new int[100];
for(int x=0; x<100; x++) {
    weekFour [x] =x+1;
}
for(int x=0; x<100; x++) {
    testRun+=weekFour[x];
          if (weekFour[x]%2==1) {//this is checking to see if the number is even or odd
           System.out.println(weekFour[x]+" is odd"); 
          }else {
            System.out.println(weekFour[x]+" is even"); 
          }}
          System.out.println("the total is "+ testRun);
}
    }