package problem04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static File file = null;
	public static void main(String[] args) {
		
		int count = 0;
		int[] randomNumArray = randomStart(); // 초기에 생성 랜덤
		System.out.println(Arrays.toString(randomNumArray));
		while (true) {
			long start = System.currentTimeMillis();

			count++;
			int ball = 0;
			int strike = 0;
			int outCount=0;
			int out =0;
			int[] inputNumArray = inputArray(); // 입력 받은 숫자
			System.out.println(Arrays.toString(inputNumArray));
			for (int i = 0; i < 3; i++) {
				outCount=0;
				for (int j = 0; j < 3; j++) {
					
					if (inputNumArray[i] == randomNumArray[j]) {

						if (i == j) {
							strike++;
							break;
						} else {
							ball++;
							break;
						}
						
					}else {outCount++;}
					if(outCount==3) {out++;}
				}
			}
			System.out.println(count + "- S:"+strike+", B:"+ball+", O:"+out);
			if(strike==3) {
				long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
				long time = (long) ((end - start )/1000.0); //실행 시간 계산 및 출력
				try {
					OutputStream output = new FileOutputStream("C:/file/result.txt");
					String text = new String("/"+time+count);
					output.write(text.getBytes());
					output.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}
		
	}

	public static int[] randomStart() {
		int[] randomNum = new int[3];
		Random rd = new Random();
		int num;
		String numString = null;
		try {
			OutputStream output = new FileOutputStream("C:/file/result.txt");
			for (int i = 0; i < randomNum.length; i++) {
				num = rd.nextInt(10);
				numString += String.valueOf(num);
				randomNum[i] = num;
			}
			output.write(numString.getBytes());
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return randomNum;
	}

	public static int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		int[] inputNum = new int[3];
		String inputString;
		inputString = sc.nextLine();
		for (int i = 0; i < 3; i++) {
			inputNum[i] =  inputString.charAt(i)-'0';
		}
		return inputNum;
	}
}