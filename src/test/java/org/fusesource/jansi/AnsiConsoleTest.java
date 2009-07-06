package org.fusesource.jansi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class AnsiConsoleTest {

	public static void main(String[] args) throws IOException {
        PrintStream out = AnsiConsole.out;
        FileInputStream f = new FileInputStream("src/test/resources/smi-ar.ans");
        int c;
        while( (c=f.read())>=0 ) {
        	out.write(c);
        }
        f.close();
	}
	
}
