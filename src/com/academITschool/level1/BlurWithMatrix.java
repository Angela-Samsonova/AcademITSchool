package com.academITschool.level1;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class BlurWithMatrix {
    public static void main(String[] args) throws IOException {
        BufferedImage initialImage = ImageIO.read(new File("image.jpg"));
        WritableRaster initialImageRaster = initialImage.getRaster();

        int width = initialImageRaster.getWidth();
        int height = initialImageRaster.getHeight();

        BufferedImage resultingImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        WritableRaster resultingImageRaster = resultingImage.getRaster();

        final int COLORS_COUNT_IN_RGB = 3;

        int[] initialImagePixel = new int[COLORS_COUNT_IN_RGB];
        double[] resultingImagePixel = new double[COLORS_COUNT_IN_RGB];

        int matrixSize = 3;
        int halfOfMatrixSize = matrixSize / 2;

        double coefficient = 1.0 / (matrixSize * matrixSize);

        double[][] matrix = new double[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = coefficient;
            }
        }

        for (int y = halfOfMatrixSize; y <= (height - 1 - halfOfMatrixSize); y++) {
            for (int x = halfOfMatrixSize; x <= (width - 1 - halfOfMatrixSize); x++) {
                double sumOfRed = 0;
                double sumOfGreen = 0;
                double sumOfBlue = 0;

                int countY = 0;

                for (int m = y - halfOfMatrixSize; m <= y + halfOfMatrixSize; ++m) {
                    int countX = 0;

                    for (int n = x - halfOfMatrixSize; n <= x + halfOfMatrixSize; ++n) {
                        initialImageRaster.getPixel(n, m, initialImagePixel);

                        sumOfRed += initialImagePixel[0] * matrix[countY][countX];
                        sumOfGreen += initialImagePixel[1] * matrix[countY][countX];
                        sumOfBlue += initialImagePixel[2] * matrix[countY][countX];

                        countX++;
                    }

                    countY++;
                }

                resultingImagePixel[0] = sumOfRed;
                resultingImagePixel[1] = sumOfGreen;
                resultingImagePixel[2] = sumOfBlue;

                for (int k = 0; k < COLORS_COUNT_IN_RGB; k++) {
                    if (resultingImagePixel[k] < 0) {
                        resultingImagePixel[k] = 0;
                    } else if (resultingImagePixel[k] > 255) {
                        resultingImagePixel[k] = 255;
                    }
                }

                resultingImageRaster.setPixel(x, y, resultingImagePixel);
            }
        }

        ImageIO.write(resultingImage, "png", new File("out.png"));
    }
}






