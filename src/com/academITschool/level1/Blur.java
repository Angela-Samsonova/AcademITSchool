package com.academITschool.level1;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blur {
    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("image.jpg"));

        WritableRaster raster = image.getRaster();

        int width = raster.getWidth();
        int height = raster.getHeight();

        final int COLORS_COUNT_IN_RGB = 3;

        int[] pixel = new int[COLORS_COUNT_IN_RGB];

        double coefficient = 1.0 / 9;

        for (int y = 1; y < height - 1; ++y) {
            for (int x = 1; x < width - 1; ++x) {
                raster.getPixel(x, y, pixel);

                double sumOfRed = 0;
                double sumOfGreen = 0;
                double sumOfBlue = 0;

                for (int i = (x - 1); i <= (x + 1); ++i) {
                    for (int j = (y - 1); j <= (y + 1); ++j) {
                        raster.getPixel(i, j, pixel);

                        sumOfRed += pixel[0];
                        sumOfGreen += pixel[1];
                        sumOfBlue += pixel[2];
                    }
                }

                pixel[0] = (int) (sumOfRed * coefficient);
                pixel[1] = (int) (sumOfGreen * coefficient);
                pixel[2] = (int) (sumOfBlue * coefficient);

                raster.setPixel(x, y, pixel);
            }
        }

        ImageIO.write(image, "png", new File("out.png"));
    }
}
