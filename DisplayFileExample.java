// import statement  
	import java.io.*;  
	import java.io.IOException;
	import java.nio.file.*;
	import java.util.List;

	public class DisplayFileExample  
	{  
		public static void printFileNames()  { 

			File f = null;
			String[] paths;
			
            
			try {    
      
				 // create new file
				 f = new File("C:\\Users\\N3431\\Desktop\\java tutorial");
										 
				 // array of files and directory
				 paths = f.list();
					
				 // for each name in the path array
				 for(String path:paths) {
				 
					// prints filename and directory name
					System.out.println(path);
				 }
				 
			} catch(Exception e) {
				 // if any error occurs
				 e.printStackTrace();
			 }
		}


	public static void newFile(){
        String strPath = "", strName = "";
  
        // Try-catch Block
        try {
  
            // Creating BufferedReadered object
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
            System.out.println("Enter the file name:");
  
            // Reading File name
            strName = br.readLine();
            System.out.println("Enter the file path:");
  
            // Reading File Path
            strPath = br.readLine();
  
            // Creating File Object
            File file1 = new File(strPath + "" + strName + ".txt");
  
            // Method createNewFile() method creates blank
            // file.
            file1.createNewFile();
			System.out.println("File created successfully");
        }
  
        // Try-Catch Block
        catch (IOException ex1) {
			System.out.println("File creation failed");
        }
    }
	
	
	public static void delFile(){
        String strPath = "", strName = "";		
  
        try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// Reading File name
			System.out.println("Enter the file name:");  
			strName = br.readLine();
				
			// Reading File Path
			System.out.println("Enter the file path:");
			strPath = br.readLine();
			
			// create full path
			File file1 = new File(strPath + "" + strName + ".txt");
				
			if (file1.delete()) { 
				System.out.println("Deleted the file: " + file1.getName());
			} else {
				System.out.println("Failed to delete the file.");
			} 	
			
        }
        catch (NoSuchFileException e) {
            System.out.println(
                "No such file/directory exists");
        }
        catch (DirectoryNotEmptyException e) {
            System.out.println("Directory is not empty.");
        }
        catch (IOException e) {
            System.out.println("Invalid permissions.");
        }
 
        System.out.println("Deletion successful.");
    }
	
	//search file 
	
	public static void searchFile(){
		
		String strName ="";
		String strPath ="";
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// Reading File name
			System.out.println("Enter the file name:");  
			strName = br.readLine();
					
			// Reading File Path
			System.out.println("Enter the file path:");
			strPath = br.readLine();
			
			// Create an object of the File class
			// Replace the file path with path of the directory
			File directory = new File(strPath);
	  
			// store all names with same name
			// with/without extension
			String[] flist = directory.list();
			int flag = 0;
			if (flist == null) {
				System.out.println("Empty directory.");
			}
			else {
	  
				// Linear search in the array
				for (int i = 0; i < flist.length; i++) {
					String filename = flist[i];
					if (filename.equalsIgnoreCase(strName)) {
						System.out.println(filename + " found");
						flag = 1;
					}
				}
			}
	  
			if (flag == 0) {
				System.out.println("File Not Found");
			}
		}catch (IOException e) {
            System.out.println("Invalid permissions.");
        }
	}
	
	
		
	// Main Method  
	public static void main(String[] args)  
		{  
		
			//newFile();
			//delFile();
			searchFile();
			//printFileNames();
			 
			 
		}  
	}  
	
	