package com.vti.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {
	public static boolean isFileExist(String pathFile) {
		File file = new File(pathFile);
		return file.exists();

	}

	public static boolean createFile(String pathFile) throws IOException {
		if (isFileExist(pathFile)) {
			throw new IOException("");
		} else {
			File file = new File(pathFile);
			return file.createNewFile();
		}
	}

	public static void downloadFile(String internetLink, String savePath) throws IOException {
		URL url = new URL(internetLink);
		Files.copy(url.openStream(), Paths.get(savePath, null));
	}

	public static void write(String path, Object object, boolean append) {
		File fileCopy = new File(path);
		if (!fileCopy.exists()) {
			fileCopy.createNewFile();
		}
		FileOutputStream fileOutPutStream = new FileOutputStream(fileCopy, append);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutPutStream);
		try {
			fileOutPutStream.write(object);
		} finally {
			fileOutPutStream.close();
		}
	}
}
