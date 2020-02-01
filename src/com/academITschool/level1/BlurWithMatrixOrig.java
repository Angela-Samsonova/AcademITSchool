package com.academITschool.level1;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class BlurWithMatrixOrig {
    public static void main(String[] args) throws IOException {
        BufferedImage initialImage = ImageIO.read(new File("image.jpg"));
        WritableRaster initialImageRaster = initialImage.getRaster();

        BufferedImage resultingImage = new BufferedImage(initialImageRaster.getWidth(), initialImageRaster.getHeight(), BufferedImage.TYPE_INT_RGB);
        WritableRaster resultingImageRaster = resultingImage.getRaster();

        int width = initialImageRaster.getWidth() - 1;
        int height = initialImageRaster.getHeight() - 1;

        final int COLORS_COUNT_IN_RGB = 3;

        int[] initialImagePixel = new int[COLORS_COUNT_IN_RGB];
        double[] resultingImagePixel = new double[COLORS_COUNT_IN_RGB];

        int matrixSize = 5;
        int halfOfMatrixSize = matrixSize / 2;

        double coefficient = 1.0 / (matrixSize * matrixSize);

        double[][] matrix = new double[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = coefficient;
            }
        }

        for (int y = halfOfMatrixSize; y < height - halfOfMatrixSize; y++) {
            for (int x = halfOfMatrixSize; x < width - halfOfMatrixSize; x++) {
                double sumOfRed = 0;
                double sumOfGreen = 0;
                double sumOfBlue = 0;

                int countY = 0;
                int countX = 0;

                for (int m = y - halfOfMatrixSize; m <= y + halfOfMatrixSize; ++m) {
                    for (int n = x - halfOfMatrixSize; n <= x + halfOfMatrixSize; ++n) {
                        initialImageRaster.getPixel(n, m, initialImagePixel);

                        sumOfRed += initialImagePixel[0] * matrix[countY][countX];
                        sumOfGreen += initialImagePixel[1] * matrix[countY][countX];
                        sumOfBlue += initialImagePixel[2] * matrix[countY][countX];

                        if (countX < matrixSize - 1) {
                            countX++;
                        } else {
                            countX = 0;
                        }
                    }

                    if (countY < matrixSize - 1) {
                        countY++;
                    } else {
                        countY = 0;
                    }
                }

                if (sumOfRed < 0) {
                    resultingImagePixel[0] = 0;
                } else if (sumOfRed > 255) {
                    resultingImagePixel[0] = 255;
                } else {
                    resultingImagePixel[0] = sumOfRed;
                }

                if (sumOfGreen < 0) {
                    resultingImagePixel[1] = 0;
                } else if (sumOfGreen > 255) {
                    resultingImagePixel[1] = 255;
                } else {
                    resultingImagePixel[1] = sumOfGreen;
                }

                if (sumOfBlue < 0) {
                    resultingImagePixel[2] = 0;
                } else if (sumOfBlue > 255) {
                    resultingImagePixel[2] = 255;
                } else {
                    resultingImagePixel[2] = sumOfBlue;
                }

                resultingImageRaster.setPixel(x, y, resultingImagePixel);
            }
        }

        ImageIO.write(resultingImage, "png", new File("out.png"));
    }
}






