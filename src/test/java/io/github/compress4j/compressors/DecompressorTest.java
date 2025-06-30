/*
 * Copyright 2025 The Compress4J Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.compress4j.compressors;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.junit.jupiter.api.Test;

class DecompressorTest {
    @Test
    void inputStreamSameInClassAndBuilderClass() throws IOException {
        var inputStream = mock(CompressorInputStream.class);

        Decompressor.DecompressorBuilder decompressorBuilder = new Decompressor.DecompressorBuilder(inputStream) {
            @Override
            protected Decompressor.DecompressorBuilder getThis() {
                return this;
            }

            @Override
            public Decompressor build() throws IOException {
                return null;
            }
        };

        assertTrue(inputStream == decompressorBuilder.compressorInputStream);
    }
}
