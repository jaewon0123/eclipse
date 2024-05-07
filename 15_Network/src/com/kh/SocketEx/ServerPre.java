package com.kh.SocketEx;
//채팅 시작 주최자
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPre {

	public static void main(String[] args) {
		try {
			ServerSocket s = new ServerSocket(12357);
			
			System.out.println("chat open");
			
			Socket b = s.accept();
			System.out.println("client success");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(b.getInputStream()));
			
			PrintWriter out = new PrintWriter(b.getOutputStream(), true);
			
			String m;
			
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m);
				
			}
			
			b.close();
			s.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
