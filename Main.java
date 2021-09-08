class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int totalNumberofMM = 55*11;
    double countBlue = totalNumberofMM * .24;
    System.out.println("Blue : " + countBlue);
    
    double countBrown= totalNumberofMM * .13;
    System.out.println("Brown : " + countBrown);
   
    double countGreen= totalNumberofMM * .16;
    System.out.println("Green : " + countGreen);
    
    double countOrange= totalNumberofMM * .20;
    System.out.println("Orange : " + countOrange);
    
    double countRed= totalNumberofMM * .13;
    System.out.println("Red : " + countRed);

    double countYellow= totalNumberofMM * .14;
    System.out.println("yellow : " + countYellow);

    double sumColors = countBlue + countBrown + countGreen+ countOrange+ countRed+ countYellow;
   
    System.out.println("Sum : "+ sumColors);


    if ( countBlue < countBrown && countRed > countOrange)
     System.out.println("Blue under Brown and Red over Orange");
    if ( countBrown >= countGreen)
     System.out.println( "Brown is greater than or equal to Green");
    if ( sumColors == totalNumberofMM)
     System.out.println("Numbers match");

  }
}