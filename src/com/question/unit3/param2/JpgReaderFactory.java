package com.question.unit3.param2;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class JpgReaderFactory implements ImageReaderFactory{

    @Override
    public ImageReader createImageReader() {
        return new JpgReader();
    }
}
