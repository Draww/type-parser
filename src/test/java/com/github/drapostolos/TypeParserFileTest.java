package com.github.drapostolos;

import java.io.File;

import org.junit.Test;

public class TypeParserFileTest extends AbstractTestHelper{
    
    public TypeParserFileTest() {
        super(File.class);
    }

    @Test
    public void canParseStringToFileType() throws Exception {
        assertThat("/path/to").isParsedTo(new File("/path/to"));
    }

}
