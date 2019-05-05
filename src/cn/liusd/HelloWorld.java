package cn.liusd;

import cn.dao.*;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		ToolForConnect.Show();
		System.out.println(ToolForCalculation.addition(1, 2));
	}
}
