package com.question.unit3.param2;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class GifReader implements ImageReader{
    @Override
    public void readImage() {
        System.out.println("读取GIF图片");
    }
}
