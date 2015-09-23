#include <math.h>
#include <stdio.h>
int main(void) {
  bool isItPrime(int number);
  int lowerLimit, upperLimit;
  printf("This program will list all the prime numbers within a given range\n");
  printf("To begin, please enter the lower limit of the range: ");
  scanf("%i",&lowerLimit);
  printf("Thank you.  Now please enter an upper limit for the range: ");
  scanf("%i",&upperLimit);
  printf("\n\nThe Prime Numbers Are:\n");

  while(lowerLimit <=upperLimit ){
    if(isItPrime(lowerLimit)==true){
      printf("%d\n",lowerLimit);
    }
    lowerLimit=lowerLimit+1;
  }
  return 0;
}

bool isItPrime(int number)
{
  int limit, i =2;
  //optimized to only check factors up to the square root plus a couple
  limit = sqrt(number+1)+1;

  //Test if number is 1 or 2
  if(number==1){return false;}
  else if(number==2){return true;}
  else if(number < 1){return false;}
  else {
    //for all other numbers, it will test by dividing the number by every other number
      while( i < limit ) {
          if( number % i == 0 ){
            return false;
          }
          i++;
      }
      //If the while loop didn't find any factors, then it must be prime
      return true;

  }
}
