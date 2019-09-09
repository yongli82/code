package com.codeessay.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 求字符串中的最长不重复子字符串
 */
public class TheLongestSubStringWithDiffrenteLetters {

    public List<String> theLongestSubString(String original) {
        List<String> subList = new ArrayList<>();
        if (original == null || original.length() == 0) {
            return subList;
        }

        Set<Character> currentChars = new HashSet<>();
        int maxLength = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        while (rightIndex < original.length() - 1) {
            rightIndex++;
            char rightChar = original.charAt(rightIndex);
            //当前不重复的字符串结束
            if (currentChars.contains(rightChar) || rightIndex == original.length() - 1) {
                //有重复，记录原有最长字符串
                if (rightIndex - leftIndex >= maxLength) {
                    if (rightIndex - leftIndex > maxLength) {
                        subList.clear();
                    }

                    String sub = original.substring(leftIndex, rightIndex);
                    subList.add(sub);
                }

                //leftIndex移动一位
                leftIndex++;
            }
        }

        return subList;
    }
}
