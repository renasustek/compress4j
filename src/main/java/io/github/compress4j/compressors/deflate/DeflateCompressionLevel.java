package io.github.compress4j.compressors.deflate;

/**
 * Defines constants for Deflate compression levels and strategies.
 * These values are standard for the deflate algorithm.
 */
public enum DeflateCompressionLevel {
    // Compression Levels
    /**
     * Compression level for no compression.
     */
    NO_COMPRESSION(0), // Corresponds to Deflater.NO_COMPRESSION

    /**
     * Compression level for fastest compression.
     */
    BEST_SPEED(1), // Corresponds to Deflater.BEST_SPEED

    /**
     * Compression level for best compression.
     */
    BEST_COMPRESSION(9), // Corresponds to Deflater.BEST_COMPRESSION

    /**
     * Default compression level.
     */
    DEFAULT_COMPRESSION(-1), // Corresponds to Deflater.DEFAULT_COMPRESSION

    // Compression Strategies
    /**
     * Compression strategy best used for data consisting mostly of small
     * values with a somewhat random distribution. Forces more Huffman coding
     * and less string matching.
     */
    FILTERED(1), // Corresponds to Deflater.FILTERED

    /**
     * Compression strategy for Huffman coding only.
     */
    HUFFMAN_ONLY(2), // Corresponds to Deflater.HUFFMAN_ONLY

    /**
     * Default compression strategy.
     */
    DEFAULT_STRATEGY(0); // Corresponds to Deflater.DEFAULT_STRATEGY

    // Note: Constants like 'DEFLATED' (compression method) and flush modes
    // (NO_FLUSH, SYNC_FLUSH, FULL_FLUSH, FINISH) are typically part of the
    // Deflater class itself and describe behavior or methods, not
    // compression levels or strategies. This enum focuses specifically
    // on the level and strategy parameters.

    private final int value;

    /**
     * Private constructor for the enum constants.
     * @param value The integer value associated with the compression level or strategy.
     */
    DeflateCompressionLevel(int value) {
        this.value = value;
    }

    /**
     * Returns the integer value of the compression level or strategy.
     * @return The integer value.
     */
    public int getValue() {
        return value;
    }
}
