package study.k8s.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: study.k8s.database
 * Created: Devonshin
 * Date: 19/10/2024
 */

@RestController
public class DatabaseController {

	@Autowired
	private Database database;

	@GetMapping("/database")
	@ResponseBody
	public ResponseEntity<String> getDatabase() {
		return ResponseEntity.ok(database.toString());
	}
}
