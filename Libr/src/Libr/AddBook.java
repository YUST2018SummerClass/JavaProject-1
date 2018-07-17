package Libr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AddBook extends Program {
public void add(){
		
		FileWriter id=null;			//�Է��� å�� �������� �ؽ�Ʈ�� ����
		FileWriter name=null;
		FileWriter author=null;
				
		
		try{
			
			System.out.println("�߰��� å id�Է�");
			input = scan.nextLine();
			
			String abpath = this.path+input+"\\";		//������ �Է��� ������ �ʿ��� ��θ� ������ ����ؼ� �����ϰ� ǥ��
			
			File book = new File(abpath); 				//���ϸ��� å�� code�� ����
			
			if(book.exists()){							//å�� �̹��ִٸ�
				System.out.println("�̹� ��ϵ��ִ� å �Դϴ�");	//���
			}else{
				if(!book.mkdir())
					System.out.println("���͸� ���� ����");
			
				id = new FileWriter(abpath+"id.txt");
				id.write(input);
			
				
				System.out.println("å �̸� �Է�");			//å�� ������ �Է� �޾� ���� �̸��� ī�װ�, ������ �ؽ�Ʈ �ȿ� ����
				input = scan.nextLine();

				name = new FileWriter(abpath+"name.txt");
				name.write(input);
			
				
				System.out.println("���� �Է�");
				input = scan.nextLine();
			
				author = new FileWriter(abpath+"author.txt");
				author.write(input);
				
			
				
			id.close();
			name.close();
			author.close();
			
			
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
