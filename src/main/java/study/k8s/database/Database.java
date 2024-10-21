package study.k8s.database;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Package: study.k8s.database
 * Created: Devonshin
 * Date: 19/10/2024
 */

@Configuration
@ConfigurationProperties(prefix = "database")
public class Database {

	private String ip;
	private String port;
	private String username;
	private String password;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Database [ip=" + ip + ", port=" + port + ", username=" + username + ", password=" + password;
	}

}
