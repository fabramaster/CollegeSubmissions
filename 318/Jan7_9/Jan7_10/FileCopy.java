/*
 * Program demonstrating IO Streams for performing
 * byte-oriented IO.
 */

import java.io.*;


public class FileCopy
{
	public static void main(String[] args) throws IOException {
		InputStream inFile = null;
		OutputStream outFile = null;

		if (args.length != 2) {
			System.err.println("Usage: java FileCopy <input file> <output file>");
			System.exit(0);
		}

		try {
			inFile = new FileInputStream(args[0]);
			outFile = new FileOutputStream(args[1]);

			/*
			 * AS A SERIES of 1 KB READS.
			 * Although it could be any size read.
             */

			byte[] bytesTwo = new byte[1024];
			int bytesRead = 0;

			while ( (bytesRead = inFile.read(bytesTwo)) > 0)
				outFile.write(bytesTwo,0,bytesRead);
		}
		catch (FileNotFoundException fnfe) {
			System.err.println("File " + args[0] + " not found.");
		}
		finally {
			if (inFile != null)
				inFile.close();
			if (outFile != null)
				outFile.close();
		}
	}
}

