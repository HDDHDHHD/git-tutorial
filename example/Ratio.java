public class Ratio {
  public static double calculate(double width, double height) {
    //Implemented
    if(width > height){
      return width/height;
    }
    else{
      return height/width;
    }
  }
}
