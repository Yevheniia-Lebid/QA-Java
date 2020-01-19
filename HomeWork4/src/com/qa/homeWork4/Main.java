package com.qa.homeWork4;

public class Main {

    public static void main(String[] args) {
        System.out.println(getUniqueSymbols("Yevheniia"));
        System.out.println(convertIntToBinary(98));
    }
    public static String getUniqueSymbols(String str){
      String result = "";
      int counter = 0;
      String currentStr = "";
      while (counter < str.length()){
          currentStr = str.substring(counter, counter+1);
          if(counter == 0){
              result = currentStr;
          } else{
             if (-1 == result.indexOf(currentStr)){
               result = result + currentStr;
             }
          }
          counter++;
      }
      return result;
    }
//    ********Task2*******

    public static String convertIntToBinary(int number){
       String result = "";
       int restOfInt = number;
       int tempResult = 0;
       while (restOfInt > 0){
            tempResult = restOfInt % 2;
            restOfInt = (int)(restOfInt/2);
            result = tempResult + result;
       }
       return result;
    }
}
