package cn.dao;

import java.io.*;

public class ToolForFile {
	public static void Create(String path) {
		File file = new File(path);
		if(file.exists()) {
			return;
		}else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
