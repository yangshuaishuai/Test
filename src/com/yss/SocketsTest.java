package com.yss;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class SocketsTest {
	public static void main(String[] args) throws Exception {

		InetAddress inetAddress = InetAddress.getLocalHost();
		System.out.println("计算机名称是：" + inetAddress.getHostName());
		System.out.println("计算机名称是：" + inetAddress.getHostName());
		byte[] byte1 = inetAddress.getAddress();
		System.out.println(Arrays.toString(byte1));
		System.out.println(224 - 127);
		byte[] b = new byte[] { (byte) 192, (byte) 168, (byte) 31, (byte) 221 };
		InetAddress inetAddress2 = InetAddress.getByAddress(b);
		// 180.97.33.107
		System.out.println(inetAddress2.getHostName());
		System.out.println("=================URl===========");
		UrlTest();
		System.out.println("=================URl2===========");
		getUrlCont();
	}

	public static void UrlTest() {

		try {
			// 创建一个URL
			URL url = new URL("http://www.imooc.com/video/2858");
			System.out.println("协议：" + url.getProtocol());
			System.out.println("主机" + url.getHost());
			System.out.println("端口号：" + url.getPort());
			System.out.println("文件路径：" + url.getPath());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public  static  String  getUrlCont(){
		try {
			URL url = new URL("http://www.imooc.com/video/2858");
			InputStream inputStream=url.openStream();
			InputStreamReader read=	new InputStreamReader(inputStream);
			BufferedReader bufferRead=new BufferedReader(read);
			String data=bufferRead.readLine();				
			while(data!=null)
			{
				System.out.println(data);	
				data=bufferRead.readLine();	
			}	
			read.close();
			bufferRead.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "";
	}

}
