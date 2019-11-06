package br.com.projuris.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.projuris.MyFindChar;

@RestController
@RequestMapping("/api/findcharachter")
public class MyFindCharResource {
	
	@GetMapping("/{word}")
	public char get (@PathVariable String word) {	
		MyFindChar myFindChar = new MyFindChar();
		
		return myFindChar.findChar(word);		
	}

}
