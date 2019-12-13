package com.kaebit.diary;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

abstract class Menu {
	String first = "글 쓰기";
	String two = "종료";
	
	abstract void menu();
}

class DiaryMenu extends Menu {

	@Override
	void menu() {
		System.out.println("1. " + first);
		System.out.println("2. " + two);
	}
	
}



class Diary {
	private int id;
	private String title;
	private String content;
	private String date;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	Diary() {
		this.date = sdf.format(new Date());
	}
	
	Diary(int id, String title, String content, String date) {
		this.title = title;
		this.content = content;
		this.date = date;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getDate() {
		return date;
	}
	
	public int getId() {
		return id;
	}
}


public class DiaryProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Diary[] diary = new Diary[100];
			int i = 1;
			int num;
			String title;
			String content;
			Scanner input = new Scanner(System.in);
	
			System.out.println("--- ���̾ ������Ʈ ---");
			System.out.println("1. �� ����");
			System.out.println("2. ����");
			System.out.println("--------------------");
			
			num = input.nextInt();
			
	
			if(num == 1) { 
				diary[0] = new Diary(0, "�׽�Ʈ ��", "�׽�Ʈ ����", "2000-00-00");
				while(true) {
					System.out.println("----- �� ���� -----");
					
					while(true) {
						diary[i-1] = new Diary();
						System.out.print("���� : ");
						title = input.nextLine();
						System.out.println(title);
						
						if(title.length() > 1) {
							diary[i-1].setTitle(title);
							break;
						}
						
						System.out.println("������ �Է����ּ���.");
					}
					
					while(true) {
						System.out.println();
						System.out.print("���� : ");
						content = input.nextLine();
						
						if(content.length() > 1) {
							diary[i-1].setContent(content);
							break;
						}
						
						System.out.println("������ �Է����ּ���");
					}
					
					diary[i-1].setId(i);
					
					System.out.println("���̾�� �ۼ��Ǿ����ϴ�.");
					System.out.println("------ ���� ------");
					System.out.println("�� ��ȣ : " + diary[i-1].getId());
					System.out.println("���� : " + diary[i-1].getTitle());
					System.out.println("���� : " + diary[i-1].getContent());
					System.out.println("��¥ : " + diary[i-1].getDate());
					
					System.out.println("----------------");
					System.out.println("�� �ۼ��� ��ġ�� �����ôٸ� 1�� �Է����ּ���.");
					System.out.println("�ٸ� Ű �Է½� �� �ۼ��� ��ӵ˴ϴ�.");
					int stop = input.nextInt();
					
					if(stop == 1) {
						break;
					}
					i += 1;
				}
				for(int a = 0; a < i; a++) {
					System.out.println("----------------");
					System.out.println("�� ��ȣ : " + diary[a].getId());
					System.out.println("���� : " + diary[a].getTitle());
					System.out.println("���� : " + diary[a].getContent());
					System.out.println("��¥ : " + diary[a].getDate());
					System.out.println("----------------");
				}
			}
			System.out.println("���α׷��� �����մϴ�.");
		}

}