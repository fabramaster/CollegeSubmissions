/**
 *
 * A simple program demonstrating java.io.Reader
 * which is used for reading character files.
 *
 */


import java.io.*;

public class ReadFile
{
	public static void main(String[] args) throws java.io.IOException {
		String line;
		int lineNum = 0;
                BufferedReader inFile = null;

		if (args.length != 1) {
			System.err.println("Usage: java ReadFile <file>");
			System.exit(0);
		}

		try {
			inFile = new BufferedReader(new FileReader(args[0]));

			while( (line = inFile.readLine()) != null)
				System.out.println(lineNum++ + ": " + line);
		}
		catch (java.io.FileNotFoundException fnfe) {
			System.err.println(fnfe);
		}
        finally {
                    if (inFile != null)
                        inFile.close();
                }
	}
}
