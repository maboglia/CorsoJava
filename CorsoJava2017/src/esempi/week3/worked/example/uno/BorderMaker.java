package esempi.week3.worked.example.uno;



public class BorderMaker
{
   public static void main(String[] args)
   {
      Picture pic = new Picture();
      pic.load("images/image010.jpg");
      int newWidth = pic.getWidth() - 40;
      int newHeight = pic.getHeight() - 40;
      pic.scale(newWidth, newHeight);
      pic.move(20, 20);
      pic.border(10);
   }
}
