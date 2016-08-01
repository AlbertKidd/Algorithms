package c1_3_bags_queues_stacks;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import edu.princeton.cs.algs4.StdOut;

public class FileList {
	private List<File> d = new ArrayList<File>();;
	
	public void readFile(File file){ 
		for(File f : file.listFiles()){
			if(f.isDirectory()){
				d.add(f);
				readFile(f);
			}else
				d.add(f);
		}
	}
	public void outputFile(File file){
		readFile(file);
		StdOut.println(d);
	}
}
