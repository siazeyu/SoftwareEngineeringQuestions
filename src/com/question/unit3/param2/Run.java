package com.question.unit3.param2;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class Run {
    public static void main(String[] args) {

        JpgReaderFactory jpgReaderFactory = new JpgReaderFactory();
        GifReaderFactory gifReaderFactory = new GifReaderFactory();

        ImageReader jpg = jpgReaderFactory.createImageReader();
        ImageReader gif = gifReaderFactory.createImageReader();

        jpg.readImage();
        gif.readImage();
    }
}
