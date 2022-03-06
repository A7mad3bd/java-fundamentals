package bitmap;

import javax.imageio.ImageIO;
import java.awt.*;
import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {
    private final String InputPath;
    private final String OutputPath;
    private final String newFileName;
    private BufferedImage image = null;

    public Bitmap(String InputPath, String OutputPath, String newFileName) {
        this.InputPath = InputPath;
        this.OutputPath = OutputPath;
        this.newFileName = newFileName;
    }




    public boolean read_File() {
        try {
            File img = new File(this.InputPath);
            this.image = ImageIO.read(img);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean save_File() {
        try {
            File outputFile = new File(this.OutputPath + this.newFileName);
            ImageIO.write(this.image, "bmp", outputFile);
        } catch (IOException e) {
            System.out.println("File not found");
            return false;
        }
        return true;
    }

    //Transformation ->
    public boolean Gray_Scale() {
        int height = this.image.getHeight();
        int width = this.image.getWidth();

        for (int h = 1; h < height; h++) {
            for (int w = 1; w < width; w++) {
                int p = this.image.getRGB(w, h);
                int r = (p >> 16) & 0xff;
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;
                //      calculate avg color
                int avg = (r + g + b) / 3;
                //    replace RGB value with avg
                p = (avg << 24) | (avg << 16) | (avg << 8) | avg;
                this.image.setRGB(w, h, p);
            }
        }
        return true;
    }

    //Transformation
    public int imageFlipHorizontal() {
        int lastRGBVal = 0;
        int height = this.image.getHeight();
        int width = this.image.getWidth();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                this.image.setRGB((width - 1) - x, y, this.image.getRGB(x, y));
                lastRGBVal = this.image.getRGB(width - 1 - x, y);
            }
        }
        return lastRGBVal;
    }

    public boolean negativeImage() {
        int height = this.image.getHeight();
        int width = this.image.getWidth();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color color = new Color(this.image.getRGB(x, y), true);
                color = new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue());
                this.image.setRGB(x, y, color.getRGB());
            }
        }
        return true;
    }

    private static final int EXIT = 0;
    private static int Choice_Number;
    private static String fileToManipulate;
    private static String newFileName1;
    private static final Scanner scan = new Scanner(System.in);

    static void userInput() {
        int count = 0;
        System.out.println("Enter a Bitmap image to manipulate (here -> original) or 0 to exit: ");
        fileToManipulate = scan.nextLine();
        if (fileToManipulate.equals("0")) return;
        System.out.println("Enter a name for your new image (ex-> test): ");
        newFileName1 = scan.nextLine();
        do {
            System.out.println("Chose one of Transformation : \n" +
                    "1 -> Negative Image\n" +
                    "2 -> Flip Horizontal\n" +
                    "3 -> Gray-Scale\n" +
                    "0 : Exit\n");
            System.out.println("Enter Transformation Tybe (Number)");
            try {
                Choice_Number = Integer.parseInt(scan.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("You did not enter a number, please try again\n");
            }
        }
        while (true);
        System.out.println();
        manipulateBitmap();
    }

    private static void manipulateBitmap() {
        if (Choice_Number == EXIT) return;
        else {
            if (Choice_Number == 1 || Choice_Number == 2 || Choice_Number == 3) {
                setBitmapClass();
            } else System.out.println("\nNot a correct option\n");
        }
        userInput();

    }

    private static void setBitmapClass() {
        String imageFilePath = "C:\\Users\\Ahmad Abdallah\\Desktop\\401\\java-fundamentals\\java-fundamentals\\bitmap-transformer\\app\\src\\main\\resources\\" + fileToManipulate + ".bmp";
        String newFilePath = "C:\\Users\\Ahmad Abdallah\\Desktop\\401\\java-fundamentals\\java-fundamentals\\bitmap-transformer\\app\\src\\main\\resources\\";
        String newFile = newFileName1 + ".bmp";

        Bitmap newImage = new Bitmap(imageFilePath, newFilePath, newFile);
        newImage.read_File();

        if (Choice_Number == 1) {
            newImage.Gray_Scale();
        } else if (Choice_Number == 2) {
            newImage.imageFlipHorizontal();
        } else {
            newImage.negativeImage();
        }
        newImage.save_File();
        System.out.printf("%s created, viewable upon exit\n%n", newFileName1);

    }
}

