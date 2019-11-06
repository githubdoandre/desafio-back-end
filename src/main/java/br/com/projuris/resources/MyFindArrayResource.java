package br.com.projuris.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.projuris.MyFindArray;

@RestController
@RequestMapping("/api/findarray")
public class MyFindArrayResource {

	@GetMapping()
	public int get () {
		MyFindArray myFindArray = new MyFindArray();
		
		int array[] = {4,9,3,7,8,3,7,1};	
		int subArray[] = {3,7};
		
		return myFindArray.findArray(array,subArray) ;
			
	}
}
