package com.arminik.nm.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException, InterruptedException {
		String var1 = "as";
		String var2 = "asdasd";
		String path = "scripts/deploy.sh";
		ProcessBuilder pb = new ProcessBuilder(path, var1);
		Process p = pb.start();
		p.waitFor();
		for(var x : p.getInputStream().readAllBytes()) {
			System.out.print((char)x);
		}
//		SpringApplication.run(Application.class, args);
	}

}
