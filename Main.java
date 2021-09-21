import java.util.Random;
class Main {
  public static void main(String[] args) {
   

Random rand = new Random();


int randomNum = rand.nextInt(50);
randomNum += 1;
System.out.println("The random num is " + randomNum);
for(int num = randomNum; num >= 0;num--){
  System.out.println(num);
}
if(randomNum <= 5){
  System.out.println("Ahoy mateys!");
}
else if(randomNum > 25 && randomNum < 42){
  System.out.println("Cannonball!");
}
else{
  System.out.println("Blast off!");
}
  }
}