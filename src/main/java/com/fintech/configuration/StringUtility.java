package com.fintech.configuration;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.nio.charset.StandardCharsets;


@NoArgsConstructor(access= AccessLevel.PRIVATE)
public class StringUtility {
    public static byte[] getByteFromUTF8EncodedString(String entry) {
        return entry.getBytes(StandardCharsets.UTF_8);
    }

    public static String getStringFormUTF8EncodedString(byte[] entry) {
        return new String(entry, StandardCharsets.UTF_8);
    }

    public static boolean isNullOrEmpty(String string) {
        return string == null || string.trim().isEmpty(); // string.isBlank(); Before changing
    }


    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static boolean isNotEmpty(final CharSequence cs) {
        return !isEmpty(cs);
    }
}
