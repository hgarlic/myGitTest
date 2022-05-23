package ch19;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//GUI 관련 클래스
class ServerScreen extends JFrame { 
	JTextArea ta;
	JTextField tf;
	
	public ServerScreen() {
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("채팅방 서버!");
		setLayout(new BorderLayout());
		JLabel label = new JLabel("This is a server!");
		add(label, BorderLayout.NORTH);
		setVisible(true);
	}
}

public class MultiChatServer {
	HashMap userMap;
	
	public MultiChatServer() {
		userMap = new HashMap<>();
		Collections.synchronizedMap(userMap);
	}
	public static void main(String[] args) {
		new ServerScreen();//화면만 띄움
		new MultiChatServer().serviceStart(); //서비스 개시
	}
	public void serviceStart() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다.");
			while(true) {
				//클라이언트의 접속을 기다리다가 접속하면 접속을 허가함(accept) ==> 통신용 소켓이 생성됨
				socket = serverSocket.accept(); //접속대기상태
				System.out.println("[" + socket.getInetAddress()+"]" + "에서 접속하셨습니다.");
				
				ServerReceiver receviveThread = new ServerReceiver(socket);
				receviveThread.start();
				System.out.println("현재 실행중인 쓰레드 이름 : " + receviveThread.getName());
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} //serviceStart();
	
	//현재 접속중인 모든 사용자에게 메세지를 전송하기 위한 기능 구현
	void sendToAll(String msg) {
		Iterator it = userMap.keySet().iterator(); 
		//메세지를 받아서 일괄적으로 전송하기 위해(HashMap에서 key값들의 집합을 return받는 것
		
		while(it.hasNext()) {
			try {
				//메시지 전송을 위한 출력 스트림 생성
				DataOutputStream out = (DataOutputStream)userMap.get(it.next());
				out.writeUTF(msg); //메세지를 전송해줌
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	} //sendToAll()
	//메세지 수신관련 클래스
	class ServerReceiver extends Thread {	
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				// 데이터 통신을 위한 입출력 스트림 생성
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				System.out.println("ServerReceiver 소켓 IO 에러");
			}
		} //ServerReceiver()
		@Override
		public void run() {
			String name = "";
			try {
				name = in.readUTF(); //utf방식으로 메세지를 수신
				sendToAll("#" + name + "님이 들어오셨습니다."); //메세지 보내기
				userMap.put(name, out);//hash맵에 사용자 추가
				System.out.println("현재 접속자 수는 " + userMap.size() +"입니다.");
				while(in != null) {
					//받은 메시지를 모든 사용자에게 보냄
					sendToAll(in.readUTF());
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				//대화방을 나간 사용자의 정보 출력
				sendToAll("#" + name + "님이 나가셨습니다.");
				userMap.remove(name); //hashmap에서 제거
				System.out.println("[" + socket.getInetAddress()+ ":" + socket.getPort() + "] 에서 접속을 종료함");
				System.out.println("현재 접속자 수는 " + userMap.size() + "입니다.");
			}
		} //run()
	} //ServerReceiver
}


