## Ridimensionare un'immagine

```java
Image image = ...;
BufferedImage scaled =
new BufferedImage((int) (w *scale), (int) (h* scale), image.getType());
AffineTransform at = AffineTransform.getScaleInstance(scale, scale);
Graphics2D g2d = (Graphics2D) scaled.getGraphics();
g2d.drawImage(image,
new AffineTransformOp(at, AffineTransformOp.TYPE_NEAREST_NEIGHBOR), 0, 0);
image = scaled;
```

## Creare un file compresso in formato ZIP


```java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
public class Main {
public void createZipFile() {
try {
String inputFileName = “miofile.txt”;
String zipFileName = “miofilecompresso.zip”;
//Creare gli stream d’input e output
FileInputStream inStream = new FileInputStream(inputFileName);
ZipOutputStream outStream = new ZipOutputStream(new FileOutputStream(zipFileName));
// Aggiungere un oggetto ZipEntry allo stream d’output
outStream.putNextEntry(new ZipEntry(inputFileName));
byte[] buffer = new byte[1024];
int bytesRead;
//Ciascuna porzione di dati letti dallo stream di input
//viene scritta nello stream di output
while ((bytesRead = inStream.read(buffer)) > 0) {
outStream.write(buffer, 0, bytesRead);
}
outStream.closeEntry();
outStream.close();
inStream.close();
} catch (IOException ex) {
ex.printStackTrace();
}
}public static void main(String[] args) {
new Main().createZipFile();
}
}
```

## Occultare la password durante la digitazione


```java
import java.io.*;
public class HidePasswordFromCommandLine extends Thread {
boolean stopThread= false;
boolean hideInput= false;
boolean shortMomentGone= false;
public void run() {
try {
sleep(500);
} catch (InterruptedException e) {}
shortMomentGone= true;
while (!stopThread) {
if (hideInput) {
System.out.print("\b*");
}
try {
sleep(1);
} catch (InterruptedException e) {}
}
}
public static void main(String[] arguments) {
String name= "";
String password= "";
HidePasswordFromCommandLine hideThread= new HidePasswordFromCommandLine();
hideThread.start();
BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
try {
System.out.println("Name: ");
// Aspetta l'immissione dello username e pulisce il buffer della tastiera
do {
name= in.readLine();
}
while (hideThread.shortMomentGone == false);
//
// Nasconde il thread e sovrascrive l'input con "*"
hideThread.hideInput= true;
// Legge la password
System.out.println("\nPassword:");
System.out.print(" ");
password = in.readLine();
hideThread.stopThread= true;
}
catch (Exception e) {}
System.out.print("\b \b");
// Solo per testing, eliminare!
System.out.println("\n\nLogin= " + name);System.out.println("Password= " + password);
}
}
```

## Catturare una schermata


```java
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
...
public void captureScreen(String fileName) throws Exception {
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
Rectangle screenRectangle = new Rectangle(screenSize);
Robot robot = new Robot();
BufferedImage image = robot.createScreenCapture(screenRectangle);
ImageIO.write(
