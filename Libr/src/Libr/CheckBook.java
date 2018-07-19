package Libr;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckBook extends Program {
	public void check(){
		File library = new File("c:\\tmp\\library");
		File[] booklist = library.listFiles();
		
		FileReader IFRead = null;
	
		
		try{
		
			for(int i=0; i<booklist.length; i++){
				File[] bookIF = booklist[i].listFiles();
				File[] IFtemp = booklist[i].listFiles(); //���ϵ��� ������ �ٲٱ� ���� ����
				String[] filename = booklist[i].list();  //���ϵ��� �̸��� ��� å�� �� �Ȱ��� ������ ���뺸�� �̸����� ������ ���Ѵ�
				String[] nameprint = {"������ȣ", "����", "����"};
				
				
				
				for(int j=0; j<bookIF.length; j++){ 		 //id, name, author������� ������ ���� �۾�
					if(filename[j].equals("id.txt")){
						bookIF[0]=IFtemp[j];
					}else if(filename[j].equals("name.txt")){
						bookIF[1]=IFtemp[j];
					}else if(filename[j].equals("author.txt")){						
						bookIF[2]=IFtemp[j];
					}
					
				} 
				
				System.out.print("å (");	
				
				for(int j=0; j<bookIF.length; j++){
					IFRead = new FileReader(bookIF[j]);
					
					System.out.printf(nameprint[j]+"=");
				
					int c;
					while ((c = IFRead.read())!= -1){
						System.out.print((char)c);;
					}	
					
					if(!(j+1==bookIF.length))		 //������ ����� �׸��� �ִ��� Ȯ��
						System.out.print(", ");		//���� ��쿡�� ', '�� ������� �ʴ´�
					
					IFRead.close();					
				}
				System.out.printf(")\n");
			}	
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
