package c1_fundamentals.c1_3_bags_queues_stacks;


import java.io.File;

public class FileList {
	private Queue<File> d = new Queue<File>();;
	
	public void readFile(File file){ 
		for(File f : file.listFiles()){
			if(f.isDirectory()){
				d.enqueue(f);
				readFile(f);
			}else
				d.enqueue(f);
		}
	}
	public void outputFile(File file){
		readFile(file);
		d.print();
	}
}
