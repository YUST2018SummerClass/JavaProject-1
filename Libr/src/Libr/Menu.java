package Libr;

import java.io.File;
import java.util.Scanner;

public class Menu {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		File library = new File("c:\\tmp\\library");	//��θ� �����Ѵ�. c����̺��� tmp��� ������ ����
		
		if(!library.exists()){
			if(!library.mkdir())
				System.out.println("���͸� ���� ����");
		}
		
		for(;;){
			System.out.println("---------------");
			System.out.println("��ȣ�� �Է��ϼ���");
			System.out.println("---------------");
			System.out.println("1. �����߰�");
			System.out.println("2. ��������");
			System.out.println("3. ������ȸ");
			System.out.println("4. ����");
			System.out.println("---------------");
			
			int menu = sc.nextInt();	
			
			Menu book = new Menu();
			
			switch(menu){
				case 1:			
					AddBook Abook = new AddBook();
					Abook.add();	
					break;
				case 2:
					DeleteBook Dbook = new DeleteBook();
					break;
				case 3:
					CheckBook Cbook = new CheckBook();
					break;
				case 4:
					System.out.println("���α׷��� �����մϴ�");
					break;
				default:
					System.out.println("1~4������ �޴��� ������ �ֽʽÿ�");
			}
			
			if(menu==4)
				break;
		}

	}

}
