package com.codeessay.code;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;  // main one
import static org.assertj.core.api.Assertions.atIndex; // for List assertions
import static org.assertj.core.api.Assertions.entry;  // for Map assertions
import static org.assertj.core.api.Assertions.tuple; // when extracting several properties at once
import static org.assertj.core.api.Assertions.fail; // use when writing exception tests
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown; // idem
import static org.assertj.core.api.Assertions.filter; // for Iterable/Array assertions
import static org.assertj.core.api.Assertions.offset; // for floating number assertions
import static org.assertj.core.api.Assertions.anyOf; // use with Condition
import static org.assertj.core.api.Assertions.contentOf; // use with File assertions

public class TheLongestSubStringWithDiffrenteLettersTest {

    TheLongestSubStringWithDiffrenteLetters m = new TheLongestSubStringWithDiffrenteLetters();

    @Test
    public void theLongestSubString() {
         assertThat(m.theLongestSubString(null).isEmpty());
         assertThat(m.theLongestSubString("").isEmpty());
         assertThat(m.theLongestSubString("a").contains("a"));
         assertThat(m.theLongestSubString("abcdefg").contains("abcdefg"));
         assertThat(m.theLongestSubString("abcdefga").contains("abcdefg"));
         assertThat(m.theLongestSubString("abcdefga").contains("bcdefga"));

         assertThat(m.theLongestSubString("xyzabcdefg123456789a").contains("xyzabcdefg123456789"));
    }
}