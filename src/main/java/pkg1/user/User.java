package pkg1.user;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
	public static List<UserModel> readFile(String fname) throws Exception{
		List<UserModel>list1=new ArrayList<>();
		File f1= new File(fname);
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			String[] arr1=sc1.nextLine().split(",");
			list1.add(new UserModel(arr1[0], arr1[1], arr1[2], arr1[3], 
					Long.parseLong(arr1[4]), arr1[4], arr1[6]));
		}
		return list1;
	}
	
	@GetMapping("/users/findall/{fname}")
	public List<UserModel> findAllUser(@PathVariable String fname) throws Exception{
		List<UserModel>list1=readFile(fname);
		return list1;
	}
	
	@GetMapping("/user/login/{fname}/{email}/{password}")
	public List<UserModel> login(@PathVariable String fname, @PathVariable String email, @PathVariable String password) throws Exception{
		List<UserModel>list1=readFile(fname);
		List<UserModel>list2=new ArrayList<>();
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i).getGmail().equals(email) && list1.get(i).password.equals(password)) {
				list2.add(new UserModel(list1.get(i).getName(),list1.get(i).getCountry_code(),list1.get(i).getGmail(),list1.get(i).getPhone(),list1.get(i).getLocation(),list1.get(i).getLocation()));
			}
		}
		return list2;
	}
}
