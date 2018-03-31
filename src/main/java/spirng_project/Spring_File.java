package spirng_project;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Spring_pkg.EmpModel;

@RestController
public class Spring_File {
	@RequestMapping(value="/hey",method=RequestMethod.POST)
	public String hey(ModelMap model)
	{
		String msg="Message";
		model.addAttribute("message",msg);
		return"showMessage";
	}
	
	@RequestMapping(value="/hlo",method=RequestMethod.POST)
	public @ResponseBody HashMap<String,String> hit()
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("status","success");
		hm.put("file","spring");
		return hm;
			}
	@RequestMapping(value="/snd",method=RequestMethod.POST)
	public @ResponseBody HashMap<String,Object> maps(@RequestBody EmpModel mod)
	{
		HashMap<String,Object> hm=new HashMap<String,Object>();	   
		hm.put("Email",mod.getEmail());
		System.out.println(mod.getName());
		return hm;
	}
}
