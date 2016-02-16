package com.sob;

import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("E:\\yc.txt",true);
			fw.write("\nhello world");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if ( fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
