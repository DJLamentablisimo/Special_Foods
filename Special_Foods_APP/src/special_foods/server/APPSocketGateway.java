package special_foods.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.StringTokenizer;
import java.util.ArrayList;

import special_foods.server.data.domain.Product;
import special_foods.server.data.remote.*;
import special_foods.server.data.services.ArrayList;
import special_foods.server.data.services.List;

public class APPSocketGateway {
	private static APPSocketGateway instance;
	private String serverIP;
	private int serverPort;
	private static String DELIMITER = "#";
	
	private List<Product> products = new ArrayList<Product>();

	products.add(new Product("Zanahoria", "Hortaliza naranja y alargada", "Eustaquio Habichuela", "", 10, 2));
	products.add(new Product("Zanahoria Dorada", "Hortaliza dorada y alargada", "Eustaquio Habichuela", "", 10, 2));

	private APPSocketGateway(String servIP, int servPort) {
		serverIP = servIP;
		serverPort = servPort;
	}
	
	public static APPSocketGateway getInstance() {
		if (instance == null) {
			instance = new APPSocketGateway("127.0.0.1", 35600);
		}
		return instance;
	}
	
	public boolean downloadInfo() {
		
	for (int i = 0; i < products...)
		try (Socket socket = new Socket(serverIP, serverPort);
				//Streams to send and receive information are created from the Socket
				DataInputStream in = new DataInputStream(socket.getInputStream());
				DataOutputStream out = new DataOutputStream(socket.getOutputStream())) {
				
				//Send request (one String) to the server
				out.writeUTF(message);
				System.out.println(" - Sending data to '" + socket.getInetAddress().getHostAddress() + ":" + socket.getPort() + "' -> '" + message + "'");
				
				//Read response (one String) from the server
				result = in.readUTF();			
				System.out.println(" - Download information from '" + socket.getInetAddress().getHostAddress() + ":" + socket.getPort() + "' -> '" + result + "'");
				tokenizer = new StringTokenizer(result, DELIMITER);

				
				)

	
}
