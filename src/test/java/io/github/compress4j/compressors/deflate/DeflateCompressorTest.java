package io.github.compress4j.compressors.deflate;

import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class DeflateCompressorTest {
    @Test
    void shouldWritePathEntryDefaultCompression() throws Exception {

        //given
        var outputStream = mock(OutputStream.class);
        final Path tempSourceFile1 = mock(Path.class);

        //when
        try(DeflateCompressor deflateCompressor = new DeflateCompressor.DeflateCompressorBuilder(outputStream)
                .compressorOutputStreamBuilder()
                .parentBuilder()
                .build();
        MockedStatic<Files>mockFiles = mockStatic(Files.class);
        ){
            deflateCompressor.write(tempSourceFile1);

            //then
            mockFiles.verify(() -> Files.copy(any(Path.class), any(OutputStream.class)));
        }
    }

}