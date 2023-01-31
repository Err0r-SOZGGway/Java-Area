package ioTest;

import java.io.File;

public class Sample {

	public static void main(String[] args) {
		String root = ".";

		File rootDir = new File(root);
		System.out.println("探索開始するディレクトリ：" + rootDir.getAbsolutePath());

		Sample obj = new Sample();
		obj.navigate(rootDir);
	}

	public void navigate(File dir) {
		System.out.println("");
		System.out.println("探索中のディレクトリ：" + dir);

		String[] contents = dir.list();
		for (int i = 0; i < contents.length; i++) {
			System.out.println(contents[i]);
			File child = new File(dir, contents[i]);

			if (child.isDirectory()) {
				navigate(child);
			}
		}
	}

}
