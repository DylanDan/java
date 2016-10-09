package com.dylan.java.spring.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SpringUtil {
	
	public static byte[] getContext(String path) throws IOException{
		
		
		File file = new File(path);
		
		Path pp = Paths.get(file.getAbsolutePath());
		
		return Files.readAllBytes(pp);	
	}

}
